import java.util.Random;

public class ClaseMathRandom {
    public static void main(String[] args) {

        String[] colores = {"azul", "verde", "rosa", "gris", "morado", "blanco", "amarillo", "rojo"};
        double random = Math.random();
        random *= colores.length;

        random = Math.floor(random);
        System.out.println("random = " + random);
        int indice = (int) random;

        System.out.println("color : " + colores[indice]);

        System.out.println(".............................");
        System.out.println("Uso de la clase random ...");

        Random randomObj = new Random();
        int randomInt = randomObj.nextInt(10, 20);
        System.out.println("randomInt = " + randomInt);
        System.out.println();
        System.out.println("Colores aleatorios");
        randomInt = randomObj.nextInt(colores.length);
        System.out.println("colores = " + colores[randomInt]);
    }
}
