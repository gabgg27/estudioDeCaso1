
package examen.pkg1;

import javax.swing.JOptionPane;

public class claseMain {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor(
            JOptionPane.showInputDialog("Ingrese el nombre del vendedor:"),
            JOptionPane.showInputDialog("Ingrese los apellidos del vendedor:"),
            JOptionPane.showInputDialog("Ingrese la cédula del vendedor:"),
            JOptionPane.showInputDialog("Ingrese el código del vendedor:"),
            JOptionPane.showInputDialog("Ingrese la sucursal del vendedor:"),
            JOptionPane.showInputDialog("¿Tiene vehículo propio? (Sí/No)").equalsIgnoreCase("Sí"),
            JOptionPane.showInputDialog("Ingrese el nombre de la empresa:")
        );
        Ventas sistema = new  Ventas(vendedor);
        sistema.getClass();
    }
                
}
