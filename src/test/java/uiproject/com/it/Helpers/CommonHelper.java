package uiproject.com.it.Helpers;

import uiproject.com.it.Pages.BasePage;

public class CommonHelper extends BasePage {
    public void closeApp(){
        driver.quit();
    }
}
