import javax.swing.*;
import java.util.Scanner;

public class BuscadorLetras {
    public static void main(String[] args) {
        String texto1 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam ut ultrices leo. Pellentesque suscipit enim ante, at tincidunt risus posuere quis. Maecenas sed felis eu diam malesuada dapibus ac non ligula. Aliquam interdum accumsan neque, a suscipit purus commodo non. Cras condimentum imperdiet ex a malesuada. Vestibulum aliquam turpis ac quam dictum, eu condimentum felis convallis. Nulla pulvinar tempus lacus, ut lacinia nibh convallis eget. Ut sed arcu convallis, mattis nisi ac, sodales magna. Cras ac aliquet massa, ac condimentum mi. Fusce pellentesque magna turpis, eu sollicitudin sapien scelerisque vitae. Suspendisse ultricies eget diam id maximus. Donec lacinia turpis sit amet leo scelerisque scelerisque.";
        String texto = "aaaaaa jlkjl";
        Scanner s = new Scanner(System.in);
        int max = texto.length();
        char letra = 'a';
        int contador = 0;

        System.out.println("max = " + max);
        for (int i = 0; i < max; i++){
            if (texto.charAt(i) != letra){
                continue;
            }
            contador ++;             
        }
        System.out.println("contador = " + contador);
    }
}
