package es.Studium.ejercicio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CajaNegra
{

	@Test
	void CE1()
	{
		int resultadoEsperado = 1;
		int resultadoReal = EJ2CJN.cambiarSemaforo("rojo");
		assertEquals(resultadoEsperado, resultadoReal);
	}
	@Test
	void CE2()
	{
		int resultadoEsperado = 1;
		int resultadoReal = EJ2CJN.cambiarSemaforo("amarillo");
		assertEquals(resultadoEsperado, resultadoReal);
	}
	@Test
	void CE3()
	{
		int resultadoEsperado = 1;
		int resultadoReal = EJ2CJN.cambiarSemaforo("verde");
		assertEquals(resultadoEsperado, resultadoReal);
	}
	@Test
	void CE4()
	{
		int resultadoEsperado = 0;
		int resultadoReal = EJ2CJN.cambiarSemaforo("azul");
		assertEquals(resultadoEsperado, resultadoReal);
	}

}
