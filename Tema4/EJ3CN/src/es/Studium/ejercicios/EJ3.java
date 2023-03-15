package es.Studium.ejercicios;

/*1º Clases de equivalencia:
 * Se Evalua para las entradas tanto para los:
 * 				-Valores Validos
 * 				-Valores no Validos
 * Se Evalua tambien para las salidas:
 * 				-Valores Validos
 * 				-Valores no Validos*/

/*Entradas pedirProducto: VV: 1-50
 * 			              VN: 0-Integer MIN_VALUE
 * 						  VN: 51-Integer Max_Value
 * 			              Tres casos de prueba por cada clase de equivalencia tanto Valida como de no Valida.
 *Entradas tipoPago:      VV: 10
 *						  VV: 20
 *                        VV: 30
 *                        VV: 40
 *                        VN: Cualquier otro número entero
 *                        Cinco casos de prueba por cada clase de equivalencia tanto Valida como de no Valida.
 * */

/*Salida pedirProducto:   VV: 1
 * 						  VN: 0
 *Salida tipoPago:        VV: 1
 *                        VN: 0
 * 			
 * 			
 *                        Cuatro casos de prueba por cada clase de equivalencia tanto Valida como de no Valida.
 *          
 *                        12 casos de prueba en total.*/


/* 2º
 *  ----------------------------------------------------------------------------------------------
 * |Clases de Equivalencia       --------     Caso de Prueba   ----------     Resultado Esperado |
 * |----------------------------------------------------------------------------------------------
 * |           1					|	   pedirProducto(1)          |			 1               |
 * |		   2					|	   pedirProducto(-1)         |			 0               |
 * |		   3					|	   pedirProducto(51) 	     |			 0               |
 * |		   4					|	   seleccionartipoPago(10)   |			 1               |
 * |		   5					|	   seleccionartipoPago(20)	 |			 1               |
 * |		   6					|	   seleccionartipoPago(30)   |			 1               |          
 * |		   7                    |      seleccionartipoPago(40)   |           1               |
 * |      	   8                    |      seleccionartipoPago(12)   |           0               |
 * |      	   9                    |      Ya estudiado              |           1               |
 * |      	   10				    |      Ya estudiado              |           0               | 
 * |      	   11	                |      Ya estudiado              |           1               |
 * |      	   12                   |      Ya estudiado              |           0               |
 *  ----------------------------------------------------------------------------------------------
 *  */






public class EJ3
{
	public static int pedirProducto(int identificador)
	{
		if ((identificador >= 1) && (identificador <= 50))
		{
			// Hacer el pedido
			return 1;
		} else
		{
			return 0;
		}
	}

	public static int seleccionarTipoPago(int codigo)
	{
		switch (codigo)
		{
		case 10:
		case 20:
		case 30:
		case 40:
			return 1;
		default:
			return 0;
		}
	}

}
