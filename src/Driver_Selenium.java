import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Driver_Selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2.53 (stable Selenium version) work with 40 or less.

		// Logs
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "null");

		FirefoxOptions options = new FirefoxOptions();

		// options.setPageLoadStrategy(PageLoadStrategy.NONE).....NOT WORKING IN MY PAGE

		// System.setProperty("webdriver.gecko.driver", "D:\\My Software\\My Jar
		// Files\\Drivers\\Mozilla\\geckodriver.exe");
		FirefoxDriver fd = new FirefoxDriver(options);

		fd.get("http://yahoo.com");
		fd.quit();
		System.out.println("ABC");
		// ChromeDriver
		System.setProperty("webdriver.chrome.driver",
				"D:\\My Software\\My Jar Files\\Drivers\\browser\\chromedriver.exe");
		ChromeDriver cd = new ChromeDriver();
		// cd.get("http://yahoo.com");

		// Internet Explorer
		// System.setProperty("webdriver.ie.driver", "D:\\My Software\\My Jar
		// Files\\Drivers\\IEDriverServer.exe");
		// InternetExplorerDriver ie = new InternetExplorerDriver();
		// ie.get("http://google.com");

	}

}
