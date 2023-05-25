package Pantallas;

import Conector.Conexion;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Obtenor.InformacionVentas;
import Manejadores.Manejador_Ventas;
import javax.swing.JDesktopPane;
import Obtenor.Venta;


public final class PantallaInternaNuevaVenta extends javax.swing.JInternalFrame 
{
    private static DefaultTableModel tablaDataInic;
    ArrayList<InformacionVentas> tablaProds = new ArrayList<>();
    private static InformacionVentas prods;
    // ===============================
    // Todas estas son variables temporales
    // ===============================
    private int idClient = 0;
    private int idProducto = 0;
    private String nombre_Venta = "";
    private int stockCant = 0;
    private double precioUnitario = 0;
    private int porcentajeIva = 0;
    private int cantidadUnitaria = 0;
    private double subTotal = 0;
    private double iva = 0;
    private double totalAPagar = 0;
    private double subTotalUnitario = 0;
    private double ivaUnitario = 0;
    private double totalAPagarFinal = 0;
    private int varTem = 1;
   
    
    public PantallaInternaNuevaVenta() 
    {
        initComponents();
        this.cargProds();
        this.setTitle("Menu de ventas");
        txt_subtotal.setText("0.0");
        txt_IVAS.setText("0.0");
        txt_tot_pag.setText("0.0");
        PantallaInternaNuevaVenta.tablaInic();
    }
    
      private static void tablaInic() 
      {
        tablaDataInic = new DefaultTableModel();
        tablaDataInic.addColumn("ID");
        tablaDataInic.addColumn("Nombre");
        tablaDataInic.addColumn("Cantidad");
        tablaDataInic.addColumn("Precio Unitario");
        tablaDataInic.addColumn("Sub Total");
        tablaDataInic.addColumn("Iva");
        tablaDataInic.addColumn("Total a pagar");
        PantallaInternaNuevaVenta.tbl_prods.setModel(tablaDataInic);
    }
      
