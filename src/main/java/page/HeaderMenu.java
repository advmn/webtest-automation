package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HeaderMenu {

    @FindBy(id = "header")
    public WebElement loggedinasusernameMessage;

    @FindBy(xpath = "/html//header[@id='header']/div[@class='header-middle']//ul[@class='nav navbar-nav']//a[@href='/delete_account']")
    public WebElement delectaccountButton;

    public void verifyIfLoggedAsUsername(){
        String loggedinasusernameExpectedMessage = loggedinasusernameMessage.getText();
        String loggedinasusernameActualMessage = loggedinasusernameMessage.getText();
        Assert.assertTrue(loggedinasusernameExpectedMessage.contains(loggedinasusernameActualMessage));
    }
}
