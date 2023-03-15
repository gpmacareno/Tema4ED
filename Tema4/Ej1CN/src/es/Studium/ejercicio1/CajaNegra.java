package es.Studium.ejercicio1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CajaNegra
{

	@Test
	void CE1()
	{
		int resultadoEsperado = 31;
		int resultadoReal = EJ1.diasDeMes(1);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	void CE2()
	{
		int resultadoEsperado = 0;
		int resultadoReal = EJ1.diasDeMes(0);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	@Test
	void CE3()
	{
		int resultadoEsperado = 0;
		int resultadoReal = EJ1.diasDeMes(13);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	@Test
	void CE4()
	{
		int resultadoEsperado = 28;
		int resultadoReal = EJ1.diasDeMes(2);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	@Test
	void CE5()
	{
		int resultadoEsperado = 30;
		int resultadoReal = EJ1.diasDeMes(11);
		assertEquals(resultadoEsperado, resultadoReal);
	}

}
