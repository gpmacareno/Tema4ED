package es.studium.tarea4;

public class Examen
{
	public static boolean validar(String dni)
	{
		if (dni.length() >= 9)
		{
			return true;
		} else
		{
			return false;
		}
	}
}
