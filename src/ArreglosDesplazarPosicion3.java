import java.util.Scanner;

public class ArreglosDesplazarPosicion3 {
    public static void main(String[] args) {

        int[] numeros = new int[7];
        int numero, posicion;

        Scanner consola = new Scanner(System.in);

        for (int i = 0; i<numeros.length - 1; i++){
            System.out.println("Ingrese un numero");
            numeros[i] =consola.nextInt();
        }

        System.out.println();
        System.out.println("Ingrese un numero a insertar : ");
        numero = consola.nextInt();
        posicion = 0;

        while (posicion < 6 && numero > numeros[posicion]){
            posicion++;
        }

        for (int i = numeros.length - 2; i >= posicion; i--){
            numeros[i + 1] = numeros[i];
        }
        numeros[posicion] = numero;
        System.out.println("----------------------");
        System.out.println("Nuevo arreglo : ");
        imprimirArreglo(numeros);

    }

    public static void imprimirArreglo(int[] arreglo){
        for (int i = 0; i<arreglo.length; i++){
            System.out.println(arreglo[i]);
        }
    }
}
