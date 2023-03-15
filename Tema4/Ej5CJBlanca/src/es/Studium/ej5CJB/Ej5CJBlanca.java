package es.Studium.ej5CJB;

public class Ej5CJBlanca
{

	public static String diasDeMes(String nombreMes)
	{

		String resultado = "";

		if (nombreMes == "Enero" | nombreMes == "Marzo" | nombreMes == "Julio" | nombreMes == "Agosto"
				| nombreMes == "Octubre" | nombreMes == "Diciembre")
		{

			resultado = nombreMes + " tiene: 31 dias";
			System.out.println(resultado);
			return resultado;

		} else if ((nombreMes == "Abril" | nombreMes == "Junio" | nombreMes == "Julio" | nombreMes == "Septiembre"
				| nombreMes == "Noviembre"))
		{

			resultado = nombreMes + " tiene: 30 dias";
			System.out.println(resultado);
			return resultado;

		} else if (nombreMes == "Febrero")
		{

			resultado = nombreMes + " tiene: 28 dias o 29 dias (en año bisiesto)";
			System.out.println(resultado);
			return resultado;
		} else
		{
			resultado = "No has especificado un mes válido";
			System.out.println(resultado);
			return resultado;

		}

	}

}
