package controlado;

import conexion.Conexion;
import model.Usuario;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author David
 */

// Clase para permitirnos hacer iniciar sesion en la base de datos manejando los datos del usuario

public class Manejador_Usuario 
{
    public boolean loginUser(Usuario object)
    {
        boolean res = false;
        Connection con = Conexion.conectar();
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
}
