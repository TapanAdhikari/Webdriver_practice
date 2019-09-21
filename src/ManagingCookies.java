import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ManagingCookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver",
				"D:\\My Software\\My Jar Files\\Drivers\\browser\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://cnn.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Set<Cookie> cookies = driver.manage().getCookies();
		Iterator<Cookie> it = cookies.iterator();
		while (it.hasNext()) {
			Cookie c = it.next();
			System.out.println(c.getName() + "----------" + c.getValue());

		}

	}

}
