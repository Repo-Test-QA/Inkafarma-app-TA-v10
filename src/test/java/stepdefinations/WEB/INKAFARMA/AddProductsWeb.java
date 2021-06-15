package stepdefinations.WEB.INKAFARMA;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.*;
import utility.Hook;

import java.awt.event.MouseWheelEvent;
import java.util.List;
import static java.lang.Thread.sleep;


public class AddProductsWeb {

   private WebDriver driver;
   public AddProductsWeb() {
      this.driver = Hook.getDriver();
   }

   @Given("^Ingreso un producto en el buscador ([^\"]*) y presiono enter$")
   public void ingreso_un_producto_en_el_buscador_producto_y_presiono_enter(String Producto) throws Throwable {

      //click en el buscador
      driver.findElement(By.xpath("//input[@type='search']")).sendKeys(Producto);
      sleep(2000);
      driver.findElement(By.xpath("//input[@type='search']")).sendKeys(Keys.ENTER);



      //logica nueva
       sleep(3500);
       driver.findElement(By.cssSelector(".button-add-product")).click();



   }

   @Given("^Agrego uno o varios productos ([^\"]*), ([^\"]*), ([^\"]*)")
   public void agrego_uno_o_varios_productos_Producto1_Producto2_Producto3(String Producto1, String Producto2, String Producto3) throws Throwable {
//      JavascriptExecutor js = (JavascriptExecutor) driver;
//      js.executeScript("window.scrollBy(0,130)");
//      driver.findElements(By.cssSelector(".button-add-product.ng-scope")).get(1).click();
      //click en Agregar
      sleep(3500);
//      driver.findElements(By.cssSelector(".button-add-product.ng-scope")).get(1).click();
//      sleep(1000);

      driver.navigate().to("https://qa.inkafarma.pe:9090/p/product-detail?sku="+Producto1+"");
      sleep(3500);
      driver.findElement(By.cssSelector(".button-add-product")).click();
//      sleep(2000);
//      driver.navigate().to("https://qa.inkafarma.pe:9090/p/product-detail?sku="+Producto2+"");
//      sleep(3500);
//      driver.findElement(By.cssSelector(".button-add-product")).click();
//      sleep(2000);
//      driver.navigate().to("https://qa.inkafarma.pe:9090/p/product-detail?sku="+Producto3+"");
//      sleep(3500);
//      driver.findElement(By.cssSelector(".button-add-product")).click();

//      driver.findElement(By.cssSelector(".col-xs-3.col-sm-3.no-padding.containers.plus")).click();
//      sleep(1000);
//      driver.findElements(By.cssSelector(".button-add-product.ng-scope")).get(7).click();
   }

   @Given("^Luego selecciono el carrito de compras$")
   public void luego_selecciono_el_carrito_de_compras() throws Throwable {

      //click en el shopping card
      sleep(2000);
      driver.findElement(By.cssSelector(".button.button-cart.display-center")).click();
   }

   @When("^Selecciono el boton comprar$")
   public void selecciono_el_boton_comprar() throws Throwable {

      JavascriptExecutor js = (JavascriptExecutor) driver;
      sleep(4000);
      List<WebElement> ListCart = driver.findElements(By.className("cart-product-list"));
      sleep(500);
      WebElement b = ListCart.get(0);
      js.executeScript("arguments[0].scrollBy(0,100);", b);
      sleep(3000);
      driver. findElement(By.cssSelector(".btn.btn-cart-checkout.width-100.animate-right.close-sidebar")).click();

   }

   @Then("^Se muestra la pantalla de inicion de session elegimos iniciar sin cuenta$")
   public void Se_muestra_la_pantalla_de_inicion_de_session_elegimos_iniciar_sin_cuenta() throws Throwable {

      sleep(3000);
      driver. findElement(By.id("continuar-sin-cuenta")).click();

      sleep(2000);
      driver. findElement(By.cssSelector(".arrow-close.cursor.pull-right.ng-scope")).click();
      sleep(2500);
      driver.findElement(By.cssSelector(".button.button-cart.display-center")).click();
      sleep(2500);
      driver. findElement(By.cssSelector(".btn.btn-cart-checkout.width-100.animate-right.close-sidebar")).click();
      sleep(2000);
      driver. findElement(By.id("continuar-sin-cuenta")).click();
   }

