package code;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4Xpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://tek-school.com/retail/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement myAccount = driver.findElement(By.xpath("//a[@class='dropdown-toggle']"));
		myAccount.click();
		Thread.sleep(4000);

		WebElement rgistration = driver.findElement(By.xpath("//a[text()='Register']"));
		rgistration.click();
		Thread.sleep(2000);

		WebElement fName = driver.findElement(By.id("input-firstname"));
		fName.sendKeys("Ali");
		Thread.sleep(2000);

		WebElement lName = driver.findElement(By.id("input-lastname"));
		lName.sendKeys("Ali");
		Thread.sleep(2000);

		WebElement email = driver.findElement(By.id("input-email"));
		email.sendKeys("Ali.122232@gmail.com");
		Thread.sleep(2000);

		WebElement telephone = driver.findElement(By.id("input-telephone"));
		telephone.sendKeys("5459876533");
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.id("input-password"));
		password.sendKeys("Alajeele");
		Thread.sleep(2000);
		WebElement confirm = driver.findElement(By.id("input-confirm"));
		confirm.sendKeys("Alajeele");
		Thread.sleep(2000);
		WebElement Subscribe = driver.findElement(By.xpath("//label[normalize-space()='Yes']"));
		Subscribe.click();
		Thread.sleep(2000);
		WebElement privacyPolicy = driver.findElement(By.xpath("//input[@type='checkbox']"));
		privacyPolicy.click();
		Thread.sleep(2000);
		WebElement submitButton = driver.findElement(By.xpath("//input[@type='submit']"));
		submitButton.click();
		Thread.sleep(2000);
		driver.close();

	}

}
