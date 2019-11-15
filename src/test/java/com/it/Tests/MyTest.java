package com.it.Tests;

import com.it.Users.UserFactory;
import com.it.Utils.Utils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest extends BaseTest{
    @Test
    public void test1() throws InterruptedException {
        System.out.println(UserFactory.getRandomUser());
        System.out.println(UserFactory.getRandomUsers(20));
        app.login.login(validUser);
        Thread.sleep(2000);
        Assert.assertEquals(app.dashboard.getEmailUser(), validUser.email);
    }
}
