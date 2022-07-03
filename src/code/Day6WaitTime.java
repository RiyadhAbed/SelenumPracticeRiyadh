package code;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day6WaitTime {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://shop.demoqa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Explicit Wait:
		// we need to create a webdriverWait and name it
		// than = new same name Also we need to initilize it to wait.unit and than pass
		// the ExpectedConditions.visibility and choos one of the and in this case we
		// have Element so we need to use visibilityOf(text)); and initilize to the
		// element name.

		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement text = driver.findElement(By.xpath("//div[text()='umbra blue ']"));
		wait.until(ExpectedConditions.visibilityOf(text));
		System.out.println(text.getText());

		// Fluent Wait
		// we need to use this code to get the wait
		// FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
		// .withTimeout(Duration.ofSeconds(20))
		// .pollingEvery(Duration.ofSeconds(1))
		// .withMessage("The message is not avalible in the UI!");
		FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(1)).withMessage("The message is not avalible in the UI!");
		WebElement text1 = driver.findElement(By.xpath("//div[text()='umbra blue ']"));
         fluentWait.until(ExpectedConditions.visibilityOf(text1));
		System.out.println(text.getText());

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();

	}

}
