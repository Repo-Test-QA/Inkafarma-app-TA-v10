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

public class IT_43_Ordenamiento_Fecha {

    public WebDriver driver;
    public IT_43_Ordenamiento_Fecha() {this.driver = Hook.getDriver(); }

    //IT-53 SC02
    @Given("^Me encuentro en el site de FarmaDashboard en el reporte$")
    public void Me_encuentro_en_el_site_de_FarmaDashboard_en_el_reporte() throws Throwable {

        driver.navigate().to("https://inkatrackerlite-ci02.cindibyinkafarma.com/#/reports/orders/drugstores");
        sleep(2000);
    }

    @And("Eligo los filtros ([^\"]*), ([^\"]*), ([^\"]*), ([^\"]*), ([^\"]*), ([^\"]*), ([^\"]*), ([^\"]*), ([^\"]*)")
    public void Eligo_los_filtros_canal_estado_local_fechainicio_fechafin_comanda_dnicl_dnitp(String canal, String estado, String local , String fechainicio,
                String fechafin, String comanda, String telefono, String dnicl,String dnitp) throws Throwable {
        //canal de venta
        driver.findElement(By.cssSelector("#inputChannel")).click();
        sleep(600);
        driver.findElement(By.cssSelector("#inputChannel option[value='"+canal+"']")).click();
        sleep(600);
        //Selecciono un estado
        driver.findElement(By.cssSelector("#inputStatus")).click();
        sleep(600);
        driver.findElement(By.cssSelector("#inputStatus option[value='"+estado+"']")).click();
        sleep(600);
        //Selecciono un local
        driver.findElement(By.cssSelector("#inputLocal")).click();
        sleep(500);
        driver.findElement(By.cssSelector("#inputLocal option[value='"+local+"']")).click();
        sleep(500);
        driver.findElement(By.id("inputDateIn")).click();
        driver.findElement(By.id("inputDateIn")).sendKeys(fechainicio);
        sleep(1000);
        driver.findElement(By.id("inputDateFn")).click();
        driver.findElement(By.id("inputDateFn")).sendKeys(fechafin);
        sleep(1000);
        driver.findElement(By.id("inputNumDelivery")).sendKeys(comanda);
        sleep(1000);
        driver.findElement(By.id("inputPhoneClient")).sendKeys(telefono);
        sleep(1000);
        driver.findElement(By.id("inputDniClient")).sendKeys(dnicl);
        sleep(1000);
        driver.findElement(By.id("inputDniTrasnport")).sendKeys(dnitp);
    }


    @When("^Seleciono el boton consultar$")
    public void seleciono_el_boton_consultar() throws Throwable {
        sleep(1000);
        driver.findElement(By.id("consultar")).click();
    }

    @Then("^El site muestra los resultados$")
    public void el_site_muestra_los_resultados() throws Throwable {
        sleep(1500);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
    }

    @Then("^Hago click sobre el filtro Fecha-Hora Promesa$")
    public void hago_click_sobre_el_filtro_Fecha_Hora_Promesa() throws Throwable {
        sleep(3000);
        driver.findElements(By.className("cell-filter")).get(1).click();
        driver.findElements(By.className("cell-filter")).get(1).click();
        sleep(4000);
        driver.findElements(By.className("cell-filter")).get(1).click();
        sleep(2000);
    }

    @Then("^El resultado de las ordenes se muestra en forma descendete por Fecha-Hora Promesa$")
    public void el_resultado_de_las_ordenes_se_muestra_en_forma_descendete_por_Fecha_Hora_Promesa() throws Throwable {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        sleep(1000);
        WebElement b =   driver.findElements(By.className("table-responsive")).get(0);
        js.executeScript("arguments[0].scrollBy(0,100);", b);
        sleep(2000);
        js.executeScript("window.scrollBy(0,-1000)");
        sleep(1000);
//
//        driver.findElement(By.cssSelector(".pagination-next a")).click();
//        sleep(2500);
//        driver.findElement(By.cssSelector(".pagination-previous a")).click();
//        sleep(2000);
//        List<WebElement> ele =  driver.findElements(By.cssSelector(".table-tbody-row.cursor-pointer"));
//        WebElement ele1 = ele.get(3);
//        ele1.click();
//        sleep(3000);
//        driver.findElement(By.cssSelector(".btn.btn-secondary.btnDialogWhite")).click();
//        sleep(2000);
//        ele1.findElement(By.id("btnCancel")).click();
//        sleep(2000);
//        driver.findElement(By.cssSelector(".btn.btn-secondary.btnDialogWhite")).click();
//        sleep(3500);
//        js.executeScript("window.scrollBy(0,-1000)");
//        sleep(1000);

    }

    //IT-53 SC05
    @Then("^Hago click sobre el filtro Fecha-Hora Pedido$")
    public void hago_click_sobre_el_filtro_Fecha_Hora_Pedido() throws Throwable {
        sleep(3000);


    }
    @Then("^El resultado de las ordenes se muestra en forma descendete por Fecha-Hora Pedido$")
    public void el_resultado_de_las_ordenes_se_muestra_en_forma_descendete_por_Fecha_Hora_Pedido() throws Throwable {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        sleep(3000);

        driver.findElement(By.cssSelector(".pagination-next a")).click();
        sleep(2500);
        List<WebElement> ele =  driver.findElements(By.cssSelector(".table-tbody-row.cursor-pointer"));
        WebElement ele1 = ele.get(3);
        ele1.click();
        sleep(3000);
        driver.findElement(By.cssSelector(".btn.btn-secondary.btnDialogWhite")).click();
        sleep(2000);
        ele1.findElement(By.id("btnCancel")).click();
        sleep(2000);
        driver.findElement(By.cssSelector(".btn.btn-secondary.btnDialogWhite")).click();
        sleep(3500);
        js.executeScript("window.scrollBy(0,-1000)");
        sleep(1000);
    }

}
