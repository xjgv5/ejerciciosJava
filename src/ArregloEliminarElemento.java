import java.util.Scanner;

public class ArregloEliminarElemento {
    public static void main(String[] args) {
        int[] a = new int[10];
        int tamanio = a.length;
        Scanner consola = new Scanner(System.in);

        for (int i = 0;  i < tamanio; i++){
            System.out.println("Ingresa un numero : ");
            a[i] = consola.nextInt();
        }

        System.out.println();
        System.out.println("Ingrese una posicion a eliminar entre 0 - 9");
        int posicion = consola.nextInt();

        for (int i = posicion; i < tamanio - 1; i++){
            a[i] = a[i+1];
        }

        for (int i = 0;  i < tamanio; i++){
            System.out.println( i +" =>" + a[i]);
        }
        System.out.println("-----------------------------------");
        // ----------------------------------------------
        //copiando en arreglo
        int[] b = new int[a.length - 1];
        System.arraycopy(a, 0, b,0 , b.length - 3);
        System.out.println("Arreglo b : ");
        for (int i = 0; i < b.length; i++){
            System.out.println(i + " => " + b[i]);
        }

    }
}
