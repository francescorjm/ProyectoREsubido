package invernadero;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//moatrando plantas con flores
		ConFlor muestraCF= new ConFlor ("null",0,"null",0,"null");
		
		//mostrando plantas sin flores
		SinFlor muestraSF = new SinFlor ("null",0,"null",0,"null");

		
		
		//Menu
		Scanner Menu = new Scanner(System.in);
		int dato;
		
		System.out.println("invernadero de FR\n"
				+ "\n elija una opcion:"
				+ "\n 1. mostrar plantas con flores"
				+ "\n 2. mostrar plantas sin flores"
				+ "\n 3. agregar plantas con flores"
				+ "\n 4. agregar plantas sin flores");
		
		dato= Menu.nextInt();
		switch(dato) {
		case 1:{
			muestraCF.invernaderoCF();		
			break;
		}
		case 2:{
			
			muestraSF.invernaderoSF();
			break;
		}
		case 3:{
			muestraCF.agregarCF();
			break;
		}
		case 4:{
			
			muestraSF.agregarSF();
		}
		}
		

	



	}

}
