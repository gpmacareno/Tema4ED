package es.Studium.ejercicio1;

public class EJ1
{
	
	/*1º Clases de equivalencia:
	 * Se Evalua para las entradas tanto para los:
	 * 				-Valores Validos
	 * 				-Valores no Validos
	 * Se Evalua tambien para las salidas:
	 * 				-Valores Validos
	 * 				-Valores no Validos*/
	
	/*Entradas: VV: Del 1 al 12. (1)
	 * 			VN: 13 - Integer_MAX_VALUE (2)
	 * 				 0 - Integer_MIN_VALUE (3)
	 * 			Tres casos de prueba por cada clase de equivalencia tanto de entrada como de salida.*/
	
	/*Salidas:  VV: 28 (4)
	 * 			VV: 30 (5)
	 * 			VV: 31 (6) 
	 * 			VN:  0 (7)
	 * 			
	 *          Cuatro casos de prueba por cada clase de equivalencia tanto de entrada como de salida.
	 *          
	 *          Siete casos de prueba en total.*/
	
	
	/* 2º
	 *  ----------------------------------------------------------------------------------------------
	 * |Clases de Equivalencia       --------     Caso de Prueba   ----------     Resultado Esperado |
	 * |----------------------------------------------------------------------------------------------
	 * |           1					|		 diasDeMes(1);			|			31               |
	 * |		   2					|		 diasDeMes(13);			|			 0               |
	 * |		   3					|		 diasDeMes(0);			|			 0               |
	 * |		   4					|		 diasDeMes(2);			|			28               |
	 * |		   5					|		 diasDeMes(11);			|			30               |
	 * |		   6					|		 Ya estudiado    		|			31               |
	 * |		   7					|		 Ya estudiado           |            0               |
	 *  ----------------------------------------------------------------------------------------------
	 *  */
	
	
	
	
	public static int diasDeMes(int mes)
	{
		int resultado = 0;
		switch (mes)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
		{
			resultado = 31;
			System.out.println(resultado);
			break;
		}
		case 4:
		case 6:
		case 9:
		case 11:
		{
			resultado = 30;
			System.out.println(resultado);
			break;
		}
		case 2:
		{
			resultado = 28;
			System.out.println(resultado);
			break;
		}
		default:
		{
			resultado = 0;
			System.out.println(resultado);
			break;
		}
		}
		return resultado;
	}
}
