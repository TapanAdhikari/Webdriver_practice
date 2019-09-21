import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandles {

	public static void main(String[] args) {
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "null"); // Disable the logs

		WebDriver driver = new FirefoxDriver();
		Set<String> winIds = driver.getWindowHandles();
		System.out.println("Number of window is : " + winIds.size());
		java.util.Iterator<String> it = winIds.iterator();
		System.out.println(it.next());
		System.out.println("--------");

		driver.get("https://www.naukri.com");
		winIds = driver.getWindowHandles();

		System.out.println("Number of window is : " + winIds.size());
		it = winIds.iterator();
		String mainWindowId = it.next();
		String firstPopUp = it.next();
		String secondPopUp = it.next();
		String thirdPopUp = it.next();
		System.out.println(mainWindowId); // printing window id (in selenium ids are chronological)
		System.out.println(firstPopUp);
		System.out.println(secondPopUp);
		System.out.println(thirdPopUp);

		driver.switchTo().window(firstPopUp);
		driver.close();
		driver.switchTo().window(secondPopUp);
		driver.close();

		driver.switchTo().window(thirdPopUp);
		driver.close();

	}

}