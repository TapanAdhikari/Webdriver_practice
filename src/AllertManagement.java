import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllertManagement {

	public static void main(String[] args) {
	
	//NOTIFICATION ALERT DISABLE
	//ChromeOptions options = new ChromeOptions();
	//	options.addArguments("--disable-notifications");
	
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "null");

		WebDriver driver = new FirefoxDriver();

		// Managing JavaScript alert

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);			//Implicit Wait
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys("Tanish");
		driver.findElement(By.name("proceed")).click();
		
																					//Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.alertIsPresent());
		

		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());

		al.accept();	// accept or agree the alert
		//al.dismiss();   //cancel the alert
		
		driver.switchTo().defaultContent();  // will take to main page 
	}

}
