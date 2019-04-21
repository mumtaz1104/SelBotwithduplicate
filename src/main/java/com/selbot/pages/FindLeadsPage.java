package com.selbot.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.selbot.testng.api.base.Annotations;

public class FindLeadsPage extends Annotations {

	public FindLeadsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.LINK_TEXT, using="Email") WebElement eleEmailLink;
	@FindBy(how=How.NAME, using="emailAddress") WebElement eleEmailAddress;
	@FindBy(how=How.XPATH, using="//span[text()='Lead List']/following::a[@class='linktext'][3]") WebElement eleFirstLead;
	@FindBy(how=How.XPATH, using="(//button[@class='x-btn-text'])[7]") WebElement eleFindLeads; 
	
	public FindLeadsPage clickEmailTab()
	{
		click(eleEmailLink);
		return this;
	}
	
	public FindLeadsPage enterEmailAddr(String email)
	{
		clearAndType(eleEmailAddress, email);
		return this;
	}
	
	public FindLeadsPage clickFindLeads()
	{
		click(eleFindLeads);
		return this;
	}
	
	public ViewLeadPage clickFirstLead()
	{
		click(eleFirstLead);
		return new ViewLeadPage();
	}
}
