package org.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertSample {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ELANGO\\eclipse-workspace\\Alertsample\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Alerts.html");
	driver.manage().window().maximize();
	WebElement alertwithtext = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
	alertwithtext.click();
	WebElement alertprmtbox=driver.findElement(By.xpath("//button[contains(text(),'prompt box')]"));
	alertprmtbox.click();
	Alert a=driver.switchTo().alert();
	Thread.sleep(2000);
	a.sendKeys("kanisha Devi");
	a.accept();
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*WebElement alertokcancel = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
	alertokcancel.click();
	WebElement alertbtnconfirm=driver.findElement(By.xpath("//button[contains(text(),'confirm box')]"));
	alertbtnconfirm.click();
	Alert a=driver.switchTo().alert();
	Thread.sleep(2000);
	a.accept();*/
	
	
	
	
	
	
	
	
	/*WebElement alertbtn=driver.findElement(By.xpath("//button[contains(text(),'alert box')]"));
	alertbtn.click();
	driver.switchTo().alert();
	WebElement alertok = driver.findElement(By.xpath("//a[text()='Alert with OK ']"));
	alertok.click();*/
	
	
	
	
}
}
