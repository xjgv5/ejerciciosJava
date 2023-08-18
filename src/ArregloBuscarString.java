import java.util.Scanner;

public class ArregloBuscarString {
    public static void main(String[] args) {

        String[] arr = new String[5];
        Scanner s = new Scanner(System.in);

        for (int i = 0; i< arr.length; i++){
            System.out.println("Ingresa un nombre : ");
            arr[i] = s.next();
        }

        System.out.println("Ingresa un nombre a buscar : ");
        String nombre = s.next();
        int i = 0 ;
        for (; i < arr.length && !arr[i].equalsIgnoreCase(nombre); i++){}

        if(i == arr.length){
            System.out.println("Nombre no encontrado");
        } else if (arr[i].toLowerCase().compareTo(nombre.toLowerCase()) == 0) {
            System.out.println("Encontrado en la posicion : " + i);
        }
    }
}
