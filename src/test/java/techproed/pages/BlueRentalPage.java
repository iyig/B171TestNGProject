package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class BlueRentalPage {
    public BlueRentalPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "")
    public WebElement loginButton;

    @FindBy(xpath = "")
    public WebElement email;
    @FindBy(xpath = "(//button)[3]")
    public WebElement verify;

}
