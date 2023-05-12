package Manejadores;

import Conector.Conexion;
import Obtenor.Usuario;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author David
 */

// Clase para permitirnos hacer iniciar sesion en la base de datos manejando los datos del usuario

public class Manejador_Usuario implements Manejador_De_Funcionalidades
{
    // login user
    public boolean loginUser(Usuario object)
    {
        boolean res = false;
        //Connection con = Conexion.conectar();
        Conexion conexion = Conexion.obtenerInstancia();
        Connection con = conexion.obtenerConexion();
        String sql = "select name_User, password from usuarios_tablas where name_User = '" + object.getUsuario() + "' and password = '" + object.getPassword() + "' ";
        Statement st;
        try
        {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next())
            {
                res = true;
            }
        }
        catch(SQLException e)
        {
            System.out.println("Error en el login 1" + e);
            JOptionPane.showMessageDialog(null,"Error en el login");
        }
        return res;
    }
    
    
    
     // Guardar user
    public boolean saveInfoDescrip(Usuario object)
    {
        boolean res = false;
        //Connection con = Conexion.conectar();
         Conexion conexion = Conexion.obtenerInstancia();
            Connection con = conexion.obtenerConexion();
         try
        {
             // Añadimos manuelmente la columna de la categoria autoincrementable
             PreparedStatement cos = con.prepareStatement("insert into usuarios_tablas values(?,?,?,?,?,?,?)");
             cos.setInt(1,0); // El idProducto
             cos.setString(2, object.getNombre_Usuario()); // Nombre del usuario
             cos.setString(3, object.getApellido_Usuario()); // Apellido del usuario
             cos.setString(4, object.getUsuario()); // id del usuario en user
             cos.setString(5, object.getPassword()); // telefono del usuario
             cos.setString(6, object.getContacto_usuario()); // direccion del usuario
             cos.setInt(7, object.getEstado()); // Id del estado del usuario
             // Comprobacion de la consulta
             if(cos.executeUpdate() > 0)
            {
                 res = true;
            }
            //con.close();
        }
         catch(SQLException e)
        {
             System.out.println("Error GUS 1, LN 47" + e);
        }
        
        return res;
    }
    
 
    // Revisar la existencia previa
    @Override
    public boolean reviRepProd(String rev)
    {
        boolean res = false;
        // Query para revisar la existencia de este elemento previamente
        String sql = "select name_User from usuarios_tablas where name_User = '" + rev +"'";
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
             System.out.println("Error RCU 1, LN 79" + e);
        }
        
        return res;
    }
    
    
    
    // Reutilizando codigo del clientes
    // Refresh cli
    public boolean refresh(Usuario object, int idUser)
    {
        boolean res = false;
        //Connection con = Conexion.conectar();
         Conexion conexion = Conexion.obtenerInstancia();
            Connection con = conexion.obtenerConexion();
         try
        {
             
             PreparedStatement cos = con.prepareStatement("update usuarios_tablas set nombre_User=?,apellido_User=?,name_User=?,password=?,contacto_User=?,estado_User=?  where idUser ='"+ idUser +"'");
             cos.setString(1,object.getNombre_Usuario());
             cos.setString(2,object.getApellido_Usuario());
             cos.setString(3,object.getUsuario());
             cos.setString(4,object.getPassword());
             cos.setString(5,object.getContacto_usuario());
             cos.setInt(6,object.getEstado());

             if(cos.executeUpdate() > 0)
            {
                 res = true;
            }
             //con.close();
        }
         catch(SQLException e)
        {
             System.out.println("Error RU1, LN 108" + e);
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
             PreparedStatement cos = con.prepareStatement("delete from usuarios_tablas where idUser ='"+ idGeneral +"'");
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
