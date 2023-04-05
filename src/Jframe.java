
public class Jframe extends javax.swing.JFrame {

  Dispositivo dispositivo = new Dispositivo("", "", 0);
    public Jframe() {
        initComponents();
        setLocationRelativeTo(null);
        dispositivo = new Dispositivo("", "", 0);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jflagregar = new javax.swing.JButton();
        jflconsultar = new javax.swing.JButton();
        jfllimpiar = new javax.swing.JButton();
        COLOR = new javax.swing.JTextField();
        TIPO = new javax.swing.JTextField();
        PESO = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));

        jLabel1.setText("DISPOSITIVO");

        jLabel2.setText("COLOR");

        jLabel3.setText("TIPO ");

        jLabel4.setText("PESO");

        jflagregar.setBackground(new java.awt.Color(0, 255, 0));
        jflagregar.setText("AGREGAR");
        jflagregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jflagregarMouseClicked(evt);
            }
        });
        jflagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jflagregarActionPerformed(evt);
            }
        });

        jflconsultar.setBackground(new java.awt.Color(0, 153, 153));
        jflconsultar.setText("CONSULTAR");
        jflconsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jflconsultarMouseClicked(evt);
            }
        });
        jflconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jflconsultarActionPerformed(evt);
            }
        });

        jfllimpiar.setBackground(new java.awt.Color(0, 204, 204));
        jfllimpiar.setText("LIMPIAR");
        jfllimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jfllimpiarMouseClicked(evt);
            }
        });

        COLOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                COLORActionPerformed(evt);
            }
        });

        TIPO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TIPOActionPerformed(evt);
            }
        });

        PESO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PESOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(49, 49, 49)
                                .addComponent(PESO))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(49, 49, 49)
                                .addComponent(TIPO, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(38, 38, 38)
                                .addComponent(COLOR, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jflagregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addComponent(jflconsultar)
                        .addGap(52, 52, 52)
                        .addComponent(jfllimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(COLOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TIPO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jflagregar)
                            .addComponent(jflconsultar)
                            .addComponent(jfllimpiar)))
                    .addComponent(PESO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jflagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jflagregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jflagregarActionPerformed

    private void jflconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jflconsultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jflconsultarActionPerformed

    private void COLORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_COLORActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_COLORActionPerformed

    private void TIPOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TIPOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TIPOActionPerformed

    private void PESOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PESOActionPerformed
      
    }//GEN-LAST:event_PESOActionPerformed

    private void jfllimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jfllimpiarMouseClicked

    COLOR.setText("");
    TIPO.setText("");
    PESO.setText(""); 
    }//GEN-LAST:event_jfllimpiarMouseClicked

    private void jflagregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jflagregarMouseClicked
    dispositivo.setColor(COLOR.getText());
    dispositivo.setTipo(TIPO.getText());
    double p = Double.parseDouble(PESO.getText());
    dispositivo.setPeso(p); 
  
    
    }//GEN-LAST:event_jflagregarMouseClicked

    private void jflconsultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jflconsultarMouseClicked
    COLOR.setText(dispositivo.getColor());
    TIPO.setText(dispositivo.getTipo());
    PESO.setText(String.valueOf(dispositivo.getPeso()));
   
    }//GEN-LAST:event_jflconsultarMouseClicked

    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField COLOR;
    private javax.swing.JTextField PESO;
    private javax.swing.JTextField TIPO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jflagregar;
    private javax.swing.JButton jflconsultar;
    private javax.swing.JButton jfllimpiar;
    // End of variables declaration//GEN-END:variables
}
