package Acciones;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.hamcrest.CoreMatchers.containsString;

import CommonFuntions.BaseTest;
import Pages.TestPages;


public class PruebaAccion extends BaseTest {
	
	WebDriver driver;
	private static Logger log = Logger.getLogger(PruebaAccion.class);
	TestPages testPage = new TestPages(driver);	
	
	public PruebaAccion(WebDriver driver) {		
		super(driver);
		this.driver = super.driver;
	}
	
	
	public String locator(int valor) {
		String xpatListaInput = "(//input[contains(@id,'testId-Input-')])";
		String locator = xpatListaInput +"["+valor+"]";
		return locator;
	}
	
	public void cerrarModalesPrincipales() {
		log.info("**********  cerrarModalesPrincipales ************");
		try {
			esperaExplicita(testPage.imgPrincipal);
			esperaExplicita(testPage.bntCerrarImgPrincipal);
			hacerClick(testPage.bntCerrarImgPrincipal);

		} catch (Exception e) {
			log.error("########## Error - cerrarModalesPrincipales()  #######" + e);
			throw new AssertionError(e);
		}
	}
	
	public void seleccioneRegistrarte() {
		log.info("**********  seleccioneRegistrarte ************");
		try {
			Actions actions = new Actions(driver);
			WebElement we = driver.findElement(testPage.selectDesplegable);
			actions.moveToElement(we).perform();
			esperaExplicita(testPage.menuHoverRegistrarse);
			actions.moveToElement(driver.findElement(testPage.menuHoverRegistrarse)).click().build().perform();
		} catch (Exception e) {
			log.error("########## Error - seleccioneRegistrarte()  #######" + e);
			throw new AssertionError(e);
		}
	}
	
	
	public void llenarInputUsuario(String nombre, String apellido, String rut, String celular,String correo, String contrasena) {
		log.info("**********  llenarInputUsuario ************");
		try {	
			
			esperaExplicita(testPage.listInputUsuario);
			List<WebElement> ListaElement = driver.findElements(testPage.listInputUsuario);

			for (int i = 0; i < ListaElement.size(); i++) {

				if (i == 0) {
					ListaElement.get(i).sendKeys(nombre);
				} else if (i == 1) {
					Hacer_scroll(By.xpath(this.locator(i)));
					ListaElement.get(i).sendKeys(apellido);
					adjuntarCaptura("llenarDatos");
				} else if (i == 2) {
					Hacer_scroll(By.xpath(this.locator(i)));
					ListaElement.get(i).sendKeys(rut);
				} else if (i == 3) {
					Hacer_scroll(By.xpath(this.locator(i)));
					ListaElement.get(i).sendKeys(celular);
					adjuntarCaptura("llenarDatos");
				} else if (i == 4) {
					Hacer_scroll(By.xpath(this.locator(i)));
					ListaElement.get(i).sendKeys(correo);
				} else if (i == 5) {
					Hacer_scroll(By.xpath(this.locator(i)));
					ListaElement.get(i).sendKeys(contrasena);
				}				

			}
			ElementVisible();
			esperaExplicita(testPage.primerCheck);
			hacerClick(testPage.primerCheck);
			hacerClick(testPage.primerCheck);
			ElementVisible();
			esperaExplicita(testPage.segundoCheck);	
			hacerClick(testPage.segundoCheck);		
			
		} catch (Exception e) {
			log.error("########## Error - llenarInputUsuario()  #######" + e);
			throw new AssertionError(e);
		}
	}
	
	public void registrarse() {
		log.info("**********  registrarse ************");
		try {
			hacerClick(testPage.btnRegistrarse);
			Thread.sleep(3);
			Hacer_scroll(testPage.tituloRegistro);
			esperaExplicita(testPage.tituloRegistro);
			assertEquals("Error comparando los mensajes","Registro Exitoso", extraerTextoElemento(testPage.tituloRegistro));
		} catch (Exception e) {
			log.error("########## Error - registrarse()  #######" + e);
			throw new AssertionError(e);
		}
	}
	
	
	
	
	public void realizarBusquedaInput(String busqueda) {
		log.info("**********  realizarBusquedaInput ************");
		try {
			EscribirElemento(testPage.inputBusquedaPrincipal, busqueda);
			EnviarEnter(By.xpath("//input[@placeholder='Buscar en falabella.com']"));
		} catch (Exception e) {
			log.error("########## Error - realizarBusquedaInput()  #######" + e);
			throw new AssertionError(e);
		}
	}
	
	public void seleccionarProducto(String busqueda) {
		log.info("**********  seleccionarProducto ************");
		try {						
			esperaExplicita(testPage.tituloResultBusqueda);
			selectValorLista(testPage.listItems, busqueda);
			System.out.println(extraerTextoElemento(testPage.principalNombreProducto));
			assertEquals("Error los elementos no coinciden", extraerTextoElemento(testPage.principalNombreProducto),
					busqueda);
	
		} catch (Exception e) {
			log.error("########## Error - seleccionarProducto()  #######" + e);
			throw new AssertionError(e);
		}
		
	}
	
