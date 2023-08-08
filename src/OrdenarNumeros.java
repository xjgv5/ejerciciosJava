import java.util.Scanner;

public class OrdenarNumeros {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        String resultado;
        Scanner s = new Scanner(System.in);

        System.out.println("Ingresa el primer numero ");
        numero1 = s.nextInt();
        System.out.println("Ingresa el segundo numero ");
        numero2 = s.nextInt();

        resultado = numero1 > numero2 ? "1.- " + numero1 + "\n2.- " + numero2 : "1.- " + numero2 + "\n2.- " + numero1;
        System.out.println(resultado);
    }
}
