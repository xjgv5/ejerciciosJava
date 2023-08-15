public class EjemploClaseMath {
    public static void main(String[] args) {
        int absoluto = Math.abs(-3);
        System.out.println("absoluto = " + absoluto);

        absoluto = Math.abs(3);
        System.out.println("absoluto = " + absoluto);

        int max = Math.max(4, 9);
        System.out.println("max = " + max);

        int min = Math.min(65, 70);
        System.out.println("min = " + min);

        double techo = Math.ceil(4.5);
        System.out.println("techo = " + techo);
        
        double piso = Math.floor(3.7);
        System.out.println("piso = " + piso);

        long redondeo = Math.round(Math.PI);
        System.out.println("redondeo = " + redondeo);

        double exp = Math.exp(2);
        System.out.println("exp = " + exp);

        double log = Math.log(10);
        System.out.println("log = " + log);

        double potencia = Math.pow(2, 3);
        System.out.println("potencia = " + potencia);

        double raiz = Math.sqrt(9);
        System.out.println("raiz = " + raiz);

        double grados = Math.round(Math.toDegrees(1.57));
        System.out.println("Convertir radianes a grados = " + grados);
    }
}
