
package Pantallas;

import Conector.Conexion;
import Manejadores.Manejador_Usuario;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Obtenor.Usuario;


/**
 *
 * @author David
 */
public class PantallaInternaAdministrarUsuario extends javax.swing.JInternalFrame 
{
      private int idUser;
    
    public PantallaInternaAdministrarUsuario() 
    {
        initComponents();
        this.setTitle("Administrar usuarios");
        this.usuariosAdministracionDeTablas();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_usuarios = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btn_delete = new javax.swing.JButton();
        btn_refresh = new javax.swing.JButton();
        txt_username = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txt_usuariosNombre = new javax.swing.JTextField();
        txt_usuariosApellido = new javax.swing.JTextField();
        txt_usuariosPassword = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_usuariosTelefono = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Administracion de los usuarios");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tbl_usuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbl_usuarios);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_delete.setText("Eliminar");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_refresh.setText("Actualizar");
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });

        txt_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usernameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Funciones");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Apellido:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Nombre:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Username:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Contraseña;");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Telefono:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_usuariosApellido)
                            .addComponent(txt_usuariosNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
                        .addGap(158, 158, 158)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_usuariosTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
                    .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_usuariosPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(213, 213, 213))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 413, Short.MAX_VALUE)
                .addComponent(btn_refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(438, 438, 438)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jSeparator1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_delete)
                    .addComponent(btn_refresh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_usuariosNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(txt_usuariosTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_usuariosApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_usuariosPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(351, 351, 351)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        // ==================================
    
    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
       // Delete user
       Manejador_Usuario mcl = new Manejador_Usuario();
       Usuario cl = new Usuario();
       
       if(idUser == 0)
       {
           JOptionPane.showMessageDialog(null, "Haber de seleccionar un usuario");
       }
       else
       {
           if(mcl.delete(idUser))
           {
               JOptionPane.showMessageDialog(null, "Error al eliminar el usuario");
           }
           else
           {
               JOptionPane.showMessageDialog(null, "Se ha eliminado el usuario");
               this.usuariosAdministracionDeTablas();
               txt_usuariosNombre.setText("");
               txt_usuariosApellido.setText("");
               txt_username.setText("");
               txt_usuariosPassword.setText("");
               txt_usuariosTelefono.setText("");
               idUser = 0;
           }
       }
        
    }//GEN-LAST:event_btn_deleteActionPerformed

        // ==================================
    
    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
        // Delete client
        Manejador_Usuario mcl = new Manejador_Usuario();
        Usuario cl = new Usuario();
        if("".equals(txt_usuariosNombre.getText()))
       {
           JOptionPane.showMessageDialog(null, "Favor de ingresar un nombre");
       }
       else if("".equals(txt_usuariosApellido.getText()))
       {
           JOptionPane.showMessageDialog(null, "Favor de ingresar un apellido");
       }
       else if("".equals(txt_username.getText()))
       {
           JOptionPane.showMessageDialog(null, "Favor de ingresar un usuario");
       }
       else if("".equals(txt_usuariosPassword.getText()))
       {
           JOptionPane.showMessageDialog(null, "Favor de ingresar una contraseña");
       }
       else if("".equals(txt_usuariosTelefono.getText()))
       {
           JOptionPane.showMessageDialog(null, "Favor de ingresar un telefono");
       }
       else 
       {
           cl.setNombre_Usuario(txt_usuariosNombre.getText());
           cl.setApellido_Usuario(txt_usuariosApellido.getText());
           cl.setUsuario(txt_username.getText());
           cl.setPassword(txt_usuariosPassword.getText());
           cl.setContacto_usuario(txt_usuariosTelefono.getText());
           cl.setEstado(1);
           
           if(mcl.refresh(cl, idUser))
           {
               JOptionPane.showMessageDialog(null, "Se ha actulizado el usuario");
               this.usuariosAdministracionDeTablas();
               txt_usuariosNombre.setText("");
               txt_usuariosApellido.setText("");
               txt_username.setText("");
               txt_usuariosPassword.setText("");
               txt_usuariosTelefono.setText("");
               idUser = 0;
           }
           else
           {
               JOptionPane.showMessageDialog(null, "Error al actualizar");
           }
       }
        
        
    }//GEN-LAST:event_btn_refreshActionPerformed

        // ==================================
    
    private void txt_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usernameActionPerformed
        // ==================================
   
   
     // =================================
    // Reutilizando codigo anteriormente hecho
    private void usuariosAdministracionDeTablas()
    {
        //Connection con = Conexion.conectar();
        Conexion conexion = Conexion.obtenerInstancia();
        Connection con = conexion.obtenerConexion();
        // Este es la tabla
        DefaultTableModel mod = new DefaultTableModel();
        // Hacemos un request a la tabla donde seleccionamos todos los campos indicados
        
        String sql = "select * from usuarios_tablas";
        Statement st;
        
        try
        {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            // Teniendo el modelo lo insertamos como una nueva tabla de tbl_categorias
            PantallaInternaAdministrarUsuario.tbl_usuarios = new JTable(mod);
            PantallaInternaAdministrarUsuario.jScrollPane1.setViewportView(PantallaInternaAdministrarUsuario.tbl_usuarios);
            mod.addColumn("ID");
            mod.addColumn("Nombre del usuario");
            mod.addColumn("Apellido del usuario");
            mod.addColumn("Username");
            mod.addColumn("Contraseña");
            mod.addColumn("Telefono del usuario");
            mod.addColumn("Estado del usuario");
            
            
            while(rs.next())
            {
                // El objeto es del numerop de columnas
                Object fl[] = new Object[7];
                
                for(int i = 0;i<7;i++)
                {
                    fl[i] = rs.getObject(i + 1);
                }
                mod.addRow(fl);
            }
            //con.close();
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Error UADT1, LN 328" + e);
        }
        
        
        
        // =================================
        // Este apartado lo tuve que investigar ya que estamos haciendo una interfaz abstracta
        
       tbl_usuarios.addMouseListener(new MouseAdapter()
       {
        @Override
        public void mouseClicked(MouseEvent evento)
        {
            int flp = tbl_usuarios.rowAtPoint(evento.getPoint());
            int clp = 0;
            if(flp >= -1)
            {
                idUser = (int) mod.getValueAt(flp, clp);
                SNDU(idUser);
            }
        }
    });
  
    }
    
    // =================================
    
    private void SNDU(int idUser)
    {

        try
        {
            //Connection con = Conexion.conectar();
            Conexion conexion = Conexion.obtenerInstancia();
            Connection con = conexion.obtenerConexion();
            // Consulta a la base de datos a la tabla categorias_tabla, el apartado idProducto
            PreparedStatement ps = con.prepareStatement("select * from usuarios_tablas where idUser ='" + idUser + "'");
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                // Pasamos con la descripcion del txt del desing, donde tomamos el estring del result set para meterlo a la base de datos
                txt_usuariosNombre.setText(rs.getString("nombre_User"));
                txt_usuariosApellido.setText(rs.getString("apellido_User"));
                txt_username.setText(rs.getString("name_User"));
                txt_usuariosPassword.setText(rs.getString("password"));
                txt_usuariosTelefono.setText(rs.getString("contacto_User"));
                
            }
            //con.close();
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Error SNDU1, LN 396" + e);
        }
    }
    
    
    
    // =================================
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_refresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JTable tbl_usuarios;
    public static javax.swing.JTextField txt_username;
    public static javax.swing.JTextField txt_usuariosApellido;
    public static javax.swing.JTextField txt_usuariosNombre;
    public static javax.swing.JTextField txt_usuariosPassword;
    public static javax.swing.JTextField txt_usuariosTelefono;
    // End of variables declaration//GEN-END:variables

    

}
