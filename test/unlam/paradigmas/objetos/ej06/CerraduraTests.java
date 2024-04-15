package unlam.paradigmas.objetos.ej06;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CerraduraTests {

	private static int claveApertura = 1234;
	
	@Test
	void testInicializaCerradura() {
		// arrange
		Cerradura cerradura = new Cerradura(claveApertura, 10);
		boolean abiertaEsperado = false, cerradaEsperado = true, bloqueadaEsperado = false;
		int aperturasExitosasEsperado = 0, aperturasFallidasEsperado = 0;
		
		boolean abierta, cerrada, bloqueada;
		int aperturasExitosas, aperturasFallidas;
		
		// act
		abierta = cerradura.estaAbierta();
		cerrada = cerradura.estaCerrada();
		bloqueada = cerradura.fueBloqueada();
		aperturasExitosas = cerradura.contarAperturasExitosas();
		aperturasFallidas = cerradura.contarAperturasFallidas();
		
		// assert
		assertEquals(abiertaEsperado, abierta);
		assertEquals(cerradaEsperado, cerrada);
		assertEquals(bloqueadaEsperado, bloqueada);
		assertEquals(aperturasExitosasEsperado, aperturasExitosas);
		assertEquals(aperturasFallidasEsperado, aperturasFallidas);
	}

	@Test
	void testAbrirExitoso() {
		// arrange
		Cerradura cerradura = new Cerradura(claveApertura, 10);
		boolean abiertaEsperado = true, cerradaEsperado = false, bloqueadaEsperado = false, abrirEsperado = true;
		int cantidadAperturasExitosasEsperado = 1, cantidadAperturasFallidasEsperado = 0;
				
		boolean abierta, cerrada, bloqueada, abrir;
		int cantidadAperturasExitosas, cantidadAperturasFallidas;
				
		// act
		abrir = cerradura.abrir(claveApertura);
		abierta = cerradura.estaAbierta();
		cerrada = cerradura.estaCerrada();
		bloqueada = cerradura.fueBloqueada();
		cantidadAperturasExitosas = cerradura.contarAperturasExitosas();
		cantidadAperturasFallidas = cerradura.contarAperturasFallidas();
			
		// assert
		assertEquals(abiertaEsperado, abierta);
		assertEquals(cerradaEsperado, cerrada);
		assertEquals(bloqueadaEsperado, bloqueada);
		assertEquals(abrirEsperado, abrir);
		assertEquals(cantidadAperturasExitosasEsperado, cantidadAperturasExitosas);
		assertEquals(cantidadAperturasFallidasEsperado, cantidadAperturasFallidas);
	}
	
	@Test
	void testAbrirClaveErronea() {
		// arrange
		Cerradura cerradura = new Cerradura(claveApertura, 10);
		boolean abiertaEsperado = false, cerradaEsperado = true, bloqueadaEsperado = false, abrirEsperado = false;
		int cantidadAperturasExitosasEsperado = 0, cantidadAperturasFallidasEsperado = 1;
				
		boolean abierta, cerrada, bloqueada, abrir;
		int cantidadAperturasExitosas, cantidadAperturasFallidas;
				
		// act
		abrir = cerradura.abrir(claveApertura+1);
		abierta = cerradura.estaAbierta();
		cerrada = cerradura.estaCerrada();
		bloqueada = cerradura.fueBloqueada();
		cantidadAperturasExitosas = cerradura.contarAperturasExitosas();
		cantidadAperturasFallidas = cerradura.contarAperturasFallidas();
			
		// assert
		assertEquals(abiertaEsperado, abierta);
		assertEquals(cerradaEsperado, cerrada);
		assertEquals(bloqueadaEsperado, bloqueada);
		assertEquals(abrirEsperado, abrir);
		assertEquals(cantidadAperturasExitosasEsperado, cantidadAperturasExitosas);
		assertEquals(cantidadAperturasFallidasEsperado, cantidadAperturasFallidas);
	}
	
	@Test
	void testCerrarExitoso() {
		// arrange
		Cerradura cerradura = new Cerradura(claveApertura, 10);
		boolean abiertaEsperado = false, cerradaEsperado = true, bloqueadaEsperado = false, abrirEsperado = true;
		int cantidadAperturasExitosasEsperado = 1, cantidadAperturasFallidasEsperado = 0;
		
		boolean abierta, cerrada, bloqueada, abrir;
		int cantidadAperturasExitosas, cantidadAperturasFallidas;
				
		// act
		abrir = cerradura.abrir(claveApertura);
		cerradura.cerrar();
		abierta = cerradura.estaAbierta();
		cerrada = cerradura.estaCerrada();
		bloqueada = cerradura.fueBloqueada();
		cantidadAperturasExitosas = cerradura.contarAperturasExitosas();
		cantidadAperturasFallidas = cerradura.contarAperturasFallidas();
			
		// assert
		assertEquals(abiertaEsperado, abierta);
		assertEquals(cerradaEsperado, cerrada);
		assertEquals(bloqueadaEsperado, bloqueada);
		assertEquals(abrirEsperado, abrir);
		assertEquals(cantidadAperturasExitosasEsperado, cantidadAperturasExitosas);
		assertEquals(cantidadAperturasFallidasEsperado, cantidadAperturasFallidas);
	}
	
	@Test
	void testBloqueoPorFallosConsecutivos() {
		// arrange
		Cerradura cerradura = new Cerradura(claveApertura, 2);
		boolean abiertaEsperado = false, cerradaEsperado = true, bloqueadaEsperado = true;
		int cantidadAperturasExitosasEsperado = 0, cantidadAperturasFallidasEsperado = 2;
		
		boolean abierta, cerrada, bloqueada;
		int cantidadAperturasExitosas, cantidadAperturasFallidas;
				
		// act
		cerradura.abrir(claveApertura+1);
		cerradura.abrir(claveApertura+1);
		abierta = cerradura.estaAbierta();
		cerrada = cerradura.estaCerrada();
		bloqueada = cerradura.fueBloqueada();
		cantidadAperturasExitosas = cerradura.contarAperturasExitosas();
		cantidadAperturasFallidas = cerradura.contarAperturasFallidas();
			
		// assert
		assertEquals(abiertaEsperado, abierta);
		assertEquals(cerradaEsperado, cerrada);
		assertEquals(bloqueadaEsperado, bloqueada);
		assertEquals(cantidadAperturasExitosasEsperado, cantidadAperturasExitosas);
		assertEquals(cantidadAperturasFallidasEsperado, cantidadAperturasFallidas);
	}
	
	@Test
	void testFallosTotalesMayorAConsecutivosNoBloquea() {
		// arrange
		Cerradura cerradura = new Cerradura(claveApertura, 3);
		boolean abiertaEsperado = false, cerradaEsperado = true, bloqueadaEsperado = false;
		int cantidadAperturasExitosasEsperado = 1, cantidadAperturasFallidasEsperado = 4;
		
		boolean abierta, cerrada, bloqueada;
		int cantidadAperturasExitosas, cantidadAperturasFallidas;
				
		// act
		cerradura.abrir(claveApertura+1); // fallo 1
		cerradura.abrir(claveApertura+1); // fallo 2
		cerradura.abrir(claveApertura);
		cerradura.cerrar();
		cerradura.abrir(claveApertura+1); // fallo 3
		cerradura.abrir(claveApertura+1); // fallo 4
		abierta = cerradura.estaAbierta();
		cerrada = cerradura.estaCerrada();
		bloqueada = cerradura.fueBloqueada();
		cantidadAperturasExitosas = cerradura.contarAperturasExitosas();
		cantidadAperturasFallidas = cerradura.contarAperturasFallidas();
			
		// assert
		assertEquals(abiertaEsperado, abierta);
		assertEquals(cerradaEsperado, cerrada);
		assertEquals(bloqueadaEsperado, bloqueada);
		assertEquals(cantidadAperturasExitosasEsperado, cantidadAperturasExitosas);
		assertEquals(cantidadAperturasFallidasEsperado, cantidadAperturasFallidas);
	}
	
	@Test
	void testFallosConsecutivosBloqueaConAperturaIntermedia() {
		// arrange
		Cerradura cerradura = new Cerradura(claveApertura, 2);
		boolean abiertaEsperado = false, cerradaEsperado = true, bloqueadaEsperado = true;
		int cantidadAperturasExitosasEsperado = 1, cantidadAperturasFallidasEsperado = 3;
		
		boolean abierta, cerrada, bloqueada;
		int cantidadAperturasExitosas, cantidadAperturasFallidas;
				
		// act
		cerradura.abrir(claveApertura+1); // fallo 1
		cerradura.abrir(claveApertura);
		cerradura.cerrar();
		cerradura.abrir(claveApertura+1); // fallo 2
		cerradura.abrir(claveApertura+1); // fallo 3
		abierta = cerradura.estaAbierta();
		cerrada = cerradura.estaCerrada();
		bloqueada = cerradura.fueBloqueada();
		cantidadAperturasExitosas = cerradura.contarAperturasExitosas();
		cantidadAperturasFallidas = cerradura.contarAperturasFallidas();
			
		// assert
		assertEquals(abiertaEsperado, abierta);
		assertEquals(cerradaEsperado, cerrada);
		assertEquals(bloqueadaEsperado, bloqueada);
		assertEquals(cantidadAperturasExitosasEsperado, cantidadAperturasExitosas);
		assertEquals(cantidadAperturasFallidasEsperado, cantidadAperturasFallidas);
	}
	
	@Test
	void testIntentarAbrirPuertaBloqueada() {
		// arrange
		Cerradura cerradura = new Cerradura(claveApertura, 1);
		boolean abiertaEsperado = false, cerradaEsperado = true, bloqueadaEsperado = true, abrirEsperado = false;
		int cantidadAperturasExitosasEsperado = 0, cantidadAperturasFallidasEsperado = 2;
		
		boolean abierta, cerrada, bloqueada, abrir;
		int cantidadAperturasExitosas, cantidadAperturasFallidas;
				
		// act
		cerradura.abrir(claveApertura+1); // fallo 1
		abrir = cerradura.abrir(claveApertura); // intento de abrir bloqueada
		abierta = cerradura.estaAbierta();
		cerrada = cerradura.estaCerrada();
		bloqueada = cerradura.fueBloqueada();
		cantidadAperturasExitosas = cerradura.contarAperturasExitosas();
		cantidadAperturasFallidas = cerradura.contarAperturasFallidas();
			
		// assert
		assertEquals(abiertaEsperado, abierta);
		assertEquals(cerradaEsperado, cerrada);
		assertEquals(bloqueadaEsperado, bloqueada);
		assertEquals(abrirEsperado, abrir);
		assertEquals(cantidadAperturasExitosasEsperado, cantidadAperturasExitosas);
		assertEquals(cantidadAperturasFallidasEsperado, cantidadAperturasFallidas);
	}
}
