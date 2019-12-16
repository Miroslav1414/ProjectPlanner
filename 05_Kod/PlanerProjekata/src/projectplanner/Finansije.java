package projectplanner;

import javax.swing.JOptionPane;

public class Finansije extends javax.swing.JDialog {
    private static String prihodRashod;

    public Finansije(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgGrupa = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        rbPrihod = new javax.swing.JRadioButton();
        rbRashod = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        minusPlus = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfNaziv = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfIznos = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taOpis = new javax.swing.JTextArea();
        bOdbaci = new javax.swing.JButton();
        bSacuvaj = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Finansije");
        setBounds(new java.awt.Rectangle(150, 150, 0, 0));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        rbPrihod.setBackground(new java.awt.Color(204, 204, 255));
        bgGrupa.add(rbPrihod);
        rbPrihod.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        rbPrihod.setText("Prihod");
        rbPrihod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPrihodActionPerformed(evt);
            }
        });

        rbRashod.setBackground(new java.awt.Color(204, 204, 255));
        bgGrupa.add(rbRashod);
        rbRashod.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        rbRashod.setText("Rashod");
        rbRashod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbRashodActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Želim da definišem:");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectplanner/ikone/money.png"))); // NOI18N

        minusPlus.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Naziv:");

        tfNaziv.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Iznos:");

        tfIznos.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tfIznos.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Opis:");

        taOpis.setColumns(20);
        taOpis.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        taOpis.setLineWrap(true);
        taOpis.setRows(5);
        taOpis.setWrapStyleWord(true);
        jScrollPane1.setViewportView(taOpis);

        bOdbaci.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        bOdbaci.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectplanner/ikone/cancel.png"))); // NOI18N
        bOdbaci.setText("Odbaci");
        bOdbaci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bOdbaciActionPerformed(evt);
            }
        });

        bSacuvaj.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        bSacuvaj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectplanner/ikone/save.png"))); // NOI18N
        bSacuvaj.setText("Sačuvaj");
        bSacuvaj.setEnabled(false);
        bSacuvaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSacuvajActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbRashod)
                                    .addComponent(rbPrihod)))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                        .addComponent(minusPlus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tfNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6))
                            .addComponent(tfIznos, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bSacuvaj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bOdbaci)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbPrihod)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbRashod))
                    .addComponent(minusPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tfNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfIznos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bOdbaci)
                    .addComponent(bSacuvaj))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbRashodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbRashodActionPerformed
        minusPlus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectplanner/ikone/minus.png")));
        prihodRashod = "KREIRAJ_RASHOD";
        bSacuvaj.setEnabled(true);
    }//GEN-LAST:event_rbRashodActionPerformed

    private void rbPrihodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPrihodActionPerformed
        minusPlus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectplanner/ikone/plus.png")));
        prihodRashod = "KREIRAJ_PRIHOD";
        bSacuvaj.setEnabled(true);
    }//GEN-LAST:event_rbPrihodActionPerformed

    private void bOdbaciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bOdbaciActionPerformed
        Sef.finansije.setVisible(false);
    }//GEN-LAST:event_bOdbaciActionPerformed

    private void bSacuvajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSacuvajActionPerformed
        String naziv = "";
        String iznos = "";
        String opis = "";
        try {
            naziv = tfNaziv.getText();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Niste uneli naziv!",
                                      "Poruka", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        try {
            iznos = tfIznos.getText();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Niste uneli iznos!",
                                      "Poruka", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        try {
            opis = taOpis.getText();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Niste uneli opis!",
                                      "Poruka", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        ProjectPlanner.out.println(prihodRashod + "#" + Sef.projekat.getIdProjekta() + "#" +
                naziv + "#" + opis + "#" + iznos);
        try {
            ProjectPlanner.poruka = ProjectPlanner.in.readLine();
            if(ProjectPlanner.poruka.equals("IZUZETAK"))
                throw new Exception();
            if(ProjectPlanner.poruka.equals("USPJESNO"))
                JOptionPane.showMessageDialog(null, "Zahtjev uspješno obrađen.",
                                      "Poruka", JOptionPane.INFORMATION_MESSAGE);
            else
                JOptionPane.showMessageDialog(null, "Zahtjev nije uspješno obrađen.",
                                      "Poruka", JOptionPane.INFORMATION_MESSAGE);
            Korisnik.sef.prikaziProjekat();
            Sef.finansije.setVisible(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Došlo je do greške!",
                                      "Poruka", JOptionPane.INFORMATION_MESSAGE);            
            Sef.finansije.setVisible(false);
        }
                
    }//GEN-LAST:event_bSacuvajActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bOdbaci;
    private javax.swing.JButton bSacuvaj;
    private javax.swing.ButtonGroup bgGrupa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel minusPlus;
    private javax.swing.JRadioButton rbPrihod;
    private javax.swing.JRadioButton rbRashod;
    private javax.swing.JTextArea taOpis;
    private javax.swing.JTextField tfIznos;
    private javax.swing.JTextField tfNaziv;
    // End of variables declaration//GEN-END:variables
}
