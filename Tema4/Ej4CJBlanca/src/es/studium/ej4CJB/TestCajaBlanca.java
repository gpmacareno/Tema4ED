package es.studium.ej4CJB;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCajaBlanca
{
	@Test
	void testCamino1()
	{
		String resultadoEsperado = "No has introducido un único carácter.";
		String resultadoReal = CajaBlanca.esVocal("Ornitorrinco");
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	void testCamino2()
	{
		String resultadoEsperado = "El carácter no es una letra.";
		String resultadoReal = CajaBlanca.esVocal("5");
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	void testCamino3()
	{
		String resultadoEsperado = "El carácter es una vocal.";
		String resultadoReal = CajaBlanca.esVocal("é");
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	void testCamino4()
	{
		String resultadoEsperado = "El carácter a veces es una vocal y a veces es una consonante.";
		String resultadoReal = CajaBlanca.esVocal("y");
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	void testCamino5()
	{
		String resultadoEsperado = "El carácter es una consonante.";
		String resultadoReal = CajaBlanca.esVocal("j");
		assertEquals(resultadoEsperado, resultadoReal);
	}

}
