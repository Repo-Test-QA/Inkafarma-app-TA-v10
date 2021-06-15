package stepdefinations.DASHBOARD_ANTIGUO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utility.Hook;

import static java.lang.Thread.sleep;

public class LoginDbs {

	private WebDriver driver;
	public LoginDbs() {
		this.driver = Hook.getDriver();
	}

	@Given("^Ingreso al site de InkaDashboard$")
	public void ingreso_al_site_de_InkaDashboard() throws Throwable {
		driver.manage().window().maximize();
		driver.get("http://inkadashboard-qa.inkafarmadigital.pe/#/login");
		System.out.println("Aplication is opened successfully");
		sleep(3000);
	}

	@Given("^Ingresamos mi correo ([^\"]*) y la contraseña ([^\"]*) coreecto$")
	public void ingresamos_mi_correo_email_y_la_contraseña_pass(String email, String pass) throws Throwable {

		driver.findElement(By.xpath("/html/body/div/section/div/section/div[2]/div/div/div/div[2]/div/div[1]/div/input")).sendKeys(email);
		sleep(1000);
		driver.findElement(By.xpath("/html/body/div/section/div/section/div[2]/div/div/div/div[2]/div/div[2]/div/input")).sendKeys(pass);
		sleep(1000);

	}

	@When("^Selecciono el boton iniciar sesion$")
	public void selecciono_el_boton_iniciar_sesion() throws Throwable {

		driver.findElement(By.cssSelector(".btn.btn-success.width-100.lg-button")).click();
	}

