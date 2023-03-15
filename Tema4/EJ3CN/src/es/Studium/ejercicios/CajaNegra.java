package es.Studium.ejercicios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CajaNegra
{

	@Test
	void CE1()
	{
		int resultadoEsperado = 1;
		int resultadoReal = EJ3.pedirProducto(1);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	@Test
	void CE2()
	{
		int resultadoEsperado = 0;
		int resultadoReal = EJ3.pedirProducto(-1);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	@Test
	void CE3()
	{
		int resultadoEsperado = 0;
		int resultadoReal = EJ3.pedirProducto(51);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	@Test
	void CE4()
	{
		int resultadoEsperado = 1;
		int resultadoReal = EJ3.seleccionarTipoPago(10);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	@Test
	void CE5()
	{
		int resultadoEsperado = 1;
		int resultadoReal = EJ3.seleccionarTipoPago(20);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	@Test
	void CE6()
	{
		int resultadoEsperado = 1;
		int resultadoReal = EJ3.seleccionarTipoPago(30);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	@Test
	void CE7()
	{
		int resultadoEsperado = 1;
		int resultadoReal = EJ3.seleccionarTipoPago(40);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	@Test
	void CE8()
	{
		int resultadoEsperado = 0;
		int resultadoReal = EJ3.seleccionarTipoPago(12);
		assertEquals(resultadoEsperado, resultadoReal);
	}

}
