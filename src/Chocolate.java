
public class Chocolate {

	String nombre;

	
	public Chocolate(String nombre) {
		this.nombre = nombre;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		
		return nombre;
	}
	
	
	
}
