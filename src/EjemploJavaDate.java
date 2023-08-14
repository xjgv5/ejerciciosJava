import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaDate {
    public static void main(String[] args) {
        Date fecha = new Date();

        System.out.println("fecha = " + fecha);

        SimpleDateFormat df = new SimpleDateFormat("EEEE dd MMMM yyyy 'a las' HH:mm" );
        String fechaStr = df.format(fecha);
        System.out.println(fechaStr);

    }
}
