package uiproject.com.it.Tests;

import uiproject.com.it.App;
import uiproject.com.it.Users.User;
import uiproject.com.it.Users.UserFactory;
import org.testng.annotations.AfterSuite;

public abstract class BaseTest {
    protected static App app = new App();
    protected static User validUser = UserFactory.getValidUser();

    @AfterSuite
    public void tearDownSuite() {
        app.common.closeApp();
    }
}
