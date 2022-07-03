package code;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day6_1selectClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement creatNewAccount = driver.findElement(By.xpath("//a[text()='Create new account']"));
		creatNewAccount.click();
		WebElement months = driver.findElement(By.id("month"));
		//If we like to store the element in select class we need to create 
		// a select and import it from selenume than pass the name of  the element and only we 
		//change the index value  
		Select select = new Select(months);
		select.selectByIndex(0);
		Thread.sleep(3000);
		select.selectByVisibleText("Aug");
		System.out.println(months.getText());
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		

	}

}
