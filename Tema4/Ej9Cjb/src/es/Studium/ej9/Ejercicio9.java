package es.Studium.ej9;

public class Ejercicio9
{

	public static String diasDeLaSemana(int day)
	{

		switch (day)
		{
		case 1:
			System.out.println("Hoy es lunes");
			return "Hoy es lunes";
		case 2:
			System.out.println("Hoy es martes");
			return "Hoy es martes";
		case 3:
			System.out.println("Hoy es miércoles");
			return "Hoy es miercoles";
		case 4:
			System.out.println("Hoy es jueves");
			return "Hoy es jueves";
		case 5:
			System.out.println("Hoy es viernes");
			return "Hoy es viernes";
		case 6:
			System.out.println("Hoy es sábado");
			return "Hoy es sábado";
		case 7:
			System.out.println("Hoy es domingo");
			return "Hoy es domingo";
		default:
			return "No es un día válido";

		}

	}

}
