import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IciciBank {

	public static void main(String[] args) {
	System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "null");
		
	WebDriver driver =new FirefoxDriver();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://loan.icicibank.com/asset-portal/auto-loan/check-eligibility");
	
	//Loan Type
	driver.findElement(By.xpath("//span [filter-option pull-left()='Used Car Loan']")).click();
	
	}

}
