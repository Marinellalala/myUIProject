package com.it.Tests;

import com.it.App;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

public abstract class BaseTest {
    protected static App app = new App();

    @AfterSuite
    public void tearDownSuite() {
        app.common.closeApp();
    }
}
