package es.studium.tarea4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class Test_Caja_Blanca
{

	@Test
	void Camino1()
	{
		boolean resultadoEsperado = true;
		boolean resultadoReal = Examen.validar("30250334K");
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	void Camino2()
	{
		boolean resultadoEsperado = false;
		boolean resultadoReal = Examen.validar("3250334K");
		assertEquals(resultadoEsperado, resultadoReal);
	
	}
}
