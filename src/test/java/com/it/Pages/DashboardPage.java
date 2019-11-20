package com.it.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class DashboardPage extends BasePage {
    @FindBy(xpath = "//li[@class='sn_menu_item']/span")
    public WebElement lbUserEmail;

    @FindBy(xpath = "//p[@class='make_message']")
	public WebElement newMessage;

    @FindBy(xpath = "//li[@class='new']")
	public WebElement btnInboxMessage;

    @FindBy(xpath = "//div[@class='row new']")
	public List<WebElement> inboxMessages;

    public String getEmailUser() {
        return lbUserEmail.getText();
    }

    public void makeMessage() {
        newMessage.click();
    }

    public void openInboxMessages() {
        btnInboxMessage.click();
    }
}
