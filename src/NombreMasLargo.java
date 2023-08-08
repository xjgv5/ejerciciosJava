import java.util.Scanner;

public class NombreMasLargo {
    public static void main(String[] args) {
        String n1, n2, n3;
        Scanner s = new Scanner(System.in);

        System.out.println("Ingresa el primer nombre completo : ");
        n1 = s.nextLine();
        String[] nombre1Div = n1.split(" ");
        String nombre1 = nombre1Div[0];
        String apellido1 = nombre1Div[1];
        int cantidad1 = nombre1.length() + apellido1.length();

        System.out.println("Ingresa el segundo nombre completo : ");
        n2 = s.nextLine();
        String[] nombre2Div = n2.split(" ");
        String nombre2 = nombre2Div[0];
        String apellido2 = nombre2Div[1];
        int cantidad2 = nombre2.length() + apellido2.length();


        System.out.println("Ingresa el tercer nombre completo : ");
        n3 = s.nextLine();
        String[] nombre3Div = n3.split(" ");
        String nombre3 = nombre3Div[0];
        String apellido3 = nombre3Div[1];
        int cantidad3 = nombre3.length() + apellido3.length();

        int idNombreMasLargo = cantidad1 > cantidad2 ? cantidad1 : cantidad2;
        idNombreMasLargo = idNombreMasLargo > cantidad3 ? idNombreMasLargo : cantidad3;

        if (idNombreMasLargo == cantidad1){
            System.out.println("El nombre : " + n1 + " es el que tiene mayor cantidad de letras");
        } else if (idNombreMasLargo == cantidad2) {
            System.out.println("El nombre : " + n2 + " es el que tiene mayor cantidad de letras");
        } else {
            System.out.println("El nombre : " + n3 + " es el que tiene mayor cantidad de letras");
        }
    }
}
