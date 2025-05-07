package modelo;

/**
 * Clase base para representar un animal.
 * 
 * @author Bryan Sigcha
 * @version 1.0
 */
public abstract class Animal {

	/**
	 * Atributo con el nombre del animal
	 */
	protected String nombre;

	/**
	 * Constructor de la clase Animal
	 * @param nombre El nombre del animal
	 */
	public Animal(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtiene el nombre del animal
	 * @return El nombre del animal
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Establece el nuevo nombre del animal
	 * @param nombre El nuevo nombre del animal
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Muestra por pantalla el nombre del animal
	 */
	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + "]";
	}
	/**
	 * Metodo abstracto que devuelve el sonido que hace el animal
	 * @return El sonido que hace el animal
	 */
	public abstract String sonido();
}