	public void seleccionarCantMaximaProducto() {
		log.info("**********  seleccionarCantMaximaProducto ************");
		try {
			hacerClick(testPage.btnagregarCarro);

			esperaExplicita(testPage.descCantMaxima);
			char[] cadena_char = extraerTextoElemento(testPage.descCantMaxima).toCharArray();
			String result = "";
			for (int i = 0; i < cadena_char.length; i++) {
				if (Character.isDigit(cadena_char[i])) {
					result += cadena_char[i];
				}
			}
			int cantMaxima = Integer.parseInt(result);

			for (int i = 0; i < cantMaxima; i++) {
				esperaExplicita(testPage.btnAgregar);
				hacerClick(testPage.btnAgregar);
				ElementVisible();
				if (i == cantMaxima - 1) {
					esperaExplicita(testPage.iconWarningCantMax);
					assertEquals("Error en el mensaje comparado",
							extraerTextoElemento(testPage.txtWarningCantMax),
							"Has alcanzado la cantidad máxima para este producto.");
				}
			}			
			esperaExplicita(testPage.btnIrCarrito);
			hacerClick(testPage.btnIrCarrito);
	
			
		} catch (Exception e) {
			log.error("########## Error - seleccionarCantMaximaProducto()  #######" + e);
			throw new AssertionError(e);
		}
	}
	
	public void eliminarOrdenCompra() {
		log.info("**********  eliminarOrdenCompra ************");
		try {
			esperaExplicita(testPage.linkButtonEliminar);
			hacerClick(testPage.linkButtonEliminar);		
			ElementVisible();
			esperaExplicita(testPage.txtTituloCarroVacio);
			assertEquals("Error en el mensaje comparado",extraerTextoElemento(testPage.txtTituloCarroVacio),
					"Tu Carro está vacío");
		} catch (Exception e) {
			log.error("########## Error - eliminarOrdenCompra()  #######" + e);
			throw new AssertionError(e);
		}
	}
	
	public void agregarEmail(String correo) {
		log.info("**********  agregarEmail ************");
		try {
			esperaExplicita(testPage.btnContinuar);
			hacerClick(testPage.btnContinuar);
			
			
			esperaExplicita(testPage.txtTituloCompra);
			assertEquals("Error los elementos no coinciden", extraerTextoElemento(testPage.txtTituloCompra),
					"Compra más rápido y fácil");
			
			
			EscribirElemento(testPage.inputCorreo,correo);
			hacerClick(testPage.btnContinuar);
		} catch (Exception e) {
			log.error("########## Error - agregarEmail()  #######" + e);
			throw new AssertionError(e);
		}
		
	}
	
	public void agregarDireccionValida(String direccion) {
		log.info("**********  agregarDireccionValida ************");
		try {
			esperaExplicita(testPage.inputDireccion);
			EscribirElemento(testPage.inputDireccion, direccion);
			esperaExplicita(By.xpath("//button[contains(@id,'"+direccion+"')]"));
			hacerClick(By.xpath("//button[contains(@id,'"+direccion+"')]"));
			
			
			esperaExplicita(testPage.btnGuardarDireccion);
			elementoEsClickable(testPage.btnGuardarDireccion);
			hacerClick(testPage.btnGuardarDireccion);
			ElementVisible();
			
			
			esperaExplicita(testPage.btnIrPagar);
			elementoEsClickable(testPage.btnIrPagar);
			hacerClick(testPage.btnIrPagar);
		} catch (Exception e) {
			log.error("########## Error - agregarDireccionValida()  #######" + e);
			throw new AssertionError(e);
		}
		
	}
	
	public void hacerCompraMedioPago(String numeroTarjeta, String cvv, String rut,String mes,String ano) {
		log.info("**********  hacerCompraMedioPago ************");
		try {
			ElementVisible();
			esperaExplicita(testPage.iframePago);
			WebElement elemento = driver.findElement(testPage.iframePago);
			driver.switchTo().frame(elemento);
			
			esperaExplicita(testPage.inputNumeroTarjeta);
			EscribirElemento(testPage.inputNumeroTarjeta, numeroTarjeta);
			
			esperaExplicita(testPage.inputCvv);
			EscribirElemento(testPage.inputCvv, cvv);
			
			esperaExplicita(testPage.inputRutTarjeta);
			EscribirElemento(testPage.inputRutTarjeta, rut);
			
			
			selectValorLista(testPage.listSelectMes,mes);
			selectValorLista(testPage.listSelectAno, ano);
			
			System.out.println("imprimir #####");
		} catch (Exception e) {
			log.error("########## Error - hacerCompraMedioPago()  #######" + e);
			throw new AssertionError(e);
		}
		;
	}
	
}
