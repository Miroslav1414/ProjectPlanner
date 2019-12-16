package projectplanner;

import javax.swing.JOptionPane;

public class NoviProjekat extends javax.swing.JDialog {

    public NoviProjekat(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        String niz[] = new String[Administrator.listaKorisnickoIme.size()];
        for(int i=0;i<Administrator.listaKorisnickoIme.size();i++) {
            niz[i] = Administrator.listaIme.get(i) + " " +
                    Administrator.listaPrezime.get(i) + " (";
            niz[i] += Administrator.listaKorisnickoIme.get(i)  + ")";            
        }
        cbSef.setModel(new javax.swing.DefaultComboBoxModel<>(niz));
        cbNadzor.setModel(new javax.swing.DefaultComboBoxModel<>(niz));
    }

        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfNazivProjekta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taOpisProjekta = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        cbSef = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cbNadzor = new javax.swing.JComboBox<>();
        bSacuvaj = new javax.swing.JButton();
        bOdbaci = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Kreiraj projekat");
        setBounds(new java.awt.Rectangle(150, 150, 0, 0));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Unesite naziv projekta:");

        tfNazivProjekta.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Unesite detaljan opis projekta:");

        taOpisProjekta.setColumns(20);
        taOpisProjekta.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        taOpisProjekta.setRows(5);
        taOpisProjekta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                taOpisProjektaKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(taOpisProjekta);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Postavi šefa:");

        cbSef.setEditable(true);
        cbSef.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Postavi nadzor:");

        cbNadzor.setEditable(true);
        cbNadzor.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        bSacuvaj.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        bSacuvaj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectplanner/ikone/save.png"))); // NOI18N
        bSacuvaj.setText("Sačuvaj");
        bSacuvaj.setEnabled(false);
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
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNazivProjekta))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(cbSef, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbNadzor, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 286, Short.MAX_VALUE))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfNazivProjekta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbSef, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbNadzor, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bSacuvajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSacuvajActionPerformed
        try {            
            if(cbSef.getSelectedIndex()<0 || cbNadzor.getSelectedIndex()<0) {
                JOptionPane.showMessageDialog(null, "Izaberite sefa i nadzor!",
                                        "Poruka", JOptionPane.INFORMATION_MESSAGE);
                return;
            }                
            if(ProjectPlanner.ispitajDuzinu(tfNazivProjekta.getText(), 500)) {
                ProjectPlanner.out.println("KREIRAJ_PROJEKAT#" + 
                        ProjectPlanner.ispitajDaLiImaApostrof(tfNazivProjekta.getText()) + "#" + Login.korisnickoIme + "#" + 
                        Administrator.listaKorisnickoIme.get(cbSef.getSelectedIndex()) + "#" +
                        Administrator.listaKorisnickoIme.get(cbNadzor.getSelectedIndex()) + "#" +
                        ProjectPlanner.ispitajDaLiImaApostrof(taOpisProjekta.getText()));
                if(ProjectPlanner.in.readLine().equals("TACNO")) {
                    JOptionPane.showMessageDialog(null, "Projekat uspješno kreiran.",
                                        "Poruka", JOptionPane.INFORMATION_MESSAGE);
                    Login.administrator.listaProjekata();
                    Administrator.noviProjekat.setVisible(false);
                } else                 
                    throw new Exception();
            } else
                JOptionPane.showMessageDialog(null, "Maksimalan broj karaktera u polju <<naziv projekta>> je 500,\npolje ne smije biti prazno.\nISPRAVITE GREŠKU!",
                                        "Poruka", JOptionPane.INFORMATION_MESSAGE);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Došlo je do greške!",
                                      "Poruka", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_bSacuvajActionPerformed

    private void bOdbaciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bOdbaciActionPerformed
        Administrator.noviProjekat.setVisible(false);
    }//GEN-LAST:event_bOdbaciActionPerformed

    private void taOpisProjektaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_taOpisProjektaKeyTyped
        bSacuvaj.setEnabled(true);
    }//GEN-LAST:event_taOpisProjektaKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bOdbaci;
    private javax.swing.JButton bSacuvaj;
    private javax.swing.JComboBox<String> cbNadzor;
    private javax.swing.JComboBox<String> cbSef;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea taOpisProjekta;
    private javax.swing.JTextField tfNazivProjekta;
    // End of variables declaration//GEN-END:variables
}
