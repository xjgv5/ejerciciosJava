import java.util.Scanner;

public class ArreglosDesplazarPosicion2 {
    public static void main(String[] args) {

        int[] numeros = new int[5];
        int tamanio = numeros.length;
        int elemento, posicion;
        Scanner consola = new Scanner(System.in);

        //llenando el arreglo :
        for (int i = 0; i < tamanio - 1; i++){
            System.out.println("Ingresa el numero : ");
            numeros[i] = consola.nextInt();
        }

        System.out.println("------------------");
        System.out.println("Nuevo elemento : ");
        elemento = consola.nextInt();
        System.out.println("Posicion ? (0 -9)");
        posicion = consola.nextInt();

        for (int i = tamanio - 2; i >= posicion; i--) {
            numeros[i + 1] = numeros[i];
        }

        numeros[posicion] = elemento;

        imprimirArreglo(numeros);

    }

    public static void imprimirArreglo(int[] arreglo){
        for (int i = 0; i<arreglo.length; i++){
            System.out.println(arreglo[i]);
        }
    }
}
