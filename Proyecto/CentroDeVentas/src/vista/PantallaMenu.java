package vista;

import java.awt.Dimension;
import javax.swing.*;

/**
 *|
 * @author David
 */
public class PantallaMenu extends javax.swing.JFrame 
{

    public static JDesktopPane jDesktopPane_main_menu;
    public int widthScreen = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
    public int heightScreen = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
    
            
    public PantallaMenu() 
    {
        initComponents();
        this.setLayout(null);
        jDesktopPane_main_menu =  new JDesktopPane();
        this.jDesktopPane_main_menu.setBounds(0,0,widthScreen,(heightScreen - 110));
        this.add(jDesktopPane_main_menu);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Menu");
        this.setSize(new Dimension(1113,700));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        user_manage = new javax.swing.JMenuItem();
        new_User = new javax.swing.JMenuItem();
        logging_off = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        clients = new javax.swing.JMenuItem();
        new_client = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        products = new javax.swing.JMenuItem();
        new_product = new javax.swing.JMenuItem();
        renew_inventory_products = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        manage_category = new javax.swing.JMenuItem();
        new_category = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        bill_sale = new javax.swing.JMenuItem();
        sells = new javax.swing.JMenuItem();
        sells_report = new javax.swing.JMenuItem();
        products_report = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        history = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuBar1.setMargin(new java.awt.Insets(1, 1, 1, 1));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(159, 70));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user-regular-24.png"))); // NOI18N
        jMenu1.setText("Usuario");
        jMenu1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jMenu1.setIconTextGap(10);
        jMenu1.setMinimumSize(new java.awt.Dimension(170, 70));
        jMenu1.setPreferredSize(new java.awt.Dimension(185, 70));

        user_manage.setText("Usuarios");
        user_manage.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenu1.add(user_manage);

        new_User.setText("Creacion de Usuario");
        new_User.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenu1.add(new_User);

        logging_off.setText("Cerrar Sesion");
        logging_off.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenu1.add(logging_off);

        jMenuBar1.add(jMenu1);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user-minus-regular-24.png"))); // NOI18N
        jMenu3.setText("Cliente");
        jMenu3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jMenu3.setMargin(new java.awt.Insets(1, 1, 1, 1));
        jMenu3.setMinimumSize(new java.awt.Dimension(170, 70));
        jMenu3.setPreferredSize(new java.awt.Dimension(185, 70));

        clients.setText("Clientes");
        clients.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenu3.add(clients);

        new_client.setText("Nuevo cliente");
        new_client.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenu3.add(new_client);

        jMenuBar1.add(jMenu3);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cart-add-regular-24.png"))); // NOI18N
        jMenu2.setText("Productos");
        jMenu2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jMenu2.setMargin(new java.awt.Insets(1, 1, 1, 1));
        jMenu2.setMinimumSize(new java.awt.Dimension(170, 70));
        jMenu2.setPreferredSize(new java.awt.Dimension(185, 70));

        products.setText("Productos");
        products.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenu2.add(products);

        new_product.setText("Productos nuevos");
        new_product.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenu2.add(new_product);

        renew_inventory_products.setText("Inventario de Productos");
        renew_inventory_products.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenu2.add(renew_inventory_products);

        jMenuBar1.add(jMenu2);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/category-regular-24.png"))); // NOI18N
        jMenu4.setText("Categoria");
        jMenu4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jMenu4.setMargin(new java.awt.Insets(1, 1, 1, 1));
        jMenu4.setMinimumSize(new java.awt.Dimension(170, 70));
        jMenu4.setPreferredSize(new java.awt.Dimension(185, 70));

        manage_category.setText("Categorias");
        manage_category.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenu4.add(manage_category);

        new_category.setText("Nueva categoria");
        new_category.setPreferredSize(new java.awt.Dimension(150, 30));
        new_category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_categoryActionPerformed(evt);
            }
        });
        jMenu4.add(new_category);

        jMenuBar1.add(jMenu4);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/check-square-regular-24.png"))); // NOI18N
        jMenu6.setText("Facturar");
        jMenu6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu6.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jMenu6.setMargin(new java.awt.Insets(1, 1, 1, 1));
        jMenu6.setMinimumSize(new java.awt.Dimension(170, 70));
        jMenu6.setPreferredSize(new java.awt.Dimension(185, 70));

        bill_sale.setText("Facturar venta");
        bill_sale.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenu6.add(bill_sale);

        sells.setText("Ventas");
        sells.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenu6.add(sells);

        sells_report.setText("Reporte de ventas");
        sells_report.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenu6.add(sells_report);

        products_report.setText("Reporte de productos");
        products_report.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenu6.add(products_report);

        jMenuBar1.add(jMenu6);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/history-regular-24.png"))); // NOI18N
        jMenu8.setText("Historial");
        jMenu8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu8.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jMenu8.setMargin(new java.awt.Insets(1, 1, 1, 1));
        jMenu8.setMinimumSize(new java.awt.Dimension(170, 70));
        jMenu8.setPreferredSize(new java.awt.Dimension(185, 70));

        history.setText("Historial de ventas");
        history.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenu8.add(history);

        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1113, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void new_categoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_categoryActionPerformed
        PantallaInternaNuevaCategoria accionPantallaInternaNuevaCategoria = new PantallaInternaNuevaCategoria();
        jDesktopPane_main_menu.add(accionPantallaInternaNuevaCategoria);
        accionPantallaInternaNuevaCategoria.setVisible(true);
    }//GEN-LAST:event_new_categoryActionPerformed

    
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PantallaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem bill_sale;
    private javax.swing.JMenuItem clients;
    private javax.swing.JMenuItem history;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem logging_off;
    private javax.swing.JMenuItem manage_category;
    private javax.swing.JMenuItem new_User;
    private javax.swing.JMenuItem new_category;
    private javax.swing.JMenuItem new_client;
    private javax.swing.JMenuItem new_product;
    private javax.swing.JMenuItem products;
    private javax.swing.JMenuItem products_report;
    private javax.swing.JMenuItem renew_inventory_products;
    private javax.swing.JMenuItem sells;
    private javax.swing.JMenuItem sells_report;
    private javax.swing.JMenuItem user_manage;
    // End of variables declaration//GEN-END:variables
}
