package Obtenor;


public class InformacionVentas 
{
    protected int idInforVentas;
    protected int idMainVentas;
    protected int idProducto;
    protected int cantidad;
    protected String nombre_Venta;
    protected double precio_Unitario;
    protected double precio_Subtotal;
    protected double precio_IVA;
    protected double precio_TotalPagar;
    protected int estado_Venta;
    
    
    // Constructores
    
    public InformacionVentas()
    {
        this.idInforVentas = 0;
        this.idMainVentas = 0;
        this.idProducto = 0;
        this.cantidad = 0;
        this.nombre_Venta = "";
        this.precio_Unitario = 0;
        this.precio_Subtotal = 0;
        this.precio_IVA = 0;
        this.precio_TotalPagar = 0;
        this.estado_Venta = 0;
    }

    public InformacionVentas(int idInforVentas, int idMainVentas, int idProducto, int cantidad, 
            String nombre_Venta, double precio_Unitario, double precio_Subtotal, double precio_IVA, double precio_TotalPagar, int estado_Venta) 
    {
        this.idInforVentas = idInforVentas;
        this.idMainVentas = idMainVentas;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.nombre_Venta = nombre_Venta;
        this.precio_Unitario = precio_Unitario;
        this.precio_Subtotal = precio_Subtotal;
        this.precio_IVA = precio_IVA;
        this.precio_TotalPagar = precio_TotalPagar;
        this.estado_Venta = estado_Venta;
    }
    
    
    // Setters y Getters

    public int getIdInforVentas() {
        return idInforVentas;
    }

    public void setIdInforVentas(int idInforVentas) {
        this.idInforVentas = idInforVentas;
    }

    public int getIdMainVentas() {
        return idMainVentas;
    }

    public void setIdMainVentas(int idMainVentas) {
        this.idMainVentas = idMainVentas;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre_Venta() {
        return nombre_Venta;
    }

    public void setNombre_Venta(String nombre_Venta) {
        this.nombre_Venta = nombre_Venta;
    }

    public double getPrecio_Unitario() {
        return precio_Unitario;
    }

    public void setPrecio_Unitario(double precio_Unitario) {
        this.precio_Unitario = precio_Unitario;
    }

    public double getPrecio_Subtotal() {
        return precio_Subtotal;
    }

    public void setPrecio_Subtotal(double precio_Subtotal) {
        this.precio_Subtotal = precio_Subtotal;
    }

    public double getPrecio_IVA() {
        return precio_IVA;
    }

    public void setPrecio_IVA(double precio_IVA) {
        this.precio_IVA = precio_IVA;
    }

    public double getPrecio_TotalPagar() {
        return precio_TotalPagar;
    }

    public void setPrecio_TotalPagar(double precio_TotalPagar) {
        this.precio_TotalPagar = precio_TotalPagar;
    }

    public int getEstado_Venta() {
        return estado_Venta;
    }

    public void setEstado_Venta(int estado_Venta) {
        this.estado_Venta = estado_Venta;
    }
    
    
}
