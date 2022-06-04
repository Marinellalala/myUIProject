package uiproject.com.it.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    @FindBy(name="login")
    private WebElement inputLogin;

    @FindBy(name="pass")
    private WebElement inputPassword;

    @FindBy(xpath="//input[@tabindex='5']")
    private WebElement btnSubmit;


    public void login(String login, String password) {
        driver.scrollDown();
        driver.scrollUp();
        inputLogin.sendKeys(login);
        inputPassword.sendKeys(password);
        btnSubmit.click();
    }
}
