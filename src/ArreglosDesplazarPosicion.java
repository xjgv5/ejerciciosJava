import java.util.Scanner;

public class ArreglosDesplazarPosicion {
    public static void main(String[] args) {

        int[] numeros = new int[5];
        int tamanio = numeros.length;
        int ultimo;
        Scanner consola = new Scanner(System.in);

        //llenando el arreglo :
        for (int i = 0; i < tamanio; i++){
            System.out.println("Ingresa el numero : ");
            numeros[i] = consola.nextInt();
        }

        System.out.println("------------------");
        System.out.println("Nuevo arreglo : ");
        ultimo = numeros[tamanio - 1];
        for (int i = tamanio - 2; i >= 0; i--) {
            numeros[i + 1] = numeros[i];
        }

        numeros[0] = ultimo;

        imprimirArreglo(numeros);

    }

    public static void imprimirArreglo(int[] arreglo){
        for (int i = 0; i<arreglo.length; i++){
            System.out.println(arreglo[i]);
        }
    }
}
