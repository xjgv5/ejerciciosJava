import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaDate {
    public static void main(String[] args) {
        Date fecha = new Date();

        System.out.println("fecha = " + fecha);

        SimpleDateFormat df = new SimpleDateFormat("dd MMMM yyyy" );
        String fechaStr = df.format(fecha);
        String[] datos = fechaStr.split(" ");
        System.out.println(fechaStr);
        for (String dat : datos){
            System.out.println(dat);
        }
    }
}
