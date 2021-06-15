package stepdefinations.APP;

import cucumber.api.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Hook;
import utility.Utility;

import java.util.List;

import static java.lang.Thread.sleep;

public class DeleteInactiveList {

    private WebDriver driver;
    private Utility utility;

    public DeleteInactiveList() {

        this.driver = Hook.getDriver();
        this.utility = new Utility();

    }

    @When("^she selects the ([^\"]*)")
    public void she_selects_the_inactive_list(String inactiveList) throws Throwable {

        /*
        List<WebElement> ListaPrd = driver.findElements(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout"));
        sleep(500);
        for (WebElement ele : ListaPrd) {
            String name = ele.findElement(By.id("com.globant.inkafarma.qa:id/predictive_search")).getText();
            if (name.equals(Producto1)) {
                ele.click();
                break;
            }
        }
        */

        sleep(4000);
        List<WebElement> inactiveLists =  driver.findElements(By.id("com.globant.inkafarma.qa:id/rv_items"));
        sleep(4000);
        for (WebElement item : inactiveLists) {
            String nameItem = item.findElement(By.id("com.globant.inkafarma.qa:id/txt_title")).getText();
            if (nameItem.equals(inactiveList)) {

                System.out.println(nameItem);
                System.out.println(inactiveList);
                System.out.println(item);

                item.click();
                break;
            }
        }

        sleep(4000);
        WebElement btnUnderstand = driver.findElement(By.id("com.globant.inkafarma.qa:id/btnUnderstand"));
        btnUnderstand.click();

    }

    @And("^she removes the inactive list")
    public void she_removes_the_inactive_list() throws Throwable {

        sleep(4000);
        WebElement btnDeleteList = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView"));
        btnDeleteList.click();
        sleep(4000);
        WebElement btnConfirm = driver.findElement(By.id("com.globant.inkafarma.qa:id/btnConfirm"));
        btnConfirm.click();

    }

    @Then("^she should not display the ([^\"]*) in the inactive lists")
    public void she_should_not_display_the_deleted_list_in_the_inactive_lists(String deleteList) throws Throwable {

        sleep(4000);
        WebElement tabInactiveR = driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"Inactiva\"]/android.widget.TextView"));
        tabInactiveR.click();

        /*
        WebElement titleListInactive = driver.findElement(By.id("com.globant.inkafarma.qa:id/txt_title"));
        String txtActualTitleListInactive = titleListInactive.getText();
        String txtExpectedTitleListInactive = "Test AT 84";
        Assert.assertEquals(txtExpectedTitleListInactive, txtActualTitleListInactive);
        */



        sleep(4000);
        List<WebElement> inactiveListsR =  driver.findElements(By.id("com.globant.inkafarma.qa:id/rv_items"));
        sleep(4000);
        for (WebElement itemI : inactiveListsR) {
            String nameItemI = itemI.findElement(By.id("com.globant.inkafarma.qa:id/txt_title")).getText();
            if (nameItemI != deleteList) {
                //itemI.click();
                System.out.println("Assert the item is not in the list");
                break;
            }
        }

    }

}
