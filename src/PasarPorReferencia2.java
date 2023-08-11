class Persona{
    private String nombre;

    public void modificarNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    public String getNombre(){
        return this.nombre;
    }
}

public class PasarPorReferencia2 {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.modificarNombre("Andres");
        System.out.println("Iniciamos el metodo main");

        System.out.println("Antes de llamar al metodo test");
        System.out.println("persona.nombre = " + persona.getNombre());

        System.out.println("--------------------------");
        test(persona);

        System.out.println("---------------------------------");
        System.out.println("Despues de llamar al metodo test");
        System.out.println(persona.getNombre());
        System.out.println("Finaliza el metodo main ");
    }

    public static void test(Persona persona){
        System.out.println("Iniciamos el metodo test");
        persona.modificarNombre("José");
        System.out.println("Finalizamos el metodo test");
    }
}
