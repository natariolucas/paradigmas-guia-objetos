package unlam.paradigmas.objetos.ej03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CirculoTests {

	@Test
	void testObtenerPropiedadesInicial() {
		// arrange
		Circulo circulo = new Circulo(2);
		double radioEsperado = 2;
		double diametroEsperado = 4;
		double perimetroEsperado = 2 * Math.PI * 2;
		double areaEsperada = Math.PI * Math.pow(2, 2);
		
		// act, assert
		assertEquals(radioEsperado, circulo.obtenerRadio());
		assertEquals(diametroEsperado, circulo.obtenerDiametro());
		assertEquals(perimetroEsperado, circulo.obtenerPerimetro());
		assertEquals(areaEsperada, circulo.obtenerArea());

	}
	
	@Test
	void testCambiarRadioInicial() {
		// arrange
		Circulo circulo = new Circulo(2);
		double nuevoRadio = 3;
		double diametroEsperado = 6;
		double perimetroEsperado = 2 * Math.PI * 3;
		double areaEsperada = Math.PI * Math.pow(3, 2);
		
		// act
		circulo.cambiarRadio(nuevoRadio);
		
		// arrange
		assertEquals(nuevoRadio, circulo.obtenerRadio());
		assertEquals(diametroEsperado, circulo.obtenerDiametro());
		assertEquals(perimetroEsperado, circulo.obtenerPerimetro());
		assertEquals(areaEsperada, circulo.obtenerArea());
	}
	
	@Test
	void testCambiarDiametroInicial() {
		// arrange
		Circulo circulo = new Circulo(2);
		double nuevoDiametro = 6;
		double radioEsperado = 3;
		double perimetroEsperado = 2 * Math.PI * 3;
		double areaEsperada = Math.PI * Math.pow(3, 2);

		
		// act
		circulo.cambiarDiametro(nuevoDiametro);
		
		// arrange
		assertEquals(nuevoDiametro, circulo.obtenerDiametro());
		assertEquals(radioEsperado, circulo.obtenerRadio());
		assertEquals(perimetroEsperado, circulo.obtenerPerimetro());
		assertEquals(areaEsperada, circulo.obtenerArea());
	}
	
	@Test
	void testCambiarPerimetroInicial() {
		// arrange
		Circulo circulo = new Circulo(2);
		double nuevoPerimetro = 2 * Math.PI * 8;
		double radioEsperado = 8;
		double diametroEsperado = 16;
		double areaEsperada = Math.PI * Math.pow(8, 2);
		
		// act
		circulo.cambiarPerimetro(nuevoPerimetro);
		
		// arrange
		assertEquals(nuevoPerimetro, circulo.obtenerPerimetro());
		assertEquals(radioEsperado, circulo.obtenerRadio());
		assertEquals(diametroEsperado, circulo.obtenerDiametro());
		assertEquals(areaEsperada, circulo.obtenerArea());
	}
	
	@Test
	void testCambiarAreaInicial() {
		// arrange
		Circulo circulo = new Circulo(2);
		double nuevaArea = 4;
		double radioEsperado = Math.sqrt(4 / Math.PI);
		double diametroEsperado = 2 * Math.sqrt(4 / Math.PI);
		double perimetroEsperado = 2 * Math.PI * Math.sqrt(4 / Math.PI);
		
		// act
		circulo.cambiarArea(nuevaArea);
		
		// arrange
		assertEquals(nuevaArea, Math.round(circulo.obtenerArea()));
		assertEquals(radioEsperado, circulo.obtenerRadio());
		assertEquals(diametroEsperado, circulo.obtenerDiametro());
		assertEquals(perimetroEsperado, circulo.obtenerPerimetro());
	}
	
}
