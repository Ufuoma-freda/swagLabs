package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OverView {
    private static WebElement element;

    public static WebElement cancelButton(WebDriver driver) {
        WebElement element = driver.findElement(By.xpath("//button[@id='cancel']"));
        return element;
    }

    public static WebElement finishButton(WebDriver driver) {
        WebElement element = driver.findElement(By.xpath("//button[@id='finish']"));
        return element;
    }
}

