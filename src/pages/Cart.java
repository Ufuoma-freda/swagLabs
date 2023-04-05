package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cart {
    private static WebElement element;

    public static WebElement cartButton(WebDriver driver) {
        WebElement element = driver.findElement(By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]"));
        return element;
    }

    public static WebElement backPackLink(WebDriver driver) {
        WebElement element = driver.findElement(By.xpath("//div[@id='']"));
        return element;
    }

    public static WebElement backPackRemoveButton(WebDriver driver) {
        WebElement element = driver.findElement(By.xpath("//button[@id='remove-sauce-labs-backpack']"));
        return element;
    }

    public static WebElement continueShoppingButton(WebDriver driver) {
        WebElement element = driver.findElement(By.id("continue-shopping"));
        return element;
    }

    public static WebElement checkOutButton(WebDriver driver) {
        WebElement element = driver.findElement(By.id("//button[@id='checkout']"));
        return element;
    }
}
