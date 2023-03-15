package es.studium.ejercicios;

/*1º Clases de equivalencia:
 * Se Evalua para las entradas tanto para los:
 * 				-Valores Validos
 * 				-Valores no Validos
 * Se Evalua tambien para las salidas:
 * 				-Valores Validos
 * 				-Valores no Validos*/

/*Entradas ingresar:      VV: De 0.1f a Float.MAX.VALUE-getSaldo().
 * 			              VN: De 0.0f a Float.MIN_VALUE.
 * 						  VN: Float.MAX.VALUE-getSaldo() + 0.1f hasta Float MAX.VALUE
 * 			              Tres casos de prueba por cada clase de equivalencia tanto Valida como de no Valida.
 *Entradas retirar:       VV: De 0.1f a Float.MAX.VALUE-getSaldo().
 *						  VN: De 0.0f a Float.MIN_VALUE.
 * 						  VN: Float.MAX.VALUE-getSaldo() + 0.1f hasta Float MAX.VALUE
 *                        Tres casos de prueba por cada clase de equivalencia tanto Valida como de no Valida.
 *Entrada transferir:     VV: De 0.1f a Float.MAX.VALUE-getSaldo().
 * 			              VN: De 0.0f a Float.MIN_VALUE.
 * 						  VN: Float.MAX.VALUE-getSaldo() + 0.1f hasta Float MAX.VALUE           
 *                        Tres casos de prueba por cada clase de equivalencia tanto Valida como de no Valida.
 * */

/*Salida ingresar:        No se estudian en el metodo ingresar porque no devuelven nada, es tipo Void. 
 * 						  
 *Salida retirar:         No se estudian en el metodo retirar porque no devuelven nada, es tipo Void. 
 *
 *Salida transferir:      No se estudian en el metodo transferir porque no devuelven nada, es tipo Void. 
 * 			
 * 			              9 casos de prueba en total*/

/* 2º
 *  ----------------------------------------------------------------------------------------------
 * |Clases de Equivalencia       --------     Caso de Prueba   ----------     Resultado Esperado |
 * |----------------------------------------------------------------------------------------------
 * |           1					|	   Cuenta c =new Cuenta();
 * 										   c.ingresar(10.0f)                  10.0f
 * 										   c.getSaldo();                
 * |		   2					|	   Cuenta c =new Cuenta(); 			  
 * 										   c.ingresar(-10.0f)                 0.0f
 * 										   c.getSaldo();             			               
 * |		   3					|	   Cuenta c =new Cuenta();
 * 										   c.ingresar(Float.MAX_VALUE)        0.0f          
 * 										   c.getSaldo();              
 * |		   4					|	   Cuenta c =new Cuenta();
 * 										   c.ingresar(10.0f)
 * 										   c.retirar (5.0f)                   5.0f    
 * 										   c.getSaldo();           
 * |		   5					|	   Cuenta c =new Cuenta();
 *                                         c.ingresar(10.0f)
 * 										   c.retirar (-15.0f)                 10.0f
 * 										   c.getSaldo();         
 * |		   6					|	   Cuenta c =new Cuenta();
 *                                         c.ingresar(10.0f)
 * 										   c.retirar (Float.MAX_VALUE)        10.0f   
 * 										   c.getSaldo();             
 * |		   7                    |      Cuenta c1 =new Cuenta();
 * 										   Cuenta c2 =new Cuenta();
 *                                         c1.ingresar(10.0f)
 * 										   c1.transferir(c2,5.0f)             5.0f            
 * 										   c1.getSaldo();					  5.0f
 *                                         c2.getSaldo();             
 * |      	   8                    |      Cuenta c1 =new Cuenta();
 * 										   Cuenta c2 =new Cuenta();
 *                                         c1.ingresar(10.0f)
 * 										   c1.transferir(c2,-10.0f)           10.0f            
 * 										   c1.getSaldo();					   0.0f
 *                                         c2.getSaldo();        
 * |      	   9               		|	   Cuenta c1 =new Cuenta();
 * 										   Cuenta c2 =new Cuenta();
 *                                         c1.ingresar(10.0f)
 * 										   c1.transferir(c2,Float.MAX_VALUE)  10.0f            
 * 										   c1.getSaldo();					   0.0f
 *                                         c2.getSaldo(); 			  
 *  ----------------------------------------------------------------------------------------------
 *  */







	public class EJ4
	{
		private float saldo;

		public EJ4()
		{
			saldo = 0.0f;
		}

		public void ingresar(float cantidad)
		{
			saldo += cantidad;
		}

		public void retirar(float cantidad)
		{
			saldo -= cantidad;
		}

		public void transferir(EJ4 destino, float cantidad)
		{
			destino.ingresar(cantidad);
			retirar(cantidad);
		}

		public float getSaldo()
		{
			return saldo;
		}

	}

