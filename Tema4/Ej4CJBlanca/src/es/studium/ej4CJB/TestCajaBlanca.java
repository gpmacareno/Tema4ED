package es.studium.ej4CJB;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCajaBlanca
{
	@Test
	void testCamino1()
	{
		String resultadoEsperado = "No has introducido un �nico car�cter.";
		String resultadoReal = CajaBlanca.esVocal("Ornitorrinco");
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	void testCamino2()
	{
		String resultadoEsperado = "El car�cter no es una letra.";
		String resultadoReal = CajaBlanca.esVocal("5");
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	void testCamino3()
	{
		String resultadoEsperado = "El car�cter es una vocal.";
		String resultadoReal = CajaBlanca.esVocal("�");
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	void testCamino4()
	{
		String resultadoEsperado = "El car�cter a veces es una vocal y a veces es una consonante.";
		String resultadoReal = CajaBlanca.esVocal("y");
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	void testCamino5()
	{
		String resultadoEsperado = "El car�cter es una consonante.";
		String resultadoReal = CajaBlanca.esVocal("j");
		assertEquals(resultadoEsperado, resultadoReal);
	}

}
