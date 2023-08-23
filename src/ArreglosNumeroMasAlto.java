import java.util.Scanner;

public class ArreglosNumeroMasAlto {
    public static void main(String[] args) {
        int[] arreglo = new int[7];
        boolean capturaCorrecta = true;
        int numero = 0;
        Scanner consola = new Scanner(System.in);

        captura: for (int i = 0; i < arreglo.length; i++){
            System.out.println("Ingresa un numero entre 11 y 99");
            numero = consola.nextInt();
            if (numero < 11 || numero > 99){
                System.out.println("Captura interrumpida por numero fuera del limite !" );
                capturaCorrecta = false;
                break captura;
            } else arreglo[i] = numero;
        }
        int max = 0;
        if (capturaCorrecta){
            for (int i = 0; i <arreglo.length; i++){
                max = (max > arreglo[i]) ? max : arreglo[i];
            }

            System.out.println("El numero mayor del arreglo es : " + max);
        }

    }
}
