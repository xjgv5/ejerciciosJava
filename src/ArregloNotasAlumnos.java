import java.util.Scanner;

public class ArregloNotasAlumnos {
    public static void main(String[] args) {
        double[] mate, historia, lenguaje;
        int sumaNotasMate = 0, sumNotasHist = 0 , sumaNotasLenguaje = 0;
        mate = new double[7];
        historia= new double[7];
        lenguaje= new double[7];

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese 7 notas de estudiantes para la clase de matematicas : ");
        for (int i = 0; i < mate.length; i++){
            mate[i] = s.nextDouble();
        }

        System.out.println("Ingrese 7 notas de estudiantes para la clase de historia : ");
        for (int i = 0; i < historia.length; i++){
            historia[i] = s.nextDouble();
        }

        System.out.println("Ingrese 7 notas de estudiantes para la clase de lenguaje : ");
        for (int i = 0; i < lenguaje.length; i++){
            lenguaje[i] = s.nextDouble();
        }

        for (int i = 0; i < 7; i++){
            sumaNotasMate += mate[i];
            sumNotasHist += historia[i];
            sumaNotasLenguaje += lenguaje[i];
        }

        double promedioMate = (sumaNotasMate / mate.length);
        double promedioHist = (sumNotasHist / historia.length);
        double promedioLeng = (sumaNotasLenguaje / lenguaje.length);

        System.out.println("Promedio de la clase de matematicas : " + promedioMate);
        System.out.println("Promedio de la clase de historia : " + promedioHist);
        System.out.println("Promedio de la clase de lenguaje : " + promedioLeng);
        System.out.println("Promedio total = " +
                (promedioMate + promedioHist + promedioLeng) / 3);

        System.out.println("Ingrese el identificador del alumno (0 - 6)");
        int id = s.nextInt();
        double promedioAlumno = (mate[id] + historia[id] + lenguaje[id]) / 3;
        System.out.println("El promedio del alumno No. " + id +" es de : " + promedioAlumno);


    }
}
