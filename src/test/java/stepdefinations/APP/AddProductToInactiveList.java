package stepdefinations.APP;

import cucumber.api.java.en.*;
import net.bytebuddy.asm.Advice;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Hook;
import utility.Utility;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.List;

import static java.lang.Thread.sleep;

public class AddProductToInactiveList {

    private WebDriver driver;
    private Utility utility;

    public AddProductToInactiveList() {

        this.driver = Hook.getDriver();
        this.utility = new Utility();

    }


    @Given("^she is in the inactive lists tab$")
    public void she_is_in_the_inactive_lists_tab() throws Throwable {

        sleep(4000);
        WebElement btnMenu = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Inkafarma Móvil\"]"));
        btnMenu.click();
        sleep(4000);
        WebElement optMyLists = driver.findElement(By.id("com.globant.inkafarma.qa:id/menu_recurrency_list"));
        optMyLists.click();
        sleep(4000);
        WebElement tabInactive = driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"Inactiva\"]/android.widget.TextView"));
        tabInactive.click();

    }


    @When("^she accesses the inactive list$")
    public void she_accesses_the_inactive_list() throws Throwable {

        sleep(4000);
        WebElement selectListInactive = driver.findElement(By.id("com.globant.inkafarma.qa:id/txt_title"));
        selectListInactive.click();
        sleep(4000);
        WebElement btnUnderstand = driver.findElement(By.id("com.globant.inkafarma.qa:id/btnUnderstand"));
        btnUnderstand.click();
        sleep(4000);
        WebElement btnEdit = driver.findElement(By.id("com.globant.inkafarma.qa:id/txtEdit"));
        btnEdit.click();
        sleep(4000);
        WebElement btnAddProducts = driver.findElement(By.id("com.globant.inkafarma.qa:id/btn_add_product"));
        btnAddProducts.click();


    }

    @And("^she adds the ([^\"]*) to the inactive list")
    public void she_adds_the_product_to_the_inactive_list(String product) throws Throwable {

        sleep(4000);
        // Hacer click sobre la caja de texto (es un elemento diferente al siguiente elemento),
        // antes de ingresar el texto.
        // Reconoce este elemento este xpath también=> /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView
        WebElement clickFocusTxtSearch = driver.findElement(By.id("com.globant.inkafarma.qa:id/layout_content_search"));
        clickFocusTxtSearch.click();
        sleep(4000);
        WebElement txtSearch = driver.findElement(By.id("com.globant.inkafarma.qa:id/search_src_text"));
        txtSearch.sendKeys(product);

        //sleep(6000);
        //No realiza el enter y se cae.
        //txtSearch.sendKeys(Keys.ENTER);

        //Se muestra el elemento, el enlace ver resultados, pero no lo encuentra, por eso se cae.
        //com.globant.inkafarma.qa:id/predictive_search


        sleep(6000);
        WebElement linkResults = driver.findElement(By.id("com.globant.inkafarma.qa:id/layout_predictive_search"));
        linkResults.click();
        sleep(6000);


        //com.globant.inkafarma.qa:id/product_item_name
        WebElement selectProduct = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ImageView"));
        selectProduct.click();

    }

    @Then("^she should see the confirmation message$")
    public void she_should_see_the_confirmation_message() throws Throwable {




    }


}
