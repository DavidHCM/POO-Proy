
package model;


public class Categorias 
{
    // Variables de la categoria nueva de la base de datos
    protected int idCategoria;
    protected String descrip_Categoria;
    protected int estado_Categoria;
    
    // Constructor:
    
    public Categorias()
    {
        this.idCategoria = 0;
        this.descrip_Categoria = "";
        this.estado_Categoria = 0;
    }

    public Categorias(int idCategoria, String descrip_Categoria, int estado_Categoria) 
    {
        this.idCategoria = idCategoria;
        this.descrip_Categoria = descrip_Categoria;
        this.estado_Categoria = estado_Categoria;
    }
    
    // Setters y Getters de la categoria nueva

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getDescrip_Categoria() {
        return descrip_Categoria;
    }

    public void setDescrip_Categoria(String descrip_Categoria) {
        this.descrip_Categoria = descrip_Categoria;
    }

    public int getEstado_Categoria() {
        return estado_Categoria;
    }

    public void setEstado_Categoria(int estado_Categoria) {
        this.estado_Categoria = estado_Categoria;
    }
    
}
