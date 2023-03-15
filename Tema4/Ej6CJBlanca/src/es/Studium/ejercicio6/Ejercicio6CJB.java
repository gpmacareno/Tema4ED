package es.Studium.ejercicio6;

public class Ejercicio6CJB
{

	public static String tabladeMultiplicar(int numero)
	{

		String resultado = "";
		for (int i = 1; i <= 10; i++)
		{

			resultado += i + " x " + numero + " = " + i * numero + "\n";
		}

		return resultado;
	}

}
