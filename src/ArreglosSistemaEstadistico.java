import java.util.Scanner;

public class ArreglosSistemaEstadistico {
    public static void main(String[] args) {
        double[] arreglo = new double[7];
        int total0 = 0;
        double promedioPositivos = 0;
        double promedioNegativos = 0;
        Scanner consola = new Scanner(System.in);

        for (int i = 0; i< arreglo.length; i++){
            System.out.println("Ingresa un numero : ");
            arreglo[i] = consola.nextDouble();
        }
        int totalPositivos = 0;
        int totalNegativos = 0;
        for (int i = 0; i <arreglo.length; i++){
            if(arreglo[i] > 0 ){
                promedioPositivos += arreglo[i];
                totalPositivos++;
            } else if ( arreglo[i] < 0 ) {
                promedioNegativos += arreglo[i];
                totalNegativos++;
            } else {
                total0++;
            }
        }

        promedioPositivos /= totalPositivos;
        promedioNegativos /= totalNegativos;

        System.out.println("El promedio de los numeros positivos es : " + promedioPositivos);
        System.out.println("El promedio de los numeros negativos es : " + promedioNegativos);
        System.out.println("El total de numeros 0 es : " + total0);
    }
}
