package Obtenor;

/**
 *
 * @author David
 */
public class Clientes 
{
    protected int idClient;
    protected String nombre_Client;
    protected String apellido_Client;
    protected String name_ClientC;
    protected String contacto_Client;
    protected String direccion_Client;
    protected int estado_Client;
    
    
    // Constructores
    public Clientes()
    {
        this.idClient = 0;
        this.nombre_Client = "";
        this.apellido_Client = "";
        this.name_ClientC = "";
        this.contacto_Client = "";
        this.direccion_Client = "";
        this.estado_Client = 0;
    }

    public Clientes(int idClient, String nombre_Client, String apellido_Client, String name_ClientC, String contacto_Client, String direccion_Client, int estado_Client) {
        this.idClient = idClient;
        this.nombre_Client = nombre_Client;
        this.apellido_Client = apellido_Client;
        this.name_ClientC = name_ClientC;
        this.contacto_Client = contacto_Client;
        this.direccion_Client = direccion_Client;
        this.estado_Client = estado_Client;
    }
    
    // Setters y Getters

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getNombre_Client() {
        return nombre_Client;
    }

    public void setNombre_Client(String nombre_Client) {
        this.nombre_Client = nombre_Client;
    }

    public String getApellido_Client() {
        return apellido_Client;
    }

    public void setApellido_Client(String apellido_Client) {
        this.apellido_Client = apellido_Client;
    }

    public String getName_ClientC() {
        return name_ClientC;
    }

    public void setName_ClientC(String name_ClientC) {
        this.name_ClientC = name_ClientC;
    }

    public String getContacto_Client() {
        return contacto_Client;
    }

    public void setContacto_Client(String contacto_Client) {
        this.contacto_Client = contacto_Client;
    }

    public String getDireccion_Client() {
        return direccion_Client;
    }

    public void setDireccion_Client(String direccion_Client) {
        this.direccion_Client = direccion_Client;
    }

    public int getEstado_Client() {
        return estado_Client;
    }

    public void setEstado_Client(int estado_Client) {
        this.estado_Client = estado_Client;
    }
    
    
}
