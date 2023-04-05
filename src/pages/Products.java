package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Products {
    private static WebElement element;

//    I did create a constructor hoping to instantiate
//    objects of each product by calling the constructor but for time constraints, I'll get back to this.
//
//    String productName;
//    String addToCartButton;
//
//    public Products () {
//      this.productName = "";
//      this.addToCartButton = "";
//    }
//    Products backPack = new Products();


    public static WebElement backPackImage(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated (By.id("item_4_img_link")));
        return element;
    }

    public static WebElement backPackAddToCartButton(WebDriver driver) {
        WebElement element = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        return element;
    }

    public static WebElement redShirtLink(WebDriver driver) {
        WebElement element = driver.findElement(By.xpath("//div[@id='']"));
        return element;
    }

    public static WebElement redShirtAddToCartButton(WebDriver driver) {
        WebElement element = driver.findElement(By.xpath("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']"));
        return element;
    }

    public static WebElement onesieAddToCartButton(WebDriver driver) {
        WebElement element = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-onesie']"));
        return element;
    }

    public static WebElement filterDropDown(WebDriver driver) {
        Select dropDown = new Select(driver.findElement(By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[2]/div[1]/span[1]/select[1]")));
        dropDown.selectByIndex(2);
        return element;
    }

    public static WebElement backToProductsButton(WebDriver driver) {
        WebElement element = driver.findElement(By.xpath("//button[@id='back-to-products']"));
        return element;
    }
}