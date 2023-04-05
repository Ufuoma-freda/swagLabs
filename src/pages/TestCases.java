package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Login;
import pages.Products;
import pages.Cart;
import pages.CheckOut;
import pages.OverView;
import pages.Logout;

public class TestCases {
    static WebDriver driver = null;

    public static void main(String args[]) {
        initializeAndLogin();
        addProductsToCart();
        cart();
        //Check out with preferred check out details (valid,blank,single character)
        validCheckOutDetails();
        //blankCheckOutDetails();
        //singleCharacterCheckOutDetails();
        checkOut();
        logOut();
    }

    public static void initializeAndLogin() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Desktop\\geckodriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.saucedemo.com/");

        driver.manage().window().maximize();


        //Login to app with invalid password/username combination
//        Login.userNameField(driver).sendKeys("standard_user1");
//        Login.passwordField(driver).sendKeys("secret_sauce");
//        Login.loginButton(driver).click();

        //Login to app with standard user
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
        Login.userNameField(driver).sendKeys("standard_user");
        Login.passwordField(driver).sendKeys("secret_sauce");
        Login.loginButton(driver).click();
    }

    public static void addProductsToCart () {
        //driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

        //Filter products
        Products.filterDropDown(driver);

        //Select products
        Products.backPackImage(driver).click();  //adding product 1
        Products.backPackAddToCartButton(driver).click();
        Products.backToProductsButton(driver).click();

        Products.redShirtLink(driver).click();  //adding product 2
        Products.redShirtAddToCartButton(driver).click();
        Products.backToProductsButton(driver).click();

        Products.onesieAddToCartButton(driver).click();  //adding product 3
    }

    public static void cart() {
        Cart.cartButton(driver).click();
        Cart.backPackLink(driver).click();
        Products.backToProductsButton(driver).click();
        Cart.backPackRemoveButton(driver).click(); //remove product from cart
        Cart.continueShoppingButton(driver).click();
        Cart.cartButton(driver).click();
        Cart.checkOutButton(driver).click();
    }

    public static void checkOut() {
        OverView.cancelButton(driver).click(); //Cancel overview

        //Finish checkout
        Cart.cartButton(driver).click();
        Cart.checkOutButton(driver).click();
        validCheckOutDetails();
        OverView.finishButton(driver).click();
    }

    public static void logOut(){
        Logout.menuButton(driver).click();
        Logout.logoutButton(driver).click();
    }

    public static void validCheckOutDetails () {
        CheckOut.cancelButton(driver).click();
        Cart.checkOutButton(driver).click();
        CheckOut.firstNameField(driver).sendKeys("John");
        CheckOut.lastNameField(driver).sendKeys("Doe");
        CheckOut.postalCodeButton(driver).sendKeys("123456");
        CheckOut.continueButton(driver).click();
    }

    public static void blankCheckOutDetails () {
        Cart.checkOutButton(driver).click();
        CheckOut.continueButton(driver).click();
    }

    public static void singleCharacterCheckOutDetails () {
        Cart.checkOutButton(driver).click();
        CheckOut.firstNameField(driver).sendKeys("J");
        CheckOut.lastNameField(driver).sendKeys("D");
        CheckOut.postalCodeButton(driver).sendKeys("1");
        CheckOut.continueButton(driver).click();
    }
}
