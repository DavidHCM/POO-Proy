package Manejadores;
import Conector.Conexion;
import java.sql.*;
import Obtenor.Productos;


public class Manejador_Productos implements Manejador_De_Funcionalidades
{
    // Guardar
    public boolean saveInfoDescrip(Productos object)
    {
        boolean res = false;
        //Connection con = Conexion.conectar();
         Conexion conexion = Conexion.obtenerInstancia();
            Connection con = conexion.obtenerConexion();
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
             //con.close();
        }
         catch(SQLException e)
        {
             System.out.println("Error GP 1" + e);
        }
        
        return res;
    }
    
    
    // Revisar la existencia previa
    @Override
    public boolean reviRepProd(String rev)
    {
        boolean res = false;
        // Query para revisar la existencia de este elemento previamente
        String sql = "select nombre_Producto from productos_tablas where nombre_Producto = '" + rev +"'";
        Statement st;
        
         try
        {
             //Connection con = Conexion.conectar();
             Conexion conexion = Conexion.obtenerInstancia();
            Connection con = conexion.obtenerConexion();
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
    
    
    
    
    
    
     // Refresh pro
    public boolean refresh(Productos object, int idProducto)
    {
        boolean res = false;
        //Connection con = Conexion.conectar();
         Conexion conexion = Conexion.obtenerInstancia();
            Connection con = conexion.obtenerConexion();
         try
        {
             
             PreparedStatement cos = con.prepareStatement("update productos_tablas set nombre_Producto=?,cantidad_Producto=?,precio_Producto=?,descripcion_Producto=?,IVAporce_Producto=?,idCategoria=?,estado_Producto=?  where idProducto ='"+ idProducto +"'");
             cos.setString(1,object.getNombre_Producto());
             cos.setInt(2,object.getCantidad_Producto());
             cos.setDouble(3,object.getPrecio_Producto());
             cos.setString(4,object.getDescripcion_Producto());
             cos.setInt(5,object.getIVAporce_Producto());
             cos.setInt(6,object.getIdCategoria());
             cos.setInt(7,object.getEstado_Producto());

             
           
             if(cos.executeUpdate() > 0)
            {
                 res = true;
            }
             //con.close();
        }
         catch(SQLException e)
        {
             System.out.println("Error RP1, LN 74" + e);
        }
        
        return res;
    }
    
     // Delete prod
    @Override
    public boolean delete(int idGeneral)
    {
        boolean res = false;
        //Connection con = Conexion.conectar();
         Conexion conexion = Conexion.obtenerInstancia();
            Connection con = conexion.obtenerConexion();
         try
        {
             // Aqui hacemoms un delete del query de la tabla especifica
             PreparedStatement cos = con.prepareStatement("delete from productos_tablas where idProducto ='"+ idGeneral +"'");
             cos.executeUpdate();
             if(cos.executeUpdate() > 0)
            {
                 res = true;
            }
             //con.close();
        }
         catch(SQLException e)
        {
             System.out.println("Error DP1, LN 107" + e);
        }
        
        return res;
    }
}
