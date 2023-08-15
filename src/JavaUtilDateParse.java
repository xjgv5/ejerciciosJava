import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class JavaUtilDateParse {
    public static void main(String[] args) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Scanner s = new Scanner(System.in);
        System.out.println("Ingresa una fecha con el formato : dd/MM/yyyy");
        try {
            Date fecha = formato.parse(s.next());
            //fecha = formato.parse("25/02/2023");
            System.out.println("fecha = " + fecha);
            System.out.println("formato = " + formato.format(fecha));

            Date fecha2 = new Date();
            System.out.println("fecha2 = " +  formato.format(fecha2));

         /*   if (fecha.after(fecha2)){
                System.out.println("Fecha del usuario es despues que fecha 2");
            } else {
                System.out.println("Fecha2 es despues de fecha 1");
            }*/

            if(fecha2.compareTo(fecha)>0 ){
                System.out.println("Fecha 2 es mayor que fecha 1");
            } else if (fecha2.compareTo(fecha) < 0) {
                System.out.println("Fecha 2 es menor que fecha 1");
            } else if (fecha2.compareTo(fecha) == 0 ) {
                System.out.println("Las fechas son iguales");
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
