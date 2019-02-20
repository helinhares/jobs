package utils;
import org.junit.rules.TestWatcher;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class TestRule extends TestWatcher {

	private static WebDriver driver;

	public TestRule() {
		super();
	}
	
	public static WebDriver getDriver() {
		return driver;
	}

	public static void abrirChrome() {
		System.setProperty("webdriver.chrome.driver", "DRIVERS/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		options.addArguments("--disable-print-preview");
		options.addArguments("--lang=pt-br");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);

		driver = new ChromeDriver(capabilities);
		driver.manage().window().maximize();
	}
	
	public static void  abrirUrl(String url) {
		abrirChrome();
		WebDriver driver = getDriver();
		driver.navigate().to(url);
	}
	
	@Before
	public void beforeCenario(String url) {
	

		
	}

	@After
	public void afterCenario() {

		// FINALIZA DRIVER
		if (driver != null) {
			driver.close();
			driver.quit();
			driver = null;
		}

	}
}