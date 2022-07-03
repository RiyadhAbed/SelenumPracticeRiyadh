package code;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.agent.builder.AgentBuilder.Identified;

public class DayThreeTag_Link_PartiaLinkName {

	public static void main(String[] args) throws InterruptedException { 
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//TagName
		WebElement element1 = driver.findElement(By.tagName("h2"));
		System.out.println(element1.getText());
		WebElement element2 = driver.findElement(By.tagName("button"));
		element2.click();
		System.out.println(element2.getText());
		//LinkText
		WebElement element3 = driver.findElement(By.linkText("Create new account"));
		System.out.println(element3.getText());
		element3.click();
		List <WebElement> allLinks = driver.findElements(By.xpath("//a"));
		for(int i = 0; i <allLinks.size();i++) {
			System.out.println(allLinks.get(i).getText());
			Thread.sleep(2000);
			driver.navigate().to("https://www.Ebay.com/");
			Thread.sleep(2000);
			driver.getCurrentUrl();
			System.out.println(driver.getCurrentUrl());
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			driver.navigate().forward();
			Thread.sleep(2000);
			System.out.print(element3.getCssValue("background-colore"));
			//Rectangle
			Rectangle rect = element2.getRect();
			System.out.println("Height: = " + rect.getHeight());
			System.out.println("Width: = " + rect.getWidth());
			System.out.println("X: = " + rect.getX());
			System.out.println("Y: = " + rect.getY());

			
			driver.close();
		}
		
		
		
		
		
		
		
		
		//PartLinkName

	}}


