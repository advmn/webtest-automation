package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

    @FindBy(xpath = "//section[@id='form']/div[@class='container']/div[@class='row']/div[@class='col-sm-4 col-sm-offset-1']//form[@action='/signup']/div[1]/div[2]/label[@class='top']/div[@class='radio']//input[@name='title']")
    public WebElement titleMrsButton;

    @FindBy(xpath = "/html//input[@id='password']")
    public WebElement passwordField;

    @FindBy(xpath = "/html//select[@id='days']")
    public WebElement dropdownDay;

    @FindBy(xpath = "/html//select[@id='months']")
    public WebElement dropdownMonth;

    @FindBy(xpath = "/html//select[@id='years']")
    public WebElement dropdownYear;

    @FindBy(xpath = "/html//input[@id='newsletter']")
    public WebElement signupfornewsletterButton;

    @FindBy(xpath = "//section[@id='form']/div[@class='container']/div[@class='row']//form[@action='/signup']//label[.='Receive special offers from our partners!']")
    public WebElement receivespecialoffersButton;

    @FindBy(xpath = "/html//input[@id='first_name']")
    public WebElement firstnameField;

    @FindBy(xpath = "/html//input[@id='last_name']")
    public WebElement lastnameField;

    @FindBy(xpath = "/html//input[@id='company']")
    public WebElement companyField;

    @FindBy(xpath = "//section[@id='form']/div[@class='container']/div[@class='row']//form[@action='/signup']//input[@name='address1']")
    public WebElement address1Field;

    @FindBy(xpath = "//section[@id='form']/div[@class='container']/div[@class='row']//form[@action='/signup']//input[@name='address2']")
    public WebElement address2Field;

    @FindBy(xpath = "/html//select[@id='country']")
    public WebElement dropdownCountry;

    @FindBy(xpath = "/html//input[@id='state']")
    public WebElement stateField;

    @FindBy(xpath = "/html//input[@id='city']")
    public WebElement cityField;

    @FindBy(xpath = "/html//input[@id='zipcode']")
    public WebElement zipcodeField;

    @FindBy(xpath = "/html//input[@id='mobile_number']")
    public WebElement mobilenumberField;

    @FindBy(xpath = "//section[@id='form']/div[@class='container']//form[@action='/signup']/button[@type='submit']")
    public WebElement createaccountButton;

        public void registerUser(){
            titleMrsButton.click();
            passwordField.sendKeys("password");
            Select dayDropdown = new Select(dropdownDay);
            dayDropdown.selectByVisibleText("22");
            Select monthDropdown = new Select(dropdownMonth);
            monthDropdown.selectByVisibleText("April");
            Select yearDropdown = new Select(dropdownYear);
            yearDropdown.selectByVisibleText("2002");
            signupfornewsletterButton.click();
            receivespecialoffersButton.click();
            firstnameField.sendKeys("Adam");
            lastnameField.sendKeys("Adach");
            companyField.sendKeys("EY");
            address1Field.sendKeys("Warszawa");
            address2Field.sendKeys("Wrocław");
            Select countryDropdown = new Select(dropdownCountry);
            countryDropdown.selectByVisibleText("United States");
            stateField.sendKeys("Arizona");
            cityField.sendKeys("Phoenix");
            zipcodeField.sendKeys("85001");
            mobilenumberField.sendKeys("123456789");
            createaccountButton.click();
        }
}
