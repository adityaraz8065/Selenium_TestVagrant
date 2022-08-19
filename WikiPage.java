package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiPage 
{
	@FindBy (xpath="//input[@id='searchInput']") 
	public WebElement search;
	@FindBy(xpath="//form[@id='search-form']/fieldset/button/i") 
	public WebElement button;
	@FindBy(xpath="//a[contains(.,'Pushpa: The Rise')]") 
	public WebElement link;
	@FindBy(xpath="//li[contains(.,'17 December 2021')]") 
	public WebElement releaseDate;
	@FindBy(xpath="//tr[14]/td") 
	public WebElement country;
	public WikiPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void movieSearch(String movieName)
	{
		search.sendKeys(movieName);
		button.click();
		link.click();
	}
}
