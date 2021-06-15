package stepdefinations.WEB.INKATRACKER_LITE;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import utility.Hook;

import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

import static java.lang.Thread.sleep;

public class IT_53_Login_Perfiles {

    public List<Dimension> screenDimensionsList;
    public WebDriver driver;

    public IT_53_Login_Perfiles() {
        this.driver = Hook.getDriver();
    }

    //IT-53 SC01
    @Given("^El site de Farma Dashboard esta habilitado$")
    public void el_site_de_Farma_Dashboard_esta_habilitado() throws InterruptedException {

//        screenDimensionsList = new ArrayList<Dimension>();
////        screenDimensionsList.add(new Dimension(1200,800));
////        screenDimensionsList.add(new Dimension(992,800));
//        screenDimensionsList.add(new Dimension(768,800));
//        screenDimensionsList.add(new Dimension(480,800));
//        screenDimensionsList.add(new Dimension(360,800));
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        for(Dimension d: screenDimensionsList){
//        driver.manage().window().setSize(d);
//

        driver.manage().window().maximize();
//        driver.navigate().to("https://inkafarmav2-qa01.cindibyinkafarma.com/");
        driver.navigate().to("https://inkatrackerlite-ci02.cindibyinkafarma.com");
//        driver.navigate().to("http://52.36.250.40:9005/#/login");

//        String url = driver.getCurrentUrl();
//        System.out.println("la url es: " + url);
//        sleep(3000);
//        js.executeScript("window.scrollBy(0,1800)");
//        sleep(2000);
//        js.executeScript("window.scrollBy(0,-1800)");
//        sleep(2000);

    }


/*
        //RESPONSIVE
        driver.findElements(By.cssSelector(".icon.icon-24-menu-light")).get(0).click();
        sleep(2000);
        driver.findElements(By.cssSelector(".list-option-next-icon")).get(4).click();
        sleep(2000);
        driver.findElements(By.cssSelector(".list-option-next-icon")).get(19).click();
        sleep(2000);
        WebElement element10= driver.findElements(By.cssSelector(".mat-drawer-inner-container")).get(3);
        String T = element10.getText();
        System.out.println("el testo es: "+T);
        js.executeScript("arguments[0].scrollBy(0,1800);", element10);
        sleep(2000);
//
        js.executeScript("arguments[0].scrollBy(0,-1800);", element10);
        sleep(2000);
        driver.findElements(By.cssSelector(".list-control-back-icon")).get(2).click();
        sleep(2000);
        driver.findElements(By.cssSelector(".list-control-back-icon")).get(1).click();
        sleep(2000);
        driver.findElements(By.cssSelector(".list-control-back-icon")).get(0).click();
        sleep(2000);

//        driver.findElements(By.cssSelector(".mat-drawer-inner-container.list-control")).get(0).click();
//        sleep(2000);
//        driver.findElements(By.cssSelector(".mat-drawer-inner-container.list-control")).get(0).click();




//
//
//
//
//
// */
////
////        //WEB
//        sleep(1000);
//        Actions action = new Actions(driver);
//        WebElement element = driver.findElements(By.className("category-header-name")).get(0);
//        action.moveToElement(element).perform();
//        sleep(3000);
//        List<WebElement> List = driver.findElements(By.cssSelector(".department-container.setting-scroll"));
//        WebElement element1 = List.get(0);
//        js.executeScript("arguments[0].scrollBy(0,500);", element1);
//        sleep(1000);
//        js.executeScript("arguments[0].scrollBy(0,-500);", element1);
//        sleep(3000);
//        List<WebElement> List1 = driver.findElements(By.cssSelector(".department-container .link"));
////        WebElement element2 = List1.get(4);
////        element2.click();
////        sleep(5000);
//
////        action.moveToElement(element2).perform();
//        for (WebElement ele : List1) {
////            String text = ele.findElements(By.cssSelector(".department-option .link")).get(0).getText();
//            String text = ele.getText();
//            if (text.equals("Cuidado personal")) {
//                action.moveToElement(ele).perform();
//                break;
//            }
//            sleep(500);
//            action.moveToElement(ele).perform();
//        }
//
//
//
//        sleep(1000);
//        List<WebElement> List2 = driver.findElements(By.cssSelector(".category-container .link"));
//
//        for (WebElement ele : List2) {
//            String text = ele.getText();
//            if (text.equals("Cuidado de la piel")) {
//                action.moveToElement(ele).perform();
//                break;
//            }
//            sleep(500);
//            action.moveToElement(ele).perform();
//        }
//
////        WebElement element3 = List2.get(4);
////        action.moveToElement(element3).perform();
//
//        sleep(1000);
//        List<WebElement> List3 = driver.findElements(By.cssSelector(".subcategory-container .link"));
////        WebElement element4 = List3.get(4);
////        action.moveToElement(element4).perform();
//        for (WebElement ele : List3) {
//            String text = ele.getText();
//            if (text.equals("Tratamiento anti edad")) {
//                action.moveToElement(ele).perform();
//                break;
//            }
//            sleep(500);
//            action.moveToElement(ele).perform();
//        }
//
//
//
//        sleep(1000);
//        List<WebElement> List4 = driver.findElements(By.cssSelector(".representative-brands"));
//        WebElement element5 = List4.get(0);
//        js.executeScript("arguments[0].scrollBy(0,1800);", element5);
//        sleep(1000);
//        js.executeScript("arguments[0].scrollBy(0,-1800);", element5);
//        sleep(1000);
//
//
//        WebElement search = driver.findElements(By.className("main-header-search-input")).get(0);
//        action.moveToElement(search).perform();
//
//        sleep(500);
//        driver.findElement(By.id("main-header-search-input")).click();
//        sleep(500);
//        driver.findElement(By.id("main-header-search-input")).sendKeys("pana");
//        sleep(5000);
////        driver.findElement(By.id("main-header-search-input")).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
//
//        driver.findElements(By.className("main-header-search-label")).get(0).click();
//
//
//        // selecionar una busqueda
////        WebElement a = driver.findElements(By.cssSelector(".products-filtered-container.ng-star-inserted")).get(0);
////        WebElement b = a.findElements(By.cssSelector(".product-filtered-text.ng-star-inserted")).get(2);
////        b.findElements(By.cssSelector("a")).get(0).click();
//
//        sleep(6000);
//        WebElement a = driver.findElements(By.className("parameters-panel")).get(0);
//        a.findElements(By.className("mat-expansion-panel-header")).get(0).click();
//        sleep(1000);
//
//        WebElement b = driver.findElements(By.className("parameters-panel")).get(1);
//        b.findElements(By.className("mat-expansion-panel-header")).get(0).click();
//        sleep(1500);
//
//        WebElement c = driver.findElements(By.className("parameters-panel")).get(2);
//        c.findElements(By.className("mat-expansion-panel-header")).get(0).click();
//        sleep(1500);
//        c.findElements(By.className("mat-expansion-panel-header")).get(0).click();
//
//        b.findElements(By.className("mat-expansion-panel-header")).get(0).click();
//        sleep(1500);
//
//        a.findElements(By.className("mat-expansion-panel-header")).get(0).click();
//        sleep(1500);
//
////        WebElement b = ListCart.get(0);
////        js.executeScript("arguments[0].scrollBy(0,100);", b);
//
//        js.executeScript("window.scrollBy(0,130)");
//
//        sleep(1500);
//        WebElement ele = driver.findElements(By.className("items-container")).get(0);
//
////        WebElement ele1 =ele.findElements(By.cssSelector(".filter-item.ng-star-inserted")).get(2);
////        ele1.findElement(By.cssSelector("span")).click();
//        List<WebElement> lista1cat = ele.findElements(By.cssSelector(".filter-item.ng-star-inserted"));
//        sleep(1000);
//        for (WebElement ele1 : lista1cat) {
//
//            ele1.findElement(By.cssSelector("span")).click();
//            sleep(800);
//        }
//        sleep(1000);
//
//        WebElement eleme2 = ele.findElements(By.className("filter-item")).get(0);
//        eleme2.findElement(By.cssSelector("span")).click();
//        sleep(1000);
//
//        js.executeScript("window.scrollBy(0,450)");
//        sleep(1500);
//        WebElement ele1 = driver.findElements(By.className("items-container")).get(1);
//        WebElement ce =ele1.findElements(By.className("mat-checkbox-label")).get(0);
//        ce.click();
//        sleep(1000);
//        WebElement ce1 =ele1.findElements(By.className("mat-checkbox-label")).get(2);
//        ce1.click();
//
//
//
//    }






    @Given("^El site de Farma Dashboard esta habilitado ingreso mi usuario y password$")
    public void el_site_de_Farma_Dashboard_esta_habilitado_ingreso_mi_usuario_y_password(DataTable dealData) throws Throwable {
        List<List<String>> dealValues = dealData.raw();
        sleep(3000);
        driver.findElement(By.id("txtUsername")).sendKeys(dealValues.get(0).get(0));
        sleep(1000);
        driver.findElement(By.id("txtPassword")).click();
        driver.findElement(By.id("txtPassword")).sendKeys(dealValues.get(0).get(1));
    }

    @When("^Selecciono el botón INGRESAR$")
    public void selecciono_el_botón_INGRESAR() throws Throwable {

        sleep(1000);
        driver.findElement(By.id("btnLogin")).click();
    }

    @Then("^Se muestra la pantalla principal del Farma Dashboard$")
    public void se_muestra_la_pantalla_principal_del_Farma_Dashboard() throws Throwable {

        sleep(5000);
        driver.findElement(By.cssSelector(".material-icons.cursor-pointer")).click();
        sleep(2000);
        driver.findElements(By.className("sidemenu-item-link")).get(1).click();
        sleep(2000);
        driver.findElement(By.cssSelector(".card .card-body a ")).click();
        sleep(2000);
        driver.findElement(By.cssSelector(".material-icons.cursor-pointer")).click();
    }

    //IT-53 SC04
    @Given("^El site de Farma Dashboard esta habilitado ingreso mi usuario y el password$")
    public void el_site_de_Farma_Dashboard_esta_habilitado_ingreso_mi_usuario_y_el_password(DataTable dealData) throws Throwable {
        List<List<String>> dealValues = dealData.raw();
        sleep(3000);
        driver.findElement(By.id("txtUsername")).sendKeys(dealValues.get(0).get(0));
        sleep(1000);
        driver.findElement(By.id("txtPassword")).click();
        driver.findElement(By.id("txtPassword")).sendKeys(dealValues.get(0).get(1));
    }



}