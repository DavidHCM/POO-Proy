package controlado;
import conexion.Conexion;
import java.sql.*;
import model.Productos;


public class Manejador_Productos 
{
    // Guardar
    public boolean saveInfoDescrip(Productos object)
    {
        boolean res = false;
        Connection con = Conexion.conectar();
         try
        {
             // Añadimos manuelmente la columna de la categoria autoincrementable
             PreparedStatement cos = con.prepareStatement("insert into productos_tablas values(?,?,?,?,?,?,?,?)");
             cos.setInt(1,0); // El idProducto
             cos.setString(2, object.getNombre_Producto()); // Nombre del producto
             cos.setInt(3, object.getCantidad_Producto()); // Cantidad del producto
             cos.setDouble(4, object.getPrecio_Producto()); // Precio del producto
             cos.setString(5, object.getDescripcion_Producto()); // Descripcion del producto
             cos.setInt(6, object.getIVAporce_Producto()); // Ivaporc del producto
             cos.setInt(7, object.getIdCategoria()); // Id de categoria del producto
             cos.setInt(8,object.getEstado_Producto()); // El estado actual del producto
             // Comprobacion de la consulta
             if(cos.executeUpdate() > 0)
            {
                 res = true;
            }
             con.close();
        }
         catch(SQLException e)
        {
             System.out.println("Error GP 1" + e);
        }
        
        return res;
    }
    
    
    // Revisar la existencia previa
    public boolean reviRepProd(String rev)
    {
        boolean res = false;
        // Query para revisar la existencia de este elemento previamente
        String sql = "select nombre_Producto from productos_tablas where nombre_Producto = '" + rev +"'";
        Statement st;
        
         try
        {
             Connection con = Conexion.conectar();
             st = con.createStatement();
             ResultSet rs = st.executeQuery(sql);
             while(rs.next())
             {
                 res = true;
             }
        }
         catch(SQLException e)
        {
             System.out.println("Error RP 1" + e);
        }
        
        return res;
    }
}
