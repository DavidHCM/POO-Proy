
package Pantallas;

import java.sql.*;
import Conector.Conexion;
import Manejadores.Manejador_Productos;
import java.util.HashSet;
import javax.swing.JOptionPane;
import Obtenor.Productos;


public class PantallaInternaNuevoProductos extends javax.swing.JInternalFrame {

    private int obIdCategoria = 0;
    
    public PantallaInternaNuevoProductos() 
    {
        initComponents();
        this.uploadCat();
        this.setTitle("Producto nuevos");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_cantidad = new javax.swing.JTextField();
        db_txt_precio = new javax.swing.JTextField();
        txt_descripcion = new javax.swing.JTextField();
        JCB_cat = new javax.swing.JComboBox<>();
        JCB_iva = new javax.swing.JComboBox<>();
        btn_save = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Nuevo producto");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Cantidad:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Precio:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Descripcion:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Categorias;");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Cantidad de IVA:");

        JCB_cat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Categorias:" }));

        JCB_iva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IVA:", "Sin IVA", "16%", " " }));
        JCB_iva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCB_ivaActionPerformed(evt);
            }
        });

        btn_save.setText("Guardar");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(txt_nombre)
                    .addComponent(txt_cantidad)
                    .addComponent(db_txt_precio)
                    .addComponent(txt_descripcion)
                    .addComponent(JCB_iva, javax.swing.GroupLayout.Alignment.TRAILING, 0, 200, Short.MAX_VALUE)
                    .addComponent(JCB_cat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(117, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(db_txt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(JCB_iva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(JCB_cat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(btn_save)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        // Boton de guardar
        Manejador_Productos mpd = new Manejador_Productos();
        Productos pd = new Productos();
        String IVA = "";
        String cat = "";
        IVA = (String) JCB_iva.getSelectedItem();
        cat = (String) JCB_cat.getSelectedItem();
        
        if(txt_nombre.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"No has introducido un nombre");
        }
        else if(txt_cantidad.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"No has introducido una cantidad");
        }
        else if(db_txt_precio.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"No has introducido un precio");
        }
        else if(txt_descripcion.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"No has introducido una descripcion");
        }
        else
        {
            if(mpd.reviRepProd(txt_nombre.getText()))
            {
                JOptionPane.showMessageDialog(null,"Ya existe este producto");
            }
            else
            {
                if(IVA.equalsIgnoreCase("IVA:"))
                {
                    JOptionPane.showMessageDialog(null,"Selecciona un IVA");
                }
                else
                {
                    if(cat.equalsIgnoreCase("Categorias:"))
                    {
                        JOptionPane.showMessageDialog(null,"Selecciona una categoria");
                    }
                    else
                    {
                        try
                        {
                            pd.setNombre_Producto(txt_nombre.getText());
                            pd.setCantidad_Producto(Integer.parseInt(txt_cantidad.getText()));
                            pd.setPrecio_Producto(Double.parseDouble(db_txt_precio.getText()));
                            pd.setDescripcion_Producto(txt_descripcion.getText());
                            
                            if(IVA.equalsIgnoreCase("Sin IVA"))
                            {
                                pd.setIVAporce_Producto(0);
                            }
                            else if (IVA.equalsIgnoreCase("16%"))
                            {
                                pd.setIVAporce_Producto(16);
                            }
                            this.idCategoria();
                            pd.setIdCategoria(obIdCategoria);
                            pd.setEstado_Producto(1);
                            
                            if(mpd.saveInfoDescrip(pd))
                            {
                                JOptionPane.showMessageDialog(null,"Producto guardado");
                                txt_nombre.setText("");
                                txt_cantidad.setText("");
                                db_txt_precio.setText("");
                                txt_descripcion.setText("");
                                this.JCB_iva.setSelectedItem("IVA:");
                                this.JCB_cat.setSelectedItem("Categorias:");
                            }
                        }
                        catch(Exception e)
                        {
                            System.out.println("Error BTNSV 1, LN 141");
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_btn_saveActionPerformed

    private void JCB_ivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCB_ivaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCB_ivaActionPerformed
    protected int idCategoria()
    {
        String sql = "select * from categorias_tabla where descrip_Categoria= '" + this.JCB_cat.getSelectedItem() +"'";
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
                obIdCategoria = rs.getInt("idCategoria");
            }
            //con.close();
        }
        catch(SQLException e)
        {
            System.out.println("Error IC 1, LN 214" + e);
        }
       return obIdCategoria;
    }

// Categorias a cargar de la base:
    protected void uploadCat()
    {
        //Connection con = Conexion.conectar();
        Conexion conexion = Conexion.obtenerInstancia();
        Connection con = conexion.obtenerConexion();
        Statement st;
        // Tomamos todas las categorias de la tabla
        String sql = "select * from categorias_tabla";
        
        try
        {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            // REMOVER ITEMS DE BOX
            JCB_cat.removeAllItems();
            JCB_cat.addItem("");
            while(rs.next())
            {
                JCB_cat.addItem(rs.getString("descrip_Categoria"));
            }
            
            //con.close();
        }
        catch(SQLException e)
        {
            System.out.println("Error UP PINP 1, LN 142" + e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JCB_cat;
    private javax.swing.JComboBox<String> JCB_iva;
    private javax.swing.JButton btn_save;
    private javax.swing.JTextField db_txt_precio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_descripcion;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
