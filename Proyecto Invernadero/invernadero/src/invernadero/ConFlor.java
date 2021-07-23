package invernadero;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class ConFlor extends Planta {

	private String Flor;
	
	public ConFlor(String nombre, float altura, String reproduccion, int duracion,String flor) {
		super( nombre, altura, reproduccion, duracion);
		this.Flor = flor;
	}

	public void mostrardatosCF() {
		System.out.println("Nombre: "+Getnombre()
				+ "\tAltura (mts.): "+Getaltura()
				+ "\tReproduccion: "+Getreproduccion()
				+ "\tDuracion(a�os): "+Getduracion()
				+ "\tflor: "+Flor);
	}
	
	public void invernaderoCF() {
		
		ConFlor girasol = new ConFlor("helianthus annuus",5,"angiospernias ",2," girasol");
		ConFlor rosa = new ConFlor("rosa",1,"magnoliopsida",1,"rosa");
		ConFlor tulipan = new ConFlor("tulipa",1,"angiospernias",2,"tulipan");
		girasol.mostrardatosCF();
		rosa.mostrardatosCF();
		tulipan.mostrardatosCF();
	}
	
	public void agregarCF(){
		//nombre
		System.out.println("escriba el nombre: ");
		Scanner n = new Scanner (System.in);
		String name= n.next();
		 Setnombre(name);
		//altura
		System.out.println("escribir altura: ");
		Scanner a = new Scanner(System.in);
		float al = a.nextFloat();
		Setaltura(al);
		//reproduccion
		System.out.println("escriba reproduccion: ");
		Scanner r = new Scanner(System.in);
		String re = r.next();
		Setreproduccion(re);
		//duraciom
		System.out.println("escriba duracion: ");
		Scanner d = new Scanner(System.in);
		int du = d.nextInt();
		Setduracion(du);
		//flor
		System.out.println("escriba tipo de flor: ");
		String fl = new Scanner(System.in).nextLine();
		Flor=fl;
		System.out.println("\tnombre: "+Getnombre()
				+"\taltura: "+Getaltura()
				+"\treproduccion: "+Getreproduccion()
				+"\tduracion: "+Getduracion()
				+"\tFlor: "+Flor);
		
		invernaderoCF();		
	}
	



	
	
}
