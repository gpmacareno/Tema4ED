package es.studium.Ejercicio1CajaBlanca;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCajaBlanca
{

	@Test
	void camino1()
	{
		boolean resultadoEsperado = true;
		boolean resultadoReal = Ejercicio1.esPar(4);
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	void camino2()
	{
		boolean resultadoEsperado = false;
		boolean resultadoReal = Ejercicio1.esPar(5);
		assertEquals(resultadoEsperado, resultadoReal);
	}

}
