          package com.actitime.test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.BaseeClass;
import com.actitime.generics.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

public class CreateCustomer extends BaseeClass {
	@Test
	public void testcreatecustomer() throws EncryptedDocumentException, IOException, InterruptedException {
	String customername = f.getExcelValue("Sheet1",1, 0);
	String customerDescp = f.getExcelValue("Sheet1", 1, 1);
	HomePage h = new HomePage(driver);
	h.clickTaskTab();
	TaskListPage t=new TaskListPage(driver);
	t.getAddNewBtn().click();
	t.getEnterCustomerMenu().click();
	t.getNewCustomertbx().sendKeys(customername);
	t.EnterCustomerdescriptionTbx().sendKeys(customerDescp);
	t.getProjectDropDown().click();
	t.getOurCompanyMenu().click();
	t.getCreateCustomerBtn().click();
	Thread.sleep(5000);
	
	

	}

}
