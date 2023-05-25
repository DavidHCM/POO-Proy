
package Pantallas;

import Conector.Conexion;
import Manejadores.Manejador_Categorias;
import Manejadores.Manejador_Productos;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Obtenor.Categorias;
import Obtenor.Productos;

/**
 *
 * @author David
 */
public class PantallaInternaAdministrarProductos extends javax.swing.JInternalFrame 
{
    private int idProducto;
    protected int ObIdCategoria;
    private int obIdCategoria2 = 0;
    String desc_Cat = "";
    double price = 0.0;
    int pIVA = 0;
    double Iva = 0;
    
    
    public PantallaInternaAdministrarProductos() 
    {
        initComponents();
        this.setTitle("Administrar productos");
        this.productosAdministracionDeTablas();
        this.loadCats();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_categorias = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btn_delete = new javax.swing.JButton();
        btn_refresh = new javax.swing.JButton();
        txt_productoPrecio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txt_productosNombre = new javax.swing.JTextField();
        txt_productosCantidad = new javax.swing.JTextField();
        txt_productoDescripcion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        JCB_iva = new javax.swing.JComboBox<>();
        JCB_cat = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Administracion de los productos");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tbl_categorias.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbl_categorias);

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

        txt_productoPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_productoPrecioActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Funciones");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Cantidad:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Nombre:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Precio:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Descripcion:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("IVA:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Categoria:");

        JCB_iva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IVA:", "Sin IVA", "16%" }));

        JCB_cat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Categorias:", "Item 2", "Item 3", "Item 4" }));

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
                    .addComponent(txt_productoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_productoDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_productosCantidad)
                            .addComponent(txt_productosNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JCB_iva, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JCB_cat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addComponent(txt_productosNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(JCB_iva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_productosCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9)
                    .addComponent(JCB_cat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_productoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_productoDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(jLabel1)
                        .addGap(0, 446, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        Manejador_Productos mcp = new Manejador_Productos();
        Productos cp = new Productos();
        if(idProducto == 0)
        {
            JOptionPane.showMessageDialog(null,"Porfavor de estar en un producto");
        }
        else
        {
            if(!mcp.delete(idProducto))
            {
                JOptionPane.showMessageDialog(null,"Se ha eliminado un producto");
                this.productosAdministracionDeTablas();
                this.loadCats();
                txt_productosNombre.setText("");
                txt_productosCantidad.setText("");
                txt_productoPrecio.setText("");
                txt_productoDescripcion.setText("");
                JCB_iva.setSelectedItem("IVA:");
                JCB_cat.setSelectedItem("Categorias:");        
                
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Error de eliminacion");
            }
        }
        
        
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
        // Reutilizando codigo anteriormente usado
        Manejador_Productos mpd = new Manejador_Productos();
        Productos pd = new Productos();
        String IVA = "";
        String cat = "";
        IVA = (String) JCB_iva.getSelectedItem();
        cat = (String) JCB_cat.getSelectedItem();
        
        if(txt_productosNombre.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"No has introducido un nombre");
        }
        else if(txt_productosCantidad.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"No has introducido una cantidad");
        }
        else if(txt_productoPrecio.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"No has introducido un precio");
        }
        else if(txt_productoDescripcion.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"No has introducido una descripcion");
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
                            pd.setNombre_Producto(txt_productosNombre.getText());
                            pd.setCantidad_Producto(Integer.parseInt(txt_productosCantidad.getText()));
                            pd.setPrecio_Producto(Double.parseDouble(txt_productoPrecio.getText()));
                            pd.setDescripcion_Producto(txt_productoDescripcion.getText());
                            
                            if(IVA.equalsIgnoreCase("Sin IVA"))
                            {
                                pd.setIVAporce_Producto(0);
                            }
                            else if (IVA.equalsIgnoreCase("16%"))
                            {
                                pd.setIVAporce_Producto(16);
                            }
                            this.idCategoria();
                            pd.setIdCategoria(obIdCategoria2);
                            pd.setEstado_Producto(1);
                            
                            if(mpd.refresh(pd,idProducto))
                            {
                                JOptionPane.showMessageDialog(null,"Producto guardado");
                                txt_productosNombre.setText("");
                                txt_productosCantidad.setText("");
                                txt_productoPrecio.setText("");
                                txt_productoDescripcion.setText("");
                                this.JCB_iva.setSelectedItem("IVA:");
                                this.JCB_cat.setSelectedItem("Categorias:");
                                this.productosAdministracionDeTablas();
                                this.loadCats();
                            }
                        }
                        catch(Exception e)
                        {
                            System.out.println("Error BTNSV 1, LN 141");
                        }
                    }
                }
            
        }
        
       
       
       
    }//GEN-LAST:event_btn_refreshActionPerformed

    private void txt_productoPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_productoPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_productoPrecioActionPerformed

    // =================================
    // Codigo reutilizado
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
                obIdCategoria2 = rs.getInt("idCategoria");
            }
            //con.close();
        }
        catch(SQLException e)
        {
            System.out.println("Error IC 1, LN 214" + e);
        }
       return obIdCategoria2;
    }
    
    // =================================
    
    private void loadCats()
    {
        //Connection con = Conexion.conectar();
        Conexion conexion = Conexion.obtenerInstancia();
        Connection con = conexion.obtenerConexion();
        String sql = "select * from categorias_tabla";
        Statement st;
        try
        {
            st = con.createStatement();
            ResultSet rs =st.executeQuery(sql);
            JCB_cat.removeAllItems();
            JCB_cat.addItem("Categorias:");
            
            while(rs.next())
            {
                // De la tabla de base de datos de categorias nos traemos las descripciones
                JCB_cat.addItem(rs.getString("descrip_Categoria"));
            }
            //con.close();
        }
        catch(SQLException e)
        {
            System.out.println("Error LC 1, LN 290");
        }

    }
    
    // =================================
    private double calcI(double price, int pIVA)
    {
        int temp_I = pIVA;
       
        if(temp_I == 0)
        {
            Iva = 0;
        }
        else if(temp_I == 16)
        {
            Iva = price * 0.16;
        }
        
        Iva = (double) Math.round(Iva * 100) / 100;
        return Iva;
    }
    
     // =================================
    
    private String CR(int cdit)
    {
        //Connection con = Conexion.conectar();
        Conexion conexion = Conexion.obtenerInstancia();
        Connection con = conexion.obtenerConexion();
        String sql = "select descrip_Categoria from categorias_tabla where idCategoria= '" + cdit + "'";
        Statement st;
        try
        {
            st = con.createStatement();
            ResultSet rs =st.executeQuery(sql);

            while(rs.next())
            {
                desc_Cat = rs.getString("descrip_Categoria");
            }
            //con.close();
        }
        catch(SQLException e)
        {
            System.out.println("Error CR 1, LN 345");
        }
        return desc_Cat;
    }
    
     // =================================
    
    private void productosAdministracionDeTablas()
    {
        //Connection con = Conexion.conectar();
        Conexion conexion = Conexion.obtenerInstancia();
        Connection con = conexion.obtenerConexion();
        // Este es la tabla
        DefaultTableModel mod = new DefaultTableModel();
        // Hacemos un request a la tabla donde seleccionamos todos los campos indicados
        
        String sql = "select p.idProducto, p.nombre_Producto, p.cantidad_Producto, p.precio_Producto, p.descripcion_Producto, p.IVAporce_Producto, c.descrip_Categoria, p.estado_Producto from productos_tablas As p, categorias_tabla As c where p.idCategoria = c.idCategoria;";
        Statement st;
        
        try
        {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            // Teniendo el modelo lo insertamos como una nueva tabla de tbl_categorias
            PantallaInternaAdministrarProductos.tbl_categorias = new JTable(mod);
            PantallaInternaAdministrarProductos.jScrollPane1.setViewportView(PantallaInternaAdministrarProductos.tbl_categorias);
            mod.addColumn("ID");
            mod.addColumn("Nombre del producto");
            mod.addColumn("Cantidad del producto");
            mod.addColumn("Precio del producto");
            mod.addColumn("Descripcion del producto");
            mod.addColumn("Porcentaje de iva");
            mod.addColumn("Categoria");
            mod.addColumn("Estado del producto");
            
            
            while(rs.next())
            {
                price = rs.getDouble("precio_Producto");
                pIVA = rs.getInt("IVAporce_Producto");
                
                // El objeto es del numerop de columnas
                Object fl[] = new Object[8];
                
                for(int i = 0;i<8;i++)
                {
                    if(i == 5)
                    {
                        this.calcI(price, pIVA);
                        fl[i] = Iva;
                        rs.getObject(i+1);
                    }
                    else
                    {
                        fl[i] = rs.getObject(i + 1);
                    }
                    
                }
                mod.addRow(fl);
            }
            //con.close();
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Error PADT1, LN 182" + e);
        }
        
        
        
        // =================================
        // Este apartado lo tuve que investigar ya que estamos haciendo una interfaz abstracta
        
       tbl_categorias.addMouseListener(new MouseAdapter()
       {
        @Override
        public void mouseClicked(MouseEvent evento)
        {
            int flp = tbl_categorias.rowAtPoint(evento.getPoint());
            int clp = 0;
            if(flp >= -1)
            {
                idProducto = (int) mod.getValueAt(flp, clp);
                SNDP(idProducto);
            }
        }
    });
  
    }
    
    // =================================
    
    private void SNDP(int idProducto)
    {
        int elIVA, cid;
        try
        {
            //Connection con = Conexion.conectar();
            Conexion conexion = Conexion.obtenerInstancia();
            Connection con = conexion.obtenerConexion();
            // Consulta a la base de datos a la tabla categorias_tabla, el apartado idProducto
            PreparedStatement ps = con.prepareStatement("select * from productos_tablas where idProducto ='" + idProducto + "'");
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                // Pasamos con la descripcion del txt del desing, donde tomamos el estring del result set para meterlo a la base de datos
                txt_productoDescripcion.setText(rs.getString("descripcion_Producto"));
                txt_productosNombre.setText(rs.getString("nombre_Producto"));
                txt_productosCantidad.setText(rs.getString("cantidad_Producto"));
                txt_productoPrecio.setText(rs.getString("precio_Producto"));
                elIVA = rs.getInt("IVAporce_Producto");
                //System.out.println(elIVA);
                cid = rs.getInt("idCategoria");
                   if (elIVA == 0) 
                   {
                    this.JCB_iva.setSelectedItem("Sin IVA");
                    } 
                   else if (elIVA == 16) 
                   {
                    this.JCB_iva.setSelectedItem("16%");
                   }
                   
                   this.JCB_cat.setSelectedItem(CR(cid));
            }
            //con.close();
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Error SNDC1, LN 169" + e);
        }
    }
    
    
    
    // =================================
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JCB_cat;
    private javax.swing.JComboBox<String> JCB_iva;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_refresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JTable tbl_categorias;
    public static javax.swing.JTextField txt_productoDescripcion;
    public static javax.swing.JTextField txt_productoPrecio;
    public static javax.swing.JTextField txt_productosCantidad;
    public static javax.swing.JTextField txt_productosNombre;
    // End of variables declaration//GEN-END:variables

    

}
