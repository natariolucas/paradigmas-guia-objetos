package unlam.paradigmas.objetos.ej05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TarjetaBajaTests {

	@Test
	void testInicializarTarjeta() {
		// arrange
		TarjetaBaja tarjeta = new TarjetaBaja(100);
		double saldoEsperado = 100;
		int viajesEnColectivoEsperado = 0, viajesEnSubteEsperado = 0, viajesEsperado = 0;
		
		double saldo;
		int viajesEnColectivo, viajesEnSubte, viajes;

		// act
		saldo = tarjeta.obtenerSaldo();
		viajesEnColectivo = tarjeta.contarViajesEnColectivo();
		viajesEnSubte = tarjeta.contarViajesEnSubte();
		viajes = tarjeta.contarViajes();
		
		// assert
		assertEquals(saldoEsperado, saldo);
		assertEquals(viajesEnColectivoEsperado, viajesEnColectivo);
		assertEquals(viajesEnSubteEsperado, viajesEnSubte);
		assertEquals(viajesEsperado, viajes);
	}
	
	@Test
	void testCargarTarjetaPositivo() {
		// arrange
		TarjetaBaja tarjeta = new TarjetaBaja(100);
		double recarga = 50;
		double saldoEsperado = 150;
		double saldo;
		
		// act
		tarjeta.cargar(recarga);
		saldo = tarjeta.obtenerSaldo();
		
		// assert
		assertEquals(saldoEsperado, saldo);
	}
	
	@Test
	void testCargarTarjetaCero() {
		// arrange
		TarjetaBaja tarjeta = new TarjetaBaja(100);
		double recarga = 0;
		double saldoEsperado = 100;
		double saldo;
		
		// act
		tarjeta.cargar(recarga);
		saldo = tarjeta.obtenerSaldo();
		
		// assert
		assertEquals(saldoEsperado, saldo);
	}
	
	@Test
	void testCargarTarjetaNegativo() { // No se debe modificar el saldo
		// arrange
		TarjetaBaja tarjeta = new TarjetaBaja(100);
		double recarga = -200;
		double saldoEsperado = 100;
		double saldo;
		
		// act
		tarjeta.cargar(recarga);
		saldo = tarjeta.obtenerSaldo();
		
		// assert
		assertEquals(saldoEsperado, saldo);
	}
	
	@Test
	void testPagarViajeEnColectivoSaldoSuficiente() { // Saldo suficiente es precondición
		// arrange
		TarjetaBaja tarjeta = new TarjetaBaja(100);
		double saldoEsperado = 60.41;
		int viajesEnColectivoEsperado = 1, viajesEnSubteEsperado = 0, viajesEsperado = 1;
		
		double saldo;
		int viajesEnColectivo, viajesEnSubte, viajes;
		
		// act
		tarjeta.pagarViajeEnColectivo();
		saldo = tarjeta.obtenerSaldo();
		viajesEnColectivo = tarjeta.contarViajesEnColectivo();
		viajesEnSubte = tarjeta.contarViajesEnSubte();
		viajes = tarjeta.contarViajes();
		
		// assert
		assertEquals(saldoEsperado, saldo);
		assertEquals(viajesEnColectivoEsperado, viajesEnColectivo);
		assertEquals(viajesEnSubteEsperado, viajesEnSubte);
		assertEquals(viajesEsperado, viajes);
	}
	
	@Test
	void testPagarViajeEnColectivoSaldoJusto() { // Saldo suficiente es precondición
		// arrange
		TarjetaBaja tarjeta = new TarjetaBaja(39.59);
		double saldoEsperado = 0;
		int viajesEnColectivoEsperado = 1, viajesEnSubteEsperado = 0, viajesEsperado = 1;

		double saldo;
		int viajesEnColectivo, viajesEnSubte, viajes;

		
		// act
		tarjeta.pagarViajeEnColectivo();
		saldo = tarjeta.obtenerSaldo();
		viajesEnColectivo = tarjeta.contarViajesEnColectivo();
		viajesEnSubte = tarjeta.contarViajesEnSubte();
		viajes = tarjeta.contarViajes();
		
		// assert
		assertEquals(saldoEsperado, saldo);
		assertEquals(viajesEnColectivoEsperado, viajesEnColectivo);
		assertEquals(viajesEnSubteEsperado, viajesEnSubte);
		assertEquals(viajesEsperado, viajes);
	}
	
	@Test
	void testPagarViajeEnSubteSaldoSuficiente() { // Saldo suficiente es precondición
		// arrange
		TarjetaBaja tarjeta = new TarjetaBaja(100);
		double saldoEsperado = 65.5;
		int viajesEnColectivoEsperado = 0, viajesEnSubteEsperado = 1, viajesEsperado = 1;

		double saldo;
		int viajesEnColectivo, viajesEnSubte, viajes;
		
		// act
		tarjeta.pagarViajeEnSubte();
		saldo = tarjeta.obtenerSaldo();
		viajesEnColectivo = tarjeta.contarViajesEnColectivo();
		viajesEnSubte = tarjeta.contarViajesEnSubte();
		viajes = tarjeta.contarViajes();
		
		// assert
		assertEquals(saldoEsperado, saldo);
		assertEquals(viajesEnColectivoEsperado, viajesEnColectivo);
		assertEquals(viajesEnSubteEsperado, viajesEnSubte);
		assertEquals(viajesEsperado, viajes);
	}
	
	@Test
	void testPagarViajeEnSubteSaldoJusto() { // Saldo suficiente es precondición
		// arrange
		TarjetaBaja tarjeta = new TarjetaBaja(34.5);
		double saldoEsperado = 0;
		int viajesEnColectivoEsperado = 0, viajesEnSubteEsperado = 1, viajesEsperado = 1;

		double saldo;
		int viajesEnColectivo, viajesEnSubte, viajes;
		
		// act
		tarjeta.pagarViajeEnSubte();
		saldo = tarjeta.obtenerSaldo();
		viajesEnColectivo = tarjeta.contarViajesEnColectivo();
		viajesEnSubte = tarjeta.contarViajesEnSubte();
		viajes = tarjeta.contarViajes();
		
		
		// assert
		assertEquals(saldoEsperado, saldo);
		assertEquals(viajesEnColectivoEsperado, viajesEnColectivo);
		assertEquals(viajesEnSubteEsperado, viajesEnSubte);
		assertEquals(viajesEsperado, viajes);
	}
	
	@Test
	void testPagarViajesMixtoSaldoSuficiente() { // Saldo suficiente es precondición
		// arrange
		TarjetaBaja tarjeta = new TarjetaBaja(100);
		double saldoEsperado = 25.91;
		int viajesEnColectivoEsperado = 1, viajesEnSubteEsperado = 1, viajesEsperado = 2;

		double saldo;
		int viajesEnColectivo, viajesEnSubte, viajes;

		
		// act
		tarjeta.pagarViajeEnSubte();
		tarjeta.pagarViajeEnColectivo();
		saldo = (double) Math.round(tarjeta.obtenerSaldo()*100)/100;
		viajesEnColectivo = tarjeta.contarViajesEnColectivo();
		viajesEnSubte = tarjeta.contarViajesEnSubte();
		viajes = tarjeta.contarViajes();
		
		
		// assert
		assertEquals(saldoEsperado, saldo);
		assertEquals(viajesEnColectivoEsperado, viajesEnColectivo);
		assertEquals(viajesEnSubteEsperado, viajesEnSubte);
		assertEquals(viajesEsperado, viajes);
	}
	
	@Test
	void testPagarViajesMixtoSaldoJusto() { // Saldo suficiente es precondición
		// arrange
		TarjetaBaja tarjeta = new TarjetaBaja(74.09);
		double saldoEsperado = 0;
		int viajesEnColectivoEsperado = 1, viajesEnSubteEsperado = 1, viajesEsperado = 2;

		double saldo;
		int viajesEnColectivo, viajesEnSubte, viajes;
		
		// act
		tarjeta.pagarViajeEnSubte();
		tarjeta.pagarViajeEnColectivo();
		saldo = tarjeta.obtenerSaldo();
		viajesEnColectivo = tarjeta.contarViajesEnColectivo();
		viajesEnSubte = tarjeta.contarViajesEnSubte();
		viajes = tarjeta.contarViajes();
		
		// assert
		assertEquals(saldoEsperado, saldo);
		assertEquals(viajesEnColectivoEsperado, viajesEnColectivo);
		assertEquals(viajesEnSubteEsperado, viajesEnSubte);
		assertEquals(viajesEsperado, viajes);
	}
}
