package es.Studium.ej9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCajaBlanca
{

	@Test
	void Camino1()
	{
		String resultadoEsperado = "Hoy es lunes";
		String resultadoReal = Ejercicio9.diasDeLaSemana(1);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	void Camino2()
	{
		String resultadoEsperado = "Hoy es martes";
		String resultadoReal = Ejercicio9.diasDeLaSemana(2);
		assertEquals(resultadoEsperado, resultadoReal);
	
	}
	
	@Test
	void Camino3()
	{
		String resultadoEsperado = "Hoy es miercoles";
		String resultadoReal = Ejercicio9.diasDeLaSemana(3);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	void Camino4()
	{
		String resultadoEsperado = "Hoy es jueves";
		String resultadoReal = Ejercicio9.diasDeLaSemana(4);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	void Camino5()
	{
		String resultadoEsperado = "Hoy es viernes";
		String resultadoReal = Ejercicio9.diasDeLaSemana(5);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	void Camino6()
	{
		String resultadoEsperado = "Hoy es sábado";
		String resultadoReal = Ejercicio9.diasDeLaSemana(6);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	void Camino7()
	{
		String resultadoEsperado = "Hoy es domingo";
		String resultadoReal = Ejercicio9.diasDeLaSemana(7);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	void Camino8()
	{
		String resultadoEsperado = "No es un día válido";
		String resultadoReal = Ejercicio9.diasDeLaSemana(8);
		assertEquals(resultadoEsperado, resultadoReal);
	}

}
