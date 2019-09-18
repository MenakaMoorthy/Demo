package org.pro;

import java.awt.AWTException;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pro {

	public static void main(String[] args) throws AWTException {
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Seleniumday2\\GreensTech\\Driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.findElement(By.id("inputValEnter")).sendKeys("iphone x");
        Robot r =new Robot();		
        r.keyPress(KeyEvent.VK_DOWN);
    	r.keyPress(KeyEvent.VK_ENTER);


	}

}
