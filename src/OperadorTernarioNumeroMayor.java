import java.util.Scanner;

public class OperadorTernarioNumeroMayor {
    public static void main(String[] args) {
        int max;
        Scanner s = new Scanner(System.in);

        System.out.println("Ingresa un numero: ");
        int n1 = s.nextInt();
        System.out.println("Ingresa un segundo numero: ");
        int n2 = s.nextInt();
        System.out.println("Ingresa un tercer numero : ");
        int n3 = s.nextInt();

        max = (n1 > n2) ? n1 : n2;
        max = (max > n3) ? max : n3;

        System.out.println("max = " + max);
    }
}
