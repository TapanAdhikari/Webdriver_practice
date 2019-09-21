import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class XpathExpert {

	public static void main(String[] args) {
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "null");

		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get(
				"https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("tadhikarinyc");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();

		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement password = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[@type='password' and @name='password']")));

		password.sendKeys("barisal&8200");
		// driver.findElement(By.xpath("//input[@type='password' and
		// @name='password']")).sendKeys("barisal&8200");

		// WebDriverWait wait = new WebDriverWait(driver, 3);
		// boolean invisible =
		// wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpathExpression))

		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.id("passwordNext"))).click().build().perform();

		// driver.findElement(By.xpath("//*[@id='passwordNext']/span/span")).click();
		// driver.get("https://www.freecrm.com/index.html");
		// driver.findElement(By.xpath("//input[@name='username']")).sendKeys("tanish");
		// String text=driver.findElement(By.xpath("//a[text()='Features']")).getText();
		// System.out.println(text);
		// *[@id="passwordNext"]/span/span

	}

}
