package stepdefinations.WEB.INKAFARMA;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.*;
import utility.Hook;

import java.util.List;

import static java.lang.Thread.sleep;

public class DireccionWebNoLogin {

   private WebDriver driver;
   public DireccionWebNoLogin() {
      this.driver = Hook.getDriver();
   }

   @And("^Selecciono la opción de ubicacion y me redirecciona una pantalla de direciones$")
   public void selecciono_la_opción_de_ubicacion_y_me_redirecciona_una_pantalla_de_direciones() throws Throwable {
      sleep(5000);
      //click en el buscador
      driver.findElement(By.xpath("//input[@type='search']")).click();
      sleep(5000);
      driver.findElement(By.xpath("//input[@type='search']")).sendKeys("panadol");
      sleep(2000);
      driver.findElement(By.xpath("//input[@type='search']")).sendKeys(Keys.ENTER);





      JavascriptExecutor js = (JavascriptExecutor) driver;
       // Registrar Dirección del usuario
       driver.findElement(By.cssSelector(".button.header-input.input-location.ellipsis-text.display-center")).click();
   }

   @Given("^Elijo la opcion de agregar nueva direccion$")
   public void elijo_la_opcion_de_agregar_nueva_direccion() throws Throwable {
      sleep(4000);
      driver.findElement(By.cssSelector(".row.no-margin")).click();

   }

   @Given("^Ingreso todo los campos obligatorios ([^\"]*), ([^\"]*), ([^\"]*), ([^\"]*), ([^\"]*), ([^\"]*), ([^\"]*), ([^\"]*)")
   public void ingreso_todo_los_campos_obligatorios_Distrito_Tipo_Via_Nombre_Via_Numero_Via_Depart_Referencia_Nombre_Lugar_Nombre_Personalizado(String Distrito, String Tipo_Via, String Nombre_Via, String Numero_Via, String Depart, String Referencia, String Nombre_Lugar, String Nombre_Personalizado) throws Throwable {
      JavascriptExecutor js = (JavascriptExecutor) driver;
      sleep(4000);
      driver.findElement(By.id("district")).click();
      sleep(2000);
      List<WebElement> Distritos = driver.findElements(By.className("choose-name"));
      for (WebElement ele : Distritos) {
         String distrito = ele.getText();
         if (distrito.equals(Distrito)) {
            ele.click();
            break;
         }
      }

      sleep(1000);
      driver.findElements(By.cssSelector(".btn.btn-modal.width-100.small")).get(1).click();
      sleep(1000);
      driver.findElement(By.id("way")).click();
      sleep(1000);

      List<WebElement> TipoVias = driver.findElements(By.className("choose-name"));
      for (WebElement ele1 : TipoVias) {
         String via = ele1.getText();
         if (via.equals(Tipo_Via)) {
            ele1.click();
            break;
         }
      }
      sleep(1000);
      driver.findElements(By.cssSelector(".btn.btn-modal.width-100.small")).get(1).click();
      sleep(1000);
      driver.findElement(By.id("street")).sendKeys(Nombre_Via);
      sleep(1000);
      driver.findElement(By.id("number")).sendKeys(Numero_Via);
      sleep(1000);
      driver.findElement(By.id("apartment")).sendKeys(Depart);
      sleep(1000);
      driver.findElement(By.id("notes")).sendKeys(Referencia);
      sleep(1000);
      driver.findElement(By.id("name")).click();
      sleep(1000);

      List<WebElement> Lugar = driver.findElements(By.className("choose-name"));
      for (WebElement ele2 : Lugar) {
         String lugar = ele2.getText();
         if (lugar.equals(Nombre_Lugar)) {
            ele2.click();
            break;
         }
      }
      driver.findElements(By.cssSelector(".btn.btn-modal.width-100.small")).get(1).click();
      sleep(1000);
      js.executeScript("window.scrollBy(0,130)");
      sleep(1000);
      driver.findElement(By.cssSelector("body > div.ng-scope > section > div > section > div > div > div > div:nth-child(2) > form > div > ng-include > div:nth-child(7) > input")).sendKeys(Nombre_Personalizado);

   }

   @When("^Selecciono boton continuar")
   public void selecciono_boton_continuar() throws Throwable {

      sleep(1000);
      driver.findElement(By.cssSelector(".button-address.ng-scope")).click();

   }

   @When("^Selecciono boton confirmar")
   public void selecciono_boton_confirmar() throws Throwable {

      sleep(4000);
      driver.findElements(By.cssSelector(".button-address")).get(1).click();

   }

   @When("^Selecciono boton aceptar")
   public void selecciono_boton_aceptar() throws Throwable {

      sleep(6000);
      driver.findElement(By.cssSelector(".btn.btn-ct-footer.btn-ct-footer-green")).click();
   }

   @When("^Se muestra la pantalla si deseo cambiar mi direccion y elijo no")
   public void see_muestra_la_pantalla_si_deseo_cambiar_mi_direccion_y_elijo_no() throws Throwable {

      sleep(6000);
      //dicidir si usar ubicacion actual ---NO get(1))--- SI get(0))
      driver.findElements(By.cssSelector(".btn.btn-current-location")).get(1).click();
      sleep(2000);
   }




}
