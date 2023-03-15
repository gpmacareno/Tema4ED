package es.Studium.ej5CJB;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCajaBlanca
{

	@Test
	void testCamino1()
	{
		String resultadoEsperado = "Enero tiene: 31 dias";
		String resultadoReal = Ej5CJBlanca.diasDeMes("Enero");
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	void testCamino2()
	{
		String resultadoEsperado = "Abril tiene: 30 dias";
		String resultadoReal = Ej5CJBlanca.diasDeMes("Abril");
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	void testCamino3()
	{
		String resultadoEsperado = "Febrero tiene: 28 dias o 29 dias (en año bisiesto)";
		String resultadoReal = Ej5CJBlanca.diasDeMes("Febrero");
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test

	void testCamino4()
	{
		String resultadoEsperado = "No has especificado un mes válido";
		String resultadoReal = Ej5CJBlanca.diasDeMes("Diciemb");
		assertEquals(resultadoEsperado, resultadoReal);

	}

}
