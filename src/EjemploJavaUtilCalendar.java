import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {
        

        
        //------------------------
        Calendar calendario = Calendar.getInstance();

        //calendario.set(2020, Calendar.JANUARY, 25);
        calendario.set(Calendar.YEAR, 2020);
        calendario.set(Calendar.MONTH, Calendar.JULY);
        calendario.set(Calendar.DATE, 25);
        Date fecha = calendario.getTime();
        System.out.println("calendario = " + fecha);

    }
}
