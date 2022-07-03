package code;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Day8_1AssertClass { 
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		WebElement uiText = driver.findElement(By.tagName("h2"));
		String actulText = uiText.getText();
		String expectedText = "Connect with friends & the world around you on Facebook.";
	    Assert.assertEquals(expectedText, actulText);
	    System.out.println("Next Step");
		
//		if(actulText.equals(expectedText)) {
//			System.out.println("Is equal");
//		}else {
//			System.out.println("Is Not Equal");
//		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}

}
