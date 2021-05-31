package GAIA.PruebaAutomatizacion;

import java.awt.AWTException;
import java.io.File;

import javax.swing.JOptionPane;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.NoAlertPresentException;	
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;




public class GAIA {
	
	
	public GAIA () {}
	

		
	
	public void Venta_Valora (ChromeDriver controlador, String producto) throws Exception {
		
				
		System.out.println("-----------------------------------------");
		System.out.println("-------------Ingresando GAIA-------------");
		System.out.println("-----------------------------------------");
		controlador.get("https://www.gaiadesign.com.mx/");
		System.out.println("-----------------------------------------");
		
		controlador.findElement(By.id("hdr1")).click();
		Thread.sleep(1000);
		controlador.findElement(By.xpath("//*[@id='my-account-pop']/div[2]/ul/li[2]/a")).click();
		Thread.sleep(1000);
		File scrFile001 = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile001, new File("d:\\Evidencias_Automatizacion\\GAIA\\1-Inicio Login.png"));
		Thread.sleep(1000);
		controlador.findElement(By.id("inputEmail")).sendKeys("fmarquez.ing@gmail.com");
		controlador.findElement(By.id("inputPassword")).sendKeys("doki1010");
		Thread.sleep(1000);
		File scrFile002 = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile002, new File("d:\\Evidencias_Automatizacion\\GAIA\\2-Datos cuenta.png"));
		controlador.findElement(By.name("send")).click();
		Thread.sleep(1000);
		controlador.findElement(By.id("header")).click();
		Thread.sleep(1000);
		controlador.findElement(By.xpath("//*[@id='categories-Container']/div[4]/a/div")).click();
		Thread.sleep(1000);
		File scrFile003 = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile003, new File("d:\\Evidencias_Automatizacion\\GAIA\\3-Camas.png"));
		Thread.sleep(1000);
		controlador.findElement(By.id("10945")).click();
		Thread.sleep(1000);
		controlador.findElement(By.xpath("//*[@id='product_addtocart_form']/div[3]/div/div/div[8]/div[2]/div[2]/div/span/a[1]/span")).click();
		Thread.sleep(500);
		controlador.findElement(By.xpath("//*[@id='product_addtocart_form']/div[3]/div/div/div[8]/div[2]/div[2]/div/span/a[1]/span")).click();
		Thread.sleep(500);
		controlador.findElement(By.xpath("//*[@id='product_addtocart_form']/div[3]/div/div/div[8]/div[2]/div[2]/div/span/a[2]/span")).click();
		Thread.sleep(500);
		controlador.findElement(By.id("414")).click();
		Thread.sleep(500);
		File scrFile004 = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile004, new File("d:\\Evidencias_Automatizacion\\GAIA\\4-Caracteristicas Producto.png"));
		controlador.findElement(By.xpath("//*[@id='slider1_container']/div/div/div[4]/div/div/div[2]/div[3]/div[1]/div[1]/img")).click();
		Thread.sleep(500);
		controlador.findElement(By.xpath("//*[@id='product_addtocart_form']/div[3]/div/div/div[8]/div[2]/div[2]/a")).click();
		Thread.sleep(1500);
		controlador.findElement(By.xpath("//*[@id='ac-cart']/div/div[2]/div[1]/div/ul/li[1]/button")).click();
		Thread.sleep(1500);
		controlador.findElement(By.id("p_method_spei")).click();
		File scrFile005 = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile005, new File("d:\\Evidencias_Automatizacion\\GAIA\\5-Metodo Pago.png"));
		Thread.sleep(1500);
		controlador.findElement(By.xpath("//*[@id='review-buttons-container']/button")).click();
		Thread.sleep(15000);
		File scrFile006 = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile006, new File("d:\\Evidencias_Automatizacion\\GAIA\\6-Numero de Pedido.png"));
		
		
	}
}
