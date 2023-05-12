package Manejadores;

import Conector.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Obtenor.Venta;
import Obtenor.InformacionVentas;

public class Manejador_Ventas 
{

    public static int idRegistrado;
    java.math.BigDecimal valDeID;
  
    public boolean saveInfoDescrip(Venta object) 
    {
        boolean respuesta = false;
        //Connection con = Conexion.conectar();
        Conexion conexion = Conexion.obtenerInstancia();
        Connection con = conexion.obtenerConexion();
        try 
        {
            PreparedStatement consulta = con.prepareStatement("insert into ventas_tablas values(?,?,?,?,?)",Statement.RETURN_GENERATED_KEYS); // Aqui traemos al AI
            consulta.setInt(1, 0);
            consulta.setInt(2, object.getIdClient());
            consulta.setDouble(3, object.getaPagar());
            consulta.setString(4, object.getDate_Venta());
            consulta.setInt(5, object.getEstado_Venta());
            
            if (consulta.executeUpdate() > 0) 
            {
                respuesta = true;
            }
            
            ResultSet rs = consulta.getGeneratedKeys();
            while(rs.next())
            {
                valDeID = rs.getBigDecimal(1);
                idRegistrado = valDeID.intValue();
            }
            
            //con.close();
        } 
        catch (SQLException e)
        {
            System.out.println("Error SID 1, LN 23" + e);
        }
        return respuesta;
    }
    
    
    public boolean guardarDetalle(InformacionVentas object) {
        boolean respuesta = false;
        //Connection con = Conexion.conectar();
        Conexion conexion = Conexion.obtenerInstancia();
        Connection con = conexion.obtenerConexion();
        try 
        {
            PreparedStatement cons = con.prepareStatement("insert into ventasInfor_tablas values(?,?,?,?,?,?,?,?,?,?)");
            cons.setInt(1, 0);
            cons.setInt(2, idRegistrado);
            cons.setInt(3, object.getIdProducto());
            cons.setInt(4, object.getCantidad());
            cons.setString(5, object.getNombre_Venta());
            cons.setDouble(6, object.getPrecio_Unitario());
            cons.setDouble(7, object.getPrecio_Subtotal());
            cons.setDouble(8, object.getPrecio_IVA());
            cons.setDouble(9, object.getPrecio_TotalPagar());
            cons.setInt(10, object.getEstado_Venta());
            
            if (cons.executeUpdate() > 0) 
            {
                respuesta = true;
            }
            //con.close();
        } 
        catch (SQLException e) 
        {
            System.out.println("Error SID 1, LN 53 " + e);
        }
        return respuesta;
    }
    
    
     
    public boolean refresh(Venta objeto, int idRegistrado) {
        boolean res = false;
        //Connection con = Conexion.conectar();
        Conexion conexion = Conexion.obtenerInstancia();
        Connection con = conexion.obtenerConexion();
        try {

            PreparedStatement consulta = con.prepareStatement("update ventas_tablas set idClient = ?, estado_Venta = ? "+ "where idRegistrado ='" + idRegistrado + "'");
            consulta.setInt(1, objeto.getIdClient());
            consulta.setInt(2, objeto.getEstado_Venta());
           
            if (consulta.executeUpdate() > 0) 
            {
                res = true;
            }
            //con.close();
        } 
        catch (SQLException e) 
        {
            System.out.println("Error SID 1, LN  85" + e);
        }
        return res;
    }

   
}
