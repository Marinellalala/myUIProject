package uiproject.com.it;

import uiproject.com.it.Helpers.CommonHelper;
import uiproject.com.it.Helpers.DashboardHelper;
import uiproject.com.it.Helpers.LoginHelper;

public class App {
    public LoginHelper login;
    public DashboardHelper dashboard;
    public CommonHelper common;

    public App() {
        login = new LoginHelper();
        dashboard = new DashboardHelper();
        common = new CommonHelper();
    }
}
