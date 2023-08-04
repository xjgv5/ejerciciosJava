public class ObtenerExtension {
    public static void main(String[] args) {
        String archivo = "claseddasdas.json";
        var dot = archivo.lastIndexOf('.')+1;
        System.out.println(dot);
        String extension = archivo.substring(dot);
        System.out.println(extension);
    }
}
