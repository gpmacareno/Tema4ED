package es.Studium.ejercicio6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCajaBlanca
{

	@Test
	void testCamino2()
	{
		String resultadoEsperado = "1 x 2 = 2\n2 x 2 = 4\n3 x 2 = 6\n4 x 2 = 8\n5 x 2 = 10\n6 x 2 = 12\n7 x 2 = 14\n8 x 2 = 16\n9 x 2 = 18\n10 x 2 = 20\n";
		String resultadoReal = Ejercicio6CJB.tabladeMultiplicar(2);
		assertEquals(resultadoEsperado, resultadoReal);
	}

}