    private  void tablaProdInic() 
    {
        PantallaInternaNuevaVenta.tablaDataInic.setRowCount(tablaProds.size());
        for (int i = 0; i < tablaProds.size(); i++) 
        {
            PantallaInternaNuevaVenta.tablaDataInic.setValueAt(i + 1, i, 0);
            PantallaInternaNuevaVenta.tablaDataInic.setValueAt(tablaProds.get(i).getNombre_Venta(), i, 1);
            PantallaInternaNuevaVenta.tablaDataInic.setValueAt(tablaProds.get(i).getCantidad(), i, 2);
            PantallaInternaNuevaVenta.tablaDataInic.setValueAt(tablaProds.get(i).getPrecio_Unitario(), i, 3);
            PantallaInternaNuevaVenta.tablaDataInic.setValueAt(tablaProds.get(i).getPrecio_Subtotal(), i, 4);
            PantallaInternaNuevaVenta.tablaDataInic.setValueAt(tablaProds.get(i).getPrecio_IVA(), i, 5);
            PantallaInternaNuevaVenta.tablaDataInic.setValueAt(tablaProds.get(i).getPrecio_TotalPagar(), i, 6);
        }
        tbl_prods.setModel(tablaDataInic);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_prods = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        JCB_prod = new javax.swing.JComboBox<>();
        txt_cant = new javax.swing.JTextField();
        txt_busc_cliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btn_buscar_cli = new javax.swing.JButton();
        btn_añadir_producto = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_cliente_encontrado = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_subtotal = new javax.swing.JTextField();
        txt_IVAS = new javax.swing.JTextField();
        txt_tot_pag = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_efectivo = new javax.swing.JTextField();
        txt_cambio = new javax.swing.JTextField();
        btn_dar_efectivo = new javax.swing.JToggleButton();
        btn_comprar = new javax.swing.JButton();

        setClosable(true);
        setForeground(java.awt.Color.white);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Hacer ventas:");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tbl_prods.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbl_prods);

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Cantidad:");

        JCB_prod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Productos:" }));
        JCB_prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCB_prodActionPerformed(evt);
            }
        });

        txt_cant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cantActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Username:");

        btn_buscar_cli.setText("Buscar cliente");
        btn_buscar_cli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar_cliActionPerformed(evt);
            }
        });

        btn_añadir_producto.setText("Añadir producto");
        btn_añadir_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_añadir_productoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Producto:");

        txt_cliente_encontrado.setEditable(false);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Cliente:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(btn_añadir_producto)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel9)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel3)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JCB_prod, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_cant, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txt_busc_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_buscar_cli))
                            .addComponent(txt_cliente_encontrado))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JCB_prod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_cant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_busc_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar_cli))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_cliente_encontrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(btn_añadir_producto)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Subtotal:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Total a pagar:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Iva:");

        txt_subtotal.setEditable(false);
        txt_subtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_subtotalActionPerformed(evt);
            }
        });

        txt_IVAS.setEditable(false);
        txt_IVAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_IVASActionPerformed(evt);
            }
        });

        txt_tot_pag.setEditable(false);
        txt_tot_pag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tot_pagActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_subtotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_IVAS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(txt_tot_pag, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_IVAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_tot_pag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Efectivo");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Cambio:");

        txt_efectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_efectivoActionPerformed(evt);
            }
        });

        txt_cambio.setEditable(false);
        txt_cambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cambioActionPerformed(evt);
            }
        });

        btn_dar_efectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dar_efectivoActionPerformed(evt);
            }
        });

        btn_comprar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_comprar.setText("Realizar compra");
        btn_comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_comprarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_cambio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_efectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_dar_efectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_comprar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txt_efectivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btn_dar_efectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_cambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_comprar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(374, 374, 374))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_subtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_subtotalActionPerformed
   
    }//GEN-LAST:event_txt_subtotalActionPerformed

    private void txt_IVASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_IVASActionPerformed
      
    }//GEN-LAST:event_txt_IVASActionPerformed

    private void txt_tot_pagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tot_pagActionPerformed
        
    }//GEN-LAST:event_txt_tot_pagActionPerformed

    private void txt_efectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_efectivoActionPerformed
     
    }//GEN-LAST:event_txt_efectivoActionPerformed

    private void txt_cambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cambioActionPerformed
        
    }//GEN-LAST:event_txt_cambioActionPerformed

    private void btn_dar_efectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dar_efectivoActionPerformed
        if (txt_efectivo.getText().equals("")) 
        {
            JOptionPane.showMessageDialog(null, "Favor de poner un numero");
        } 
        else 
        {
            boolean validacion = comprobNum(txt_efectivo.getText());
            if (validacion == true) 
            {
                double efc = Double.parseDouble(txt_efectivo.getText());
                double top = Double.parseDouble(txt_tot_pag.getText());

                if (efc > top)
                {
                    double cambio = (efc - top);
                    double cambi = (double) Math.round(cambio * 100d) / 100;
                    String camb = String.valueOf(cambi);
                    txt_cambio.setText(camb);
                } 
            } 
        }
    }//GEN-LAST:event_btn_dar_efectivoActionPerformed

    private void btn_añadir_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_añadir_productoActionPerformed

        if (!txt_cant.getText().isEmpty()) 
        {
            boolean validacion = comprobVal(txt_cant.getText());
            if (validacion == true)
            {
                if (Integer.parseInt(txt_cant.getText()) > 0)
                {
                    cantidadUnitaria = Integer.parseInt(txt_cant.getText());
                    this.prodsData();
                    if (cantidadUnitaria <= stockCant) 
                    {
                        subTotal = precioUnitario * cantidadUnitaria;
                        totalAPagar = subTotal + iva;
                        subTotal = (double) Math.round(subTotal * 100) / 100;
                        iva = (double) Math.round(iva * 100) / 100;
                        totalAPagar = (double) Math.round(totalAPagar * 100) / 100;
                        prods = new InformacionVentas(varTem, 1, idProducto, Integer.parseInt(txt_cant.getText()), nombre_Venta, precioUnitario, subTotal, iva, totalAPagar, 1);
                        tablaProds.add(prods);
                        varTem++;
                        txt_cant.setText("");
                        this.cargProds();
                        this.calcTotal();
                        txt_efectivo.setEnabled(true);
                        btn_comprar.setEnabled(true);

                    } 
                    else 
                    {
                        JOptionPane.showMessageDialog(null, "Es mayor al almacen");
                    }
                }
                else 
                {
                    JOptionPane.showMessageDialog(null, "Favor de poner una cantidad");
                }
            }
        }
        this.tablaProdInic();
    }//GEN-LAST:event_btn_añadir_productoActionPerformed

    private void btn_buscar_cliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar_cliActionPerformed
        //Connection con = Conexion.conectar();
        Conexion conexion = Conexion.obtenerInstancia();
        Connection con = conexion.obtenerConexion();
        ResultSet rs;
        Statement st;
        String cliente = txt_busc_cliente.getText();
        String sql = "select nombre_Client, apellido_Client, name_ClientC from cliente_tablas where name_ClientC = '" + cliente + "'";
        try
        {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            if(rs.next())
            {
                txt_cliente_encontrado.setText("Nombre: " +rs.getString("nombre_Client") + " " + rs.getString("apellido_Client") + ", Expediente: " + rs.getString("name_ClientC"));
            }
            else
            {
                txt_cliente_encontrado.setText("No se encontro el cliente");
            }
            //con.close();
        }
        catch(SQLException e)
        {
            System.out.println("Error BTNSCH 1, LN 523" + e);
        }

    }//GEN-LAST:event_btn_buscar_cliActionPerformed

    private void txt_cantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cantActionPerformed

    }//GEN-LAST:event_txt_cantActionPerformed

    private void JCB_prodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCB_prodActionPerformed

    }//GEN-LAST:event_JCB_prodActionPerformed

    private void btn_comprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_comprarActionPerformed
        Venta cabeceraVenta = new Venta();
        InformacionVentas detalleVenta = new InformacionVentas();
        Manejador_Ventas controlVenta = new Manejador_Ventas();

        String fechaActual = ""; // La inicializo que si no luego da problemas
        java.util.Date date = new java.util.Date();
        fechaActual = new SimpleDateFormat("yyyy/MM/dd").format(date);

        if (!txt_cliente_encontrado.getText().equals("") || tablaProds.isEmpty())
        {
                this.geneID();
                cabeceraVenta.setIdMainVentas(0);
                cabeceraVenta.setIdClient(idClient);
                cabeceraVenta.setaPagar(Double.parseDouble(txt_tot_pag.getText()));
                cabeceraVenta.setDate_Venta(fechaActual);
                cabeceraVenta.setEstado_Venta(1);
                if (controlVenta.saveInfoDescrip(cabeceraVenta)) 
                {
                    JOptionPane.showMessageDialog(null, "Venta realizada");
                    for (InformacionVentas elem : tablaProds) 
                    {
                        detalleVenta.setIdInforVentas(0);
                        detalleVenta.setIdMainVentas(0);
                        detalleVenta.setIdProducto(elem.getIdProducto());
                        detalleVenta.setCantidad(elem.getCantidad());
                        detalleVenta.setNombre_Venta(elem.getNombre_Venta());
                        detalleVenta.setPrecio_Unitario(elem.getPrecio_Unitario());
                        detalleVenta.setPrecio_Subtotal(elem.getPrecio_Subtotal());
                        detalleVenta.setPrecio_IVA(elem.getPrecio_IVA());
                        detalleVenta.setPrecio_TotalPagar(elem.getPrecio_TotalPagar());
                        detalleVenta.setEstado_Venta(1);
                        JOptionPane.showMessageDialog(
                                null,
                                """
                                Venta realizada
                                
                                ID de venta: """ + cabeceraVenta.getIdClient() + "\n"
                                + "ID de cliente: " + detalleVenta.getNombre_Venta() + "\n"
                                + "Total a pagar: " + detalleVenta.getPrecio_TotalPagar() + "\n"
                                + "Fecha de venta: " + cabeceraVenta.getDate_Venta() + "\n",
                                "Detalles de la venta",
                                JOptionPane.INFORMATION_MESSAGE
                        );

                        if (controlVenta.guardarDetalle(detalleVenta)) 
                        {
                            txt_subtotal.setText("");
                            txt_IVAS.setText("");
                            txt_tot_pag.setText("");
                            txt_efectivo.setText("");
                            txt_cambio.setText("");
                            txt_busc_cliente.setText("");
                            varTem = 1;
                            this.delAlmacen(elem.getIdProducto(), elem.getCantidad());
                        } 
                    }
                    tablaProds.clear();
                    tablaProdInic();
                }   
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "Falta cliente o producto");
        }
    }//GEN-LAST:event_btn_comprarActionPerformed
    
    private void prodsData() 
    {
        try 
        {
            //Connection con = Conexion.conectar();
            Conexion conexion = Conexion.obtenerInstancia();
            Connection con = conexion.obtenerConexion();
            Statement st;
            String sql = "select * from productos_tablas where nombre_Producto = '" + this.JCB_prod.getSelectedItem() + "'";
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) 
            {
                idProducto = rs.getInt("idProducto");
                nombre_Venta = rs.getString("nombre_Producto");
                stockCant = rs.getInt("cantidad_Producto");
                precioUnitario = rs.getDouble("precio_Producto");
                porcentajeIva = rs.getInt("IVAporce_Producto");
                
                switch (porcentajeIva) 
                {
                    case 0 -> iva = 0.0;
                    case 16 -> iva = (precioUnitario * cantidadUnitaria) * 0.14;
                    default -> 
                    {
                    }
                }
            }
        } 
        catch (SQLException e) 
        {
            System.out.println("Error PSD, LN 612, " + e);
        }
    }
    
    private static boolean comprobNum(String valor) 
    {
        try 
        {
            double num = Double.parseDouble(valor); // Si no dio error entonces pasamos al return
            return true;
        } 
        catch (NumberFormatException e)
        {
            return false;
        }
    }
    
    
    private static boolean comprobVal(String valor)
    {
        try 
        {
            int num = Integer.parseInt(valor); // Si no dio error entonces pasamos al return
            return true;
        } 
        catch (NumberFormatException e)
        {
            return false;
        }
    }
    
    public void cargProds()
    {
        //Connection con = Conexion.conectar();
        Conexion conexion = Conexion.obtenerInstancia();
        Connection con = conexion.obtenerConexion();
        String sql = "select * from productos_tablas";
        ResultSet rs;
        Statement st;
        try
        {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            JCB_prod.removeAllItems();
            JCB_prod.addItem("Productos");
            while(rs.next())
            {
                JCB_prod.addItem(rs.getString("nombre_Producto"));
            }
            //con.close();
        }
        catch(SQLException e)
        {
            System.out.println("Error CP 1, LN 675" + e);
        }
    }

     private void calcTotal() 
     {
        subTotalUnitario = 0;
        ivaUnitario = 0;
        totalAPagarFinal = 0;

        for (InformacionVentas elemento : tablaProds)
        {
            subTotalUnitario += elemento.getPrecio_Subtotal();
            ivaUnitario += elemento.getPrecio_IVA();
            totalAPagarFinal += elemento.getPrecio_TotalPagar();
        }
        subTotalUnitario = (double) Math.round(subTotalUnitario * 100) / 100;
        ivaUnitario = (double) Math.round(ivaUnitario * 100) / 100;
        totalAPagarFinal = (double) Math.round(totalAPagarFinal * 100) / 100;

        txt_subtotal.setText(String.valueOf(subTotalUnitario));
        txt_IVAS.setText(String.valueOf(ivaUnitario));
        txt_tot_pag.setText(String.valueOf(totalAPagarFinal));
    }
     
     private  void geneID() 
     {
        try 
        {
            //Connection con = Conexion.conectar();
            Conexion conexion = Conexion.obtenerInstancia();
            Connection con = conexion.obtenerConexion();
            String cliente = txt_busc_cliente.getText();
            String sql = "select name_ClientC from cliente_tablas where name_ClientC = '" + cliente + "'";
            Statement st;
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) 
            {
                this.idClient = rs.getInt("name_ClientC");
            }

        } 
        catch (SQLException e) 
        {
            System.out.println("Error LN 599 " + e);
        }
    }
    
    
    
     private void delAlmacen(int idProducto, int cantidad)
     {
        int cantidadProductosBaseDeDatos = 0;
        try 
        {
            //Connection con = Conexion.conectar();
            Conexion conexion = Conexion.obtenerInstancia();
            Connection con = conexion.obtenerConexion();
            Statement st;
            String sql = "select idProducto, cantidad_Producto from productos_tablas where idProducto = '" + idProducto + "'";
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) 
            {
                cantidadProductosBaseDeDatos = rs.getInt("cantidad_Producto");
            }
            //con.close();
        } 
        catch (SQLException e) 
        {
            System.out.println("Error al restar cantidad 1, " + e);
        }
        
        try 
        {
            //Connection con = Conexion.conectar();
            Conexion conexion = Conexion.obtenerInstancia();
            Connection con = conexion.obtenerConexion();
            PreparedStatement cos = con.prepareStatement("update productos_tablas set cantidad_Producto=? where idProducto = '" + idProducto + "'");
            int cantidadNueva = cantidadProductosBaseDeDatos - cantidad;
            cos.setInt(1, cantidadNueva);
             if(cos.executeUpdate() > 0){
                //System.out.println("Sin error");
            }
            //con.close();
        } 
        catch (SQLException e) 
        {
            System.out.println("Error LN 741, " + e);
        }
    }
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JCB_prod;
    private javax.swing.JButton btn_añadir_producto;
    private javax.swing.JButton btn_buscar_cli;
    private javax.swing.JButton btn_comprar;
    private javax.swing.JToggleButton btn_dar_efectivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tbl_prods;
    private javax.swing.JTextField txt_IVAS;
    private javax.swing.JTextField txt_busc_cliente;
    private javax.swing.JTextField txt_cambio;
    private javax.swing.JTextField txt_cant;
    private javax.swing.JTextField txt_cliente_encontrado;
    private javax.swing.JTextField txt_efectivo;
    private javax.swing.JTextField txt_subtotal;
    private javax.swing.JTextField txt_tot_pag;
    // End of variables declaration//GEN-END:variables
}
