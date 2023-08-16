public class OrdenamientoBurbuja {
    public static void main(String[] args) {
        String[] productos = {"Kingston Pendrive 64GB", "Samsung Galaxy" ,
        "Disco Duro SSD Samsung Externo", "Asus Notebook",
        "Macbook Air", "Chromecast 4ta Generacion", "Matebook D16"};

        int total = productos.length;

        mostrarArreglo(productos, total);

        for (int i = 0 ; i < total; i++){
            for (int j = 0; j < total; j++){
                if (productos[i].compareTo(productos[j]) < 0){
                    String auxiliar = productos[i];
                    productos[i] = productos[j];
                    productos[j] = auxiliar;
                }
            }
        }

        System.out.println("-----------------------------");
        mostrarArreglo(productos, total);

    }

    public static void mostrarArreglo(String[] arr, int total){
        for (int i = 0; i < total; i++){
            System.out.println("Para indice " + i + " : "  + arr[i]);
        }
    }
}