	@Then("^Se muestra la pantalla del Hompe principal de iInkaDashboard$")
	public void se_muestra_la_pantalla_del_Hompe_principal_de_iInkaDashboard() throws Throwable {
		sleep(4000);
		driver.navigate().to("http://inkadashboard-qa.inkafarmadigital.pe/#/administrador");

	}




//
//	@Given("^Ingreso al aplicativo Inkafarma$")
//	public void Ingreso_al_aplicativo_Inkafarma() throws Throwable {
//        driver.navigate().to("http://inkadashboard-qa.inkafarmadigital.pe/#/login");
//		System.out.println("Aplication is opened successfully");
//        sleep(6000);
//    }
//
//    @Given("^Selecciono la opcion de ingresar con Google, elijo mi correo electronico y luego ingreso mi numero de celular ([^\"]*)")
//    public void selecciono_la_opcion_de_ingresar_con_Google_elijo_mi_correo_electronico_y_luego_ingreso_mi_numero_de_celular_numero(String numero) throws Throwable {
//
//	    driver.findElement(By.id("com.globant.inkafarma.uat:id/btn_login_google")).click();
//		sleep(3000);
//        List<WebElement> correos = driver.findElements(By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout"));
//        sleep(500);
//        correos.get(0).click();
//        sleep(4000);
//        MobileElement txtUsername = (MobileElement) driver.findElement(By.id("com.globant.inkafarma.uat:id/phone_editText"));
//		txtUsername.sendKeys(numero);
//		sleep(2000);
//    }
//
//    @When("^Selecciono el boton continuar$")
//    public void selecciono_el_boton_continuar_reutilizar() throws Throwable {
//
//        driver.findElement(By.id("com.globant.inkafarma.uat:id/confirm_btn")).click();
//    }
//
//    @When("^Aceptamos el boton de conformidad de mi numero ingresado$")
//    public void aceptamos_el_boton_de_conformidad_de_mi_numero_ingresado() throws Throwable {
//
//	    sleep(1000);
//        driver.findElement(By.id("com.globant.inkafarma.uat:id/md_buttonDefaultPositive")).click();
//    }
//
//    @Then("^Se muestra la pantalla de codigo de validacion y esperamos a que el aplicativo continue con la siguiente pantalla$")
//    public void se_muestra_la_pantalla_de_codigo_de_validacion_y_esperamos_a_que_el_aplicativo_continue_con_la_siguiente_pantalla() throws Throwable {
//
//	    sleep(20000);
//    }
//
//    @Then("^Ingresamos todos los campos obligatorios ([^\"]*), ([^\"]*), ([^\"]*), ([^\"]*) y aceptamos los Terminos y Condiciones, asimismo las politicas de privacidad")
//    public void ingresamos_todos_los_campos_obligatorios_nombres_apellidos_email_dni_y_aceptamos_los_Terminos_y_Condiciones_asimismo_las_politicas_de_privacidad(String nombres ,String apellidos,String email,String dni) throws Throwable {
//
//        driver.findElement(By.id("com.globant.inkafarma.uat:id/et_request_name")).clear();
//		sleep(500);
//		driver.findElement(By.id("com.globant.inkafarma.uat:id/et_request_name")).sendKeys(nombres);
//		sleep(1000);
//		driver.findElement(By.id("com.globant.inkafarma.uat:id/et_request_lastname")).clear();
//		sleep(500);
//		driver.findElement(By.id("com.globant.inkafarma.uat:id/et_request_lastname")).sendKeys(apellidos);
//		sleep(1000);
//		driver.findElement(By.id("com.globant.inkafarma.uat:id/et_request_email")).clear();
//		sleep(500);
//		driver.findElement(By.id("com.globant.inkafarma.uat:id/et_request_email")).sendKeys(email);
//		sleep(500);
//		driver.findElement(By.id("com.globant.inkafarma.uat:id/et_request_dni")).clear();
//		sleep(500);
//		driver.findElement(By.id("com.globant.inkafarma.uat:id/et_request_dni")).sendKeys(dni);
//		sleep(1000);
//		driver.findElement(By.id("com.globant.inkafarma.uat:id/chk_terms")).click();
//		sleep(500);
//		driver.findElement(By.id("com.globant.inkafarma.uat:id/chk_policity")).click();
//		sleep(500);
//	}
//
//    @When("^Selecciono el boton siguiente")
//    public void selecciono_el_boton_siguiente_reutilizar() throws Throwable {
//
//        driver.findElement(By.id("com.globant.inkafarma.uat:id/request_access_button")).click();
////        sleep(6000);
////        driver.findElement(By.id("com.globant.inkafarma.uat:id/textView_start")).click();
//	}
//
//    @Then("^Se muestra la pantalla del Hompe principal de inkafarma$")
//    public void se_muestra_la_pantalla_del_Hompe_principal_de_inkafarma() throws Throwable {
//
//        sleep(20000);
//        driver.findElement(By.id("com.globant.inkafarma.uat:id/btn_next")).click();
//        sleep(3000);
//    }
//
//
//
//
//
//
//
//
//
//
//
//	//@And("Ingreso mi correo electronico ([^\"]*) y el password ([^\"]*)")
////	@And("^Ingreso mi correo electronic \"([^\"]*)\"")
//	@And("^Ingreso mi correo electronic ([^\"]*)")
////	public void ingreso_mi_correo_electronic_correo(String correo) throws Throwable {
//	public void ingreso_mi_correo_electronic_n(String n) throws Throwable {
//
//
//////		driver.findElement(By.id("com.inkafarma.inkamotolite.qa2:id/editText_email")).sendKeys(correo);
////		driver.findElement(By.id("com.globant.inkafarma.uat:id/btn_login_google")).click();
////		sleep(3000);
////		driver.findElements(By.id("android:id/list")).get(0).click();
////		sleep(4000);
////		//Ingresar telefono
////
////		MobileElement txtUsername = (MobileElement) driver.findElement(By.id("com.globant.inkafarma.uat:id/phone_editText"));
////		txtUsername.sendKeys("9 5 7 2 8 1 1 4 5");
////		sleep(2000);
////		//btn ingresar
////		driver.findElement(By.id("com.globant.inkafarma.uat:id/confirm_btn")).click();
////		sleep(1000);
////		driver.findElement(By.id("com.globant.inkafarma.uat:id/md_buttonDefaultPositive")).click();
////		sleep(15000);
////		driver.findElement(By.id("com.globant.inkafarma.uat:id/et_request_name")).clear();
////		sleep(500);
////		driver.findElement(By.id("com.globant.inkafarma.uat:id/et_request_name")).sendKeys("Alexander");
////		sleep(1000);
////		driver.findElement(By.id("com.globant.inkafarma.uat:id/et_request_lastname")).clear();
////		sleep(500);
////		driver.findElement(By.id("com.globant.inkafarma.uat:id/et_request_lastname")).sendKeys("Garcia");
////		sleep(1000);
////		driver.findElement(By.id("com.globant.inkafarma.uat:id/et_request_email")).clear();
////		sleep(500);
////		driver.findElement(By.id("com.globant.inkafarma.uat:id/et_request_email")).sendKeys("alexcgp94@gmail.com");
////		sleep(500);
////		//ocultar teclado
////		driver.navigate().back();
////		sleep(1000);
////		driver.findElement(By.id("com.globant.inkafarma.uat:id/et_request_dni")).clear();
////		sleep(500);
////		driver.findElement(By.id("com.globant.inkafarma.uat:id/et_request_dni")).sendKeys("71333594");
////		sleep(1000);
////		driver.navigate().back();
////		sleep(500);
////		driver.findElement(By.id("com.globant.inkafarma.uat:id/chk_terms")).click();
////		sleep(500);
////		driver.findElement(By.id("com.globant.inkafarma.uat:id/chk_policity")).click();
////		sleep(500);
////		driver.findElement(By.id("com.globant.inkafarma.uat:id/request_access_button")).click();
////		sleep(6000);
////		driver.findElement(By.id("com.globant.inkafarma.uat:id/textView_start")).click();
////		sleep(15000);
////		driver.findElement(By.id("com.globant.inkafarma.uat:id/btn_next")).click();
////		sleep(3000);
//
//		// agregar direccion
//		driver.findElement(By.id("com.globant.inkafarma.uat:id/layout_location")).click();
//		sleep(3000);
//		//agregar direccion
//		driver.findElement(By.id("com.globant.inkafarma.uat:id/add_address_btn")).click();
//		sleep(5000);
//		driver.findElement(By.id("com.globant.inkafarma.uat:id/district_spinner")).click();
//		sleep(3000);
//
//		driver.findElements(new By.ByXPath("//android.widget.LinearLayout")).get(2).click();
//		sleep(1000);
//		//driver.findElement(By.id("com.globant.inkafarma.uat:id/md_control")).click();
////		sleep(1000);
//
//
//
//
////		driver.findElement(By.id("com.globant.inkafarma.uat:id/md_contentRecyclerView"));
////		TouchAction action = new TouchAction((PerformsTouchActions) driver);
////		Thread.sleep(500);
////		int startX = 360;
////		int startY = 470;
////		int endX = 360;
////		int endY = 1542;
////
////		action.press(startX, startY).waitAction(Duration.ofDays(3000)).moveTo(endX, endY).release().perform();
//
////		TouchAction action = new TouchAction((PerformsTouchActions) driver);
////		int x,y;
////		//action.press(sX,sY).waitAction(3000).moveTo(eX, eY).release().perform();
////		action.press(x=983, y=440).moveTo(x=983, y=1460).release().perform();
//
////		List<WebElement> allIdsOnCurrentScreen = driver.findElements(By.xpath("//*[@class='android.widget.LinearLayout']"));
////		for(int i=0;i<allIdsOnCurrentScreen.size();i++){
////			if(allIdsOnCurrentScreen.get(i).getText()=="Ate")
////				driver.findElement(By.id("com.globant.inkafarma.uat:id/md_control")).click();
////				//System.out.println(allIdsOnCurrentScreen.get(i).getAttribute(""));
////		}
//
//
////		List<WebElement> linears =  driver.findElements(new By.ByXPath("//android.widget.LinearLayout"));
////		sleep(1000);
//
////		WebElement linearFound ;
////		for (WebElement element: linears){
////            String textViewText = element.findElement(By.xpath("//android.widget.TextView")).getText();
////			if(textViewText=="Barranco")
////		}
////
////		driver.findElements(new By.ByXPath("//android.widget.LinearLayout")).get(element);
////		sleep(1000);
////
////		driver.findElement(By.id("com.globant.inkafarma.uat:id/md_control")).click();
//////				driver.findElement(By.xpath("//android.widget.LinearLayout[@text='Ate']")).click();
////
////		sleep(2000); "com.globant.inkafarma.uat:id/md_buttonDefaultPositive"
//
//	}
//
//	public void i_validate_the_search_text_field() throws Throwable {
//		sleep(16000);
////		Assert.assertTrue(driver.findElement(By.name("q")).isDisplayed());
//	}
//
//	@Then("^I validate the Gmail Link$")
//	public void i_validate_the_Gmail_Link() throws Throwable {
////		Assert.assertTrue(driver.findElement(By.linkText("Gmail")).isDisplayed());
//	}
//
//	@Then("^I validate the Image Link$")
//	public void i_validate_the_Image_Link() throws Throwable {
////		Assert.assertTrue(driver.findElement(By.linkText("Image")).isDisplayed());
//	}
//
//	@When("^I enter \"([^\"]*)\" in search keyword$")
//	public void i_enter_in_search_keyword(String searchText) throws Throwable {
////	    driver.findElement(By.name("q")).clear();
////		driver.findElement(By.name("q")).sendKeys(searchText);
////		Thread.sleep(5000);
//	}
//
//	@Then("^I validate searched text$")
//	public void i_validate_searched_text() throws Throwable {
//	    sleep(25000);
//	}
}
