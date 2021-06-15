package stepdefinations.DASHBOARD_ANTIGUO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import utility.Hook;

import static java.lang.Thread.sleep;

public class AgregarCategoriaDbs {

    private WebDriver driver;
    public AgregarCategoriaDbs() {
        this.driver = Hook.getDriver();
    }

    @Given("^Me encuetro en el panel del home de InkaDashboard y seleciono el icono de Categorias$")
    public void me_encuetro_en_el_panel_del_home_de_InkaDashboard_y_seleciono_el_icono_de_Categorias() throws Throwable {

        driver.navigate().to("http://inkadashboard-qa.inkafarmadigital.pe/#/administrador");
        sleep(1000);
        driver.findElement(By.cssSelector("body > div:nth-child(1) > section > div > div > div > div:nth-child(1) > div > div.navbar-submenu-elem.ng-scope.ng-isolate-scope.navbar-submenu-elem--active > li:nth-child(6) > a")).click();
        sleep(3000);
    }

    @When("^Selecciono el boton Editar y selecciono el boton Agregar Categoria$")
    public void selecciono_el_boton_Editar_y_selecciono_el_boton_Agregar_Categoria() throws Throwable {

        driver.findElement(By.cssSelector(".btn.btn-success")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("body > div > section > div > div > div > div.row-fluid.menu-container > ng-include > div > div.b-cat-add-new > button")).click();
        Thread.sleep(2000);

    }

    @Then("^Se muestra el PopUp donde ingresaremos el Titulo: ([^\"]*) el Icono: ([^\"]*) y el Link: ([^\"]*)$")
    public void se_muestra_el_PopUp_donde_ingresaremos_el_Titulo_Titulo_del_icono_el_Icono_Icono_y_el_Link_Link(String Titulo_del_icono ,String Icono,String Link) throws Throwable {

        driver.findElement(By.cssSelector(".form-control.input-lg.ng-pristine.ng-untouched.ng-valid.ng-empty")).sendKeys(Titulo_del_icono);
        sleep(1000);
        driver.findElement(By.cssSelector(".modal-select-control")).click();
        sleep(2000);
        driver.findElement(By.cssSelector("option[value='"+Icono+"']")).click();
        sleep(200);
        driver.findElement(By.cssSelector(".form-control.input-lg.ng-pristine.ng-untouched.ng-valid.ng-empty")).sendKeys(Link);
        sleep(1500);
    }

    @When("^Selecionames el boton Guardar$")
    public void selecionames_el_boton_Guardar() throws Throwable {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.findElement(By.cssSelector(".btn.btn-primary")).click();
        sleep(1500);
        driver.findElement(By.cssSelector(".btn.btn-primary")).click();
        sleep(2500);
        driver.findElement(By.cssSelector(".btn.btn-primary")).click();

        sleep(2000);
        js.executeScript("window.scrollBy(0,5000)");
        sleep(3000);
        js.executeScript("window.scrollBy(0,-5000)");
    }



}
