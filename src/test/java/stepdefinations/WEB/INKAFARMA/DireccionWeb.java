package stepdefinations.WEB.INKAFARMA;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import static java.lang.Thread.sleep;

import org.openqa.selenium.WebElement;
import utility.Hook;

import java.util.List;

public class DireccionWeb {

   private WebDriver driver;
   public DireccionWeb() {
      this.driver = Hook.getDriver();
   }


   @And("^Mi usuario debe estar logeado en el site$")
   public void mi_usuario_debe_estar_logeado_en_site(String arg1) throws Throwable {

//      String User = driver.findElement(By.cssSelector("#profile-header > span")).getText();
//      System.out.println("El usuario es: " + User);
//      sleep(1000);
   }


    @And("^Selecciono la opción de ubicacion y me redirecciona a una pantalla de direciones$")
    public void selecciono_la_opción_de_ubicacion_y_me_redirecciona_a_una_pantalla_de_direciones() throws Throwable {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Registrar Dirección del usuario
       driver.findElement(By.cssSelector(".button.header-input.input-location.ellipsis-text.display-center")).click();
       sleep(8000);
       driver.findElement(By.cssSelector(".row.no-margin")).click();
       sleep(8000);
       driver.findElement(By.id("district")).click();
       sleep(2000);

       List<WebElement> listas = driver.findElements(By.className("choose-name"));


       for(int i=0; i<listas.size() ; i++){
          WebElement ele = listas.get(i);
          String a = ele.getText();
          if(a.equals("Barranco")){
             ele.click();
             break;
          }
    }

       sleep(2000);
       driver.findElements(By.cssSelector(".btn.btn-modal.width-100.small")).get(1).click();
       sleep(1000);
       driver.findElement(By.id("way")).click();
       sleep(1000);
       driver.findElement(By.cssSelector("#modal-body > div:nth-child(1) > label")).click();
       sleep(1000);
       driver.findElements(By.cssSelector(".btn.btn-modal.width-100.small")).get(1).click();
       sleep(1000);
       driver.findElement(By.id("street")).sendKeys("Jorge Basadre");
       sleep(1000);
       driver.findElement(By.id("number")).sendKeys("595");
       sleep(1000);
       driver.findElement(By.id("apartment")).sendKeys("int 5");
       sleep(1000);
       driver.findElement(By.id("notes")).sendKeys("atton");
       sleep(1000);

       driver.findElement(By.id("name")).click();
       sleep(2000);
       driver.findElement(By.xpath("//*[@id=\"modal-body\"]/div[5]/label")).click();
       sleep(1000);
       driver.findElements(By.cssSelector(".btn.btn-modal.width-100.small")).get(1).click();
       sleep(1500);
       js.executeScript("window.scrollBy(0,130)");
       sleep(1000);

       driver.findElement(By.cssSelector("body > div.ng-scope > section > div > section > div > div > div > div:nth-child(2) > form > div > ng-include > div:nth-child(7) > input")).sendKeys("prueba");
       sleep(1000);
       driver.findElement(By.cssSelector(".button-address.ng-scope")).click();
       sleep(6000);
       driver.findElements(By.cssSelector(".button-address")).get(1).click();
       sleep(6000);
       driver.findElement(By.cssSelector(".btn.btn-ct-footer.btn-ct-footer-green")).click();
       sleep(8000);

       //dicidir si usar ubicacion actual ---NO get(1))--- SI get(0))
       //driver.findElements(By.cssSelector(".btn.btn-current-location")).get(1).click();
       sleep(8000);

       //driver.quit();
    }




}
