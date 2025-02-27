
package examen.pkg1;

import javax.swing.JOptionPane;

public class Ventas {
    private Vendedor vendedor;
    
    public Ventas(Vendedor vendedor){
        this.vendedor = vendedor;   
    }
    
    public void procesoVentas(){
        Double totalVentas = 0;
        Integer puntos =0;
        Boolean continuar = true;
        
        while (continuar) {
            try {
                Factura factura = ingresarFactura();
                totalVentas += factura.getMonto();
                puntos += calcularPuntos(factura);
                
                continuar = JOptionPane.showInputDialog("¿Quiere ingresar alguna otra factura? (Sí/No)").equalsIgnoreCase("Sí");
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "Error al introducir los datos. Por favor intente de nuevo.");
            }
        }
        // Calcular puntos extra 
        if (totalVentas > 300000) totalVentas +=20000;
        totalVentas *= 1.20;
        Double comision = totalVentas * 0.05;
        mostrarResultados (totalVentas, comision, puntos); 
    }
    private Factura ingresarFactura(){
        String nombreCliente = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");
        String cedulaCliente = JOptionPane.showInputDialog("Ingrese la cédula del cliente:");
        String codigoFactura = JOptionPane.showInputDialog("Ingrese el código de la factura:");
        Double monto = Double.valueOf(JOptionPane.showInputDialog("Ingrese el monto de la factura:"));
        Integer mes = Integer.valueOf(JOptionPane.showInputDialog("Ingrese el mes (1-12):"));
        Integer  productosElectrico = Integer.valueOf(JOptionPane.showInputDialog("Cantidad de productos eléctricos:"));
        Integer  productosAutomotris = Integer.valueOf(JOptionPane.showInputDialog("Cantidad de productos automotrices:"));
        Integer  productosConstruccion  = Integer.valueOf(JOptionPane.showInputDialog("Cantidad de productos de construcción:"));
        
        return new Factura(nombreCliente, cedulaCliente, codigoFactura, monto, mes, productosElectrico, productosAutomotris, productosConstruccion);
    }
    private int calcularPuntos(Factura factura) {
        int puntos = 0;
        if (factura.getProductoElectrico()>= 3) puntos += 1;
        if (factura.geteProductoAutomotris()> 4) puntos += 1;
        if (factura.getProductoContruccion()> 0) puntos += 2;
        if (factura.getMonto() > 50000) puntos += 1;
        return puntos;
    }
     private void mostrarResultados(Double totalVentas, Double comision, Integer puntos) {
        String mensaje = " Agente Vendedor " + vendedor.getNombre() + " código: " + vendedor.getCodigo() +
                         "\nTotal Ventas: " + totalVentas +
                         "\nTotal Comisiones: " + comision +
                         "\nPuntos obtenidos: " + puntos +
                         "\nSucursal: " + vendedor.getScucursal()+
                         "\nVehículo propio: " + (vendedor.tieneVeiculo()? "Sí" : "No");
        JOptionPane.showMessageDialog(null, mensaje);
     }
}
