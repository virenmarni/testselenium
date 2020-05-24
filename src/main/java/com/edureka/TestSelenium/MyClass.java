package com.edureka.TestSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class MyClass {
	public static void main(String[] args) throws IOException, InterruptedException  {
       		
		String baseUrl = "http://35.223.116.213:9090/helloedureka";
		System.out.println("String baseUrl" + baseUrl);
		System.setProperty("webdriver.chrome.driver","/home/edureka/Downloads/chromedriver");
		System.setProperty("webdriver.chrome.logfile", "chromedriver.log");
	    System.setProperty("webdriver.chrome.verboseLogging", "true");
		System.out.println("		System.setProperty!!");
		ChromeOptions chromeOptions = new ChromeOptions(); 
		System.out.println("headless!!");
		chromeOptions.addArguments("headless"); 
		System.out.println("no-sandbox!!");
		chromeOptions.addArguments("--no-sandbox");
		System.out.println("chromeOptions!!");
		WebDriver driver = new ChromeDriver(chromeOptions); 
		System.out.println("driver!!");

        driver.get(baseUrl);
        System.out.println("baseUrl!!");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        String test = driver.findElement(By.xpath("/html/body/h1")).getText();
        System.out.println("findElement!!" + test);
        
        System.out.println("Test Succeeded!!");
             
        //close Fire fox
        driver.quit();     
    }
}
