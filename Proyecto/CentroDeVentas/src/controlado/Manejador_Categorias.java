package controlado;
import conexion.Conexion;
import java.sql.*;
import model.Categorias;

// Clase donde añadimos una nueva categoria a la base de datos

public class Manejador_Categorias 
{
    public boolean saveInfoDescrip(Categorias object)
    {
        boolean res = false;
        Connection con = Conexion.conectar();
         try
        {
             // Añadimos manuelmente la columna de la categoria autoincrementable
             PreparedStatement cos = con.prepareStatement("insert into categorias_tabla values(?,?,?)");
             cos.setInt(1,0);
             cos.setString(2, object.getDescrip_Categoria());
             cos.setInt(3,object.getEstado_Categoria());
             // Comprobacion de la consulta
             if(cos.executeUpdate() > 0)
            {
                 res = true;
            }
             con.close();
        }
         catch(SQLException e)
        {
             System.out.println("Error GC 1" + e);
        }
        
        return res;
    }
    
    public boolean reviRep(String rev)
    {
        boolean res = false;
        // Query para revisar la existencia de este elemento previamente
        String sql = "select Descrip_Categoria from categorias_tabla where Descrip_Categoria = '" + rev +"'";
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
             System.out.println("Error CC 1" + e);
        }
        
        return res;
    }
}

