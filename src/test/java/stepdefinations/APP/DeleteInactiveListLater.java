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

public class DeleteInactiveListLater {

    private WebDriver driver;
    private Utility utility;

    public DeleteInactiveListLater() {

        this.driver = Hook.getDriver();
        this.utility = new Utility();

    }

    @When("^she chooses the inactive list")
    public void she_chooses_the_inactive_list(List<String> inactiveListToRemove) throws Throwable {

        sleep(4000);
        WebElement pageListRL = driver.findElement(By.className("androidx.recyclerview.widget.RecyclerView"));
        List<WebElement> inactiveListsRL = pageListRL.findElements(By.className("android.widget.LinearLayout"));

        for (WebElement itemRL : inactiveListsRL) {
            String nameItemRL = itemRL.findElement(By.className("android.widget.TextView")).getText();
            if (nameItemRL.equals(inactiveListToRemove.get(0))) {
                itemRL.click();
                break;
            } else {
                System.out.println("The element is not in the grid of inactive lists");
            }
        }

        sleep(4000);
        WebElement btnUnderstandRL = driver.findElement(By.id("com.globant.inkafarma.qa:id/btnUnderstand"));
        btnUnderstandRL.click();

    }

    @And("^she decides to delete the list at another time")
    public void she_decides_to_delete_the_list_at_another_time() throws Throwable {

        sleep(4000);
        WebElement btnDeleteListRL = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView"));
        btnDeleteListRL.click();
        sleep(4000);
        WebElement btnCancel = driver.findElement(By.id("com.globant.inkafarma.qa:id/txtCancel"));
        btnCancel.click();
        sleep(4000);

    }

    @Then("^she should visualize the inactive list")
    public void she_should_visualize_the_inactive_list(List<String> inactiveListEnabled) throws Throwable {

        sleep(4000);
        WebElement txtInactiveListEnabled = driver.findElement(By.className("android.widget.TextView"));
        String txtActualInactiveListEnabled = txtInactiveListEnabled.getText();
        String txtExpectedInactiveListEnabled = inactiveListEnabled.get(0);
        Assert.assertEquals(txtExpectedInactiveListEnabled, txtActualInactiveListEnabled);
        sleep(4000);

    }
}
