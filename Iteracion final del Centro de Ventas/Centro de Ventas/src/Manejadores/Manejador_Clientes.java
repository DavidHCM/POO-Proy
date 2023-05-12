package Manejadores;

import Conector.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Obtenor.Clientes;



public class Manejador_Clientes implements Manejador_De_Funcionalidades
{
     // Guardar
    public boolean saveInfoDescrip(Clientes object)
    {
        boolean res = false;
        //Connection con = Conexion.conectar();
         Conexion conexion = Conexion.obtenerInstancia();
            Connection con = conexion.obtenerConexion();
         try
        {
             // Añadimos manuelmente la columna de la categoria autoincrementable
             PreparedStatement cos = con.prepareStatement("insert into cliente_tablas values(?,?,?,?,?,?,?)");
             cos.setInt(1,0); // El idProducto
             cos.setString(2, object.getNombre_Client()); // Nombre del cliente
             cos.setString(3, object.getApellido_Client()); // Apellido del cliente
             cos.setString(4, object.getName_ClientC()); // id del cliente en user
             cos.setString(5, object.getContacto_Client()); // telefono del cliente
             cos.setString(6, object.getDireccion_Client()); // direccion del cliente
             cos.setInt(7, object.getEstado_Client()); // Id del estado del cliente
             // Comprobacion de la consulta
             if(cos.executeUpdate() > 0)
            {
                 res = true;
            }
             //con.close();
        }
         catch(SQLException e)
        {
             System.out.println("Error GCL 1, LN 13" + e);
        }
        
        return res;
    }
    
    
    // Revisar la existencia previa
    @Override
    public boolean reviRepProd(String rev)
    {
        boolean res = false;
        // Query para revisar la existencia de este elemento previamente
        String sql = "select name_ClientC from cliente_tablas where name_ClientC = '" + rev +"'";
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
             System.out.println("Error RCL 1, LN 48" + e);
        }
        
        return res;
    }
    
    
    
    // Reutilizando codigo del producto
    // Refresh cli
    public boolean refresh(Clientes object, int idClient)
    {
        boolean res = false;
        //Connection con = Conexion.conectar();
         Conexion conexion = Conexion.obtenerInstancia();
            Connection con = conexion.obtenerConexion();
         try
        {
             
             PreparedStatement cos = con.prepareStatement("update cliente_tablas set nombre_Client=?,apellido_Client=?,name_ClientC=?,contacto_Client=?,direccion_Client=?,estado_Client=?  where idClient ='"+ idClient +"'");
             cos.setString(1,object.getNombre_Client());
             cos.setString(2,object.getApellido_Client());
             cos.setString(3,object.getName_ClientC());
             cos.setString(4,object.getContacto_Client());
             cos.setString(5,object.getDireccion_Client());
             cos.setInt(6,object.getEstado_Client());

             if(cos.executeUpdate() > 0)
            {
                 res = true;
            }
             //con.close();
        }
         catch(SQLException e)
        {
             System.out.println("Error RC1, LN 77" + e);
        }
        
        return res;
    }
    
     // Delete cli
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
             PreparedStatement cos = con.prepareStatement("delete from cliente_tablas where idClient ='"+ idGeneral +"'");
             cos.executeUpdate();
             if(cos.executeUpdate() > 0)
            {
                 res = true;
            }
             //con.close();
        }
         catch(SQLException e)
        {
             System.out.println("Error DC1, LN 110" + e);
        }
        
        return res;
    }
}
