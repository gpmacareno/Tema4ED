package es.studium.Tarea4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class Test_Caja_Negra
{

	@Test
	void Camino1()
	{
		Producto p = new Producto();       
		p.setPrecio(100.0);
		p.aplicarDescuento(20);
		double resultadoReal = p.getPrecio();
		double resultadoEsperado = 80.0;
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	void Camino2()
	{
		Producto p = new Producto();       
		p.setPrecio(100.0);
		/*p.aplicarDescuento(-2);
		  Esta línea no se ejecuta, porque según indica el
	      enunciado, si se hace una operación no válida no cambian los
	      atributos del objeto.*/
		double resultadoReal = p.getPrecio();
		double resultadoEsperado =100.0;
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	void Camino3()
	{
		Producto p = new Producto();       
		p.setPrecio(100.0);
		/*p.aplicarDescuento(120);
		  Esta línea no se ejecuta, porque según indica el
	      enunciado, si se hace una operación no válida no cambian los
	      atributos del objeto.*/
		double resultadoReal = p.getPrecio();
		double resultadoEsperado = 100.0;
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	void Camino4()
	{
		Producto p = new Producto();       
		p.setIVA(21);
		int resultadoReal = p.getIVA();
		int resultadoEsperado = 21;
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	void Camino5()
	{
		Producto p = new Producto();       
		p.setIVA(10);
		int resultadoReal = p.getIVA();
		int resultadoEsperado = 10;
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	void Camino6()
	{
		Producto p = new Producto();       
		p.setIVA(4);
		int resultadoReal = p.getIVA();
		int resultadoEsperado = 4;
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	void Camino7()
	{
		Producto p = new Producto();       
		//p.setIVA(1000);
		/*Esta línea no se ejecuta, porque según indica el
	      enunciado, si se hace una operación no válida no cambian los
	      atributos del objeto.*/
		int resultadoReal = p.getIVA();
		int resultadoEsperado = 21;
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	void Camino8()
	{
		Producto p = new Producto();       
		p.setPrecio(90.0);
		double resultadoReal = p.getPrecio();
		double resultadoEsperado = 90.0;
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	void Camino9()
	{
		Producto p = new Producto();       
		//p.setPrecio(-50.0);
		/*Esta línea no se ejecuta, porque según indica el
	      enunciado, si se hace una operación no válida no cambian los
	      atributos del objeto.*/
		double resultadoReal = p.getPrecio();
		double resultadoEsperado = 0.0;
		assertEquals(resultadoEsperado, resultadoReal);
	}



}
