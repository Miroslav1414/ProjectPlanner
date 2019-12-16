package projectplanner;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Korisnik extends javax.swing.JFrame {
    static ArrayList<String> listaIdProjekta = new ArrayList<String>();
    static ArrayList<String> listaNazivProjekta = new ArrayList<String>();
    static ArrayList<String> listaOpis = new ArrayList<String>();
    static ArrayList<String> listaUloga = new ArrayList<String>();
    static Sef sef;
    static Nadzor nadzor;
    static Radnik radnik;  
    static Lozinka lozinka;
    
    public Korisnik(String ime, String prezime, String radnoMjesto) {
        initComponents();
        tfImePrezime.setText(ime + " " + prezime);
        tfRadnoMjesto.setText(radnoMjesto);
    }

        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taOpis = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        tfImePrezime = new javax.swing.JTextField();
        tfRadnoMjesto = new javax.swing.JTextField();
        bPrikaziProjekat = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tProjekti = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Project Planner Korisnik");
        setBounds(new java.awt.Rectangle(150, 150, 0, 0));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        taOpis.setEditable(false);
        taOpis.setColumns(20);
        taOpis.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        taOpis.setLineWrap(true);
        taOpis.setRows(5);
        taOpis.setWrapStyleWord(true);
        jScrollPane2.setViewportView(taOpis);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Prijavljen kao:");

        tfImePrezime.setEditable(false);
        tfImePrezime.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tfImePrezime.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfImePrezime.setText("Ime Prezime");

        tfRadnoMjesto.setEditable(false);
        tfRadnoMjesto.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tfRadnoMjesto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfRadnoMjesto.setText("zanimanje");

        bPrikaziProjekat.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bPrikaziProjekat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectplanner/ikone/prikazi icon.png"))); // NOI18N
        bPrikaziProjekat.setText("Prikaži projekat");
        bPrikaziProjekat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPrikaziProjekatActionPerformed(evt);
            }
        });

        tProjekti.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tProjekti.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {""},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Lista mojih projekata:"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tProjekti.setGridColor(new java.awt.Color(0, 51, 153));
        tProjekti.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tProjekti.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tProjektiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tProjekti);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectplanner/ikone/login.png"))); // NOI18N
        jButton1.setText("Promjeni lozinku");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                            .addComponent(tfRadnoMjesto, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfImePrezime, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bPrikaziProjekat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfImePrezime))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bPrikaziProjekat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfRadnoMjesto))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bPrikaziProjekatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPrikaziProjekatActionPerformed
        if(listaUloga.get(tProjekti.getSelectedRow()).equals("nadzor")) {
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    Login.korisnik.setEnabled(false);
                    nadzor = new Nadzor();
                    nadzor.setVisible(true);
                }
            });
        } else if(listaUloga.get(tProjekti.getSelectedRow()).equals("sef")){
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login.korisnik.setEnabled(false);
                sef = new Sef();
                sef.prikaziProjekat();
                sef.setVisible(true);
            }
        });
        } else if(listaUloga.get(tProjekti.getSelectedRow()).equals("radnik")){
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login.korisnik.setEnabled(false);
                radnik = new Radnik();
                radnik.setVisible(true);
            }
        });
        }
    }//GEN-LAST:event_bPrikaziProjekatActionPerformed

    private void tProjektiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tProjektiMouseClicked
        taOpis.setText(listaOpis.get(tProjekti.getSelectedRow()) + "\nMOJA ULOGA NA PROJEKTU JE:\n" +
                listaUloga.get(tProjekti.getSelectedRow()));
        tProjekti.setToolTipText(listaNazivProjekta.get(tProjekti.getSelectedRow()));
    }//GEN-LAST:event_tProjektiMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        ProjectPlanner.kraj();
    }//GEN-LAST:event_formWindowClosing

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                lozinka = new Lozinka(new javax.swing.JFrame(), true);
                lozinka.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        lozinka.setVisible(false);
                    }
                });
                lozinka.setVisible(true);
            }
        });
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bPrikaziProjekat;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tProjekti;
    private javax.swing.JTextArea taOpis;
    private javax.swing.JTextField tfImePrezime;
    private javax.swing.JTextField tfRadnoMjesto;
    // End of variables declaration//GEN-END:variables
    public void listaProjekata() {
        try {
            ProjectPlanner.out.println("LISTA_PROJEKATA#" + Login.korisnickoIme);
            listaIdProjekta = new ArrayList<String>();
            listaNazivProjekta = new ArrayList<String>();
            listaOpis = new ArrayList<String>();
            listaUloga = new ArrayList<String>();
            while(!(ProjectPlanner.poruka = ProjectPlanner.in.readLine()).equals("KRAJ_PROJEKATA")) {
                System.out.println(ProjectPlanner.poruka);
                if(ProjectPlanner.poruka.equals("IZUZETAK"))
                    throw new Exception();
                listaNazivProjekta.add(ProjectPlanner.poruka.split("#")[1]);
                listaIdProjekta.add(ProjectPlanner.poruka.split("#")[0]);
                listaOpis.add(ProjectPlanner.poruka.split("#")[2]);
                listaUloga.add(ProjectPlanner.poruka.split("#")[3]);
            }
            String matrica[][] = new String[listaNazivProjekta.size()][1];
            for(int i=0;i<matrica.length;i++)
                matrica[i][0] = new String();
            for(int i=0;i<matrica.length;i++)
                matrica[i][0] = listaNazivProjekta.get(i);
            Object m[][] = matrica;
            tProjekti.setModel(new javax.swing.table.DefaultTableModel(                    
                m,
                new String [] {
                "LISTA MOJIH PROJEKATA:"
                }
                ) {
                Class[] types = new Class [] {
                java.lang.String.class
                };
                boolean[] canEdit = new boolean [] {
                false
                };
                
                public Class getColumnClass(int columnIndex) {
                    return types [columnIndex];
                }

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }
            });
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Došlo je do greške!",
                                      "Poruka", JOptionPane.INFORMATION_MESSAGE);
            e.printStackTrace();
        }
    }

    public int getSelectedRowTProjekti() {
        return tProjekti.getSelectedRow();
    }
}
