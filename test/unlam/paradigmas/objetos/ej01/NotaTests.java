package unlam.paradigmas.objetos.ej01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NotaTests {

	@Test
	void notaLimiteAprobacion() {
		// arrange
		Nota nota = new Nota(7);
		
		// act
		boolean aprobado = nota.aprobado();
		boolean desaprobado = nota.desaprobado();
		
		// assert
		assertTrue(aprobado);
		assertFalse(desaprobado);
	}
	
	@Test
	void notaSuperiorLimiteAprobacion() {
		// arrange
		Nota nota = new Nota(9);
		
		// act
		boolean aprobado = nota.aprobado();
		boolean desaprobado = nota.desaprobado();
		
		// assert
		assertTrue(aprobado);
		assertFalse(desaprobado);
	}
	
	@Test
	void notaInferiorLimiteAprobacion() {
		// arrange
		Nota nota = new Nota(6);
		
		// act
		boolean aprobado = nota.aprobado();
		boolean desaprobado = nota.desaprobado();
		
		// assert
		assertFalse(aprobado);
		assertTrue(desaprobado);
	}
	
	@Test
	void notaCero() {
		// arrange
		Nota nota = new Nota(0);
				
		// act
		boolean aprobado = nota.aprobado();
		boolean desaprobado = nota.desaprobado();
				
		// assert
		assertFalse(aprobado);
		assertTrue(desaprobado);
	}

}
