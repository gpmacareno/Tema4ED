package es.studium.Tarea4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class Prueba_Caja_Blanca
{

	@Test
	void Camino1()
	{
		String resultadoEsperado = "Ya eres mayor de edad";
		String resultadoReal = Examen.mensaje(18);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	void Camino2()
	{
		String resultadoEsperado = "Ya puedes jubilarte";
		String resultadoReal = Examen.mensaje(67);
		assertEquals(resultadoEsperado, resultadoReal);
	
	}
	
	@Test
	void Camino3()
	{
		String resultadoEsperado = "No pasa nada";
		String resultadoReal = Examen.mensaje(25);
		assertEquals(resultadoEsperado, resultadoReal);
	}

}
