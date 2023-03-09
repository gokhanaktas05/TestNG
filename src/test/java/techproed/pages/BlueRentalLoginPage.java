package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class BlueRentalLoginPage {
    public BlueRentalLoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (id = "formBasicEmail")
    public WebElement emailBox;

    @FindBy (id = "formBasicPassword")
    public WebElement passwordBox;

    @FindBy (css = "button[class='btn btn-primary']")
    public WebElement loginButton;

    @FindBy (css = "div[role='alert']")
    public WebElement error_message_1;


}