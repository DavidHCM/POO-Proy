package controlado;
import conexion.Conexion;
import java.sql.*;
import model.Categorias;

// Clase donde añadimos una nueva categoria a la base de datos

public class Manejador_Categorias 
{
    
    // Save Descrip
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
    
    // Refresh
    public boolean refresh(Categorias object, int idCategoria)
    {
        boolean res = false;
        Connection con = Conexion.conectar();
         try
        {
             
             PreparedStatement cos = con.prepareStatement("update categorias_tabla set descrip_Categoria=? where idCategoria ='"+ idCategoria +"'");
             cos.setString(1,object.getDescrip_Categoria());
             
           
             if(cos.executeUpdate() > 0)
            {
                 res = true;
            }
             con.close();
        }
         catch(SQLException e)
        {
             System.out.println("Error R1, LN 37" + e);
        }
        
        return res;
    }
    
     // Delete
    public boolean delete(int idCategoria)
    {
        boolean res = false;
        Connection con = Conexion.conectar();
         try
        {
             // Aqui hacemoms un delete del query de la tabla especifica
             PreparedStatement cos = con.prepareStatement("delete from categorias_tabla where idCategoria ='"+ idCategoria +"'");
             cos.executeUpdate();
             if(cos.executeUpdate() > 0)
            {
                 res = true;
            }
             con.close();
        }
         catch(SQLException e)
        {
             System.out.println("Error D1, LN 65" + e);
        }
        
        return res;
    }
    
     // Rev Descrip
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

