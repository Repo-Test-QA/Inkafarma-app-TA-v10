package stepdefinations.WEB.INKATRACKER_LITE;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Hook;

import java.util.List;

import static java.lang.Thread.sleep;

public class IT_50_Entregar_Pedidos_desde_Asignado {

    public WebDriver driver;
    public IT_50_Entregar_Pedidos_desde_Asignado() {this.driver = Hook.getDriver(); }

    //IT-53 SC03
    @Given("^Eligo una orden y selecciono el boton de Entregar$")
    public void Eligo_una_orden_y_selecciono_el_boton_de_Entregar() throws Throwable {



    }

    @And("Elijo otra orden y selecciono el boton Cancelar")
    public void Elijo_otra_orden_y_selecciono_el_boton_Cancelar() throws Throwable {

    }


    @When("^El resultado de las ordenes se muestra con los ultimos estados y los botones desaparecen$")
    public void El_resultado_de_las_ordenes_se_muestra_con_los_ultimos_estados_y_los_botones_desaparecen() throws Throwable {


    }



    //IT-53 SC06
    @Then("^El site muestra los resultados y los botones de Entregar y Cancelar no se muestran$")
    public void El_site_muestra_los_resultados_y_los_botones_de_Entregar_y_Cancelar_no_se_muestran() throws Throwable {
        sleep(3000);


    }

}
