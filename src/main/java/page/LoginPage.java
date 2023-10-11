package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage {
    @FindBy(xpath = "/html//section[@id='form']/div[@class='container']//h2[.='New User Signup!']")
    public WebElement newUserSignupMessage;
    @FindBy(xpath = "/html//section[@id='form']//form[@action='/signup']/input[@name='name']")
    public WebElement name;
    @FindBy(xpath = "/html//section[@id='form']//form[@action='/signup']/input[@name='email']")
    public WebElement email;
    @FindBy(xpath = "/html//section[@id='form']//form[@action='/signup']/button[@type='submit']")
    public WebElement signupButton;
    @FindBy(xpath = "//section[@id='form']/div[@class='container']/div[@class='row']//b[.='Enter Account Information']")
        public WebElement enterAccountInfoMessage;
    public void verifySignupMessageIsDisplayed(){
        String expectedNewUserMessage = "New User Signup!";
        String actualNewUserMessage = newUserSignupMessage.getText();
        Assert.assertTrue(actualNewUserMessage.contains(expectedNewUserMessage));
    }
    public void loginUser(){
        name.sendKeys("Adam");
        email.sendKeys("adam.adach12@gds.ey.com");
        signupButton.click();
    }

    public void verifyAccountInfoMessage() {
        String expectedAccountInfoMessage = "ENTER ACCOUNT INFORMATION";
        String actualAccountInfoMessage = enterAccountInfoMessage.getText();
        Assert.assertTrue(expectedAccountInfoMessage.contains(actualAccountInfoMessage));
    }

}
