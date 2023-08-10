import java.util.ArrayList;
import java.util.Scanner;

public class GestorDeNotasAlumnos {
    public static void main(String[] args) {
        //pedir 5 calificaciones de 5 alumnos
        //obtener el promedio
        //Mostrar el promedio de las notas mayores a 5, promedio de notas inferiores a 4 y
        // la cantidad de notas 1, ademas mostrar el promedio total.
        //si una de las notas ingresadas es 0 debe salirse del ciclo for y mostrar un mensaje de error finalizando el programa.

        ArrayList<Double> calificaciones = new ArrayList<Double>();
        ArrayList<Double> promedios = new ArrayList<Double>();
        double numero;
        double promedio;
        boolean ejecucionCorrecta = true;
        Scanner s = new Scanner(System.in);
        alumno:for(int i = 0; i< 3; i++){
            promedio = 0;
            calificaciones.clear();
            System.out.println();
            System.out.println("Alumno : " + i);
            calificacion:for (int j = 0; j < 3; j++){
                System.out.println("calificacion no." + j);
                numero = s.nextDouble();
                if (numero < 1){
                    System.out.println("Interrupcion de la ejecucion por captura = 0");
                    ejecucionCorrecta = false;
                    break alumno;
                }
                else {
                    calificaciones.add(numero);
                }

            }
            for (double n: calificaciones){
                promedio = promedio + n;
            }
            promedio /= 3;
            promedios.add(promedio);

        }

        if (ejecucionCorrecta){
            System.out.println("promedios = " + promedios);
        }

    }
}
