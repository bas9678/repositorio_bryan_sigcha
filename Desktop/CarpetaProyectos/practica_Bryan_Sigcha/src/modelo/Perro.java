package modelo;

/**
 * Clase para representar un perro
 * @author Bryan Sigcha
 * @version 1.0
 */
public class Perro extends Animal{
	
	/**
	 * Constructor de la clase Perro
	 * @param nombre El nombre del perro
	 */
	public Perro(String nombre) {
		super(nombre);
	}
	/**
	 * Devuelve el sonido que hace el perro
	 */
	@Override
	public String sonido() {
		// TODO Auto-generated method stub
		return "guau guau";
	}
	/**
	 * Muestra por pantalla el tipo de animal con su nombre
	 */
	@Override
	public String toString() {
		return "El perro "+this.nombre;
	}
	
}
