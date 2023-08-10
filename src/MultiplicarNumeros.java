import java.util.Scanner;

public class MultiplicarNumeros {
    //multiplicar 2 numeros sin tener que usar el simbolo de mult
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1, n2, resultado = 0;

        System.out.println("Ingresa el primer numero : ");
        n1 = s.nextInt();
        System.out.println("Ingresa el segundo numero : ");
        n2 = s.nextInt();

        for(int i = 0; i < n1; i++){
            resultado += n2;
        }
        System.out.println("resultado = " + resultado);
    }
}
