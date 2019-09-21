import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AjaxHandling {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",
				"D:\\My Software\\My Jar Files\\Drivers\\browser\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://google.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("hello");

		List<WebElement> options = driver.findElements(By.xpath("//ul[@jsname='erkvQe']/li"));
		System.out.println(options.size());

	}

}
