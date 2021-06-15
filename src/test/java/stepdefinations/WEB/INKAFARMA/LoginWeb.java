package stepdefinations.WEB.INKAFARMA;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import utility.Hook;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;

import static java.lang.Thread.sleep;

public class LoginWeb {

	private WebDriver driver;
	public LoginWeb() {
		this.driver = Hook.getDriver();
	}


	@Given("^El site de Inkafarma esta habilitado y se muestra el logo de Inkafarma$")
	public void el_site_de_Inkafarma_esta_habilitado_y_se_muestra_el_logo_de_Inkafarma() throws Throwable {
		driver.manage().window().maximize();
//		driver.navigate().to("https://inkafarma-ci02.cindibyinkafarma.com/");
		driver.navigate().to("https://mifarma.cindibyinkafarma.com/");
//		driver.navigate().to("https://inkafarma-qa01.cindibyinkafarma.com/");
		System.out.println("Aplication is opened successfully");
		sleep(7000);

//        LoggingPreferences logPrefs = new LoggingPreferences();
//        logPrefs.enable(LogType.PERFORMANCE, Level.ALL);
//        DesiredCapabilities cap = DesiredCapabilities.chrome();
//        cap.setCapability(CapabilityType.LOGGING_PREFS, logPrefs);
//
//        LogEntries logs = driver.manage().logs().get("performance");
	}


	@And("^Selecciono la opción de ingresar y me redirecciona a una pantalla de Bienvenida$")
	public void selecciono_la_opción_de_ingresar_y_me_redirecciona_a_una_pantalla_de_Bienvenida()  throws Throwable {

		//Ingresar Usuario

		driver.findElement(By.cssSelector(".text-dark-gray.font-semi-bold.cursor.ng-scope")).click();
		sleep(3000);

	}

	@When("^Eligo la opción de ingresar con Google$")
	public void Eligo_la_opción_de_ingresar_con_Google() throws Throwable {

		driver.findElements(By.cssSelector(".btn.btn-login")).get(1).click();
		sleep(10000);
	}


	@Then("Se abre una ventana nueva donde ingresaremos el usuario ([^\"]*) y password ([^\"]*)")
	public void seAbreUnaVentanaNuevaDondeIngresaremosElUsuarioUserYPasswordPass(String user, String pass) throws Throwable {

		//abrir ventana
		String parent= driver.getWindowHandle();
		System.out.println("Parent windows id is"+parent);
		Set<String> allwindows=driver.getWindowHandles();
		ArrayList<String> tabs =new ArrayList<String>(allwindows);
		driver.switchTo().window(tabs.get(1));
		sleep(3000);
		//ingreso de correo
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(user);
		sleep(2000);
		driver.findElement(By.id("identifierNext")).click();
		sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pass);
		driver.findElement(By.id("passwordNext")).click();
		sleep(500);
		driver.switchTo().window(tabs.get(0));
		sleep(10000);

	}

	@And("^Ingreso mi numero de telefono ([^\"]*) y luego ingreso el digito que recibí por mensaje$")
	public void ingreso_mi_numero_de_telefono_numero_y_luego_ingreso_el_digito_que_recibí_por_mensaje(String numero) throws Throwable {

		driver.findElement(By.name("phone")).sendKeys(numero);
		sleep(2000);
		driver.findElement(By.cssSelector(".btn.btn-success.width-100.button-style.login-button")).click();
		sleep(50000);




	}

	@And("^Ingreso todos los campos obligatorios ([^\"]*), ([^\"]*), ([^\"]*), ([^\"]*) y aceptamos los Terminos y Condiciones, asimismo las politicas de privacidad")
	public void ingresamos_todos_los_campos_obligatorios_nombres_apellidos_email_dni_y_aceptamos_los_Terminos_y_Condiciones_asimismo_las_politicas_de_privacidad(String nombres ,String apellidos,String email,String dni) throws Throwable {

		driver.findElement(By.cssSelector(".btn.btn-success.width-100.button-style.button-code")).click();
		sleep(8000);

		//DATOS DEL USUARIO
		driver.findElement(By.id("name")).clear();
		sleep(500);
		driver.findElement(By.id("name")).sendKeys(nombres);
		sleep(1000);
		driver.findElement(By.id("lastName")).clear();
		sleep(500);
		driver.findElement(By.id("lastName")).sendKeys(apellidos);
		sleep(1000);
		driver.findElement(By.id("email")).clear();
		sleep(500);
		driver.findElement(By.id("email")).sendKeys(email);
		sleep(1000);
		driver.findElement(By.id("dni")).clear();
		sleep(500);
		driver.findElement(By.id("dni")).sendKeys(dni);
		sleep(1500);

		List<WebElement> check = driver.findElements(By.cssSelector("ul.unstyled li .styled-checkbox~label"));
		sleep(500);
		check.get(0).click();
		sleep(1000);
		check.get(1).click();
		sleep(1500);


		// habilitar solo para clientes nuevos
		//  driver.findElement(By.cssSelector(".btn.btn-block.coupon-button.coupon-button-continue")).click();

	}

	@When("^Selecciono boton siguiente")
	public void selecciono_boton_siguiente() throws Throwable {

		driver.findElement(By.cssSelector(".btn.btn-success.width-100.button-style")).click();
		sleep(10000);
	}

	@Then("^Debo visualizar mi usuario en el Home de inkafarma$")
	public void debo_visualizar_mi_usuario_en_el_Home_de_inkafarma() throws Throwable {

		String Usuaurio = driver.findElement(By.cssSelector("#profile-header > span")).getText();
		System.out.println("El usuario es: " + Usuaurio);
		sleep(10000);
	}


}
