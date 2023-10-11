package tests;

import driver.WebDriverFactory;
import jdk.jfr.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.HeaderMenu;
import page.LoginPage;
import page.MainPage;
import page.RegisterPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class RegisterTest {
    MainPage mainPage = new MainPage();
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        driver.wait(2000);
        driver.quit();
    }

    @Test(priority = 1)
    @Description("First test case")

    public void testCaseFirst() throws InterruptedException{
        System.out.println("Test started!");
       // WebDriver driver = new ChromeDriver();

        System.out.println("Browser started");
        driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();
        System.out.println("Page is opened");

        //mainPage.checkMainUrl();
        mainPage.signupLoginButton.click();
        LoginPage loginPage = new LoginPage();
        loginPage.verifySignupMessageIsDisplayed();
        loginPage.loginUser();
        loginPage.verifyAccountInfoMessage();
        RegisterPage registerPage = new RegisterPage();
        registerPage.registerUser();
        mainPage.verifyAccountCreatedMessage();
        mainPage.continueButton.click();
        HeaderMenu headerMenu = new HeaderMenu();
        headerMenu.verifyIfLoggedAsUsername();
        headerMenu.delectaccountButton.click();
    }
}
