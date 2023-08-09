import java.util.Scanner;

public class NumeroMenor {
    public static void main(String[] args) {
        // ingresar 10 numeros
        int numero;
        int numMenor = 10000;
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 10 ; i ++){
            System.out.println("Ingresa un numero ");
            numero = s.nextInt();
            if (numero < numMenor){
                numMenor = numero;
            }

        }

        System.out.println("numMenor = " + numMenor);
        if (numMenor > 10){
            System.out.println("El numero menor es igual o mayor que 10");
        } else {

            System.out.println("El numero menor es menor que 10");
        }
    }
}
