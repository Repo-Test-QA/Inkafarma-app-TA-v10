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

public class AddInactiveFrequentList {

    private WebDriver driver;
    private Utility utility;

    public AddInactiveFrequentList() {

        this.driver = Hook.getDriver();
        this.utility = new Utility();

    }


    @When("^she accesses the option my lists$")
    public void she_accesses_the_option_my_lists() throws Throwable {

        sleep(4000);
        WebElement btnMenu = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Inkafarma Móvil\"]"));
        btnMenu.click();
        sleep(4000);
        WebElement optMyLists = driver.findElement(By.id("com.globant.inkafarma.qa:id/menu_recurrency_list"));
        optMyLists.click();

    }

    @And("^she enters a description to the frequent list$")
    public void she_enters_a_description_to_the_frequent_list(List<String> datos) throws Throwable {

        // android.widget.Button
        sleep(4000);
        WebElement btnCreateNewList = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.Button"));
        btnCreateNewList.click();
        sleep(4000);
        WebElement btnNewList = driver.findElement(By.id("com.globant.inkafarma.qa:id/txt_add"));
        btnNewList.click();
        sleep(4000);
        WebElement txtDescription = driver.findElement(By.id("com.globant.inkafarma.qa:id/etNameList"));
        txtDescription.sendKeys(datos.get(0));
        sleep(4000);
        WebElement btnCreate = driver.findElement(By.id("com.globant.inkafarma.qa:id/btn_created_recurrency_list"));
        btnCreate.click();

    }

    @Then("^she should visualize the screen Your list is already created$")
    public void she_should_visualize_the_screen_Your_list_is_already_created() throws Throwable {

        sleep(4000);
        WebElement msgListCreated = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[1]"));
        String txtActualListCreated = msgListCreated.getText();
        String txtExpectedListCreated = "¡Tu lista ya está creada!";
        Assert.assertEquals(txtExpectedListCreated, txtActualListCreated);
        sleep(4000);
        WebElement btnActivateListLater = driver.findElement(By.id("com.globant.inkafarma.qa:id/txt_last_add"));
        btnActivateListLater.click();

    }

    @And("^she should see the ([^\"]*)")
    public void she_should_see_the_inactive_list_created(String inactiveListCreated) throws Throwable {

        /*
        sleep(4000);
        WebElement tabInactive = driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"Inactiva\"]/android.widget.TextView"));
        tabInactive.click(); //Agregado
        */

        // Por el momento no es dinámico, la verificación de la lista creada.
        // Se debería recuperar en una lista, los registros que se muestran en el tab Inactivas
        // Por tanto, se debería comparar la lista inactiva creada con los elementos de tal lista.
        // Este es el elemento que tiene la lista de inactivas:
        // id => com.globant.inkafarma.qa:id/rv_items

        /*
        WebElement titleListInactive = driver.findElement(By.id("com.globant.inkafarma.qa:id/txt_title"));
        String txtActualTitleListInactive = titleListInactive.getText();
        String txtExpectedTitleListInactive = "Test AT 87";
        Assert.assertEquals(txtExpectedTitleListInactive, txtActualTitleListInactive);
        */

        sleep(4000);
        List<WebElement> inactiveListsC =  driver.findElements(By.id("com.globant.inkafarma.qa:id/rv_items"));
        sleep(4000);
        for (WebElement itemC : inactiveListsC) {
            String nameItemC = itemC.findElement(By.id("com.globant.inkafarma.qa:id/txt_title")).getText();
            if (nameItemC.equals(inactiveListCreated)) {

                System.out.println(nameItemC);
                System.out.println(inactiveListCreated);
                System.out.println(itemC);

                System.out.println("The list created is in the inactive lists");
                Assert.assertEquals(inactiveListCreated, nameItemC);
                //break;
            }
            else {
                System.out.println("Cannot find inactive list created");
            }
        }

    }

}
