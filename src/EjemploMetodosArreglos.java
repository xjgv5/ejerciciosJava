public class EjemploMetodosArreglos {
    public static void main(String[] args) {
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray()); //imprime el hashcode
        char[] arreglo = trabalenguas.toCharArray();
        int tamanio = arreglo.length;
        for (int i = 0; i < tamanio; i++){
            System.out.println("arreglo = " + arreglo[i]);
        }
    }
}
