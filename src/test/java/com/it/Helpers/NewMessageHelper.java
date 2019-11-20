package com.it.Helpers;

import com.it.Models.Email;
import com.it.Pages.NewMessagePage;

public class NewMessageHelper extends NewMessagePage {

    public void sendNewMessage(Email email){
        inputReceiver.sendKeys(email.getReceiver());
        inputSubject.sendKeys(email.getSubject());
        inputMessage.sendKeys(email.getText());
        btnSend.click();
    }
}
