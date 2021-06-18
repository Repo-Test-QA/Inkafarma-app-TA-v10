package stepdefinations.APP;

import cucumber.api.java.en.*;
import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Hook;
import utility.Utility;

import java.util.List;

import static java.lang.Thread.sleep;

public class DeleteInactiveListWithoutProducts {

    private WebDriver driver;
    private Utility utility;

    public DeleteInactiveListWithoutProducts() {

        this.driver = Hook.getDriver();
        this.utility = new Utility();

    }

    @When("^she selects the inactive list")
    public void she_selects_the_inactive_list(List<String> inactiveList) throws Throwable {

        sleep(4000);
        WebElement pageList = driver.findElement(By.className("androidx.recyclerview.widget.RecyclerView"));
        List<WebElement> inactiveLists = pageList.findElements(By.className("android.widget.LinearLayout"));

        for (WebElement item : inactiveLists) {
            String nameItem = item.findElement(By.className("android.widget.TextView")).getText();
            if (nameItem.equals(inactiveList.get(0))) {
                item.click();
                break;
            } else {
                System.out.println("The element is not in the grid of inactive lists");
            }
        }


        /*
        sleep(4000);
        WebElement btnUnderstand = driver.findElement(By.id("com.globant.inkafarma.qa:id/btnUnderstand"));
        btnUnderstand.click();

         */
    }

    @And("^she removes the inactive list")
    public void she_removes_the_inactive_list() throws Throwable {

        sleep(4000);
        WebElement btnDeleteList = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView"));
        boolean isDisplayed = btnDeleteList.isDisplayed();

        if (!isDisplayed) {
            WebElement btnUnderstand = driver.findElement(By.id("com.globant.inkafarma.qa:id/btnUnderstand"));
            btnUnderstand.click();
        }

        sleep(4000);
        btnDeleteList.click();

        sleep(4000);
        WebElement btnConfirm = driver.findElement(By.id("com.globant.inkafarma.qa:id/btnConfirm"));
        btnConfirm.click();


        /*

        sleep(4000);
        WebElement btnUnderstand = driver.findElement(By.id("com.globant.inkafarma.qa:id/btnUnderstand"));
        btnUnderstand.click();
        sleep(4000);
        WebElement btnDeleteList = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView"));
        btnDeleteList.click();
        sleep(4000);
        WebElement btnConfirm = driver.findElement(By.id("com.globant.inkafarma.qa:id/btnConfirm"));
        btnConfirm.click();
        */

    }

    @Then("^she should not display the inactive list deleted in the inactive lists")
    public void she_should_not_display_the_inactive_list_deleted_in_the_inactive_lists(List<String> inactiveListDeleted) throws Throwable {

        sleep(4000);
        WebElement tabInactiveR = driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"Inactiva\"]/android.widget.TextView"));
        tabInactiveR.click();

        sleep(4000);
        WebElement pageListV = driver.findElement(By.className("androidx.recyclerview.widget.RecyclerView"));
        List<WebElement> inactiveListsV = pageListV.findElements(By.className("android.widget.LinearLayout"));

        for (WebElement itemV : inactiveListsV) {
            String nameItemV = itemV.findElement(By.className("android.widget.TextView")).getText();
            if (nameItemV != inactiveListDeleted.get(0)) {
                System.out.println("Assert the item is not in the list");
                //break;
            }
        }
    }
}
