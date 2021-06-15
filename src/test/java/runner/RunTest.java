package runner;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import java.io.File;


/**
 * @author ALEXANDER GARCIA
 *
 */

// Uncomment @RunWith if you are using Junit to run Test
@RunWith(Cucumber.class)
@CucumberOptions(features={"src//test//java//features"}
		,glue={"stepdefinations","utility"}
		,plugin = {"pretty","com.cucumber.listener.ExtentCucumberFormatter:test-output/report.html", "json:Test-Output/cucumber.json"}
		,monochrome = true
//                    ,tags ={"@A02"}  	//  "@appium,@sc02","~@sc01 "
//                    ,tags ={"@WEB3,@SC01,@SC02,@SC03","~@SC04","~@SC05"}  	//  "@appium,@sc02","~@sc01 "
//                    ,tags ={"@web1,@SC01","~@SC04"}  	//  "@appium,@sc02","~@sc01 "
		,tags ={"@appium3,@A04"} //@A02,@A03
//					  ,tags ={"@WEB2,@W03"}
)
@Test
public class
RunTest extends AbstractTestNGCucumberTests {
	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File("config/report.xml"));

	}
}

