package prueba_junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

/*	@Test
	void test() {
		fail("Not yet implemented");
	}
*/


	// Realización de los Tests unitarios usando DisplayName
	
	@Test
	@DisplayName("Prueba sumar dos números positivos")
	public void testSuma() {
		int valorEsperado = 30;
		Calculadora calcu = new Calculadora(20,10);
		int resultado = calcu.suma();
		assertEquals(valorEsperado, resultado, "No coinciden los valores");
	}
	
	@Test
	@DisplayName("Prueba restar dos números positivos")
	public void testResta() {
		int valorEsperado = 10;
		Calculadora calcu = new Calculadora(20,10);
		int resultado = calcu.resta();
		assertEquals(valorEsperado, resultado, "No coinciden los valores");
	}
	
	@Test
	@DisplayName("Prueba multiplica dos números positivos")
	public void testMultiplicacion() {
		int valorEsperado = 200;
		Calculadora calcu = new Calculadora(20,10);
		int resultado = calcu.multiplica();
		assertEquals(valorEsperado, resultado, "No coinciden los valores");
	}
	
	@Test
	@DisplayName("Prueba dividir dos números positivos")
	public void testDivision() {
		int valorEsperado = 2;
		Calculadora calcu = new Calculadora(20,10);
		int resultado = calcu.divide();
		assertEquals(valorEsperado, resultado, "No coinciden los valores");
	}
	
	@Test
	@DisplayName("Prueba dividir entre 0")
	public void testDivision0() {
		int valorEsperado = 0;
		Calculadora calcu = new Calculadora(0,20);
		int resultado = calcu.divide0();
		assertEquals(valorEsperado, resultado, "No coinciden los valores");
	}
	
	
	// Realización de los Tests unitarios usando Try and Catch
	
	@Test
	public void testExceptionSuma() {
		try {
			Calculadora cal = new Calculadora(20,10);
			double resultado = cal.suma();
		}catch(ArithmeticException e){
			System.out.println("Error " + e.toString());
		}
	}
}