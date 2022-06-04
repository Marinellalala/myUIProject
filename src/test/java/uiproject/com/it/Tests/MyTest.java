package uiproject.com.it.Tests;

import uiproject.com.it.Users.UserFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

//private WebElement webElement;


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
