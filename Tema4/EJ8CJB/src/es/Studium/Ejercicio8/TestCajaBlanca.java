package es.Studium.Ejercicio8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class TestCajaBlanca
{

	@Test
	void Camino1()
	{
		int resultadoEsperado = 1;
		int resultadoReal = Ej8.posicion("p","p");
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	void Camino2()
	{
		int resultadoEsperado = 0;
		int resultadoReal = Ej8.posicion("p","q");
		assertEquals(resultadoEsperado, resultadoReal);
	
	}
	
	@Test
	void Camino3()
	{
		int resultadoEsperado = 0;
		int resultadoReal = Ej8.posicion("p","");
		assertEquals(resultadoEsperado, resultadoReal);
	}

}
