public class EjemploPropiedadesSistema {
    public static void main(String[] args) {
        String username = System.getProperty("user.name");
        String home = System.getProperty("user.home");
        String java = System.getProperty("java.version");
        System.out.println("username = " + username);
        System.out.println("home = " + home);
        System.out.println("java = " + java);
    }
}
