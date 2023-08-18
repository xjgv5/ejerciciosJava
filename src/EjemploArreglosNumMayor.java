import java.util.Scanner;

public class EjemploArreglosNumMayor {
    public static void main(String[] args) {
        int[] arreglo = new int[5];
        Scanner s = new Scanner(System.in);

        System.out.println("Ingresa 5 enteros : ");
        for (int i = 0; i<arreglo.length; i++){
            arreglo[i] = s.nextInt();
        }

        int max = 0;
        for (int i = 1;  i < arreglo.length; i++){
            max = (arreglo[max] > arreglo[i]) ? max : i;
        }

        System.out.println("El numero mayor es : " + arreglo[max]);

    }
}
