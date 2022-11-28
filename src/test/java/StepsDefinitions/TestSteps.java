package StepsDefinitions;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import Acciones.PruebaAccion;
import CommonFuntions.BaseTest;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;

public class TestSteps {

	WebDriver driver;
	Logger log = Logger.getLogger(TestSteps.class);
	BaseTest baseTest;
	PruebaAccion pruebaAccion;

	public TestSteps() {		
		this.driver = Driver.driver;
		pruebaAccion = new PruebaAccion(driver);
	}

	@Dado("^un usuario que ingrese a la pagina de fallabella$")
	public void unUsuarioQueIngreseALaPaginaDeFallabellar() throws Throwable {
		pruebaAccion.cerrarModalesPrincipales();
	}

	@Cuando("^seleccione el desplegable registrarte$")
	public void navegarRegistrar() throws Throwable {
		pruebaAccion.seleccioneRegistrarte();
	}
	
	@Y("llene el formulario con la siguiente informacion {string}{string}{string}{string}{string}{string}")
	public void lleneElFormularioConLaSiguienteInformacion(String nombre, String apellido, String rut, String celular,String correo, String contrasena) throws Throwable {
		pruebaAccion.llenarInputUsuario(nombre, apellido, rut, celular, correo, contrasena);
	
	}
	
	@Entonces("se permite el registro de un usuario en el portal")
	public void  sePermiteElRegistroDeUnUsuarioEnElPortal() throws Throwable {
		pruebaAccion.registrarse();
	}

	
	
	@Cuando("realice la busqueda {string}")
	public void realiceLaBusqueda(String busqueda) throws Throwable {
		pruebaAccion.realizarBusquedaInput(busqueda);
	}
	
	@Y("seleccione el producto con nombre {string}")
	public void seleccioneElProductoConNombre(String busqueda) throws Throwable {
		pruebaAccion.seleccionarProducto(busqueda);
	}
	
	@Y("agrege al carrito aumentando la cantidad maxima por producto")
	public void agregeAlCarritoAumentandoLaCantidadMaximaPorProducto() throws Throwable {
		pruebaAccion.seleccionarCantMaximaProducto();
	}
	
	@Entonces("permite eliminar la cantidad total de la orden")
	public void PermiteEliminarLaCantidadTotalDeLaOrden() {
		pruebaAccion.eliminarOrdenCompra();
	}

	
	
}
