package unlam.paradigmas.objetos.ej02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PuntoTests {

	@Test
	void inicializacionXY() {
		// arrange
		double x = 2;
		double y = 4;
		Punto punto = new Punto(x,y);
		
		// act, assert
		assertEquals(punto.obtenerX(), x);
		assertEquals(punto.obtenerY(), y);
	}
	
	@Test
	void cambiosXY() {
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
		assertEquals(punto.obtenerX(), nuevoX);
		assertEquals(punto.obtenerY(), nuevoY);
	}
	
	@Test
	void puntoSobreEjeX() {
		// arrange
		Punto punto = new Punto(1,0);
		
		// act, assert
		assertTrue(punto.estaSobreEjeX());
		assertFalse(punto.estaSobreEjeY());
	};
	
	@Test
	void puntoSobreEjeY() {
		// arrange
		Punto punto = new Punto(0,1);
		
		// act, assert
		assertFalse(punto.estaSobreEjeX());
		assertTrue(punto.estaSobreEjeY());
		
	};
	
	@Test
	void puntoSobreNingunEje() {
		// arrange
		Punto punto = new Punto(1,1);
		
		// act, assert
		assertFalse(punto.estaSobreEjeX());
		assertFalse(punto.estaSobreEjeY());
	};
	
	@Test
	void puntoOrigen() {
		// arrange
		Punto punto = new Punto(0,0);
		
		// act, assert
		assertTrue(punto.estaSobreEjeX());
		assertTrue(punto.estaSobreEjeY());
		assertTrue(punto.esElOrigen());
	};
	
	@Test
	void distanciaHorizontalDosPuntos() {
		// arrange
		Punto punto1 = new Punto(2,2);
		Punto punto2 = new Punto(4,2);
		double distancia = 2;
		
		// act, assert
		assertEquals(punto1.distanciaAotroPunto(punto2), distancia);
		assertEquals(punto2.distanciaAotroPunto(punto1), distancia);
	};
	
	@Test
	void distanciaVerticalDosPuntos() {
		// arrange
		Punto punto1 = new Punto(2,2);
		Punto punto2 = new Punto(2,4);
		double distancia = 2;
		
		// act, assert
		assertEquals(punto1.distanciaAotroPunto(punto2), distancia);
		assertEquals(punto2.distanciaAotroPunto(punto1), distancia);
	};
	
	@Test
	void distanciaHorizontalDosPuntosUnoOrigen() {
		// arrange
		Punto punto1 = new Punto(2,0);
		Punto punto2 = new Punto(0,0);
		double distancia = 2;
		
		// act, assert
		assertEquals(punto1.distanciaAotroPunto(punto2), distancia);
		assertEquals(punto2.distanciaAotroPunto(punto1), distancia);
	};
	
	@Test
	void distanciaVerticalDosPuntosUnoOrigen() {
		// arrange
		Punto punto1 = new Punto(0,2);
		Punto punto2 = new Punto(0,0);
		double distancia = 2;
		
		// act, assert
		assertEquals(punto1.distanciaAotroPunto(punto2), distancia);
		assertEquals(punto2.distanciaAotroPunto(punto1), distancia);
	};
	
	@Test
	void distanciaDiagonalNegativaDosPuntos() {
		// arrange
		Punto punto1 = new Punto(-Math.sqrt(2),-Math.sqrt(2));
		Punto punto2 = new Punto(Math.sqrt(2),Math.sqrt(2));
		double distancia = 4;
				
		// act, assert
		assertEquals(punto1.distanciaAotroPunto(punto2), distancia);
		assertEquals(punto2.distanciaAotroPunto(punto1), distancia);
	};
	
	@Test
	void distanciaHorizontalOrigen() {
		// arrange
		Punto punto = new Punto(2,0);
		double distancia = 2;
		
		// act, assert
		assertEquals(punto.distanciaAlOrigen(), distancia);
	};
	
	@Test
	void distanciaVerticalOrigen() {
		// arrange
		Punto punto = new Punto(0,2);
		double distancia = 2;
		
		// act, assert
		assertEquals(punto.distanciaAlOrigen(), distancia);
	};
	
	@Test
	void distanciaDiagonalNegativaOrigen() {
		// arrange
		Punto punto = new Punto(-Math.sqrt(2),-Math.sqrt(2));
		double distancia = 2;
				
		// act, assert
		assertEquals(punto.distanciaAlOrigen(), distancia);
	};
	
	@Test
	void distanciaDiagonalPositivaOrigen() {
		// arrange
		Punto punto = new Punto(Math.sqrt(2),Math.sqrt(2));
		double distancia = 2;
				
		// act, assert
		assertEquals(punto.distanciaAlOrigen(), distancia);
	};
}
