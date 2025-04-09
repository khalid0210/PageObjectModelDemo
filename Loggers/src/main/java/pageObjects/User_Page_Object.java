package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class User_Page_Object {
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]")
	public static WebElement admin;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[1]")
	public static WebElement userManagement;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[1]/ul/li")
	public static WebElement user;
	
	@FindBy(xpath = "//div[contains(@class,'oxd-select-text')]")
	public static WebElement userRole;
	
	@FindBy(xpath = "//div[@role='listbox']//div[normalize-space()='Admin']") 
	public static WebElement adminRole;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div")
	public static WebElement status;
	
	@FindBy(xpath="//div[@role='listbox']//div[normalize-space()='Enabled']")
	public static WebElement enabled;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")
	public static WebElement searchButton;
    
	
	
	
}
