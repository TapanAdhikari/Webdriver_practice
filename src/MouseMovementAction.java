import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementAction {

	public static void main(String[] args) {
		
		
System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "null");
		
		WebDriver driver =new FirefoxDriver();
		
		// Managing JavaScript alert
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.americangolf.co.uk");
		
		
		WebElement brands= driver.findElement(By.xpath("/html/body/div[1]/div[2]/header/nav/div/div[1]/ul/li[1]/a"));
		
		Actions act = new Actions(driver);
		act.moveToElement(brands).build().perform();

	}

}
