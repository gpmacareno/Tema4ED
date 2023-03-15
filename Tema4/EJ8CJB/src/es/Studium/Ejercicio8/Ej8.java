package es.Studium.Ejercicio8;

public class Ej8
{

	public static int posicion(String letra, String cadena)
	{

		int posicion = 1;
		int resultado = 0;

		for (int i = 0; i < cadena.length(); i++)
		{

			if (cadena.substring(i, i + 1).equals(letra))
			{

				resultado = posicion;
			}

			posicion++;
		}
		return resultado;
	}

}
