package com.actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
@FindBy(id="logoutLink")
private WebElement LOGOUTLINK;

@FindBy(id="container_tasks")
private WebElement TaskMenu;

public HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getLOGOUTLINK() {
	return LOGOUTLINK;
	
}

public WebElement getTaskMenu() {
	return TaskMenu;
}
}
