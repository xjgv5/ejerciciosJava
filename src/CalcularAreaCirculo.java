import java.util.Scanner;

public class CalcularAreaCirculo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double radio, area;
        System.out.println("***** Programa que calcula el radio de un circulo *****");
        System.out.println("Ingresa el radios del circulo : ");
        radio = s.nextDouble();

        area = Math.PI * Math.pow(radio, 2);

        System.out.println("El area del circulo es : " + area);

    }
}
