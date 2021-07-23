package invernadero;

import java.util.Scanner;

public class SinFlor extends Planta {

	private String Naturaleza;
	
	public SinFlor(String nombre, float altura, String reproduccion, int duracion,String naturaleza) {
		super(nombre, altura, reproduccion, duracion);
		this.Naturaleza=naturaleza;
	}

    public void mostrardatosSF() {
		System.out.println("Nombre: "+Getnombre()
				+ "\tAltura: "+Getaltura()
				+ "\tReproduccion:  "+Getreproduccion()
				+ "\tDuracion:  "+Getduracion()
				+ "\tNaturaleza: "+Naturaleza);
		
	}
	
	public void invernaderoSF() {
		
		SinFlor helecho = new SinFlor("\tpolypodiophyta",1,"\tsemilla",1,"\tbriofitas");
		SinFlor coladecaballo = new SinFlor("\tequisetopsida",1,"\tgimnospernia",5,"\tpteridofitas");
		SinFlor musgo = new SinFlor("\tPolytrichum Juniperinium",3,"\tgimnospernias",5,"\tbriofitas");
		helecho.mostrardatosSF();
		coladecaballo.mostrardatosSF();
		musgo.mostrardatosSF();


		
		
	}

public void agregarSF() {
	
	//nombre
	System.out.println("escriba el nombre: ");
	Scanner n = new Scanner(System.in);
	String name= n.next();
	 Setnombre(name);
	 //altura
	 System.out.println("escriba tama�o:");
	 Scanner a= new Scanner(System.in);
	 float al = a.nextFloat();
	 Setaltura(al);
	 //reproduccion
	 System.out.println("escriba reproduccion:");
	 Scanner r = new Scanner(System.in);
	 String re = r.next();
	 Setreproduccion(re);
	 //duracion
	 System.out.println("escriba duracion:");
	 Scanner d = new Scanner(System.in);
	 int du = d.nextInt();
	 Setduracion(du);
	 //flor
	 System.out.println("escriba naturaleza:");
	 Scanner z = new Scanner(System.in);
	 String na = z.nextLine();
	 Naturaleza=na;
	 System.out.println("\tnombre: "+Getnombre()
	 		+ "\taltura: "+Getaltura()
	 		+ "\treproduccion: "+Getreproduccion()
	 		+ "\tduracion: "+Getduracion()
	 		+ "\tNaturaleza: "+Naturaleza);
	 invernaderoSF();
	
	
}
	
}
