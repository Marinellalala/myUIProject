package com.it.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest extends BaseTest {

    @Test
    public void test1() throws InterruptedException {
        app.login.login(validUser);
        Thread.sleep(2000);
        Assert.assertEquals(app.dashboard.getEmailUser(), validUser.email);
        app.dashboard.makeMessage();
        app.newMessage.sendNewMessage(email);
        app.dashboard.openInboxMessages();
        app.dashboard.getMessageBySubject(email.getSubject()).click();
        Assert.assertTrue(email.equals(app.inboxMessage.getInboxEmail()));
    }
}
