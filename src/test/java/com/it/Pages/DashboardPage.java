package com.it.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
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

	/*@FindBy(xpath = "//div[@class='row new']")
    public List<InboxTableRow> tableRows;*/

    public String getEmailUser() {
        return lbUserEmail.getText();
    }

    public void makeMessage() {
        newMessage.click();
    }

    public void openInboxMessages() {
        btnInboxMessage.click();
    }

	public WebElement getMessageBySenderAndSubject(String subject) {
		for (WebElement inboxMessage : inboxMessages) {
			if (inboxMessage.findElement(By.xpath("//span[@class=\"sbj\"]")).getText().equals(subject)) {
				return inboxMessage;
			}
		}
//        throw new NoSuchElementException(String.format("New message with title %s mot found", subject));
		return null;
	}
}
