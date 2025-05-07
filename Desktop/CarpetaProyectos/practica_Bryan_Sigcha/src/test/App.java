package test;
import modelo.Perro;
import modelo.Gato;
/**
 * Clase principal que contiene el punto de entrada al programa
 * Crea objetos de las clases Perro y Gato, y muestra sus sonidos
 */
public class App {

	/**
	 * Metodo main() es el punto de entrada del programa
	 * @param args Argumentos del metodo main
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Perro p1 = new Perro("jake");
		Perro p2 = new Perro("balto");
		Gato g1 =new Gato("leo");
		System.out.println(p1.toString()+" hace "+p1.sonido());
		System.out.println(p2.toString()+" hace "+p2.sonido());
		System.out.println(g1.toString()+" hace "+g1.sonido());
	}

}
