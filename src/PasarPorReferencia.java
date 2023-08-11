public class PasarPorReferencia {
    public static void main(String[] args) {
        int[] edad = {10, 11, 12}; // los arreglos se pasan por referencia

        System.out.println("Iniciamos el metodo main");
        for (int e: edad){
            System.out.println("e = " + e);
        }

        System.out.println("Antes de llamar al metodo test");
        test(edad);
        System.out.println("Despues de llamar al metodo test");
        
        for(int e: edad){
            System.out.println("e = " + e);
        }

        System.out.println("Finaliza el metodo main ");
    }

    public static void test(int[] edadArr){
        System.out.println("Iniciamos el metodo test");
        for (int i = 0; i<edadArr.length; i ++){
            edadArr[i] += 20;
        }
        System.out.println("Finalizamos el metodo test");
    }
}
