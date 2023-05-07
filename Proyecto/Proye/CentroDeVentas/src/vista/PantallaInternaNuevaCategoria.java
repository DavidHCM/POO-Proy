package vista;

import controlado.Manejador_Categorias;
import java.awt.*;
import javax.swing.JOptionPane;
import model.Categorias;


public class PantallaInternaNuevaCategoria extends javax.swing.JInternalFrame 
{

    
    public PantallaInternaNuevaCategoria() 
    {
        initComponents();
        this.setTitle("Nueva categoria");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btn_AceptarDescripcion = new javax.swing.JButton();
        txt_newDescription = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Descripcion de la nueva categoria");

        btn_AceptarDescripcion.setText("Aceptar");
        btn_AceptarDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AceptarDescripcionActionPerformed(evt);
            }
        });

        txt_newDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_newDescriptionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(txt_newDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(btn_AceptarDescripcion)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txt_newDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_AceptarDescripcion)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_newDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_newDescriptionActionPerformed
        
    }//GEN-LAST:event_txt_newDescriptionActionPerformed

    private void btn_AceptarDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AceptarDescripcionActionPerformed
        // Boton de aceptar la descripcion
        Manejador_Categorias mcat = new Manejador_Categorias();
        Categorias cat = new Categorias();

        // Validacion de los campos de estar vacios o no
        if(txt_newDescription.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Esta vacio la descripcion de categoria");
        }
        else
        {
            if(mcat.reviRep(txt_newDescription.getText()))
            {
                JOptionPane.showMessageDialog(null, "Esta categoria ya existe");
            }
            else
            {
                cat.setDescrip_Categoria(txt_newDescription.getText().trim());
                cat.setEstado_Categoria(1);
            
                if(mcat.saveInfoDescrip(cat))
                {
                    JOptionPane.showMessageDialog(null, "Guardado Exitoso");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Guardado Erroneo");
                }
            }
        }
        txt_newDescription.setText("");
    }//GEN-LAST:event_btn_AceptarDescripcionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_AceptarDescripcion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txt_newDescription;
    // End of variables declaration//GEN-END:variables
}
