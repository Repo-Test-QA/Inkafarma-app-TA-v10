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

public class AddInactiveList {

    private WebDriver driver;
    private Utility utility;

    public AddInactiveList() {

        this.driver = Hook.getDriver();
        this.utility = new Utility();

    }

    @When("^she accesses the option my lists")
    public void she_accesses_the_option_my_lists() throws Throwable {

        sleep(4000);
        WebElement btnMenu = driver.findElement(By.className("android.widget.ImageButton"));
        btnMenu.click();
        sleep(4000);
        WebElement optMyLists = driver.findElement(By.id("com.globant.inkafarma.qa:id/menu_recurrency_list"));
        optMyLists.click();

    }

    @And("^she enters a frequent list")
    public void she_enters_a_frequent_list(List<String> frequentList) throws Throwable {

        sleep(4000);
        WebElement btnCreateNewList = driver.findElement(By.className("android.widget.Button"));
        btnCreateNewList.click();
        sleep(4000);
        WebElement btnNewList = driver.findElement(By.id("com.globant.inkafarma.qa:id/txt_add"));
        btnNewList.click();
        sleep(4000);
        WebElement txtDescription = driver.findElement(By.id("com.globant.inkafarma.qa:id/etNameList"));
        txtDescription.sendKeys(frequentList.get(0));
        sleep(4000);
        WebElement btnCreate = driver.findElement(By.id("com.globant.inkafarma.qa:id/btn_created_recurrency_list"));
        btnCreate.click();

    }

    @Then("^she should visualize the screen your list is created")
    public void she_should_visualize_the_screen_your_list_is_created() throws Throwable {

        sleep(4000);
        WebElement msgListCreated = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[1]"));
        String txtActualListCreated = msgListCreated.getText();
        String txtExpectedListCreated = "¡Tu lista ya está creada!";
        Assert.assertEquals(txtExpectedListCreated, txtActualListCreated);

        sleep(4000);
        WebElement btnActivateListLater = driver.findElement(By.id("com.globant.inkafarma.qa:id/txt_last_add"));
        btnActivateListLater.click();

    }

    @And("^she should see the inactive list created")
    public void she_should_see_the_inactive_list_created(List<String> inactiveListCreated) throws Throwable {

        sleep(4000);
        WebElement pageListsC = driver.findElement(By.className("androidx.recyclerview.widget.RecyclerView"));
        List<WebElement> inactiveListsC = pageListsC.findElements(By.className("android.widget.LinearLayout"));

        for (WebElement itemC : inactiveListsC) {
            String nameItemC = itemC.findElement(By.className("android.widget.TextView")).getText();
            if (nameItemC.equals(inactiveListCreated.get(0))) {
                //itemC.click();
                System.out.println("The element is in the grid of inactive lists" + nameItemC);
                //break;
            } else {
                System.out.println("The element is not in the grid of inactive lists");
            }
        }
    }
}
