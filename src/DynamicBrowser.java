
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DynamicBrowser {

	// String browser="Mozilla";
	@Test(dataProvider = "getData")
	public void launch(String browser, String username) {

		System.setProperty("webdriver.gecko.driver",
				"D:\\My Software\\My Jar Files\\Drivers\\browser\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver",
				"D:\\My Software\\My Jar Files\\Drivers\\browser\\chromedriver.exe");
		System.setProperty("webdriver.ie.driver",
				"D:\\My Software\\My Jar Files\\Drivers\\browser\\IEDriverServer.exe");

		WebDriver driver = null;
		// D:\\My Software\\My Jar Files\\Drivers\\browser\\
		if (browser.equals("Mozilla")) {
			driver = new FirefoxDriver();
		} else if (browser.equals("Chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("IE")) {
			driver = new InternetExplorerDriver();
		}

		driver.get("http://gmail.com");
		driver.quit();
	}

	@DataProvider
	public Object[][] getData() {

		Object[][] data = new Object[3][2];

		data[0][0] = "Mozilla";
		data[0][1] = "User1";

		data[1][0] = "Chrome";
		data[1][1] = "User2";

		data[2][0] = "IE";
		data[2][1] = "User3";

		return data;

	}

}
