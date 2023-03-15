package es.Studium.Ej7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class TestCajaBlanca
{

	@Test
	void Camino1()
	{
		String resultadoEsperado = "";
		String resultadoReal = Ej7.trianguloFilas(0);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	void Camino3()
	{
		String resultadoEsperado = "1\n";
		String resultadoReal = Ej7.trianguloFilas(1);
		assertEquals(resultadoEsperado, resultadoReal);
	}


}
