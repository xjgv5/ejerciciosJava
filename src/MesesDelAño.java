import java.util.Scanner;

public class MesesDelAño {
    public static void main(String[] args) {
        int mes;
        int dias = 0;
        int anio;
        Scanner s = new Scanner(System.in);

        System.out.println("Programa que te dice cuantos dias tuvo un mes segun el año !");
        System.out.println("Ingresa el año ");
        anio = s.nextInt();
        System.out.println("Ingresa el mes (en numero)");
        mes = s.nextInt();

        if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            dias = 31;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            dias = 30;
        } else if (mes == 2) {
            if (anio % 400 == 0 || (anio % 4 == 0) && !(anio % 100 == 0)){
                dias = 29;
            } else {
                dias = 28;
            }

        }

        System.out.println("El mes " + mes + " tiene " + dias + " dias");
    }
}
