package commonFunctions;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CommonFunctions {
    public static WebDriver driver = null;
    public static Properties properties = null;

    // Logger instance
    private static final Logger logger = LogManager.getLogger(CommonFunctions.class);

    static {
        // Load Log4j configuration before any logging
        
    	Configurator.initialize(null, "log4j2.xml");
    }

    public Properties loadPropertyFile() throws IOException {
        FileInputStream fileinputstream = new FileInputStream("config.properties");
        properties = new Properties();
        properties.load(fileinputstream);
        return properties;
    }

    @BeforeSuite
    public void launchBrowser() throws IOException {
        logger.info("Loading properties file...");
        loadPropertyFile();
        
        String browser = properties.getProperty("browser");
        String url = properties.getProperty("url");

        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
            logger.info("Chrome Browser Launched");
        } else if (browser.equalsIgnoreCase("fireFox")) {
            driver = new FirefoxDriver();
            logger.info("Firefox Browser Launched");
        }

        driver.manage().window().maximize();
        logger.info("Navigating to the application: " + url);
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @AfterSuite
    public void tearDown() {
        logger.info("Closing the Browser");
       
    }
}
