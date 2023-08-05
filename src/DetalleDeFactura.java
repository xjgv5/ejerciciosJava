import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        double precio1;
        double precio2;
        double total1;
        Scanner consola = new Scanner(System.in);

        System.out.println("Ingresa el primer precio: ");
        precio1 = consola.nextDouble();
        System.out.println("Ingresa el segundo precio: ");
        precio2 = consola.nextDouble();
        total1 = precio1 + precio2;
        double total2 = (precio1 + precio2) + total1 * 0.19;
        System.out.println("El total original es: " + total1);
        System.out.println("El total con impuestos es : " + total2);
    }
}
