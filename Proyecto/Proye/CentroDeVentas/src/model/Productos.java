package model;

/**
 *
 * @author David
 */
public class Productos 
{
    protected int idPrducto;
    protected String nombre_Producto;
    protected int cantidad_Producto;
    protected double precio_Producto;
    protected String descripcion_Producto;
    protected int IVAporce_Producto;
    protected int idCategoria;
    protected int estado_Producto;
    
    // Constructores
    public Productos()
    {
        this.idPrducto = 0;
        this.nombre_Producto = "";
        this.cantidad_Producto = 0;
        this.precio_Producto = 0;
        this.descripcion_Producto = "";
        this.IVAporce_Producto = 0;
        this.idCategoria = 0;
        this.estado_Producto = 0;
    }
    
    public Productos(int idPrducto, String nombre_Producto, int cantidad_Producto, double precio_Producto, String descripcion_Producto, int IVAporce_Producto, int idCategoria, int estado_Producto) {
        this.idPrducto = idPrducto;
        this.nombre_Producto = nombre_Producto;
        this.cantidad_Producto = cantidad_Producto;
        this.precio_Producto = precio_Producto;
        this.descripcion_Producto = descripcion_Producto;
        this.IVAporce_Producto = IVAporce_Producto;
        this.idCategoria = idCategoria;
        this.estado_Producto = estado_Producto;
    }
    
     // Setters y Getters

    public int getIdPrducto() {
        return idPrducto;
    }

    public void setIdPrducto(int idPrducto) {
        this.idPrducto = idPrducto;
    }

    public String getNombre_Producto() {
        return nombre_Producto;
    }

    public void setNombre_Producto(String nombre_Producto) {
        this.nombre_Producto = nombre_Producto;
    }

    public int getCantidad_Producto() {
        return cantidad_Producto;
    }

    public void setCantidad_Producto(int cantidad_Producto) {
        this.cantidad_Producto = cantidad_Producto;
    }

    public double getPrecio_Producto() {
        return precio_Producto;
    }

    public void setPrecio_Producto(double precio_Producto) {
        this.precio_Producto = precio_Producto;
    }

    public String getDescripcion_Producto() {
        return descripcion_Producto;
    }

    public void setDescripcion_Producto(String descripcion_Producto) {
        this.descripcion_Producto = descripcion_Producto;
    }

    public int getIVAporce_Producto() {
        return IVAporce_Producto;
    }

    public void setIVAporce_Producto(int IVAporce_Producto) {
        this.IVAporce_Producto = IVAporce_Producto;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getEstado_Producto() {
        return estado_Producto;
    }

    public void setEstado_Producto(int estado_Producto) {
        this.estado_Producto = estado_Producto;
    }
    
}
