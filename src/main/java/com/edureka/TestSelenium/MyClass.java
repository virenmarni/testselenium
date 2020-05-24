//package newpackage;
package com.edureka.TestSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import static org.junit.Assert.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class MyClass {
	public static void main(String[] args) throws IOException, InterruptedException  {
       		
    	//System.setProperty("webdriver.gecko.driver","/Users/robertoflores/Documents/selenium-java-3.141.59/Software/geckodriver");
		//WebDriver driver = new FirefoxDriver();
		
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
        driver.findElement(By.id("About Us")).click();
        String test = driver.findElement(By.id("PID-ab2-pg")).getText();
        
        System.out.println("findElement!!");
        
        assertEquals(test, "This is about page. Lorem Ipsum Dipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
        System.out.println("Test Succeeded!!");
        
       
        //close Fire fox
        driver.quit();
		
       
    }
}
