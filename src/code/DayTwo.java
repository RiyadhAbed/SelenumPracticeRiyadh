package code;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DayTwo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("12345");
		Thread.sleep(3000);
		pass.clear();
		WebElement crtAcct = driver.findElement(By.xpath("//a[text()='Create new account']"));
		crtAcct.click();
		Thread.sleep(2000);
		WebElement fName = driver.findElement(By.xpath("//input[@data-type='text']"));
		fName.sendKeys("Riyadh");

		List<WebElement> months = driver.findElements(By.xpath("//select[@id='month']//option"));
		for (int i = 0; i < months.size(); i++) {
			System.out.println(months.get(i).getText());
			
		}
		
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		List<WebElement> companyName = driver.findElements(By.xpath("//table[@id='customers']//tr//td[1]"));
		for(int i = 0;i< companyName.size();i++) {
			System.out.println(companyName.get(i).getText());
		}
		
		List<WebElement> islandTrading = driver.findElements(By.xpath("//table[@id='customers']//tr//td[1]"));
		for(int i = 0;i< islandTrading.size();i++) { 
           if(islandTrading.get(i).getText().equals("Island Trading")) {
			System.out.println(islandTrading.get(i).getText());
		}
		
		
		
		
		

	}

}

	}


