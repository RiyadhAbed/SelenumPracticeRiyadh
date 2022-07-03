package code;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day9 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement electronics = driver.findElement(By.linkText("Electronics"));
		WebElement toys = driver.findElement(By.linkText("Toys"));
		Actions action = new Actions(driver);
		action.moveToElement(electronics).perform();
		action.moveToElement(toys).perform();

		WebElement textBox = driver.findElement(By.xpath("//input[@type='text']"));
		Actions action2 = new Actions(driver);
		action2.moveToElement(textBox).keyDown(textBox, Keys.SHIFT).sendKeys(textBox, "cars books")
				.keyUp(textBox, Keys.SHIFT).build().perform();
		driver.findElement(By.id("gh-btn")).click();

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();

	}

}
