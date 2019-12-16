package projectplanner;

import javax.swing.JOptionPane;

public class KreirajNalog extends javax.swing.JDialog {

        public KreirajNalog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lIme = new javax.swing.JLabel();
        tfKorisnickoIme = new javax.swing.JTextField();
        lLozinka = new javax.swing.JLabel();
        tfLozinka = new javax.swing.JTextField();
        lLozinka1 = new javax.swing.JLabel();
        tfPrezime = new javax.swing.JTextField();
        lLozinka2 = new javax.swing.JLabel();
        tfIme = new javax.swing.JTextField();
        lLozinka3 = new javax.swing.JLabel();
        tfRadnoMjesto = new javax.swing.JTextField();
        bSacuvaj = new javax.swing.JButton();
        bOdbaci = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Kreiraj nalog");
        setBounds(new java.awt.Rectangle(250, 250, 0, 0));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        lIme.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lIme.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lIme.setText("Unesite korisničko ime:");
        lIme.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lIme.setName(""); // NOI18N

        lLozinka.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lLozinka.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lLozinka.setText("Unesite Lozinku:");
        lLozinka.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lLozinka.setName(""); // NOI18N

        lLozinka1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lLozinka1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lLozinka1.setText("Unesite prezime:");
        lLozinka1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lLozinka1.setName(""); // NOI18N

        lLozinka2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lLozinka2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lLozinka2.setText("Unesite ime:");
        lLozinka2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lLozinka2.setName(""); // NOI18N

        lLozinka3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lLozinka3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lLozinka3.setText("Unesite radno mjesto:");
        lLozinka3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lLozinka3.setName(""); // NOI18N

        bSacuvaj.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        bSacuvaj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectplanner/ikone/save.png"))); // NOI18N
        bSacuvaj.setText("Sačuvaj");
        bSacuvaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSacuvajActionPerformed(evt);
            }
        });

        bOdbaci.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        bOdbaci.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectplanner/ikone/cancel.png"))); // NOI18N
        bOdbaci.setText("Odbaci");
        bOdbaci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bOdbaciActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lLozinka3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lLozinka2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lLozinka1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lLozinka, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lIme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfRadnoMjesto, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfPrezime, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tfKorisnickoIme, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                                    .addComponent(tfLozinka))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(tfIme, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bSacuvaj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bOdbaci)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lIme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfKorisnickoIme))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lLozinka, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfLozinka))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lLozinka1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfPrezime))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lLozinka2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfIme))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lLozinka3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfRadnoMjesto))
                .addGap(33, 33, 33)
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
        Administrator.kreirajNalog.setVisible(false);
    }//GEN-LAST:event_bOdbaciActionPerformed

    private void bSacuvajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSacuvajActionPerformed
        try {            
            if(ProjectPlanner.ispitajDuzinu(tfKorisnickoIme.getText(), 30) && 
                    ProjectPlanner.ispitajDuzinu(tfLozinka.getText(), 30) && 
                    ProjectPlanner.ispitajDuzinu(tfIme.getText(), 30) &&
                    ProjectPlanner.ispitajDuzinu(tfPrezime.getText(), 30) &&
                    ProjectPlanner.ispitajDuzinu(tfRadnoMjesto.getText(), 30)) {
                System.out.println("Usao u if.");
                ProjectPlanner.out.println("REGISTER#" 
                        + ProjectPlanner.ispitajDaLiImaApostrof(tfKorisnickoIme.getText())  +
                        "#" + ProjectPlanner.ispitajDaLiImaApostrof(tfLozinka.getText()) + "#" +
                        ProjectPlanner.ispitajDaLiImaApostrof(tfIme.getText())
                        + "#" + ProjectPlanner.ispitajDaLiImaApostrof(tfPrezime.getText())
                        + "#" + ProjectPlanner.ispitajDaLiImaApostrof(tfRadnoMjesto.getText()));
                System.out.println("Poslao porukuadmin  admin.");
                ProjectPlanner.poruka = ProjectPlanner.in.readLine();
                if(ProjectPlanner.poruka.equals("TACNO")) {                   
                    JOptionPane.showMessageDialog(null, "Nalog uspješno kreiran.",
                                        "Poruka", JOptionPane.INFORMATION_MESSAGE);
                    Login.administrator.listaNaloga();
                    Administrator.kreirajNalog.setVisible(false);                    
                } else if(ProjectPlanner.poruka.equals("NETACNO")) {
                    JOptionPane.showMessageDialog(null, "Korisničko ime je već zauzeto, unesite drugo!",
                                        "Poruka", JOptionPane.INFORMATION_MESSAGE);
                    tfKorisnickoIme.setText("");
                } else if(ProjectPlanner.poruka.equals("IZUZETAK")) 
                    throw new Exception();
            } else {                
                JOptionPane.showMessageDialog(null, "Maksimalan broj karaktera u svakom polju je 30,\npolja ne smiju biti prazna.\nISPRAVITE GREŠKU!",
                                        "Poruka", JOptionPane.INFORMATION_MESSAGE);
            }            
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
    private javax.swing.JLabel lLozinka1;
    private javax.swing.JLabel lLozinka2;
    private javax.swing.JLabel lLozinka3;
    private javax.swing.JTextField tfIme;
    private javax.swing.JTextField tfKorisnickoIme;
    private javax.swing.JTextField tfLozinka;
    private javax.swing.JTextField tfPrezime;
    private javax.swing.JTextField tfRadnoMjesto;
    // End of variables declaration//GEN-END:variables
}
