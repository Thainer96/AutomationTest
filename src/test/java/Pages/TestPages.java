package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestPages {
	WebDriver driver;
	public By imgPrincipal;
			public By bntCerrarImgPrincipal;
			public By selectDesplegable;
			public By listInputUsuario;
			public By primerCheck;
			public By segundoCheck;
			public By listCheck;
			public By tituloRegistro;
			public By menuHoverRegistrarse;
			public By btnRegistrarse;
			public By inputBusquedaPrincipal;
			public By tituloResultBusqueda;
			public By listItems;
			public By principalNombreProducto;
			public By btnagregarCarro;
			public By descCantMaxima;
			public By btnAgregar;
			public By iconWarningCantMax;
			public By txtWarningCantMax;
			public By btnIrCarrito;
			public By linkButtonEliminar;
			public By txtTituloCarroVacio;
			public By btnContinuar;
			public By txtTituloCompra;
			public By inputCorreo;
			public By inputDireccion;
			public By btnGuardarDireccion;
			public By btnIrPagar;
			public By iframePago;
			public By inputNumeroTarjeta;
			public By inputCvv;
			public By inputRutTarjeta;
			public By listSelectMes;
			public By listSelectAno;
			
			
			
			public By inputUser;
			public By inputPassword;
			public By buttonLogin;
			public By tittleProducts;
			public By listProducts;
			public By buttonAddCart;
			public By buttonShopping;
			public By tittleDescription;
			public By buttonCheckout;
			public By listInputInformation;
			public By buttonContinue;
			public By itemPrice;
			public By itemTotal;
			public By buttonFinish;
			public By textOrderComplete;
			
		public TestPages(WebDriver driver) {
			this.driver = driver;	
		
			imgPrincipal = By.xpath("//img[@alt='Descarga la APP']");
			bntCerrarImgPrincipal = By.xpath("//div[@class='dy-lb-close']");
			selectDesplegable = By.xpath("//p[contains(.,'Hola')]");
			listInputUsuario = By.xpath("//input[contains(@id,'testId-Input-')]");
			tituloRegistro = By.xpath("(//h3)[1]");
			menuHoverRegistrarse = By.xpath("//a[contains(.,'Regístrate')]");
			primerCheck = By.xpath("(//span[contains(.,'Autorizo el')])[2]");
			segundoCheck = By.xpath("(//span[contains(.,'Acepto los')])[2]");
			btnRegistrarse = By.xpath("//button[contains(.,'Registrarme')]");
			listCheck = By.xpath("//p[contains(@class,'jsx-')]/child::span[not(contains(@role,'button'))]");
			inputBusquedaPrincipal =By.xpath("//input[@placeholder='Buscar en falabella.com']");
			tituloResultBusqueda = By.xpath("//span[contains(.,'Resultados') and contains(@id,'testId-')]");
			listItems= By.xpath("//b[contains(@id,'testId-pod-') and contains(@class,'pod-subTitle')]");
			principalNombreProducto = By.xpath("//div[@data-name]");
			btnagregarCarro = By.xpath("//button[@type='button' and contains(.,'Agregar al Carro')]");
			descCantMaxima = By.xpath("//p[contains(.,'Máximo')]");
			btnAgregar = By.xpath("(//button[contains(@class,'increment')])[1]");
			iconWarningCantMax = By.xpath("//i[contains(@class,'csicon-warning-alert')]");
			txtWarningCantMax = By.xpath("(//span[contains(@class,'copy5')])[1]");
			btnIrCarrito = By.xpath("//a[@id='linkButton']");
			linkButtonEliminar = By.xpath("//button[@type='button' and contains(.,'Eliminar')]");
			txtTituloCarroVacio = By.xpath("(//span[contains(.,'Tu Carro está')])");
			btnContinuar = By.xpath("//button[contains(.,'Continuar')]");
			txtTituloCompra = By.xpath("//span[contains(.,'Compra')]");
			inputCorreo = By.id("testId-Input-email");
			inputDireccion = By.id("testId-Input-street");
			btnGuardarDireccion = By.xpath("//button[@id='testId-infoModalFooter-button']");
			btnIrPagar = By.xpath("//button[contains(.,'Ir a pagar')]");
			
			iframePago = By.xpath("//iframe[@title='payment-iframe']");
			inputNumeroTarjeta = By.xpath("//input[@placeholder='Número de tarjeta de crédito']");
			inputCvv = By.xpath("//input[@placeholder='CVV']");
			inputRutTarjeta = By.xpath("//input[@placeholder='RUT dueño de tarjeta ']");
			listSelectMes = By.xpath("//option[@ng-repeat='month in months']");
			listSelectAno = By.xpath("//option[@ng-repeat='year in years']");
			
			
			inputUser = By.id("user-name");
			inputPassword = By.name("password");
			buttonLogin = By.id("login-button");
			tittleProducts = By.xpath("//span[contains(.,'Products')]");
			listProducts = By.className("inventory_item_name");
			buttonAddCart = By.xpath("//button[contains(@id,'add-to-cart')]");
			buttonShopping = By.className("shopping_cart_badge");
			tittleDescription = By.className("inventory_item_name");
			buttonCheckout = By.id("checkout");
			listInputInformation = By.xpath("//input[contains(@class,'form_input')]");
			buttonContinue = By.id("continue");
			itemPrice = By.className("inventory_item_price");
			itemTotal = By.className("summary_total_label");
			buttonFinish = By.id("finish");
			textOrderComplete = By.className("complete-header");			
		}	
}
