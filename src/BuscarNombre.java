import javax.swing.*;

public class BuscarNombre {
    public static void main(String[] args) {

        String[] nombres = {"Andres", "Pepe", "Maria", "Paco", "Lalo", "Bea", "Pato", "Pepa"};
        int count = nombres.length;
        for (int i = 0; i < count; i++){
            if(nombres[i].toLowerCase().contains("ANDRES".toLowerCase()) ||
                    nombres[i].toLowerCase().contains("PePa".toLowerCase())) {
                continue;
            }
            System.out.println(i + ".- " + nombres[i]);
        }
        
        String buscar = JOptionPane.showInputDialog("Ingresa un nombre : ");
        boolean encontrado = false;
        for (int i = 0; i < count; i++){
            if (nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }
        }
        if (encontrado){
            JOptionPane.showMessageDialog(null, buscar +" se encuentra en el registro");
        } else {
            JOptionPane.showMessageDialog(null, buscar + " no se encuentra en el registo ! ");
        }
    }
}
