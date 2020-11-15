import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CalcularEdad {

    private static int years;
    private static int months;
    private static int days;
    private static int datosPersonaAnio;
    private static int datosPersonaMes;
    private static int datosPersonaDia;

    public static void main(String[] args) {

        datosPersonas();
        System.out.print("tienes: ");
        System.out.println(calcular(new GregorianCalendar(datosPersonaAnio, datosPersonaMes, datosPersonaDia)));
        
    }

    public static int calcular(Calendar fechaNac) {
        Calendar fechaActual = Calendar.getInstance();

       
        years = fechaActual.get(Calendar.YEAR) - fechaNac.get(Calendar.YEAR);
        months = fechaActual.get(Calendar.MONTH) - fechaNac.get(Calendar.MONTH);
        days = fechaActual.get(Calendar.DAY_OF_MONTH) - fechaNac.get(Calendar.DAY_OF_MONTH);


        if (months < 0 
                || (months == 0 && days < 0)) {
            years--;
        }
        return years;
    }

    public static void datosPersonas() {

        System.out.println("Ingresa tu ano de nacimiento ");
        Scanner tecladoAnio = new Scanner(System.in);
        datosPersonaAnio = tecladoAnio.nextInt();

        System.out.println("Ingresa tu mes de nacimiento ");
        Scanner tecladoMes = new Scanner(System.in);
        datosPersonaMes = tecladoMes.nextInt();

        System.out.println("Ingresa tu dia de nacimiento ");
        Scanner tecladoDia = new Scanner(System.in);
        datosPersonaDia = tecladoDia.nextInt();
    }

}