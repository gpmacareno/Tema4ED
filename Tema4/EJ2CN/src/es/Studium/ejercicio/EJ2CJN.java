package es.Studium.ejercicio;

/*1� Clases de equivalencia:
 * Se Evalua para las entradas tanto para los:
 * 				-Valores Validos
 * 				-Valores no Validos
 * Se Evalua tambien para las salidas:
 * 				-Valores Validos
 * 				-Valores no Validos*/

/*Entradas: VV: "rojo" (1)
 * 			VV: "amarillo" (2)
 * 			VV: "verde" (3)
 * 			VN: Cualquier otra cadena (4)
 * 			Cuatro casos de prueba por cada clase de equivalencia tanto Valida como de no Valida.*/

/*Salidas:  VV: 1 (5)
 * 			VN: 0 (6)
 * 			
 *          Dos casos de prueba por cada clase de equivalencia tanto Valida como de no Valida.
 *          
 *          Seis casos de prueba en total.*/


/* 2�
 *  ----------------------------------------------------------------------------------------------
 * |Clases de Equivalencia       --------     Caso de Prueba   ----------     Resultado Esperado |
 * |----------------------------------------------------------------------------------------------
 * |           1					|	  cambiarSemaforo(rojo);    |			 1               |
 * |		   2					|	  cambiarSemaforo(amarillo);|			 1               |
 * |		   3					|	  cambiarSemaforo(verde);	|			 1               |
 * |		   4					|	  cambiarSemaforo(azul);    |			 0               |
 * |		   5					|	  Ya estudiado   			|			 1               |
 * |		   6					|	  Ya estudiado    		    |			 0               |	  
 *  ----------------------------------------------------------------------------------------------
 *  */






public class EJ2CJN
{
	public static int cambiarSemaforo(String color)
	{
		if (color == "rojo")
		{
			// Cambiar sem�foro a ROJO
			return 1;
		} else if (color == "amarillo")
		{
			// Cambiar sem�foro a AMARILLO
			return 1;
		} else if (color == "verde")
		{
			// Cambiar sem�foro a VERDE
			return 1;
		} else
		{
			return 0;
		}
	}

}
