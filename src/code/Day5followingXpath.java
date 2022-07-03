package code;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day5followingXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://tek-school.com/retail/index.php?route=account/register");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));

		boolean isdisplayed = checkBox.isDisplayed();
		boolean isenabled = checkBox.isEnabled();
		boolean isselected = checkBox.isSelected();

		if (isdisplayed == true && isdisplayed == true && isselected != true) {
			checkBox.click();
		}else {
			System.out.println("Select the checkBox");
		}

			Thread.sleep(3000);
		driver.close();

	}

}
