package GAIA.PruebaAutomatizacion;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class GAIA {
	
	
	public GAIA () {
		
	}

      
    public WebDriverWait                wait;
	
		
	
	public void Venta_Valora (ChromeDriver controlador, String producto) throws Exception {
		
		
		//Identificadores
		By botonCuenta 		= By.id("hdr1");
		By Micuenta 		= By.xpath("//*[@id='my-account-pop']/div[2]/ul/li[2]/a");
		By email 			= By.id("inputEmail");
	    By password 		= By.id("inputPassword");
	    By login 			= By.id("send2");	    
	    By categoriaCama 	= By.xpath("//*[@id='categories-Container']/div[4]/a/div");
	    By cama10942 		= By.id("10942");
	    By addproduct 		= By.xpath("//*[@id='product_addtocart_form']/div[3]/div/div/div[8]/div[2]/div[2]/div/span/a[1]/span");
	    By quitproduct 		= By.xpath("//*[@id='product_addtocart_form']/div[3]/div/div/div[8]/div[2]/div[2]/div/span/a[2]/span");
	    By color414			= By.id("414");
	    By addcart	 		= By.xpath("//*[@id='product_addtocart_form']/div[3]/div/div/div[8]/div[2]/div[2]/a");
	    By pagar			= By.xpath("//*[@id='ac-cart']/div/div[2]/div[1]/div/ul/li[1]/button");
	    By spei				= By.id("p_method_spei");
	    
	    
	    wait = new WebDriverWait(controlador, 10);
		
				
		System.out.println("-----------------------------------------");
		System.out.println("-------------Ingresando GAIA-------------");
		System.out.println("-----------------------------------------");
		controlador.get("https://www.gaiadesign.com.mx/");
		System.out.println("-----------------------------------------");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(botonCuenta)).click();
		controlador.findElement(By.id("hdr1")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(Micuenta)).click();
		File file  = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("D:/Automatizacion Slenium/1-Inicio Login.png"));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(email)).sendKeys("fmarquez.ing@gmail.com");
		wait.until(ExpectedConditions.visibilityOfElementLocated(password)).sendKeys("doki1010");
		File file2  = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file2, new File("D:/Automatizacion Slenium/2-Datos cuenta.png"));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(login)).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(categoriaCama)).click();
		File file3  = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file3, new File("D:/Automatizacion Slenium/3-Camas.png"));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(cama10942)).click();		
		wait.until(ExpectedConditions.visibilityOfElementLocated(addproduct)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(addproduct)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(quitproduct)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(color414)).click();
		File file4  = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file4, new File("D:/Automatizacion Slenium/4-Caracteristicas Producto.png"));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(addcart)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(pagar)).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(spei)).click();
		File file5  = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file5, new File("D:/Automatizacion Slenium/5-Metodo Pago.png"));
		Thread.sleep(2000);
		controlador.findElement(By.xpath("//*[@id='review-buttons-container']/button")).click();
		Thread.sleep(2000);
		File file6  = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file6, new File("D:/Automatizacion Slenium/6-Numero de Pedido.png"));
		
		
	}
}
