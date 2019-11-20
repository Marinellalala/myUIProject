package com.it.Helpers;

import com.it.Pages.DashboardPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DashboardHelper extends DashboardPage {
    public WebElement getMessageBySubject(String subject) {
        for (WebElement inboxMessage : inboxMessages) {
            if (inboxMessage.findElement(By.xpath("//span[@class='sbj']")).getText().equals(subject)) {
                return inboxMessage;
            }
        }
        return null;
    }
}
