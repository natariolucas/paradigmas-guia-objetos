package unlam.paradigmas.objetos.ej04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CuboTests {

	@Test
	void testInicializarCubo() {
		// arrange
		Cubo cubo = new Cubo(2);
		double ladoEsperado = 2;
		double areaCaraEsperada = 4;
		double volumenEsperado = 8;
		
		// act, assert
		assertEquals(cubo.obtenerLado(), ladoEsperado);
		assertEquals(cubo.obtenerAreaCara(), areaCaraEsperada);
		assertEquals(cubo.obtenerVolumen(), volumenEsperado);
	}
	
	@Test
	void testCambiarLado() {
		// arrange
		Cubo cubo = new Cubo(2);
		double nuevoLado = 4;
		double ladoEsperado = 4;
		double areaCaraEsperada = 16;
		double volumenEsperado = 64;
		
		// act
		cubo.cambiarLado(nuevoLado);
		double lado = cubo.obtenerLado();
		double areaCara = cubo.obtenerAreaCara();
		double volumen = cubo.obtenerVolumen();
		
		// assert
		assertEquals(lado, ladoEsperado);
		assertEquals(areaCara, areaCaraEsperada);
		assertEquals(volumen, volumenEsperado);
	}
	
	@Test
	void testCambiarAreaCara() {
		// arrange
		Cubo cubo = new Cubo(2);
		double nuevaAreaCara = 16;
		double areaCaraEsperada = nuevaAreaCara;
		double ladoEsperado = 4;
		double volumenEsperado = 64;
		
		// act
		cubo.cambiarAreaCara(nuevaAreaCara);
		double areaCara = cubo.obtenerAreaCara();
		double lado = cubo.obtenerLado();
		double volumen = cubo.obtenerVolumen();
		
		// assert
		assertEquals(areaCara, areaCaraEsperada);
		assertEquals(lado, ladoEsperado);
		assertEquals(volumen, volumenEsperado);
	}
	
	@Test
	void testCambiarVolumen() {
		// arrange
		Cubo cubo = new Cubo(2);
		double nuevoVolumen = 64;
		double volumenEsperado = nuevoVolumen;
		double ladoEsperado = 4;
		double areaCaraEsperada = 16;
		
		// act
		cubo.cambiarVolumen(nuevoVolumen);
		double areaCara = cubo.obtenerAreaCara();
		double lado = cubo.obtenerLado();
		double volumen = cubo.obtenerVolumen();
		
		// assert
		assertEquals(areaCara, areaCaraEsperada);
		assertEquals(lado, ladoEsperado);
		assertEquals(volumen, volumenEsperado);
	}
}
