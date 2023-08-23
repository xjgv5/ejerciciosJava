import java.sql.SQLOutput;
import java.util.Scanner;

public class ArregloNumerosAlternados {
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner consola = new Scanner(System.in);

        System.out.println("Programa que muestra los numeros alternados ! ");
        //llenando el arreglo :
        for (int i = 0; i < a.length; i++){
           // System.out.println("Ingresa un numero ");
            //a[i] = consola.nextInt();
            a[i] = i + 1;
        }

        System.out.println("------------------------");
        System.out.println("Arreglo original ");
        imprimirArreglo(a);
        System.out.println();
        System.out.println("------------------------");
        System.out.println("Arreglo modificado");
        int aux = a.length - 1;
        int i = 0;
        int contador = 0;
        do{
            if (contador % 2 != 0){
                System.out.println(a[i]);
                i++;
            } else if (contador %2 == 0){
                System.out.println(a[aux]);
                aux--;
            }

            contador++;

        }while (contador < a.length);

        // como en cada iteración del for se muestran dos números
        // solo necesitaremos recorrer la mitad de iteraciones, con eso es suficiente.
        /*System.out.println("El resultado es:");
        for (i = 0; i <= 4; i++) {
            System.out.println(arreglo[9 - i]); // y el i-ésimo por el final
            System.out.println(arreglo[i]); // mostramos el i-ésimo número por el principio
        }*/

    }

    public static void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++){
            System.out.println( i + " => " + arreglo[i]);
        }
    }
}
