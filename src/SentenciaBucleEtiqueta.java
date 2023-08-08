public class SentenciaBucleEtiqueta {
    public static void main(String[] args) {

        bucle1:
        for (int i = 1; i <= 10; i++) {
            System.out.println();
            for (int j = 1; j <= 3; j++) {
                if (i % 2 == 0) {
                    continue bucle1;
                }
                System.out.print(" i = " + i + "  j = " + j + " | ");
            }
        }
    }
}
