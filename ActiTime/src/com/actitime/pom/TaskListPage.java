package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {

@FindBy(xpath =".//div[text()='Add New']")
private WebElement AddNewBtn;

@FindBy(xpath ="//div[text()='+ New Customer']")
private WebElement NewCustomerManu;

@FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
private WebElement EnterNewCustomerbx;

@FindBy(xpath = "(//div[text()='- Select Customer -'])[1]")
private WebElement ProjectDropDown;

@FindBy(xpath = "(//textarea[@placeholder='Enter Customer Description'])")
private WebElement EnterNewCustomerdescriptionTbx;

@FindBy(xpath = "//div[@class='itemRow cpItemRow ' and text()='Our company']")
private WebElement OurCompanyMenu;

@FindBy(xpath ="//div[text()='Create Customer']")
private WebElement CreateCustomerBtn;

public TaskListPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getAddNewBtn() {
	return AddNewBtn;
}

public WebElement getNewCustomertbx() {
	return EnterNewCustomerbx;
	

}

public WebElement getEnterCustomerMenu() {
return NewCustomerManu;	

}

public WebElement EnterCustomerdescriptionTbx() {
	     return EnterNewCustomerdescriptionTbx;
	
}



public WebElement getProjectDropDown() {
	return ProjectDropDown;
	
}

public WebElement getOurCompanyMenu() {

	return OurCompanyMenu;
}

public WebElement getCreateCustomerBtn() {
	return CreateCustomerBtn;
}
	
}

