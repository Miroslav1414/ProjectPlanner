package projectplanner;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import projectplanner.klase.Podcjelina;

public class DodajPodcjelinu extends javax.swing.JDialog {    
    private ArrayList<String> listaAktivnosti;
    private ArrayList<String> listaIme;
    private ArrayList<String> listaPrezime;
    private ArrayList<String> listaKorisnickoIme;
    private ArrayList<String> listaUcesnika;
    private String naziviNadcjelina[];

    public DodajPodcjelinu(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        listaAktivnosti = new ArrayList<String>();
        listaIme = new ArrayList<String>();
        listaPrezime = new ArrayList<String>();
        listaKorisnickoIme = new ArrayList<String>();
        listaUcesnika = new ArrayList<String>();        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        tfVremenskiRok = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        tfNazivPodcjeline = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cbRoditeljskaPodcjelina = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        tfRadniCasovi = new javax.swing.JTextField();
        bOdbaci = new javax.swing.JButton();
        bSacuvaj = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tZaposleni = new javax.swing.JTable();
        bDodajUcesnika = new javax.swing.JButton();
        bUkloniUcesnika = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tUcesnici = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tAktivnosti = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        tfNazivAktivnosti = new javax.swing.JTextField();
        bDodajAktivnost = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Dodaj podcjelinu");
        setBounds(new java.awt.Rectangle(150, 150, 0, 0));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel14.setText("Vremenski rok:");

        tfVremenskiRok.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tfVremenskiRok.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfVremenskiRok.setText("dd.mm.gggg.");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel15.setText("Naziv podcjeline:");

        tfNazivPodcjeline.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tfNazivPodcjeline.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Podcjelina od:");

        cbRoditeljskaPodcjelina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NEZAVISNA PODCJELINA", "podcjelina 1", "podcjelina 2", "podcjelina 3", "podcjelina 4" }));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Predvidjen broj radnih časova:");

        tfRadniCasovi.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tfRadniCasovi.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

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

