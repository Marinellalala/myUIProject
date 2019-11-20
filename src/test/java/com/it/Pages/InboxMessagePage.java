package com.it.Pages;

import com.it.Models.Email;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InboxMessagePage extends BasePage {
	@FindBy(xpath="//div[@class='message_header clear']/h3")
	private WebElement header;

	@FindBy(xpath="//div[@class='to']/div[@class='field_value']")
	private WebElement to;

	@FindBy(xpath="//div[@class='message_body']")
	private WebElement text;

    public String getHeader(){
        return header.getText();
    }

    public String getTo(){
        return to.getText();
    }

    public String getEmailText(){
        return text.getText();
    }

}
