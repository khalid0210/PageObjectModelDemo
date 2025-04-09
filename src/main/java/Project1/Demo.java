package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://dev1-website.hdfclife.tech/home/retirement/calculator");

        WebElement nextButton = driver.findElement(By.xpath("//*[@id=\"btnNext\"]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", nextButton);


        
    }
}
