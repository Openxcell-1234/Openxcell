package testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestBase {
	
public static WebDriver driver;

	
	public void prerequisite() {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("--disable-notifications");
//		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(option);
		driver.get("https://expresslanyard.wpengine.com");
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

}
