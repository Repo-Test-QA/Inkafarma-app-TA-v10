package utility;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;


public class Hook {

	private static WebDriver driver;

	@Before("@WEB2")
	public WebDriver setUp()
	{
		System.setProperty("webdriver.chrome.driver", "/home/alexander/cindi/apps/chromedriver");
//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		chromeOptions.addArguments("--disable-notifications");
//		driver = new ChromeDriver(chromeOptions);     // --->    Abrir ventanas por cada escenario

		if (driver == null) {
			driver = new ChromeDriver();
		}
		return driver;
	}


	@Before("@appium3")
	public void setUpAppium() throws MalformedURLException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "RF8N31A8NEJ");  //adb phone => RF8N31A8NEJ  ||  //adb Emulador => emulator-5554
        cap.setCapability("autoGrantPermissions", true);
		cap.setCapability("noReset", true);
		cap.setCapability("fullReset", false);
//		cap.setCapability("unicodeKeyboard",true);
//		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		cap.setCapability(CapabilityType.VERSION,"11"); //9.0.0
        cap.setCapability("appPackage", "com.globant.inkafarma.qa");
        cap.setCapability("appActivity","com.globant.inkafarma.feature.splash.SplashActivity");
        driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
        cap.setCapability (MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
//		driver.get("https://inkafarmav2-qa01.cindibyinkafarma.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


//		driver.navigate().to("https://inkafarmav2-qa01.cindibyinkafarma.com/");
//
//		HashMap<String, String> customFindModules = new HashMap<>();
//		customFindModules.put("ai", "test-ai-classifier");
//		cap.setCapability("customFindModules", customFindModules);
//		cap.setCapability("shouldUseCompactResponses", false);

	}
//
	@After
	public void tearDown()

	{
		//driver.quit();
	}

	public static WebDriver getDriver()
	{
		return driver;
	}



}
