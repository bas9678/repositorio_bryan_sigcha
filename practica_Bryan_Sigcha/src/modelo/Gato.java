package modelo;

/**
 * Clase para representar un gato
 * @author Bryan Sigcha
 * @version 1.0
 */
public class Gato extends Animal{

	/**
	 * Constructor de la clase Gato
	 * @param nombre El nombre del gato
	 */
	public Gato(String nombre) {
		super(nombre);
		
	}
	/**
	 * Devuelve el sonido que hace el gato
	 */
	@Override
	public String sonido() {
		// TODO Auto-generated method stub
		return "miau miau";
	}
	/**
	 * Muestra por pantalla el tipo de animal con su nombre
	 */
	@Override
	public String toString() {
		return "El gato "+this.nombre;
	}
	
}
