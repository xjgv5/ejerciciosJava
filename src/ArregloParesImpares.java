import java.util.Scanner;

public class ArregloParesImpares {
    public static void main(String[] args) {
        int[] a, pares, impares;
        a = new int[10];
        int totalPares = 0;
        int totalImpares = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Ingresa 10 numeros : ");

        for (int i = 0; i <a.length; i++){
            a[i] = s.nextInt();
        }

        for (int i = 0; i< a.length; i++){
            if (a[i] % 2 == 0){
                totalPares += 1;
            } else {
                totalImpares += 1;
            }
        }

        pares = new int[totalPares];
        impares = new int[totalImpares];

        int j = 0;
        int k = 0;
        for (int i = 0; i < a.length; i++){
            if(a[i] % 2 == 0){
                pares[j++] = a[i];
            } else
                impares[k++] = a[i];
        }

        System.out.println("Numeros pares : ");
        for (int i = 0; i < pares.length; i++){
            System.out.print(pares[i] + " ");
        }
        System.out.println("\nNumeros impares");
        for (int i = 0; i < impares.length; i++){
            System.out.print(impares[i] + " ");
        }

    }
}
