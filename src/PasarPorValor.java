public class PasarPorValor {
    public static void main(String[] args) {
        int i = 10;
        System.out.println("iniciamos el main = " + i);
        test(i);
        System.out.println("Finaliza main con i = " + i);
        //pasa solamente el valor, no la referencia
    }

    public static void test(int i ){
        System.out.println("Iniciamos el metodo test con i  = "+ i);
         i = 35;
        System.out.println("Finaliza el valor de i  = " + i);
    }
}
