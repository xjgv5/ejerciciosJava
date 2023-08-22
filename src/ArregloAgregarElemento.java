import java.util.Scanner;

public class ArregloAgregarElemento {
    public static void main(String[] args) {
        int[] a = new int[10];
        int elemento, posicion, ultimo;
        Scanner consola = new Scanner(System.in);

        for (int i = 0; i <a.length; i ++){
            System.out.println("Ingresa un numero");
            a[i] = consola.nextInt();
        }

        System.out.println();
        System.out.println("Ingresa el nuevo elemento ");
        elemento = consola.nextInt();

        System.out.println("Ingresa la posicion donde deseas agregarlo : (0 - 9)");
        posicion = consola.nextInt();

        ultimo = a[a.length-1];
        for (int i = a.length-2; i >= posicion; i--){
            a[i + 1] = a[i];
        }
        int[] b = new int[a.length + 1];
        System.arraycopy(a, 0, b, 0, a.length);
        b[b.length - 1] = ultimo;
        a[posicion] = elemento;
        System.out.println("Nuevo arreglo : ");
        imprimirArreglo(a);
    }

    public static void imprimirArreglo(int[] arreglo){
        for (int i = 0; i <arreglo.length; i++){
            System.out.println( i + " => " + arreglo[i]);
        }
    }
}
