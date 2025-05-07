package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import modelo.Perro;
import modelo.Gato;
/**
 * Clase de pruebas junit para las clases Perro y Gato
 */
public class TestPractica {

	/**
	 * Comprueba si el metodo sonido() de Perro devuelve el sonido esperado: guau guau
	 */
	@Test
	void testLadrarCorrecto(){
		Perro p1 = new Perro("perroTest");
		assertEquals("guau guau",p1.sonido());
	}
	/**
	 * Comprueba que el metodo sonido() de Perro sea distinto de otro sonido
	 */
	@Test
	void testLadrarFalso(){
		Perro p1 = new Perro("perroTest");
		assertNotEquals("miau miau",p1.sonido());
	}
	/**
	 * Comprueba si el metodo sonido() de Gato devuelve el sonido esperado: miau miau
	 */
	@Test
	void testMaullarCorrecto(){
		Gato g1 = new Gato("gatoTest");
		assertEquals("miau miau",g1.sonido());
	}
	/**
	 * Comprueba que el metodo sonido() de Gato sea distinto de otro sonido
	 */
	@Test
	void testMaullarFalso(){
		Gato g1 = new Gato("gatoTest");
		assertNotEquals("guau guau",g1.sonido());
	}
}
