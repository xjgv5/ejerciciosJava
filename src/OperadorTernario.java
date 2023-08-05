import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        double matematicas, espanol, informatica, promedio;
        Scanner consola = new Scanner(System.in);
        String estado;
        
        System.out.println("Ingresa la nota de matematicas");
        matematicas = consola.nextDouble();
        System.out.println("Ingresa la nota de español");
        espanol = consola.nextDouble();
        System.out.println("Ingresa la nota de informatica ");
        informatica = consola.nextDouble();
        
        promedio = (matematicas + espanol + informatica) / 3;
        estado = promedio > 5.0 ? "Aprobado" : "Reprobado";
        System.out.println("promedio = " + promedio);
        System.out.println("estado = " + estado);
        
    }
}
