package Conector;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class Conexion {
  
    private static Conexion instancia;

   
    private Connection con;

   
    private Conexion() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://sql9.freesqldatabase.com:3306/sql9616110","sql9616110","QD71XrzfSr");
        } catch (SQLException e) {
            System.out.println("No se logró la conexión inicial" + e);
        }
    }

    
    public static Conexion obtenerInstancia() {
        if (instancia == null) {
            instancia = new Conexion();
        }
        return instancia;
    }

   
    public Connection obtenerConexion() {
        return con;
    }

   
    @Override
    protected void finalize() throws Throwable {
        if (con != null && !con.isClosed()) {
            con.close();
        }
        super.finalize();
    }
}
