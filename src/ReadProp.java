import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadProp {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {

		Properties prop = new Properties();

		FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\config.properties");
		// System.getProperty("user.dir") gives current project directory = D:\\My
		// Software\\SELENIUM_JAVA\\Day 1 in WebDriver 3

		// or use D:\\My Software\\SELENIUM_JAVA\\Day 1 in WebDriver
		// 3\\src\\config.properties
		prop.load(ip);

		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("pass"));
		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"D:\\My Software\\My Jar Files\\Drivers\\browser\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equals("ff")) {

			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();

	}

}
