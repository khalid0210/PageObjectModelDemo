package testcases;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import commonFunctions.CommonFunctions;
import pageObjects.User_Page_Object;

public class Test_User_Role extends CommonFunctions{
	static  Logger logger = LogManager.getLogger(Test_User_Role.class);
	@Test
	public void verifyAdmin() {
		User_Page_Object adminPage = PageFactory.initElements(driver, User_Page_Object.class);
	        
	        // Explicit wait before clicking
		 logger.info("Clicking the Admin Tab");
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.elementToBeClickable(adminPage.admin)).click();
			 logger.info("Clicking the userManagement");
	        wait.until(ExpectedConditions.elementToBeClickable(adminPage.userManagement)).click();
	        logger.info("Clicking the user");
	        wait.until(ExpectedConditions.elementToBeClickable(adminPage.user)).click();
	        logger.info("Clicking the userRole");
	        wait.until(ExpectedConditions.elementToBeClickable(adminPage.userRole)).click();
	        logger.info("Clicking the adminRole");
	        wait.until(ExpectedConditions.elementToBeClickable(adminPage.adminRole)).click();
	        logger.info("Clicking the status");
	        wait.until(ExpectedConditions.elementToBeClickable(adminPage.status)).click();
	        logger.info("Clicking the enabled");
	        
	        wait.until(ExpectedConditions.elementToBeClickable(adminPage.enabled)).click();
	        logger.info("Clicking the searchButton");
	        wait.until(ExpectedConditions.elementToBeClickable(adminPage.searchButton)).click();
	       	        
	        
	        
	        
	        
	}

}
