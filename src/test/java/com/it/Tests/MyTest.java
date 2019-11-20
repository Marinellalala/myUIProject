package com.it.Tests;

import com.it.Models.Email;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest extends BaseTest {

    public static final String TEST_SUBJECT = "testSubject";

    @Test
    public void test1() throws InterruptedException {
       // email.equals(email);
        //System.out.println(UserFactory.getRandomUser());
        //System.out.println(UserFactory.getRandomUsers(20));
        app.login.login(validUser);
        Thread.sleep(2000);
        Assert.assertEquals(app.dashboard.getEmailUser(), validUser.email);
        app.dashboard.makeMessage();
        String emailText = RandomStringUtils.randomAlphanumeric(100);
        Email email = new Email(validUser.email, TEST_SUBJECT, emailText);
        app.newMessage.sendNewMessage(email);
        app.dashboard.openInboxMessages();
        app.dashboard.getMessageBySenderAndSubject(TEST_SUBJECT).click();
        Assert.assertTrue(email.equals(app.inboxMessage.getInboxEmail()));

    }
}
