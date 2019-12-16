package projectplanner;

import javax.swing.JOptionPane;

public class Lozinka extends javax.swing.JDialog {

    public Lozinka(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lIme = new javax.swing.JLabel();
        tfLozinka = new javax.swing.JTextField();
        lLozinka = new javax.swing.JLabel();
        tfLozinka1 = new javax.swing.JTextField();
        bOdbaci = new javax.swing.JButton();
        bSacuvaj = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nova lozinka");
        setBounds(new java.awt.Rectangle(200, 200, 0, 0));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        lIme.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lIme.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lIme.setText("Unesite novu lozinku:");
        lIme.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lIme.setName(""); // NOI18N

        lLozinka.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lLozinka.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lLozinka.setText("Ponovite lozinku:");
        lLozinka.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lLozinka.setName(""); // NOI18N

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
        bSacuvaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSacuvajActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 170, Short.MAX_VALUE)
                        .addComponent(bSacuvaj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bOdbaci))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lLozinka, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lIme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfLozinka)
                            .addComponent(tfLozinka1))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lIme, javax.swing.GroupLayout.PREFERRED_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(tfLozinka))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lLozinka, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfLozinka1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bOdbaci)
                    .addComponent(bSacuvaj))
                .addContainerGap())
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bOdbaciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bOdbaciActionPerformed
        Korisnik.lozinka.setVisible(false);
    }//GEN-LAST:event_bOdbaciActionPerformed

    private void bSacuvajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSacuvajActionPerformed
        try {
            if(!tfLozinka.getText().equals(tfLozinka1.getText())) {
                JOptionPane.showMessageDialog(null, "Unosi se ne podudaraju!",
                "Poruka", JOptionPane.INFORMATION_MESSAGE);
                return;
            } else 
                ProjectPlanner.out.println("SIFRA#" + Login.korisnickoIme + "#" + tfLozinka.getText());
            if(ProjectPlanner.in.readLine().equals("TACNO"))
                JOptionPane.showMessageDialog(null, "Lozinka uspješno promjenjena.",
                "Poruka", JOptionPane.INFORMATION_MESSAGE);
            else
                JOptionPane.showMessageDialog(null, "Lozinka nije promjenjena.",
                "Poruka", JOptionPane.INFORMATION_MESSAGE);
            Korisnik.lozinka.setVisible(false);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Došlo je do greške!",
                "Poruka", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_bSacuvajActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bOdbaci;
    private javax.swing.JButton bSacuvaj;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lIme;
    private javax.swing.JLabel lLozinka;
    private javax.swing.JTextField tfLozinka;
    private javax.swing.JTextField tfLozinka1;
    // End of variables declaration//GEN-END:variables
}
