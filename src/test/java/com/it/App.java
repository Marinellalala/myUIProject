package com.it;

import com.it.Helpers.*;

public class App {
    public LoginHelper login;
    public DashboardHelper dashboard;
    public CommonHelper common;
    public NewMessageHelper newMessage;
    public InboxMessageHelper inboxMessage;

    public App() {
        login = new LoginHelper();
        dashboard = new DashboardHelper();
        common = new CommonHelper();
        newMessage = new NewMessageHelper();
        inboxMessage = new InboxMessageHelper();
    }
}
