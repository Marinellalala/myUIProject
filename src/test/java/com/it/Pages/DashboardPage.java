package com.it.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends BasePage{
	@FindBy(xpath="//li[@class='sn_menu_item']/span")
	private WebElement lbUserEmail;


    public String getEmailUser(){
	    return lbUserEmail.getText();
    }

}
