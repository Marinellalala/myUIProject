package com.it.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest extends BaseTest{
    @Test
    public void test1() throws InterruptedException {
        app.login.login("ittest2", "337774a");
        Thread.sleep(2000);
        Assert.assertEquals(app.dashboard.getEmailUser(), "ittest2@i.ua");
    }
}
