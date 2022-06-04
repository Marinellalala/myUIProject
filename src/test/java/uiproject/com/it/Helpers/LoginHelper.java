package uiproject.com.it.Helpers;

import uiproject.com.it.Pages.LoginPage;
import uiproject.com.it.Users.User;

public class LoginHelper extends LoginPage {
    public void login(User user) {
        login(user.username, user.password);
    }
}