   @And("^Ingreso mis datos obligatorios ([^\"]*), ([^\"]*), ([^\"]*)")
   public void Ingreso_mis_datos_obligatorios(String Nombres, String Numero, String Email) throws Throwable {

      sleep(12000);
      driver.findElement(By.id("anonymousName")).sendKeys(Nombres);
      sleep(1000);
      driver.findElement(By.id("anonymousPhone")).sendKeys(Numero);
      sleep(1000);
      driver.findElement(By.id("anonymousEmail")).sendKeys(Email);
      sleep(500);

      List<WebElement> check = driver.findElements(By.cssSelector("ul.unstyled li .styled-checkbox~label"));
      sleep(500);
      check.get(0).click();
      sleep(1000);
      check.get(1).click();
   }

   @And("^Selecciono el boton de continuar$")
   public void Selecciono_el_boton_de_continuar() throws Throwable {

      sleep(2000);
      driver.findElement(By.cssSelector(".checkout-btn.checkout-btn-uppercase.checkout-btn-green")).click();
   }

   @And("^Ingreso un horario para mi pedido$")
   public void Ingreso_un_horario_para_mi_pedido() throws Throwable {
      JavascriptExecutor js = (JavascriptExecutor) driver;
      sleep(3000);
      js.executeScript("window.scrollBy(0,500)");
      sleep(1000);
      driver.findElement(By.id("selectHour")).click();
      sleep(500);
      List<WebElement> horas = driver.findElements(By.cssSelector(".select-schedule-hour .select-item"));
      WebElement hora = horas.get(0);
      hora.click();
      sleep(1500);
      driver.findElement(By.cssSelector(".checkout-btn.checkout-btn-uppercase.checkout-btn-green.cg-schedule-btn")).click();
   }

   @And("^Elijo un medio de pago ([^\"]*)")
   public void elijo_un_medio_de_pago_Medio_Pago(String Medio_Pago ) throws Throwable {

      //Boton Agregar medio de pago
      sleep(5500);
      driver.findElement(By.xpath("/html/body/div/section/div/section/div/div[1]/div/div/div[1]/div[2]/checkout-payment/div/div/div[2]/div/div[2]/ng-include/div/button")).click();
//      List<WebElement> Listboton = driver.findElements(By.className("checkout-btn checkout-btn-uppercase checkout-btn-green"));
//      WebElement element= Listboton.get(2);
//      element.click();
      sleep(4000);
      JavascriptExecutor js = (JavascriptExecutor) driver;
      //Elijo medio de pago
      if (Medio_Pago.equals("Efectivo En Soles (S/)")) {
         driver.findElement(By.id("cashPaymentMethod")).sendKeys("100");
         sleep(2000);
      } else {
         js.executeScript("window.scrollBy(0,-1500)");
         sleep(1500);
         List<WebElement> ListPay = driver.findElements(By.cssSelector(".panel-collapse.collapse.in .row.ng-scope .ng-binding"));
         for (WebElement ele : ListPay) {
            String pay = ele.getText();
            System.out.println("el testo es: " + pay);
            if (pay.equals(Medio_Pago)) {
               js.executeScript("window.scrollBy(0,135)");
               sleep(500);
               System.out.println("el testo es: " + pay);
               sleep(500);
               ele.click();
               sleep(5000);
               js.executeScript("window.scrollBy(0,135)");
               sleep(1500);
               break;
            }
         }
      }
      driver.findElement(By.cssSelector(".btn.btn-ct-footer.btn-ct-footer-green")).click();
      sleep(5500);
      js.executeScript("window.scrollBy(0,200)");
   }

   @When("^Selecciono confirmar pedido")
   public void Selecciono_confirmar_pedido() throws Throwable {

      sleep(3000);
      driver.findElement(By.cssSelector(".checkout-btn.checkout-btn-uppercase.checkout-btn-green.checkout-btn-big")).click();
      sleep(5500);
      driver.findElement(By.cssSelector(".btn.btn-checkout.width-100.center-block.btn-continue")).click();

   }


}
