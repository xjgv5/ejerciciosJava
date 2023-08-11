import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ControlEstudiantes {
    public static void main(String[] args) {
        int opcionIndice = 0;
        boolean salir = false;
        String producto;
        int indiceProducto;
        int produdctoEliminado;
        String productoActualizado;
        ArrayList<String> productos = new ArrayList<String>();
        productos.add("Limpiador");
        productos.add("Escoba");
        productos.add("Telefono");
        productos.add("Taza");
        productos.add("Reloj");


        Map<String, Integer> opciones = new HashMap();
        opciones.put("Actualizar", 1);
        opciones.put("Eliminar", 2);
        opciones.put("Agregar", 3);
        opciones.put("Listar", 4);
        opciones.put("Salir", 5);

        JOptionPane.showMessageDialog(null, "Programa de control de productos varios");
        Object[] opArreglo = opciones.keySet().toArray();
        do{
            Object opcion = JOptionPane.showInputDialog(null,
                    "Seleccione un Opción",
                    "Mantenedor de Productos",
                    JOptionPane.INFORMATION_MESSAGE, null, opArreglo, opArreglo[0]);

            if (opcion == null) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar una operación");
            } else {
                opcionIndice = opciones.get(opcion.toString());
                switch (opcionIndice){
                    case 1 ->{
                        //actualizar
                        JOptionPane.showMessageDialog(null, "Estos son los elementos actuales : \n" + productos);
                        indiceProducto = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero del elemento a actualizar  "));
                        productoActualizado = JOptionPane.showInputDialog("Ingresa el nuevo producto : ");
                        productos.set(indiceProducto, productoActualizado);
                        JOptionPane.showMessageDialog(null, "Se ha actualizado la lista de productos con éxito");
                    }
                    case 2 ->{
                        //eliminar
                        JOptionPane.showMessageDialog(null,"Estos son los productos actuales : \n " + productos );
                        produdctoEliminado = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero del elemento a eliminar"));
                        productos.remove(produdctoEliminado);
                        JOptionPane.showMessageDialog(null, "Producto eliminado con éxito ! ");
                    }
                    case 3 ->{
                        //agregar
                        producto = JOptionPane.showInputDialog("Ingresa el producto");
                        productos.add(producto);
                        JOptionPane.showMessageDialog(null, producto + " agregado con exito");
                    }
                    case 4 ->{
                        //listar
                        JOptionPane.showMessageDialog(null, productos);
                    }
                    case 5 ->{
                        JOptionPane.showMessageDialog(null, "Saliendo del programa");
                        salir = true;

                    }
                }

            }
        } while (!salir);


    }
}
