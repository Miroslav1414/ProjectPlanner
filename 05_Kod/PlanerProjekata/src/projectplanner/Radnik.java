package projectplanner;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import static projectplanner.Korisnik.listaIdProjekta;
import static projectplanner.Korisnik.listaNazivProjekta;
import projectplanner.klase.KorisnickiNalog;
import projectplanner.klase.Projekat;

public class Radnik extends javax.swing.JFrame {
    private static Projekat projekat;
    private static String procenatIzvrstenosti;
    private static ArrayList<String>listaAktivnosti = new ArrayList<String>();;
    private static ArrayList<String>listaPoruka = new ArrayList<String>();;
    
    public Radnik() {
        initComponents();
        try {
            projekat = new Projekat();
            projekat.setIdProjekta(listaIdProjekta.get(Login.korisnik.getSelectedRowTProjekti()));
            projekat.setNaziv(listaNazivProjekta.get(Login.korisnik.getSelectedRowTProjekti()));
            ProjectPlanner.out.println("PRIKAZI_PROJEKAT#" + Login.korisnickoIme + "#"
                    + listaIdProjekta.get(Login.korisnik.getSelectedRowTProjekti()));
            ProjectPlanner.poruka = ProjectPlanner.in.readLine();
            System.out.println(ProjectPlanner.poruka);
            if(ProjectPlanner.poruka.equals("IZUZETAK"))
                throw new Exception();
            projekat.setOpis(ProjectPlanner.poruka.split("#")[0]);
            taOpis.setText(ProjectPlanner.poruka.split("#")[0]);
            projekat.setSef(ProjectPlanner.poruka.split("#")[1] + " " + ProjectPlanner.poruka.split("#")[2]);
            tfSef.setText(ProjectPlanner.poruka.split("#")[1] + " " + ProjectPlanner.poruka.split("#")[2]);
            projekat.setNadzor(ProjectPlanner.poruka.split("#")[3] + " " + ProjectPlanner.poruka.split("#")[4]);
            tfNadzor.setText(ProjectPlanner.poruka.split("#")[3] + " " + ProjectPlanner.poruka.split("#")[4]);
            ProjectPlanner.out.println("PRIMIO_PODATKE");
            while(!(ProjectPlanner.poruka = ProjectPlanner.in.readLine()).equals("KRAJ_UCESNIKA")) {
                System.out.println(ProjectPlanner.poruka);
                if(ProjectPlanner.poruka.equals("IZUZETAK"))
                    throw new Exception();
                KorisnickiNalog ucesnik = new KorisnickiNalog();
                ucesnik.setIme(ProjectPlanner.poruka.split("#")[0]);
                ucesnik.setPrezime(ProjectPlanner.poruka.split("#")[1]);
                ucesnik.setKorisnickoIme(ProjectPlanner.poruka.split("#")[2]);
                ucesnik.setRadnoMjesto(ProjectPlanner.poruka.split("#")[3]);
                projekat.setUcesnici(ucesnik);
            }
            System.out.println("PRIMIO_UCESNIKE");
            ProjectPlanner.out.println("PRIMIO_UCESNIKE");
            String matrica[][] = new String[projekat.getListaUcesnici().size()][1];
            for(int i=0;i<matrica.length;i++)
                matrica[i][0] = new String();
            for(int i=0;i<matrica.length;i++)
                matrica[i][0] = projekat.getUcesnici(i).getIme() + " " + projekat.getUcesnici(i).getPrezime() + 
                        " (" + projekat.getUcesnici(i).getRadnoMjesto() + ")";
            Object m[][] = matrica;
            tUcesniciNaProjektu.setModel(new javax.swing.table.DefaultTableModel(                    
                m,
                new String [] {
                "UČESNICI NA PROJEKTU:"
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
            ProjectPlanner.poruka = ProjectPlanner.in.readLine();
            System.out.println(ProjectPlanner.poruka);
            if(ProjectPlanner.poruka.equals("IZUZETAK"))
                throw new Exception();
            procenatIzvrstenosti = ProjectPlanner.poruka;
            pbProcenatIzvrsenosti.setValue(Integer.parseInt(procenatIzvrstenosti));
            lProcenatIzvrsenosti.setText(procenatIzvrstenosti + " %");
            ProjectPlanner.out.println("PRIMIO_PROCENAT");
            listaAktivnosti = new ArrayList<String>();
            while(!(ProjectPlanner.poruka = ProjectPlanner.in.readLine()).equals("KRAJ_AKTIVNOSTI")) {
                if(ProjectPlanner.poruka.equals("IZUZETAK"))
                    throw new Exception();
                listaAktivnosti.add(ProjectPlanner.poruka);
                System.out.println(ProjectPlanner.poruka);
            }
            ProjectPlanner.out.println("PRIMIO_AKTIVNOSTI");
            System.out.println("PRIMIO_AKTIVNOSTI");
            matrica = new String[listaAktivnosti.size()][1];
            for(int i=0;i<matrica.length;i++)
                matrica[i][0] = new String();
            for(int i=0;i<matrica.length;i++)
                matrica[i][0] = listaAktivnosti.get(i).split("#")[1];
            m = matrica;
            tMojiZadaci.setModel(new javax.swing.table.DefaultTableModel(                    
                m,
                new String [] {
                "MOJI ZADACI:"
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
            while(!(ProjectPlanner.poruka = ProjectPlanner.in.readLine()).equals("KRAJ_PORUKA")) {
                System.out.println(ProjectPlanner.poruka);
                if(ProjectPlanner.poruka.equals("IZUZETAK"))
                    throw new Exception();
                listaPoruka.add(ProjectPlanner.poruka);
            }
            ProjectPlanner.out.println("PRIMIO_PORUKE");
            System.out.println("PRIMIO_PORUKE");
            if(listaPoruka.size()>0) {
                bPrikaziPoruku.setEnabled(true);
                tfBrojPoruka.setText("Novih poruka: " + listaPoruka.size());
            } else
                tfBrojPoruka.setText("Nemate poruka.");
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Došlo je do greške!",
                    "Poruka", JOptionPane.INFORMATION_MESSAGE);
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        tfBrojRadnihSati = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taPoruka = new javax.swing.JTextArea();
        bPosalji = new javax.swing.JButton();
        bPrikaziPoruku = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tMojiZadaci = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        tfBrojPoruka = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taOpis = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        pbProcenatIzvrsenosti = new javax.swing.JProgressBar();
        lProcenatIzvrsenosti = new javax.swing.JLabel();
        tfSef = new javax.swing.JTextField();
        tfNadzor = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tUcesniciNaProjektu = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Project Planner Radnik");
        setBounds(new java.awt.Rectangle(150, 150, 0, 0));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel16.setText("Izvještaj:");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel17.setText("Broj radnih sati:");

        tfBrojRadnihSati.setBackground(new java.awt.Color(204, 204, 255));
        tfBrojRadnihSati.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tfBrojRadnihSati.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel18.setText("Poruka za šefa:");

        taPoruka.setColumns(20);
        taPoruka.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        taPoruka.setLineWrap(true);
        taPoruka.setRows(5);
        taPoruka.setWrapStyleWord(true);
        jScrollPane1.setViewportView(taPoruka);

        bPosalji.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        bPosalji.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectplanner/ikone/send.png"))); // NOI18N
        bPosalji.setText("Pošalji");
        bPosalji.setEnabled(false);
        bPosalji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPosaljiActionPerformed(evt);
            }
        });

        bPrikaziPoruku.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        bPrikaziPoruku.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectplanner/ikone/imatePoruku.png"))); // NOI18N
        bPrikaziPoruku.setText("Prikaži poruku");
        bPrikaziPoruku.setEnabled(false);
        bPrikaziPoruku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPrikaziPorukuActionPerformed(evt);
            }
        });

        tMojiZadaci.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tMojiZadaci.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"aktivnost podcjeline u koju sam uključen"},
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
                "Moji zadaci:"
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
        tMojiZadaci.setGridColor(new java.awt.Color(0, 0, 153));
        tMojiZadaci.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tMojiZadaci.getTableHeader().setReorderingAllowed(false);
        tMojiZadaci.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tMojiZadaciMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tMojiZadaci);
        if (tMojiZadaci.getColumnModel().getColumnCount() > 0) {
            tMojiZadaci.getColumnModel().getColumn(0).setResizable(false);
        }

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectplanner/ikone/radnik.png"))); // NOI18N

        tfBrojPoruka.setEditable(false);
        tfBrojPoruka.setBackground(new java.awt.Color(204, 204, 255));
        tfBrojPoruka.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tfBrojPoruka.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfBrojRadnihSati, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel18)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bPosalji)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tfBrojPoruka, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(bPrikaziPoruku, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfBrojRadnihSati, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfBrojPoruka, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bPosalji, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bPrikaziPoruku, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        taOpis.setEditable(false);
        taOpis.setColumns(20);
        taOpis.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        taOpis.setLineWrap(true);
        taOpis.setRows(5);
        taOpis.setText("Opis projekta");
        taOpis.setWrapStyleWord(true);
        jScrollPane2.setViewportView(taOpis);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Nadzor na projektu:");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Šef na projektu:");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("Progres:");

        lProcenatIzvrsenosti.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lProcenatIzvrsenosti.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lProcenatIzvrsenosti.setText("??? %");

        tfSef.setEditable(false);
        tfSef.setBackground(new java.awt.Color(204, 204, 255));
        tfSef.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tfSef.setText("ime i prezime");

        tfNadzor.setEditable(false);
        tfNadzor.setBackground(new java.awt.Color(204, 204, 255));
        tfNadzor.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tfNadzor.setText("ime i prezime");

        tUcesniciNaProjektu.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tUcesniciNaProjektu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"ime prezime (zanimanje)"},
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
                "Učesnici na projektu:"
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
        tUcesniciNaProjektu.setGridColor(new java.awt.Color(0, 0, 153));
        tUcesniciNaProjektu.setRowSelectionAllowed(false);
        tUcesniciNaProjektu.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(tUcesniciNaProjektu);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfSef)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfNadzor))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pbProcenatIzvrsenosti, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lProcenatIzvrsenosti))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfSef, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfNadzor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 2, Short.MAX_VALUE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pbProcenatIzvrsenosti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lProcenatIzvrsenosti, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(19, 19, 19))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bPrikaziPorukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPrikaziPorukuActionPerformed
        JOptionPane.showMessageDialog(null, listaPoruka.get(0).split("#")[1],
                    "Poruka", JOptionPane.INFORMATION_MESSAGE);        
        ProjectPlanner.out.println("BRISI_PORUKU#" + listaPoruka.get(0).split("#")[0]);
        listaPoruka.remove(0);
        if(listaPoruka.size()>0) {
            bPrikaziPoruku.setEnabled(true);
            tfBrojPoruka.setText("Novih poruka: " + listaPoruka.size());
        }
        else {
            bPrikaziPoruku.setEnabled(false);
            tfBrojPoruka.setText("Nemate poruka.");
        }        
    }//GEN-LAST:event_bPrikaziPorukuActionPerformed

    private void bPosaljiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPosaljiActionPerformed
        String sati = "";
        String poruka = "";
        if(tfBrojRadnihSati.getText().trim().length()<1) {
            JOptionPane.showMessageDialog(null, "Niste uneli broj radnih sati!",
                    "Poruka", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        poruka += "Broj radnih sati: " + tfBrojRadnihSati.getText().trim();        
        if(taPoruka.getText().trim().length()<1) 
            poruka += "Poruka: Nema poruke.";
        else
            poruka += "               Poruka: " + taPoruka.getText().trim();
        ProjectPlanner.out.println("KREIRAJ_PORUKU_RADNIK#" + listaAktivnosti.get(tMojiZadaci.getSelectedRow()).split("#")[0] +
                "#" + poruka + "#" + Login.korisnickoIme);
        try {
            ProjectPlanner.poruka = ProjectPlanner.in.readLine();
            if(ProjectPlanner.poruka.equals("PORUKA_UPISANA")) {
                JOptionPane.showMessageDialog(null, "Poruka poslana.",
                    "Poruka", JOptionPane.INFORMATION_MESSAGE);
                tfBrojRadnihSati.setText("");
                taPoruka.setText("");
            }
            else
                throw new Exception();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Došlo je do greške!",
                    "Poruka", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_bPosaljiActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Korisnik.radnik.setVisible(false);
        Login.korisnik.setEnabled(true);
    }//GEN-LAST:event_formWindowClosing

    private void tMojiZadaciMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tMojiZadaciMouseClicked
        bPosalji.setEnabled(true);
    }//GEN-LAST:event_tMojiZadaciMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bPosalji;
    private javax.swing.JButton bPrikaziPoruku;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lProcenatIzvrsenosti;
    private javax.swing.JProgressBar pbProcenatIzvrsenosti;
    private javax.swing.JTable tMojiZadaci;
    private javax.swing.JTable tUcesniciNaProjektu;
    private javax.swing.JTextArea taOpis;
    private javax.swing.JTextArea taPoruka;
    private javax.swing.JTextField tfBrojPoruka;
    private javax.swing.JTextField tfBrojRadnihSati;
    private javax.swing.JTextField tfNadzor;
    private javax.swing.JTextField tfSef;
    // End of variables declaration//GEN-END:variables
}
