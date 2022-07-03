package code;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day7practice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//practice for Tables///////////////////////////////////////////////////////
		List<WebElement> contacts = driver.findElements(By.xpath("//table[@id='customers']//tbody//tr//td[2]"));
		System.out.println(contacts.size());
		for(int i = 2; i <= contacts.size()+1; i++){
			WebElement names = driver.findElement(By.xpath("//table[@id='customers']//tbody//tr["+i+"]//td[2]"));
			System.out.println(names.getText());
		}
		driver.close();

	}

}
