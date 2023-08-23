import java.sql.SQLOutput;
import java.util.Scanner;

public class ArregloNumerosAlternados {
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner consola = new Scanner(System.in);

        //llenando el arreglo :
        for (int i = 0; i < a.length; i++){
            System.out.println("Ingresa un numero ");
            a[i] = consola.nextInt();
        }

        System.out.println("------------------------");
        System.out.println("Arreglo original ");
        imprimirArreglo(a);
        System.out.println();
        System.out.println("------------------------");
        System.out.println("Arreglo modificado");
        for (int i = 0; i<a.length; i++){
            
        }

    }

    public static void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++){
            System.out.println( i + " => " + arreglo[i]);
        }
    }
}
