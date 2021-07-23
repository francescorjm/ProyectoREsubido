package invernadero;

public class Planta {

	private String Nombre;
	private float Altura;
	private String Reproduccion;
	private int Duracion;

	//Metodo Constructor
	public Planta(String nombre,float altura, String reproduccion,int duracion){
		
		this.Nombre = nombre; 
		this.Altura = altura;
	this.Reproduccion = reproduccion;
		this.Duracion = duracion;
		
	}
	
	//metodos getters y setters
	
	public void Setnombre(String nombre) {
		this.Nombre=nombre;
	}
	
	public String Getnombre() {
		 
		return Nombre;
	}
	
	//metodo altura
	public void Setaltura(float altura) {
		this.Altura = altura;
	}
	
	public float Getaltura() {
		
	return Altura;
	
	}
	
	//metodo reproduccion
	
	public void Setreproduccion(String reproduccion) {
		
		this.Reproduccion = reproduccion;
	}
	
	public String Getreproduccion() {
		return Reproduccion;
	}
	
	//metodo duracion
	public void Setduracion(int duracion) {
		this.Duracion=duracion;	
	}
	
	public int Getduracion() {
		return Duracion;	
	}
	
	
	
}
