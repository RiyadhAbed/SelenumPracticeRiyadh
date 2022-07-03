package code;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class8AlertsClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//this is the ferst way to handlit the Alert/////hard coding 
		
		
		
//		String alertText = driver.switchTo().alert().getText();
//		System.out.println(alertText);
//		driver.switchTo().alert().accept();

		/// Thats the second way to handlit it /// this way more better'
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		
		///////////////////////////////////////////////////////////////////////////////////
		WebElement iframe1 = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(iframe1);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(3000);
		Alert alert1 = driver.switchTo().alert();
		alert.accept();
//		alert.dismiss();
		//below line of code will bring you back to the main web page content and you will be 
		//able to exist the frame and enter the main content of the web page and perform the rest
		//of you actions on the main content
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("runbtn")).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}

}
