package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Logout {
    private static WebElement element;

    public static WebElement menuButton(WebDriver driver) {
        WebElement element = driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
        return element;
    }

    public static WebElement logoutButton(WebDriver driver) {
        WebElement element = driver.findElement(By.xpath("//a[@id='logout_sidebar_link']"));
        return element;
    }
}
