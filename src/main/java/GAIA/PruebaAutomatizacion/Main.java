package GAIA.PruebaAutomatizacion;



import javax.swing.JOptionPane;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class Main 
{

	
    public static void main( String[] args ) throws Exception {
    {
    	//its a trap  
    	
    	
    	try {
    		
			GAIA Navegador = new GAIA();
		   
			String msg = "", opc = "";
			

    		do
    			{	
    			ChromeOptions options = new ChromeOptions();
    			options.addArguments("--start-maximized");
		    	ChromeDriver controlador = new ChromeDriver(options);
		    	
		   
		    	
		    	String menu = "";
				menu += "a)	Compra con Usuario registrado                     \n";
				

				
				
				String producto = JOptionPane.showInputDialog(null, menu, " Selecciona una opción ", 3);

				switch (producto) {
				case "a" : 
					Navegador.Venta_Valora(controlador, producto);
					break;

				default:
					JOptionPane.showConfirmDialog(null, "Opción Incorrecta");
					break;
				}
				opc = JOptionPane.showInputDialog(null, "¿Otra vez?");
				msg = "";
				controlador=null;
    			} while (opc.equalsIgnoreCase("si"));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Se produjo un error inesperado", "Mensaje de Error", 0);
			System.out.println("Causa   " + e.getLocalizedMessage() + "\n Mensaje de error   " + e.getMessage());
		}

	}
}
}