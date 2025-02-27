
package examen.pkg1;


 public class Vendedor {
     // Clase vendedor 
    private String nombre;
    private String apellidos;
    private String cedula;
    private String codigo;
    private String sucursal;
    private Boolean tieneVeiculo;
    private String empresa;
    
    public Vendedor(String nombre,String apellidos,String cedula,String codigo, String sucursal, Boolean tieneVeiculo,String empresa){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.codigo = codigo;
        this.sucursal = sucursal;
        this.tieneVeiculo = tieneVeiculo;
        this.empresa =empresa;   
    }
    public String getNombre(){ return nombre;}
    public String getCodigo(){ return codigo;}
    public String getScucursal(){ return sucursal;}
    public Boolean tieneVeiculo(){ return tieneVeiculo;}
        
 }       
          

