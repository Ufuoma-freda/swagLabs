package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
    private static WebElement element;

    public static WebElement userNameField(WebDriver driver) {
        WebElement element = driver.findElement(By.id("user-name"));
        return element;
    }

    public static WebElement passwordField(WebDriver driver) {
        WebElement element = driver.findElement(By.id("password"));
        return element;
    }

    public static WebElement loginButton(WebDriver driver) {
        WebElement element = driver.findElement(By.id("login-button"));
        return element;
    }
}
