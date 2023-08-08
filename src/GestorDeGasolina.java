import java.util.Scanner;

public class GestorDeGasolina {
    public static void main(String[] args) {
        int capacidadActual;
        Scanner s = new Scanner(System.in);

        System.out.println("Ingresa la cantidad de gasolina actual del tanque");
        capacidadActual = s.nextInt();

        if (capacidadActual == 70) {
            System.out.println("Tanque lleno");
        } else if (capacidadActual <70 && capacidadActual >= 60) {
            System.out.println("Tanque casi lleno");
        } else if (capacidadActual <60 && capacidadActual >= 40 ) {
            System.out.println("Tanque a 3/4 de capacidad");
        } else if (capacidadActual < 40 && capacidadActual >= 35) {
            System.out.println("Tanque a mitad de capacidad");
        } else if (capacidadActual < 35 && capacidadActual >= 20) {
            System.out.println("Cantidad insuficiente ! " );
        } else if (capacidadActual < 20 && capacidadActual >= 1) {
            System.out.println("Tanque casi vacio !" );
        }
    }
}
