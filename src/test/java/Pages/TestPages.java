package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestPages {
	WebDriver driver;
	public By imgPrincipal;
			public By bntCerrarImgPrincipal;
			public By selectDesplegable;
			public By listInputUsuario;
			public By listCheck;
			
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
			
		public TestPages(WebDriver driver) {
			this.driver = driver;	
		
			imgPrincipal = By.xpath("//img[@alt='Descarga la APP']");
			bntCerrarImgPrincipal = By.xpath("//div[@class='dy-lb-close']");
			selectDesplegable = By.xpath("//p[contains(.,'Hola')]");
			listInputUsuario = By.xpath("//input[contains(@id,'testId-Input-')]");
			listCheck = By.xpath("//p[contains(@class,'jsx-')]/child::span[not(contains(@role,'button'))]");
			
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
		}	
}