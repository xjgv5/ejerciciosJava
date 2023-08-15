import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CalcularEdadDate {
    public static void main(String[] args) {
        //calcula la edad segun la fecha de nacimiento
        Scanner s = new Scanner(System.in);
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaNacimiento = new Date();
        Date fechaActual = new Date();

        String[] anioNacimientoArr = new String[3];
        String[] anioActualArr = new String[3];
        String anioNacimientoStr, anioActualStr;
        int anioNacimientoInt = 0 , anioActualInt = 0;

        System.out.println("Programa que calcula tu edad segun tu año de nacimiento ");
        System.out.println("Ingresa tu fecha de nacimiento en el siguiente formato : dd/mm/yyyy");

        //verificacion de que no se ha ingresado una fecha en el futuro
        boolean fechaAnterior = false;

        try {
            fechaNacimiento = df.parse(s.next());
        } catch (ParseException e) {
            System.out.println("Error durante la captura de la edad");
            throw new RuntimeException(e);
        }

        //validando que el año sea menor que el actual
        if (fechaNacimiento.compareTo(fechaActual)> 0){
            System.out.println("Error al ingresar una fecha de nacimiento que no ha ocurrido !");
        } else if (fechaNacimiento.compareTo(fechaActual) == 0 ) {
            System.out.println("Tienes 0 años ! ");
        } else if (fechaNacimiento.compareTo(fechaActual) < 0 ) {
            fechaAnterior = true;
        }

        if (fechaAnterior){
            anioNacimientoStr = df.format(fechaNacimiento);
            anioActualStr = df.format(fechaActual);

            anioNacimientoArr = anioNacimientoStr.split("/");
            anioActualArr = anioActualStr.split("/");

            anioNacimientoInt = Integer.parseInt(anioNacimientoArr[2]);
            anioActualInt = Integer.parseInt(anioActualArr[2]);

            int edad = anioActualInt - anioNacimientoInt;

            System.out.println("Actualemente tienes " + edad + " años");
        }



    }
}
