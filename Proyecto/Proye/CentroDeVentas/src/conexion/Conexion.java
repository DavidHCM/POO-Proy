
package conexion;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

/**
 *
 * @author David
 * 
 */

// Aqui estableceremos la conexion con el MySQL
public class Conexion 
{
    // La conexion con mysql
    public static Connection conectar()
    {
        try
        {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/sis_ventas","root","123456");
            return con;
        }
        catch(SQLException e)
        {
            System.out.println("No se logro la conexion inicial" + e);
        }
        return null;
    }
    
}
