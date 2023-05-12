
package Pantallas;

import Conector.Conexion;
import Manejadores.Manejador_Clientes;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Obtenor.Clientes;


/**
 *
 * @author David
 */
public class PantallaInternaAdministrarClientes extends javax.swing.JInternalFrame 
{
      private int idClient;
    
    public PantallaInternaAdministrarClientes() 
    {
        initComponents();
        this.setTitle("Administrar clientes");
        this.clientesAdministracionDeTablas();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_clientes = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btn_delete = new javax.swing.JButton();
        btn_refresh = new javax.swing.JButton();
        db_client_id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txt_clientesNombre = new javax.swing.JTextField();
        txt_clientesApellido = new javax.swing.JTextField();
        txt_clientesTelefono = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_clientesDireccion = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Administracion de los clientes");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tbl_clientes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbl_clientes);

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

        db_client_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                db_client_idActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Funciones");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Apellido:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Nombre:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Expediente:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Telefono:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Direccion:");

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
                            .addComponent(txt_clientesApellido)
                            .addComponent(txt_clientesNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
                        .addGap(158, 158, 158)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_clientesDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
                    .addComponent(db_client_id, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_clientesTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(txt_clientesNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(txt_clientesDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_clientesApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(db_client_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_clientesTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
       Manejador_Clientes mcl = new Manejador_Clientes();
       Clientes cl = new Clientes();
       
       if(idClient == 0)
       {
           JOptionPane.showMessageDialog(null, "Haber de seleccionar un cliente");
       }
       else
       {
           if(mcl.delete(idClient))
           {
               JOptionPane.showMessageDialog(null, "Error al eliminar el cliente");
           }
           else
           {
               JOptionPane.showMessageDialog(null, "Se ha eliminado el cliente");
               this.clientesAdministracionDeTablas();
               txt_clientesNombre.setText("");
               txt_clientesApellido.setText("");
               db_client_id.setText("");
               txt_clientesTelefono.setText("");
               txt_clientesDireccion.setText("");
           }
       }
        
    }//GEN-LAST:event_btn_deleteActionPerformed

        // ==================================
    
    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
        // Delete client
        Manejador_Clientes mcl = new Manejador_Clientes();
        Clientes cl = new Clientes();
        if("".equals(txt_clientesNombre.getText()))
       {
           JOptionPane.showMessageDialog(null, "Favor de ingresar un nombre");
       }
       else if("".equals(txt_clientesApellido.getText()))
       {
           JOptionPane.showMessageDialog(null, "Favor de ingresar un apellido");
       }
       else if("".equals(db_client_id.getText()))
       {
           JOptionPane.showMessageDialog(null, "Favor de ingresar un id");
       }
       else if("".equals(txt_clientesTelefono.getText()))
       {
           JOptionPane.showMessageDialog(null, "Favor de ingresar un telefono");
       }
       else if("".equals(txt_clientesDireccion.getText()))
       {
           JOptionPane.showMessageDialog(null, "Favor de ingresar una direccion");
       }
       else 
       {
           cl.setNombre_Client(txt_clientesNombre.getText());
           cl.setApellido_Client(txt_clientesApellido.getText());
           cl.setName_ClientC(db_client_id.getText());
           cl.setContacto_Client(txt_clientesTelefono.getText());
           cl.setDireccion_Client(txt_clientesDireccion.getText());
           cl.setEstado_Client(1);
           
           if(mcl.refresh(cl, idClient))
           {
               JOptionPane.showMessageDialog(null, "Se ha actulizado el cliente");
               this.clientesAdministracionDeTablas();
               txt_clientesNombre.setText("");
               txt_clientesApellido.setText("");
               db_client_id.setText("");
               txt_clientesTelefono.setText("");
               txt_clientesDireccion.setText("");
           }
           else
           {
               JOptionPane.showMessageDialog(null, "Error al actualizar");
           }
       }
        
        
    }//GEN-LAST:event_btn_refreshActionPerformed

        // ==================================
    
    private void db_client_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_db_client_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_db_client_idActionPerformed
        // ==================================
   
   
     // =================================
    // Reutilizando codigo anteriormente hecho
    private void clientesAdministracionDeTablas()
    {
        //Connection con = Conexion.conectar();
        Conexion conexion = Conexion.obtenerInstancia();
        Connection con = conexion.obtenerConexion();
        // Este es la tabla
        DefaultTableModel mod = new DefaultTableModel();
        // Hacemos un request a la tabla donde seleccionamos todos los campos indicados
        
        String sql = "select * from cliente_tablas";
        Statement st;
        
        try
        {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            // Teniendo el modelo lo insertamos como una nueva tabla de tbl_categorias
            PantallaInternaAdministrarClientes.tbl_clientes = new JTable(mod);
            PantallaInternaAdministrarClientes.jScrollPane1.setViewportView(PantallaInternaAdministrarClientes.tbl_clientes);
            mod.addColumn("ID");
            mod.addColumn("Nombre del cliente");
            mod.addColumn("Apellido del cliente");
            mod.addColumn("Expediente del cliente");
            mod.addColumn("Contacto del cliente");
            mod.addColumn("Direccion del cliente");
            mod.addColumn("Estado del cliente");
            
            
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
            JOptionPane.showMessageDialog(null,"Error CADT1, LN 247" + e);
        }
        
        
        
        // =================================
        // Este apartado lo tuve que investigar ya que estamos haciendo una interfaz abstracta
        
       tbl_clientes.addMouseListener(new MouseAdapter()
       {
        @Override
        public void mouseClicked(MouseEvent evento)
        {
            int flp = tbl_clientes.rowAtPoint(evento.getPoint());
            int clp = 0;
            if(flp >= -1)
            {
                idClient = (int) mod.getValueAt(flp, clp);
                SNDC(idClient);
            }
        }
    });
  
    }
    
    // =================================
    
    private void SNDC(int idClient)
    {

        try
        {
            //Connection con = Conexion.conectar();
            Conexion conexion = Conexion.obtenerInstancia();
            Connection con = conexion.obtenerConexion();
            // Consulta a la base de datos a la tabla categorias_tabla, el apartado idProducto
            PreparedStatement ps = con.prepareStatement("select * from cliente_tablas where idClient ='" + idClient + "'");
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                // Pasamos con la descripcion del txt del desing, donde tomamos el estring del result set para meterlo a la base de datos
                txt_clientesNombre.setText(rs.getString("nombre_Client"));
                txt_clientesApellido.setText(rs.getString("apellido_Client"));
                db_client_id.setText(rs.getString("name_ClientC"));
                txt_clientesTelefono.setText(rs.getString("contacto_Client"));
                txt_clientesDireccion.setText(rs.getString("direccion_Client"));
                
            }
            //con.close();
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Error SNDC1, LN 316" + e);
        }
    }
    
    
    
    // =================================
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_refresh;
    public static javax.swing.JTextField db_client_id;
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
    public static javax.swing.JTable tbl_clientes;
    public static javax.swing.JTextField txt_clientesApellido;
    public static javax.swing.JTextField txt_clientesDireccion;
    public static javax.swing.JTextField txt_clientesNombre;
    public static javax.swing.JTextField txt_clientesTelefono;
    // End of variables declaration//GEN-END:variables

    

}
