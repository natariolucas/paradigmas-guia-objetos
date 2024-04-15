package unlam.paradigmas.objetos.ej02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PuntoTests {

	@Test
	void testInicializacionXY() {
		// arrange
		double x = 2;
		double y = 4;
		Punto punto = new Punto(x,y);
		
		// act, assert
		assertEquals(x, punto.obtenerX());
		assertEquals(y, punto.obtenerY());
	}
	
	@Test
	void testCambiosXY() {
		// arrange
		double x = 2;
		double y = 4;
		
		double nuevoX = 4;
		double nuevoY = 2;
		
		Punto punto = new Punto(x,y);
		
		// act
		punto.cambiarX(nuevoX);
		punto.cambiarY(nuevoY);
		
		// assert
		assertEquals(nuevoX, punto.obtenerX());
		assertEquals(nuevoY, punto.obtenerY());
	}
	
	@Test
	void testPuntoSobreEjeX() {
		// arrange
		Punto punto = new Punto(1,0);
		
		// act, assert
		assertTrue(punto.estaSobreEjeX());
		assertFalse(punto.estaSobreEjeY());
	};
	
	@Test
	void testPuntoSobreEjeY() {
		// arrange
		Punto punto = new Punto(0,1);
		
		// act, assert
		assertFalse(punto.estaSobreEjeX());
		assertTrue(punto.estaSobreEjeY());
		
	};
	
	@Test
	void tesPuntoSobreNingunEje() {
		// arrange
		Punto punto = new Punto(1,1);
		
		// act, assert
		assertFalse(punto.estaSobreEjeX());
		assertFalse(punto.estaSobreEjeY());
	};
	
	@Test
	void testPuntoOrigen() {
		// arrange
		Punto punto = new Punto(0,0);
		
		// act, assert
		assertTrue(punto.estaSobreEjeX());
		assertTrue(punto.estaSobreEjeY());
		assertTrue(punto.esElOrigen());
	};
	
	@Test
	void testDistanciaHorizontalDosPuntos() {
		// arrange
		Punto punto1 = new Punto(2,2);
		Punto punto2 = new Punto(4,2);
		double distancia = 2;
		
		// act, assert
		assertEquals(distancia, punto1.distanciaAotroPunto(punto2));
		assertEquals(distancia, punto2.distanciaAotroPunto(punto1));
	};
	
	@Test
	void testDistanciaVerticalDosPuntos() {
		// arrange
		Punto punto1 = new Punto(2,2);
		Punto punto2 = new Punto(2,4);
		double distancia = 2;
		
		// act, assert
		assertEquals(distancia, punto1.distanciaAotroPunto(punto2));
		assertEquals(distancia, punto2.distanciaAotroPunto(punto1));
	};
	
	@Test
	void testDistanciaHorizontalDosPuntosUnoOrigen() {
		// arrange
		Punto punto1 = new Punto(2,0);
		Punto punto2 = new Punto(0,0);
		double distancia = 2;
		
		// act, assert
		assertEquals(distancia, punto1.distanciaAotroPunto(punto2));
		assertEquals(distancia, punto2.distanciaAotroPunto(punto1));
	};
	
	@Test
	void testDistanciaVerticalDosPuntosUnoOrigen() {
		// arrange
		Punto punto1 = new Punto(0,2);
		Punto punto2 = new Punto(0,0);
		double distancia = 2;
		
		// act, assert
		assertEquals(distancia, punto1.distanciaAotroPunto(punto2));
		assertEquals(distancia, punto2.distanciaAotroPunto(punto1));
	};
	
	@Test
	void testDistanciaDiagonalNegativaDosPuntos() {
		// arrange
		Punto punto1 = new Punto(-Math.sqrt(2),-Math.sqrt(2));
		Punto punto2 = new Punto(Math.sqrt(2),Math.sqrt(2));
		double distancia = 4;
				
		// act, assert
		assertEquals(distancia, punto1.distanciaAotroPunto(punto2));
		assertEquals(distancia, punto2.distanciaAotroPunto(punto1));
	};
	
	@Test
	void testDistanciaHorizontalOrigen() {
		// arrange
		Punto punto = new Punto(2,0);
		double distancia = 2;
		
		// act, assert
		assertEquals(distancia, punto.distanciaAlOrigen());
	};
	
	@Test
	void testDistanciaVerticalOrigen() {
		// arrange
		Punto punto = new Punto(0,2);
		double distancia = 2;
		
		// act, assert
		assertEquals(distancia, punto.distanciaAlOrigen());
	};
	
	@Test
	void testDistanciaDiagonalNegativaOrigen() {
		// arrange
		Punto punto = new Punto(-Math.sqrt(2),-Math.sqrt(2));
		double distancia = 2;
				
		// act, assert
		assertEquals(distancia, punto.distanciaAlOrigen());
	};
	
	@Test
	void testDistanciaDiagonalPositivaOrigen() {
		// arrange
		Punto punto = new Punto(Math.sqrt(2),Math.sqrt(2));
		double distancia = 2;
				
		// act, assert
		assertEquals(distancia, punto.distanciaAlOrigen());
	};
}
