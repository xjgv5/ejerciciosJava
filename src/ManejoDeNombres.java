import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManejoDeNombres {
    public static void main(String[] args) {
        String n1;
        List<String> nombres = new ArrayList<String>();
        // ----------------------------


        Scanner consola = new Scanner(System.in);
        for (int i = 1; i<=3; i++){
            System.out.println("Ingresa el nombre No. " + i);
            n1 = consola.nextLine();

            String new1 = String.valueOf(n1.charAt(1))
                    .toUpperCase()
                    .concat(".")
                    .concat(n1.substring(n1.length()-2));
            nombres.add(new1);
        }
        System.out.println(nombres);
    }
}
