package testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;
import commonFunctions.CommonFunctions;
import pageObjects.Dashboard_Page_Object;
import pageObjects.Login_Page_Object;

public class Test_Pending_Leave_Request extends CommonFunctions {
	static  Logger logger = LogManager.getLogger(Test_Pending_Leave_Request.class);

    @Test
    public void verifyMyLeave() throws InterruptedException {
        // Initialize Login Page
    	logger.info("Launching the application");
        Login_Page_Object loginPage = PageFactory.initElements(driver, Login_Page_Object.class);
        
        loginPage.userName.sendKeys(properties.getProperty("username"));
        loginPage.passWord.sendKeys(properties.getProperty("password"));
        loginPage.submitButton.click();
        Thread.sleep(5000);
        // Initialize Dashboard Page
        logger.info("Naviagting to the Dashboard tab");
        Dashboard_Page_Object dashboardPage = PageFactory.initElements(driver, Dashboard_Page_Object.class);
        Thread.sleep(5000);
        // Explicit wait before clicking
        logger.info("Clicking the MyLeave Option");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(dashboardPage.myLeave)).click();
    }
}
