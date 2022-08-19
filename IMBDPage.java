package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IMBDPage
{
	@FindBy(xpath="//input[@id='suggestion-search']")
	public WebElement search;
	@FindBy(xpath="//button[@id='suggestion-search-button']")
	public WebElement button;
	@FindBy(xpath="//a[contains(text(),'Pushpa: The Rise - Part 1')]")
	public WebElement link;
	@FindBy(xpath="//a[contains(text(),'January 7, 2022 (United States)')]")
	public  WebElement click_ReleaseDate;
	@FindBy(xpath = "(//td[text()='17 December 2021'])[5]")
	public WebElement releaseDate;
	@FindBy(xpath="//a[contains(text(),'India')]")
	public WebElement country;

	public IMBDPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void movieSearch(String moviename)
	{
		search.sendKeys(moviename);
		button.click();
		link.click();
		click_ReleaseDate.click();
		
	}
	
}
