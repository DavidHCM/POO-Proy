package Obtenor;


public class Venta 
{

    protected int idMainVentas;
    protected int idClient;
    protected double aPagar;
    protected String date_Venta;
    protected int estado_Venta;
    
    // Constructores
    
    public Venta()
    {
        this.idMainVentas = 0;
        this.idClient = 0;
        this.aPagar = 0;
        this.date_Venta = "";
        this.estado_Venta = 0;
    }

    public Venta(int idMainVentas, int idClient, double aPagar, String date_Venta, int estado_Venta) 
    {
        this.idMainVentas = idMainVentas;
        this.idClient = idClient;
        this.aPagar = aPagar;
        this.date_Venta = date_Venta;
        this.estado_Venta = estado_Venta;
    }
    
    // Setters y Getters

    public int getIdMainVentas() {
        return idMainVentas;
    }

    public void setIdMainVentas(int idMainVentas) {
        this.idMainVentas = idMainVentas;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public double getaPagar() {
        return aPagar;
    }

    public void setaPagar(double aPagar) {
        this.aPagar = aPagar;
    }

    public String getDate_Venta() {
        return date_Venta;
    }

    public void setDate_Venta(String date_Venta) {
        this.date_Venta = date_Venta;
    }

    public int getEstado_Venta() {
        return estado_Venta;
    }

    public void setEstado_Venta(int estado_Venta) {
        this.estado_Venta = estado_Venta;
    }
    
}