        tZaposleni.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tZaposleni.setModel(new javax.swing.table.DefaultTableModel(
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
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Lista svih zaposlenih:"
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
        tZaposleni.setGridColor(new java.awt.Color(0, 0, 153));
        tZaposleni.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tZaposleni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tZaposleniMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tZaposleni);

        bDodajUcesnika.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        bDodajUcesnika.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectplanner/ikone/plus mini.png"))); // NOI18N
        bDodajUcesnika.setText("Dodaj učesnika");
        bDodajUcesnika.setEnabled(false);
        bDodajUcesnika.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDodajUcesnikaActionPerformed(evt);
            }
        });

        bUkloniUcesnika.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        bUkloniUcesnika.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectplanner/ikone/minus mini.png"))); // NOI18N
        bUkloniUcesnika.setText("Ukloni učesnika");
        bUkloniUcesnika.setEnabled(false);
        bUkloniUcesnika.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUkloniUcesnikaActionPerformed(evt);
            }
        });

        tUcesnici.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tUcesnici.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Lista izabranih učesnika:"
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
        tUcesnici.setGridColor(new java.awt.Color(0, 0, 153));
        tUcesnici.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tUcesnici.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tUcesniciMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tUcesnici);

        tAktivnosti.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tAktivnosti.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Lista aktivnosti:"
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
        tAktivnosti.setGridColor(new java.awt.Color(0, 0, 153));
        tAktivnosti.setRowSelectionAllowed(false);
        tAktivnosti.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(tAktivnosti);

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel16.setText("Naziv aktivnosti:");

        tfNazivAktivnosti.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tfNazivAktivnosti.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        bDodajAktivnost.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        bDodajAktivnost.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectplanner/ikone/plus mini.png"))); // NOI18N
        bDodajAktivnost.setText("Dodaj aktivnost");
        bDodajAktivnost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDodajAktivnostActionPerformed(evt);
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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bDodajUcesnika, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bUkloniUcesnika, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfVremenskiRok, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNazivPodcjeline, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbRoditeljskaPodcjelina, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfRadniCasovi))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 228, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bDodajAktivnost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tfNazivAktivnosti))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bOdbaci, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bSacuvaj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(tfNazivPodcjeline, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(cbRoditeljskaPodcjelina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(tfVremenskiRok, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(tfRadniCasovi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(bDodajUcesnika)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bUkloniUcesnika))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bOdbaci)
                            .addComponent(tfNazivAktivnosti, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bSacuvaj)
                            .addComponent(bDodajAktivnost)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
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

    private void bDodajUcesnikaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDodajUcesnikaActionPerformed
        listaUcesnika.add(listaIme.get(tZaposleni.getSelectedRow()) + " " + listaPrezime.get(tZaposleni.getSelectedRow()) +
                " (" + listaKorisnickoIme.get(tZaposleni.getSelectedRow()) + ")");
        listaKorisnickoIme.remove(tZaposleni.getSelectedRow());
        listaIme.remove(tZaposleni.getSelectedRow());
        listaPrezime.remove(tZaposleni.getSelectedRow());
        String matrica[][] = new String[listaKorisnickoIme.size()][1];
            for(int i=0;i<matrica.length;i++)
                matrica[i][0] = new String();
            for(int i=0;i<matrica.length;i++)
                matrica[i][0] = listaIme.get(i) + " " + listaPrezime.get(i) + " (" + listaKorisnickoIme.get(i) + ")";
            Object m[][] = matrica;
            tZaposleni.setModel(new javax.swing.table.DefaultTableModel(                    
                m,
                new String [] {
                "LISTA SVIH ZAPOSLENIH:"
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
        matrica = new String[listaUcesnika.size()][1];
        for(int i=0;i<matrica.length;i++)
            matrica[i][0] = new String();
        for(int i=0;i<matrica.length;i++)
            matrica[i][0] = listaUcesnika.get(i);
        m = matrica;
        tUcesnici.setModel(new javax.swing.table.DefaultTableModel(                    
            m,
            new String [] {
            "LISTA IZABRANIH UČESNIKA:"
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
    }//GEN-LAST:event_bDodajUcesnikaActionPerformed

    private void bUkloniUcesnikaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUkloniUcesnikaActionPerformed
        listaIme.add(listaUcesnika.get(tUcesnici.getSelectedRow()).split(" ")[0]);
        listaPrezime.add(listaUcesnika.get(tUcesnici.getSelectedRow()).split(" ")[1]);
        listaKorisnickoIme.add(listaUcesnika.get(tUcesnici.getSelectedRow()).split("[(]")[1].replaceFirst("[)]", ""));
        listaUcesnika.remove(tUcesnici.getSelectedRow());
        String matrica[][] = new String[listaKorisnickoIme.size()][1];
            for(int i=0;i<matrica.length;i++)
                matrica[i][0] = new String();
            for(int i=0;i<matrica.length;i++)
                matrica[i][0] = listaIme.get(i) + " " + listaPrezime.get(i) + " (" + listaKorisnickoIme.get(i) + ")";
            Object m[][] = matrica;
            tZaposleni.setModel(new javax.swing.table.DefaultTableModel(                    
                m,
                new String [] {
                "LISTA SVIH ZAPOSLENIH:"
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
        matrica = new String[listaUcesnika.size()][1];
        for(int i=0;i<matrica.length;i++)
            matrica[i][0] = new String();
        for(int i=0;i<matrica.length;i++)
            matrica[i][0] = listaUcesnika.get(i);
        m = matrica;
        tUcesnici.setModel(new javax.swing.table.DefaultTableModel(                    
            m,
            new String [] {
            "LISTA IZABRANIH UČESNIKA:"
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
    }//GEN-LAST:event_bUkloniUcesnikaActionPerformed

    private void bOdbaciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bOdbaciActionPerformed
        Sef.dodajPodcjelinu.setVisible(false);
    }//GEN-LAST:event_bOdbaciActionPerformed

    private void bDodajAktivnostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDodajAktivnostActionPerformed
        if(tfNazivAktivnosti.getText().trim().length()<1) {
            JOptionPane.showMessageDialog(null, "Unesite naziv aktivnosti!",
                                      "Poruka", JOptionPane.INFORMATION_MESSAGE);
            return;            
        }
        listaAktivnosti.add(tfNazivAktivnosti.getText().trim());
        String matrica[][] = new String[listaAktivnosti.size()][1];
        for(int i=0;i<matrica.length;i++)
            matrica[i][0] = new String();
        for(int i=0;i<matrica.length;i++)
            matrica[i][0] = listaAktivnosti.get(i);
        Object m[][] = matrica;
        tAktivnosti.setModel(new javax.swing.table.DefaultTableModel(                    
            m,
            new String [] {
            "LISTA AKTIVNOSTI:"
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
    }//GEN-LAST:event_bDodajAktivnostActionPerformed

    private void tZaposleniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tZaposleniMouseClicked
        bDodajUcesnika.setEnabled(true);
        tZaposleni.setToolTipText(listaIme.get(tZaposleni.getSelectedRow()) + " " + listaPrezime.get(tZaposleni.getSelectedRow()) +
                " (" + listaKorisnickoIme.get(tZaposleni.getSelectedRow()) + ")");
    }//GEN-LAST:event_tZaposleniMouseClicked

    private void tUcesniciMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tUcesniciMouseClicked
        bUkloniUcesnika.setEnabled(true);
        tUcesnici.setToolTipText(listaUcesnika.get(tUcesnici.getSelectedRow()));
    }//GEN-LAST:event_tUcesniciMouseClicked

    private void bSacuvajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSacuvajActionPerformed
        String naziv = "";
        String vremenskiRok = "";
        String casovi = "";
        String idNadcjeline = "";
        if(((String)cbRoditeljskaPodcjelina.getSelectedItem()).equals("NEZAVISNA PODCJELINA"))
            idNadcjeline = "NULL";        
        else {
            System.out.println((String)cbRoditeljskaPodcjelina.getSelectedItem());
            for(Podcjelina podcjelina: Sef.projekat.getListaPodcjeline()) {
                if(((String)cbRoditeljskaPodcjelina.getSelectedItem()).equals(podcjelina.getNazivPodcjeline())) {
                    idNadcjeline += podcjelina.getIdPodcjeline();
                    System.out.println("USAO U IF");
                    System.out.println(podcjelina.getIdPodcjeline());
                }
            }
        }
        if((naziv = tfNazivPodcjeline.getText().trim()).length()<1) {
            JOptionPane.showMessageDialog(null, "Niste uneli naziv podcjeline!",
                                      "Poruka", JOptionPane.INFORMATION_MESSAGE);
            return;
        }      
        if((vremenskiRok = tfVremenskiRok.getText().trim()).length()<1) {
            JOptionPane.showMessageDialog(null, "Niste uneli vremenski rok!",
                                      "Poruka", JOptionPane.INFORMATION_MESSAGE);
            return;
        } 
        if((casovi = tfRadniCasovi.getText().trim()).length()<1) {
            JOptionPane.showMessageDialog(null, "Niste uneli broj radnih časova!",
                                      "Poruka", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        Sef.idZadnjeCjeline++;
        for(int i=0;i<listaUcesnika.size();i++) {
            try {                
                ProjectPlanner.out.println("KREIRAJ_CJELINU#" + Sef.projekat.getIdProjekta() + "#" +
                        listaUcesnika.get(i).split("[(]")[1].split("[)]")[0] + "#" +
                        naziv + "#" + idNadcjeline + "#" + vremenskiRok + "#" + casovi + "#" + Sef.idZadnjeCjeline);
                System.out.println(ProjectPlanner.in.readLine());                
                ProjectPlanner.odgovor = "";
                for(int j=0;j<listaAktivnosti.size();j++)
                    ProjectPlanner.odgovor += listaAktivnosti.get(j) + "#";                
                ProjectPlanner.out.println(ProjectPlanner.odgovor);
                System.out.println(ProjectPlanner.odgovor);
                System.out.println(ProjectPlanner.in.readLine());
                if (ProjectPlanner.poruka.equals("IZUZETAK") || ProjectPlanner.poruka.equals("GRESKA")) {
                    throw new Exception();
                }                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Došlo je do greške!",
                                      "Poruka", JOptionPane.INFORMATION_MESSAGE);
                e.printStackTrace();
            }
        }
        JOptionPane.showMessageDialog(null, "Uspješno ste dodali podcjelinu.",
                        "Poruka", JOptionPane.INFORMATION_MESSAGE);
        Korisnik.sef.prikaziProjekat();
        Korisnik.sef.prikaziProjekat();
        Sef.dodajPodcjelinu.setVisible(false);       
    }//GEN-LAST:event_bSacuvajActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bDodajAktivnost;
    private javax.swing.JButton bDodajUcesnika;
    private javax.swing.JButton bOdbaci;
    private javax.swing.JButton bSacuvaj;
    private javax.swing.JButton bUkloniUcesnika;
    private javax.swing.JComboBox<String> cbRoditeljskaPodcjelina;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tAktivnosti;
    private javax.swing.JTable tUcesnici;
    private javax.swing.JTable tZaposleni;
    private javax.swing.JTextField tfNazivAktivnosti;
    private javax.swing.JTextField tfNazivPodcjeline;
    private javax.swing.JTextField tfRadniCasovi;
    private javax.swing.JTextField tfVremenskiRok;
    // End of variables declaration//GEN-END:variables
    public void listaNaloga() {
        try {
            ProjectPlanner.out.println("LISTA_NALOGA");
            listaKorisnickoIme = new ArrayList<String>();
            listaIme = new ArrayList<String>();
            listaPrezime = new ArrayList<String>();
            while(!(ProjectPlanner.poruka = ProjectPlanner.in.readLine()).equals("KRAJ_NALOGA")) {
                if(ProjectPlanner.poruka.equals("IZUZETAK"))
                    throw new Exception();
                listaKorisnickoIme.add(ProjectPlanner.poruka.split("#")[0]);
                listaIme.add(ProjectPlanner.poruka.split("#")[1]);
                listaPrezime.add(ProjectPlanner.poruka.split("#")[2]);
            }
            String matrica[][] = new String[listaKorisnickoIme.size()][1];
            for(int i=0;i<matrica.length;i++)
                matrica[i][0] = new String();
            for(int i=0;i<matrica.length;i++)
                matrica[i][0] = listaIme.get(i) + " " + listaPrezime.get(i) + " (" + listaKorisnickoIme.get(i) + ")";
            Object m[][] = matrica;
            tZaposleni.setModel(new javax.swing.table.DefaultTableModel(                    
                m,
                new String [] {
                "LISTA SVIH ZAPOSLENIH:"
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
        }
    }

    public void dodajMoguceRoditeljeskePodcjeline() {
        naziviNadcjelina = new String[Sef.projekat.getListaPodcjeline().size()+1];
        naziviNadcjelina[0] = "NEZAVISNA PODCJELINA";
        for(int i=1;i<naziviNadcjelina.length;i++) 
            naziviNadcjelina[i] = Sef.projekat.getPodcjeline(i-1).getNazivPodcjeline();        
        cbRoditeljskaPodcjelina.setModel(new javax.swing.DefaultComboBoxModel<>(naziviNadcjelina));
    }
}
