import java.util.Scanner;

public class LoginConArreglos {
    public static void main(String[] args) {
        String[] usernames = new String[2];
        String[] passwords = new String[2];
        Scanner consola = new Scanner(System.in);
        boolean esAuntenticado = false;

        usernames[0] = "admin";
        passwords[0] = "12345";
        usernames[1] = "root";
        passwords[1] = "123";

        System.out.println("Usuario: ");
        String u = consola.next();
        System.out.println("Contraseña");
        String p = consola.next();

        for (int i = 0; i < usernames.length; i++){
            if (usernames[i].equals(u) && passwords[i].equals(p)){
                esAuntenticado = true;
                break;
            }
        }

        if (esAuntenticado){
            System.out.println("Bienvenido ".concat(u).concat(" !"));
        } else {
            System.out.println("Usuario o contraseña incorrecto ! ");
        }
    }
}
