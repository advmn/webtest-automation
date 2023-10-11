package page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class MainPage {

    WebDriver driver;
    @FindBy(xpath = "/html//section[@id='form']//h2/b[.='Account Created!']")
    public WebElement accountcreatedMessage;

    @FindBy (className = "fa fa-lock")
    public WebElement signupLoginButton;

    @FindBy(xpath = "/html//section[@id='form']/div[@class='container']//a[@href='/']")
    public WebElement continueButton;

    public void checkMainUrl() {
        String expectedUrl = driver.getCurrentUrl();
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl, "Actual page url is not the same as expected");
    }

    public void verifyAccountCreatedMessage() {
        String accountcreatedExpectedMessage = "ACCOUNT CREATED!";
        String accountcreatedActualMessage = accountcreatedMessage.getText();
        Assert.assertTrue(accountcreatedExpectedMessage.contains(accountcreatedActualMessage));
    }
}
