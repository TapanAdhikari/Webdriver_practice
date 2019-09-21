import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadFile_SeleniumCode {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "null");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("tapandu@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Jamaica&11432");
		driver.findElement(By.id("loginbutton")).click();

		Thread.sleep(4000);

		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE).build().perform();
		WebElement photo = driver.findElement(By.xpath("//div[text()='Photo/Video']"));
		action.moveToElement(photo).build().perform();

		photo.sendKeys("C:\\Users\\GITA\\Desktop\\Tanish1.jpg");
		// we have to use AutoIT tools for uploading in facebook.

	}

}
