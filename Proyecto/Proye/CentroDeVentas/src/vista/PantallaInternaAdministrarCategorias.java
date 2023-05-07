
package vista;

import conexion.Conexion;
import controlado.Manejador_Categorias;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Categorias;

/**
 *
 * @author David
 */
public class PantallaInternaAdministrarCategorias extends javax.swing.JInternalFrame 
{
    protected int idCategoria;
    
    
    public PantallaInternaAdministrarCategorias() 
    {
        initComponents();
        this.setTitle("Administrar categorias");
        this.categoriasAdministracionDeTablas();
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
        jLabel2 = new javax.swing.JLabel();
        txt_CategoriasDescrip = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setClosable(true);
        setIconifiable(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Administracion de las categorias");

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Descripcion:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Funciones");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(329, 329, 329)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(194, 194, 194)
                                .addComponent(btn_refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_CategoriasDescrip, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(328, 328, 328)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_CategoriasDescrip, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(264, 264, 264))
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
        Manejador_Categorias mct = new Manejador_Categorias();
        Categorias ct = new Categorias();
        if(txt_CategoriasDescrip.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Porfavor de estar en una categoria");
        }
        else
        {
            ct.setDescrip_Categoria(txt_CategoriasDescrip.getText());
            if(!mct.delete(idCategoria))
            {
                JOptionPane.showMessageDialog(null,"Se ha eliminado la categoria");
                txt_CategoriasDescrip.setText("");
                this.categoriasAdministracionDeTablas();
            }
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
        Manejador_Categorias mct = new Manejador_Categorias();
        Categorias ct = new Categorias();
        if(txt_CategoriasDescrip.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Porfavor de estar en una categoria");
        }
        else
        {
            ct.setDescrip_Categoria(txt_CategoriasDescrip.getText());
            if(mct.refresh(ct, idCategoria))
            {
                JOptionPane.showMessageDialog(null,"Se ha actulizado la categoria");
                txt_CategoriasDescrip.setText("");
                this.categoriasAdministracionDeTablas();
            }
        }
    }//GEN-LAST:event_btn_refreshActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_refresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JTable tbl_categorias;
    public static javax.swing.JTextField txt_CategoriasDescrip;
    // End of variables declaration//GEN-END:variables

    // =================================

    private void categoriasAdministracionDeTablas()
    {
        Connection con = Conexion.conectar();
        // Este es la tabla
        DefaultTableModel mod = new DefaultTableModel();
        // Hacemos un request a la tabla donde seleccionamos todos los campos indicados
        String sql = "select idCategoria, descrip_Categoria, estado_Categoria from categorias_tabla";
        Statement st;
        
        try
        {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            // Teniendo el modelo lo insertamos como una nueva tabla de tbl_categorias
            PantallaInternaAdministrarCategorias.tbl_categorias = new JTable(mod);
            PantallaInternaAdministrarCategorias.jScrollPane1.setViewportView(PantallaInternaAdministrarCategorias.tbl_categorias);
            mod.addColumn("idCategoria");
            mod.addColumn("descrip_Categoria");
            mod.addColumn("estado_Categoria");
            while(rs.next())
            {
                // El objeto es del numerop de columnas
                Object fl[] = new Object[3];
                
                for(int i = 0;i<3;i++)
                {
                    fl[i] = rs.getObject(i + 1);
                }
                mod.addRow(fl);
            }
            con.close();
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Error CADT1, LN 182" + e);
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
                idCategoria = (int) mod.getValueAt(flp, clp);
                SNDC(idCategoria);
            }
        }
    });
    
       
       
       
       
    }
    
    private void SNDC(int idCategoria)
    {
        try
        {
            Connection con = Conexion.conectar();
            // Consulta a la base de datos a la tabla categorias_tabla, el apartado idCategoria
            PreparedStatement ps = con.prepareStatement("select * from categorias_tabla where idCategoria ='" + idCategoria + "'");
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                // Pasamos con la descripcion del txt del desing, donde tomamos el estring del result set para meterlo a la base de datos
                txt_CategoriasDescrip.setText(rs.getString("descrip_Categoria"));
            }
            con.close();
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Error SNDC1, LN 169" + e);
        }
    }
    
}
