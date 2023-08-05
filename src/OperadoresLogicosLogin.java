import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {
        String username = "admin";
        String password = "12345";
        Scanner consola = new Scanner(System.in);
        boolean esAutenticado = false;

        System.out.println("Usuario: ");
        String u = consola.nextLine();
        System.out.println("Contraseña: ");
        String p = consola.nextLine();

        if (u.equals(username) && p.equals(password)){
            esAutenticado = true;
        }

        if (esAutenticado){
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Usuario o contraseña incorrecto !");
        }
    }
}
