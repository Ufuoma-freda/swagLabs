package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckOut {
    private static WebElement element;

    public static WebElement firstNameField(WebDriver driver) {
        WebElement element = driver.findElement(By.id("first-name"));
        return element;
    }

    public static WebElement lastNameField(WebDriver driver) {
        WebElement element = driver.findElement(By.id("last-name"));
        return element;
    }

    public static WebElement postalCodeButton(WebDriver driver) {
        WebElement element = driver.findElement(By.id("postal-code"));
        return element;
    }

    public static WebElement cancelButton(WebDriver driver) {
        WebElement element = driver.findElement(By.id("cancel"));
        return element;
    }

    public static WebElement continueButton(WebDriver driver) {
        WebElement element = driver.findElement(By.xpath("//input[@id='continue']"));
        return element;
    }
}

