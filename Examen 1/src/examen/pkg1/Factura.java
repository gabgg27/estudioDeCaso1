
package examen.pkg1;

public class Factura {
    private String nombreCliente;
    private String cedulaCliente;
    private String codigoFactura;
    private Double monto;
    private Integer mes;
    private Integer productoElectrico;
    private Integer productoAutomotris;
    private Integer productoConstruccion;
    
     public Factura(String nombreCliente, String cedulaCliente, String codigoFactura, Double monto, Integer mes, Integer productosElectricos, Integer productosAutomotrices, Integer productosConstruccion) {
        this.nombreCliente = nombreCliente;
        this.cedulaCliente = cedulaCliente;
        this.codigoFactura = codigoFactura;
        this.monto = monto;
        this.mes = mes;
        this.productoElectrico = productosElectricos;
        this.productoAutomotris = productosAutomotrices;
        this.productoConstruccion = productosConstruccion;
     }
    public Double getMonto(){ return monto; }
    public Integer getProductoElectrico(){ return productoElectrico; }
    public Integer geteProductoAutomotris(){ return productoAutomotris;}          
    public Integer getProductoContruccion(){ return productoConstruccion;}
          
}
     
