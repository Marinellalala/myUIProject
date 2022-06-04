package suiteRunner.com.runner2.tests;

import org.testng.annotations.*;

public class MyTests1 {
    @BeforeMethod
    public void setUpBeforeMethod() {
        System.out.println("BeforeMethod");
    }

    @AfterMethod
    public void tearDownAfterMethod() {
        System.out.println("AfterMethod");
    }

    @BeforeClass
    public void setUpBeforeClass() {
        System.out.println("BeforeClass");
    }

    @AfterClass
    public void tearDownAfterClass() {
        System.out.println("AfterClass");
    }

    @BeforeGroups
    public void setUpBeforeGroups() {
        System.out.println("BeforeGroups");
    }

    @AfterGroups
    public void tearDownAfterGroups() {
        System.out.println("AfterGroups");
    }

    @BeforeTest
    public void setUpBeforeTest() {
        System.out.println("BeforeTest");
    }

    @AfterTest
    public void tearDownAfterTest() {
        System.out.println("AfterTest");
    }

    @BeforeSuite
    public void setUpBeforeSuite() {
        System.out.println("BeforeSuite");
    }

    @AfterSuite
    public void tearDownAfterSuite() {
        System.out.println("AfterSuite");
    }

    @Test(description = "changeUser Password", priority = 2)
    public void changeUserPassword() {
        System.out.println("changeUser Password");
    }

    @Test(description = "changeUser Login")
    public void changeUserLogin(){
        System.out.println("changeUser Login");
    }

    @Test(description = "try to login"/*, dependsOnMethods = {"changeUserPassword", "changeUserLogin"}, alwaysRun = true*/)
    public void trytologin() {
        System.out.println("try to Login");
    }
}
