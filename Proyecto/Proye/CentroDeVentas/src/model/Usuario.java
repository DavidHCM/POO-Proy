package model;

/**
 *
 * @author David
 */

// Atributos correspondientes al usuario

public class Usuario 
{
    protected int idUsuario; // El id del usuario
    protected String nombre_Usuario; // El nombre del usuario
    protected String apellido_Usuario; // El apellido del usuario
    protected String usuario; // El username del usuario
    protected String password; // La contraseña del usuario
    protected String telefono; // El telefono de contacto del usuario
    protected int estado; // El estado actual del usuario
    // =========================================
    
    // Construct
    
    public Usuario()
    {
        this.idUsuario = 0;
        this.nombre_Usuario = "";
        this.apellido_Usuario = "";
        this.usuario = "";
        this.password = "";
        this.telefono = "";
        this.estado = 0;
    }
    
    // =========================================
    
    
    //Setters y Getters

    
    // =========================================
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre_Usuario() {
        return nombre_Usuario;
    }

    public void setNombre_Usuario(String nombre_Usuario) {
        this.nombre_Usuario = nombre_Usuario;
    }

    public String getApellido_Usuario() {
        return apellido_Usuario;
    }

    public void setApellido_Usuario(String apellido_Usuario) {
        this.apellido_Usuario = apellido_Usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getContacto_usuario() {
        return telefono;
    }

    public void setContacto_usuario(String contacto_usuario) {
        this.telefono = contacto_usuario;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    
    // =========================================
    
}
