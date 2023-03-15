package es.Studium.Ej7;

public class Ej7
{

	public static String trianguloFilas(int filas)
	{
		String resultado = "";
		for (int i = 1; i <= filas; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				resultado += i;

			}
			resultado += "\n";
		}
		return resultado;
	}

}
