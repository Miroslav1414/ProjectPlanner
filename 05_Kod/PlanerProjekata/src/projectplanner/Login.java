package projectplanner;

import javax.swing.JOptionPane;

public class Login extends javax.swing.JDialog {
    static String korisnickoIme;
    static Administrator administrator;
    static Korisnik korisnik;

    public Login(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        getRootPane().setDefaultButton(bPrijaviSe);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lIme = new javax.swing.JLabel();
        lLozinka = new javax.swing.JLabel();
        tfIme = new javax.swing.JTextField();
        pfLozinka = new javax.swing.JPasswordField();
        bPrijaviSe = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Prijava");
        setBounds(new java.awt.Rectangle(500, 250, 0, 0));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        lIme.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lIme.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lIme.setText("Korisničko ime:");
        lIme.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lIme.setName(""); // NOI18N

        lLozinka.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lLozinka.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lLozinka.setText("Lozinka:");
        lLozinka.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lLozinka.setName(""); // NOI18N

        tfIme.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        bPrijaviSe.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bPrijaviSe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectplanner/ikone/login.png"))); // NOI18N
        bPrijaviSe.setText("Prijavi se");
        bPrijaviSe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPrijaviSeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lIme, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfIme, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lLozinka, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(pfLozinka)))
                    .addComponent(bPrijaviSe))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfIme)
                    .addComponent(lIme, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lLozinka, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(pfLozinka))
                .addGap(18, 18, 18)
                .addComponent(bPrijaviSe)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 381, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 248, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bPrijaviSeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPrijaviSeActionPerformed
        try {
            String sifra = "";            
            for(char c:pfLozinka.getPassword()) {
                sifra += c;
            }
            korisnickoIme = tfIme.getText();                        
            if (ProjectPlanner.ispitajDuzinu(sifra, 30) && ProjectPlanner.ispitajDuzinu(korisnickoIme, 30)) {
                ProjectPlanner.out.println("LOGIN#" + tfIme.getText() + "#" + sifra);
                ProjectPlanner.poruka = ProjectPlanner.in.readLine();
                if (ProjectPlanner.poruka.equals("ADMIN")) {
                    setVisible(false);
                    java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                            administrator = new Administrator();
                            administrator.listaNaloga();
                            administrator.listaProjekata();
                            administrator.setVisible(true);
                        }
                    });
                } else if (ProjectPlanner.poruka.startsWith("KORISNIK")) {
                    setVisible(false);
                    String ime = ProjectPlanner.poruka.split("#")[1];
                    String prezime = ProjectPlanner.poruka.split("#")[2];
                    String radnoMjesto = ProjectPlanner.poruka.split("#")[3];
                    java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                            korisnik = new Korisnik(ime, prezime, radnoMjesto);
                            korisnik.listaProjekata();
                            korisnik.setVisible(true);
                        }
                    });
                } else if (ProjectPlanner.poruka.equals("DEAKTIVIRAN_NALOG")) {
                    JOptionPane.showMessageDialog(null, "Vaš nalog je deaktiviran!",
                            "Poruka", JOptionPane.INFORMATION_MESSAGE);
                } else if (ProjectPlanner.poruka.equals("GRESKA_UNOSA")) {
                    JOptionPane.showMessageDialog(null, "Niste unijeli tačne podatke!",
                            "Poruka", JOptionPane.INFORMATION_MESSAGE);
                } else if (ProjectPlanner.poruka.equals("IZUZETAK")) {
                    throw new Exception();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Niste unijeli tačne podatke!",
                            "Poruka", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch(Exception e){            
            JOptionPane.showMessageDialog(null, "Došlo je do greške!",
                                      "Poruka", JOptionPane.INFORMATION_MESSAGE);
            ProjectPlanner.kraj();
        }
    }//GEN-LAST:event_bPrijaviSeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bPrijaviSe;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lIme;
    private javax.swing.JLabel lLozinka;
    private javax.swing.JPasswordField pfLozinka;
    private javax.swing.JTextField tfIme;
    // End of variables declaration//GEN-END:variables
}
