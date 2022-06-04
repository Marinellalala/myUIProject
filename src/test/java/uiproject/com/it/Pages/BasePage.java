package uiproject.com.it.Pages;

import uiproject.com.it.Drivers.MyDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
   protected static MyDriver driver = MyDriver.getDriver();



    public BasePage() {
        PageFactory.initElements(driver, this);
    }
}
