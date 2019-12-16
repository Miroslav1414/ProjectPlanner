package projectplanner;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import static projectplanner.Korisnik.listaIdProjekta;
import static projectplanner.Korisnik.listaNazivProjekta;
import projectplanner.klase.KorisnickiNalog;
import projectplanner.klase.Podcjelina;
import projectplanner.klase.Poruka;
import projectplanner.klase.Prihod;
import projectplanner.klase.Projekat;
import projectplanner.klase.Rashod;

public class Sef extends javax.swing.JFrame {
    static Finansije finansije;
    static DodajPodcjelinu dodajPodcjelinu;
    static Projekat projekat;
    static int idZadnjeCjeline;
    ArrayList<String> listaPodcjelina = new ArrayList<String>();;
    ArrayList<Poruka> listaPoruka = new ArrayList<Poruka>();;
    
    public Sef() {
        initComponents();        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        taIzvjestajRadnika = new javax.swing.JTextArea();
        cbDodajPoruku = new javax.swing.JCheckBox();
        jScrollPane12 = new javax.swing.JScrollPane();
        taPoruka = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        bKreirajPodcjelinu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        bRegulisiFinansije = new javax.swing.JButton();
        jScrollPane16 = new javax.swing.JScrollPane();
        tPristigliIzvjestajiRadnika = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfUnesiteSatnicu = new javax.swing.JTextField();
        bOdbaci = new javax.swing.JButton();
        bPotvrdi = new javax.swing.JButton();
        tpTabovi = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taOpis = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        pbProcenatIzvrsenosti = new javax.swing.JProgressBar();
        lProcenatIzvrsenosti = new javax.swing.JLabel();
        tfSef = new javax.swing.JTextField();
        tfNadzor = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tUcesniciNaProjektu = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        tfVremenskiRok = new javax.swing.JTextField();
        tfProcenatIzvrsenosti = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tUcesniciUPodcjelini = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tAktivnosti = new javax.swing.JTable();
        jScrollPane13 = new javax.swing.JScrollPane();
        tPodcjeline = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        taOpisPrihoda = new javax.swing.JTextArea();
        jLabel20 = new javax.swing.JLabel();
        tfIznosPrihoda = new javax.swing.JTextField();
        tfUkupnoPrihoda = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        tfDatumPrihoda = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tPrihodi = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane17 = new javax.swing.JScrollPane();
        taOpisRashoda = new javax.swing.JTextArea();
        jLabel21 = new javax.swing.JLabel();
        tfIznosRashoda = new javax.swing.JTextField();
        tfUkupnoRashoda = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tfDatumRashoda = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tRashodi = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        cbStanjeProjekta = new javax.swing.JCheckBox();
        cbFinansijskiPregled = new javax.swing.JCheckBox();
        cbPregledAktivnosti = new javax.swing.JCheckBox();
        bGenerisi = new javax.swing.JToggleButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        taIzvjestaj = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Project Planner Šef");
        setBounds(new java.awt.Rectangle(150, 150, 0, 0));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Izvještaj:");

        taIzvjestajRadnika.setEditable(false);
        taIzvjestajRadnika.setColumns(20);
        taIzvjestajRadnika.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        taIzvjestajRadnika.setLineWrap(true);
        taIzvjestajRadnika.setRows(5);
        taIzvjestajRadnika.setWrapStyleWord(true);
        jScrollPane6.setViewportView(taIzvjestajRadnika);

        cbDodajPoruku.setBackground(new java.awt.Color(204, 204, 255));
        cbDodajPoruku.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbDodajPoruku.setText("Dodaj poruku");
        cbDodajPoruku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDodajPorukuActionPerformed(evt);
            }
        });

        taPoruka.setBackground(new java.awt.Color(204, 204, 204));
        taPoruka.setColumns(20);
        taPoruka.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        taPoruka.setLineWrap(true);
        taPoruka.setRows(5);
        taPoruka.setWrapStyleWord(true);
        taPoruka.setEnabled(false);
        jScrollPane12.setViewportView(taPoruka);

        bKreirajPodcjelinu.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        bKreirajPodcjelinu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectplanner/ikone/plus mini.png"))); // NOI18N
        bKreirajPodcjelinu.setText("Kreiraj podcjelinu");
        bKreirajPodcjelinu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bKreirajPodcjelinuActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectplanner/ikone/radnik.png"))); // NOI18N

        bRegulisiFinansije.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        bRegulisiFinansije.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectplanner/ikone/money mini.png"))); // NOI18N
        bRegulisiFinansije.setText("Reguliši finansije");
        bRegulisiFinansije.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegulisiFinansijeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bKreirajPodcjelinu, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bRegulisiFinansije, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bRegulisiFinansije)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bKreirajPodcjelinu)
                .addContainerGap())
        );

        tPristigliIzvjestajiRadnika.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tPristigliIzvjestajiRadnika.setModel(new javax.swing.table.DefaultTableModel(
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
                "Pristigli izvještaji radnika:"
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
        tPristigliIzvjestajiRadnika.setGridColor(new java.awt.Color(0, 0, 153));
        tPristigliIzvjestajiRadnika.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tPristigliIzvjestajiRadnika.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tPristigliIzvjestajiRadnikaMouseClicked(evt);
            }
        });
        jScrollPane16.setViewportView(tPristigliIzvjestajiRadnika);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Poruka:");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Unesite satnicu:");

        tfUnesiteSatnicu.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tfUnesiteSatnicu.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        bOdbaci.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        bOdbaci.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectplanner/ikone/no mini.png"))); // NOI18N
        bOdbaci.setText("Odbaci");
        bOdbaci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bOdbaciActionPerformed(evt);
            }
        });

        bPotvrdi.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        bPotvrdi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectplanner/ikone/yes mini.png"))); // NOI18N
        bPotvrdi.setText("Potvrdi");
        bPotvrdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPotvrdiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(cbDodajPoruku, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfUnesiteSatnicu))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bPotvrdi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bOdbaci))
                    .addComponent(jScrollPane12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbDodajPoruku)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(tfUnesiteSatnicu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(bOdbaci)
                                    .addComponent(bPotvrdi))))))
                .addContainerGap())
        );

        tpTabovi.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        taOpis.setEditable(false);
        taOpis.setColumns(20);
        taOpis.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        taOpis.setLineWrap(true);
        taOpis.setRows(5);
        taOpis.setText("Niste izabrali nijedan projekat!");
        taOpis.setWrapStyleWord(true);
        jScrollPane2.setViewportView(taOpis);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("Nadzor na projektu:");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("Šef na projektu:");

        jLabel25.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel25.setText("Progres:");

        lProcenatIzvrsenosti.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lProcenatIzvrsenosti.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lProcenatIzvrsenosti.setText("??? %");

        tfSef.setEditable(false);
        tfSef.setBackground(new java.awt.Color(204, 204, 255));
        tfSef.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        tfNadzor.setEditable(false);
        tfNadzor.setBackground(new java.awt.Color(204, 204, 255));
        tfNadzor.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tUcesniciNaProjektu.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tUcesniciNaProjektu.setModel(new javax.swing.table.DefaultTableModel(
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
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfNadzor))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pbProcenatIzvrsenosti, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
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
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfSef, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfNadzor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 2, Short.MAX_VALUE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pbProcenatIzvrsenosti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lProcenatIzvrsenosti, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(19, 19, 19))))
        );

        tpTabovi.addTab("Opis", jPanel2);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel14.setText("Vremenski rok:");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel18.setText("Procenat izvršenosti:");

        tfVremenskiRok.setEditable(false);
        tfVremenskiRok.setBackground(new java.awt.Color(204, 204, 255));
        tfVremenskiRok.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tfVremenskiRok.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        tfProcenatIzvrsenosti.setEditable(false);
        tfProcenatIzvrsenosti.setBackground(new java.awt.Color(204, 204, 255));
        tfProcenatIzvrsenosti.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tfProcenatIzvrsenosti.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        tUcesniciUPodcjelini.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tUcesniciUPodcjelini.setModel(new javax.swing.table.DefaultTableModel(
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
                "Učesnici u podcjelini:"
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
        tUcesniciUPodcjelini.setGridColor(new java.awt.Color(0, 0, 153));
        tUcesniciUPodcjelini.setRowSelectionAllowed(false);
        tUcesniciUPodcjelini.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane4.setViewportView(tUcesniciUPodcjelini);

        tAktivnosti.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tAktivnosti.setModel(new javax.swing.table.DefaultTableModel(
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
                "Aktivnosti:"
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
        jScrollPane5.setViewportView(tAktivnosti);

        jScrollPane13.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane13.setAutoscrolls(true);

        tPodcjeline.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tPodcjeline.setModel(new javax.swing.table.DefaultTableModel(
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
                "Podcjeline:"
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
        tPodcjeline.setToolTipText("");
        tPodcjeline.setGridColor(new java.awt.Color(0, 0, 153));
        tPodcjeline.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tPodcjeline.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tPodcjelineMouseClicked(evt);
            }
        });
        jScrollPane13.setViewportView(tPodcjeline);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfVremenskiRok, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfProcenatIzvrsenosti)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfVremenskiRok, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfProcenatIzvrsenosti, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 21, Short.MAX_VALUE))
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        tpTabovi.addTab("Podcjeline", jPanel3);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Iznos:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Opis:");

        taOpisPrihoda.setEditable(false);
        taOpisPrihoda.setColumns(20);
        taOpisPrihoda.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        taOpisPrihoda.setLineWrap(true);
        taOpisPrihoda.setRows(5);
        taOpisPrihoda.setWrapStyleWord(true);
        jScrollPane8.setViewportView(taOpisPrihoda);

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel20.setText("Ukupno prihoda:");

        tfIznosPrihoda.setEditable(false);
        tfIznosPrihoda.setBackground(new java.awt.Color(204, 204, 255));
        tfIznosPrihoda.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tfIznosPrihoda.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        tfUkupnoPrihoda.setEditable(false);
        tfUkupnoPrihoda.setBackground(new java.awt.Color(204, 204, 255));
        tfUkupnoPrihoda.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tfUkupnoPrihoda.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel26.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel26.setText("Datum:");

        tfDatumPrihoda.setEditable(false);
        tfDatumPrihoda.setBackground(new java.awt.Color(204, 204, 255));
        tfDatumPrihoda.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tfDatumPrihoda.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectplanner/ikone/money.png"))); // NOI18N

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectplanner/ikone/plus.png"))); // NOI18N

        tPrihodi.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tPrihodi.setModel(new javax.swing.table.DefaultTableModel(
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
                "Lista prihoda:"
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
        tPrihodi.setGridColor(new java.awt.Color(0, 0, 153));
        tPrihodi.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tPrihodi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tPrihodiMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(tPrihodi);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfUkupnoPrihoda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfIznosPrihoda, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel26)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfDatumPrihoda, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                                .addComponent(jLabel16)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfUkupnoPrihoda, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel16))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfIznosPrihoda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                                    .addComponent(tfDatumPrihoda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(20, 20, 20)))
                .addContainerGap())
        );

        tpTabovi.addTab("Prihodi", jPanel5);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Iznos:");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Opis:");

        taOpisRashoda.setEditable(false);
        taOpisRashoda.setColumns(20);
        taOpisRashoda.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        taOpisRashoda.setLineWrap(true);
        taOpisRashoda.setRows(5);
        taOpisRashoda.setWrapStyleWord(true);
        jScrollPane17.setViewportView(taOpisRashoda);

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel21.setText("Ukupno razhoda:");

        tfIznosRashoda.setEditable(false);
        tfIznosRashoda.setBackground(new java.awt.Color(204, 204, 255));
        tfIznosRashoda.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tfIznosRashoda.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        tfUkupnoRashoda.setEditable(false);
        tfUkupnoRashoda.setBackground(new java.awt.Color(204, 204, 255));
        tfUkupnoRashoda.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tfUkupnoRashoda.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("Datum:");

        tfDatumRashoda.setEditable(false);
        tfDatumRashoda.setBackground(new java.awt.Color(204, 204, 255));
        tfDatumRashoda.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tfDatumRashoda.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectplanner/ikone/money.png"))); // NOI18N

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectplanner/ikone/minus.png"))); // NOI18N

        tRashodi.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tRashodi.setModel(new javax.swing.table.DefaultTableModel(
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
                "Lista rashoda:"
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
        tRashodi.setGridColor(new java.awt.Color(0, 0, 153));
        tRashodi.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tRashodi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tRashodiMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tRashodi);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfUkupnoRashoda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfIznosRashoda, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfDatumRashoda, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfUkupnoRashoda, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfIznosRashoda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                                    .addComponent(tfDatumRashoda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20)))
                .addContainerGap())
        );

        tpTabovi.addTab("Rashodi", jPanel9);

        cbStanjeProjekta.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbStanjeProjekta.setText("Stanje projekta");
        cbStanjeProjekta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbStanjeProjektaActionPerformed(evt);
            }
        });

        cbFinansijskiPregled.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbFinansijskiPregled.setText("Finansijski pregled");
        cbFinansijskiPregled.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFinansijskiPregledActionPerformed(evt);
            }
        });

        cbPregledAktivnosti.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbPregledAktivnosti.setText("Pregled aktivnosti");
        cbPregledAktivnosti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPregledAktivnostiActionPerformed(evt);
            }
        });

        bGenerisi.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        bGenerisi.setText("Generiši");
        bGenerisi.setEnabled(false);
        bGenerisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGenerisiActionPerformed(evt);
            }
        });

        taIzvjestaj.setEditable(false);
        taIzvjestaj.setColumns(20);
        taIzvjestaj.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        taIzvjestaj.setLineWrap(true);
        taIzvjestaj.setRows(5);
        taIzvjestaj.setWrapStyleWord(true);
        jScrollPane11.setViewportView(taIzvjestaj);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbStanjeProjekta)
                            .addComponent(cbFinansijskiPregled)
                            .addComponent(cbPregledAktivnosti)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(bGenerisi)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(cbStanjeProjekta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbFinansijskiPregled)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbPregledAktivnosti)
                .addGap(18, 18, 18)
                .addComponent(bGenerisi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane11)
                .addContainerGap())
        );

        tpTabovi.addTab("Izvještaji", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tpTabovi))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(tpTabovi)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bKreirajPodcjelinuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bKreirajPodcjelinuActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dodajPodcjelinu = new DodajPodcjelinu(new javax.swing.JFrame(), true);
                dodajPodcjelinu.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        dodajPodcjelinu.setVisible(false);                        
                    }
                });
                dodajPodcjelinu.listaNaloga();
                dodajPodcjelinu.dodajMoguceRoditeljeskePodcjeline();
                dodajPodcjelinu.setVisible(true);
            }
        });
    }//GEN-LAST:event_bKreirajPodcjelinuActionPerformed

    private void bRegulisiFinansijeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegulisiFinansijeActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                finansije = new Finansije(new javax.swing.JFrame(), true);
                finansije.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        finansije.setVisible(false);
                    }
                });
                finansije.setVisible(true);
            }
        });
    }//GEN-LAST:event_bRegulisiFinansijeActionPerformed

    private void tPodcjelineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tPodcjelineMouseClicked
        tPodcjeline.setToolTipText(listaPodcjelina.get(tPodcjeline.getSelectedRow()));
        String matrica[][] = new String[projekat.getListaPodcjeline().get(tPodcjeline.getSelectedRow()).getListaUcesnici().size()][1];
            for(int i=0;i<matrica.length;i++)
                matrica[i][0] = new String();
            for(int i=0;i<matrica.length;i++)
                matrica[i][0] = projekat.getPodcjeline(tPodcjeline.getSelectedRow()).getUcesnici(i).getIme() + " " + projekat.getPodcjeline(tPodcjeline.getSelectedRow()).getUcesnici(i).getPrezime();
            Object m[][] = matrica;
            tUcesniciUPodcjelini.setModel(new javax.swing.table.DefaultTableModel(                    
                m,
                new String [] {
                "UČESNICI U PODCJELINI:"
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
            matrica = new String[projekat.getPodcjeline(tPodcjeline.getSelectedRow()).getListaAktivnosti().size()][1];
            for(int i=0;i<matrica.length;i++)
                matrica[i][0] = new String();
            for(int i=0;i<matrica.length;i++)
                matrica[i][0] = projekat.getPodcjeline(tPodcjeline.getSelectedRow()).getAktivnosti(i);
            m = matrica;
            tAktivnosti.setModel(new javax.swing.table.DefaultTableModel(                    
                m,
                new String [] {
                "AKTIVNOSTI:"
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
            tfVremenskiRok.setText(projekat.getPodcjeline(tPodcjeline.getSelectedRow()).getVremenskiRok());
            tfProcenatIzvrsenosti.setText("" + ((projekat.getPodcjeline(tPodcjeline.getSelectedRow()).getBrojOdradjenihCasova()*100)/projekat.getPodcjeline(tPodcjeline.getSelectedRow()).getBrojRadnihCasova()) + " %");
    }//GEN-LAST:event_tPodcjelineMouseClicked

    private void tPrihodiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tPrihodiMouseClicked
        taOpisPrihoda.setText(projekat.getPrihodi(tPrihodi.getSelectedRow()).getOpis());
        tfIznosPrihoda.setText(projekat.getPrihodi(tPrihodi.getSelectedRow()).getIznos() + " KM");
        tfDatumPrihoda.setText(projekat.getPrihodi(tPrihodi.getSelectedRow()).getDatum());
    }//GEN-LAST:event_tPrihodiMouseClicked

    private void tRashodiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tRashodiMouseClicked
        taOpisRashoda.setText(projekat.getRashodi(tRashodi.getSelectedRow()).getOpis());
        tfIznosRashoda.setText(projekat.getRashodi(tRashodi.getSelectedRow()).getIznos() + " KM");
        tfDatumRashoda.setText(projekat.getRashodi(tRashodi.getSelectedRow()).getDatum());
    }//GEN-LAST:event_tRashodiMouseClicked

    private void cbStanjeProjektaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbStanjeProjektaActionPerformed
        if(cbStanjeProjekta.isSelected() || cbFinansijskiPregled.isSelected() || cbPregledAktivnosti.isSelected())
        bGenerisi.setEnabled(true);
        else
        bGenerisi.setEnabled(false);
    }//GEN-LAST:event_cbStanjeProjektaActionPerformed

    private void cbFinansijskiPregledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFinansijskiPregledActionPerformed
        if(cbStanjeProjekta.isSelected() || cbFinansijskiPregled.isSelected() || cbPregledAktivnosti.isSelected())
        bGenerisi.setEnabled(true);
        else
        bGenerisi.setEnabled(false);
    }//GEN-LAST:event_cbFinansijskiPregledActionPerformed

    private void cbPregledAktivnostiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPregledAktivnostiActionPerformed
        if(cbStanjeProjekta.isSelected() || cbFinansijskiPregled.isSelected() || cbPregledAktivnosti.isSelected())
        bGenerisi.setEnabled(true);
        else
        bGenerisi.setEnabled(false);
    }//GEN-LAST:event_cbPregledAktivnostiActionPerformed

    private void bGenerisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGenerisiActionPerformed
        String izvjestaj = "Naziv projekta: ";
        izvjestaj += projekat.getNaziv() + "\n" + "Opis: " + projekat.getOpis() + "\n\n";
        if(cbStanjeProjekta.isSelected()) {
            izvjestaj += "STANJE PROJEKTA\nSef na projektu je: " + projekat.getSef() + "\n";
            izvjestaj += "Nadzor na projektu je: " + projekat.getNadzor() + "\n";
            izvjestaj += "Lista podcjelina i njihovih planiranih rokova završetka: \n";
            for(Podcjelina podcjelina: projekat.getListaPodcjeline())
            izvjestaj += podcjelina.getNazivPodcjeline() + ": " + podcjelina.getVremenskiRok() + "\n";
            izvjestaj += "Procenat izvršenosti projekta je.: " + projekat.getProcenatIzvrsenosti() + " %\n\n";
        }
        if(cbFinansijskiPregled.isSelected()) {
            izvjestaj += "FINASIJSKI PREGLED\nLista prihoda:\n";
            for(Prihod prihod: projekat.getListaPrihodi())
            izvjestaj += prihod.getDatum() + ": " + prihod.getNaziv() + ", iznos: " + prihod.getIznos() + " KM\n";
            izvjestaj += "Ukupan prihod: " + projekat.getUkupnoPrihoda() + "\n";
            izvjestaj += "Lista rashoda:\n";
            for(Rashod rashod: projekat.getListaRashodi())
            izvjestaj += rashod.getDatum() + ": " + rashod.getNaziv() + ", iznos: " + rashod.getIznos() + " KM\n";
            izvjestaj += "Ukupan rashod: " + projekat.getUkupnoRashoda() + "\n\n";
        }
        if(cbPregledAktivnosti.isSelected()) {
            try {
                izvjestaj += "ISTORIJA AKTIVNOSTI: \n";
                ProjectPlanner.out.println("PREGLED_AKTIVNOSTI#" + projekat.getIdProjekta());
                while(!(ProjectPlanner.poruka = ProjectPlanner.in.readLine()).equals("KRAJ_AKTIVNOSTI")) {
                    if(ProjectPlanner.poruka.equals("IZUZETAK"))
                    throw new Exception();
                    izvjestaj += projekat.nadjiUcesnika(ProjectPlanner.poruka.split("#")[0]).getIme() +
                    " " + projekat.nadjiUcesnika(ProjectPlanner.poruka.split("#")[0]).getPrezime() +
                    " (" + projekat.nadjiUcesnika(ProjectPlanner.poruka.split("#")[0]).getKorisnickoIme() + "): " +
                    ProjectPlanner.poruka.split("#")[1] + "\nOpis: " + ProjectPlanner.poruka.split("#")[2] + "\n";
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Došlo je do greške!",
                    "Poruka", JOptionPane.INFORMATION_MESSAGE);
                e.printStackTrace();
            }
        }
        taIzvjestaj.setText(izvjestaj);
    }//GEN-LAST:event_bGenerisiActionPerformed

    private void tPristigliIzvjestajiRadnikaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tPristigliIzvjestajiRadnikaMouseClicked
        taIzvjestajRadnika.setText(listaPoruka.get(tPristigliIzvjestajiRadnika.getSelectedRow()).getTekstPoruke());
    }//GEN-LAST:event_tPristigliIzvjestajiRadnikaMouseClicked

    private void cbDodajPorukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDodajPorukuActionPerformed
        if(cbDodajPoruku.isSelected()) {
            taPoruka.setBackground(new java.awt.Color(255, 255, 255));
            taPoruka.setEnabled(true);
        } else {
            taPoruka.setBackground(new java.awt.Color(204, 204, 204));
            taPoruka.setEnabled(false);
        }
    }//GEN-LAST:event_cbDodajPorukuActionPerformed

    private void bOdbaciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bOdbaciActionPerformed
        try {
            String tekstPoruke = "Vaš izvještaj za aktivnost " + 
                    listaPoruka.get(tPristigliIzvjestajiRadnika.getSelectedRow()).getNazivAktivnosti() + 
                    " nije prihvaćen. ";
            if(taPoruka.isEnabled() && taPoruka.getText().length()<1) {
                JOptionPane.showMessageDialog(null, "Niste uneli tekst poruke!",
                        "Poruka", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            if(taPoruka.isEnabled())
                tekstPoruke += taPoruka.getText();
            ProjectPlanner.out.println("KREIRAJ_PORUKU_SEF#" + listaPoruka.get(tPristigliIzvjestajiRadnika.getSelectedRow()).getIdAktivnosti()
                    + "#" + tekstPoruke + "#" + listaPoruka.get(tPristigliIzvjestajiRadnika.getSelectedRow()).getKorisnickoImeRadnika()
                    + "#" + listaPoruka.get(tPristigliIzvjestajiRadnika.getSelectedRow()).getIdPodcjeline()
                    + "#" + "0" + "#" + listaPoruka.get(tPristigliIzvjestajiRadnika.getSelectedRow()).getIdPoruke());
            ProjectPlanner.poruka = ProjectPlanner.in.readLine();
            if(ProjectPlanner.poruka.equals("IZUZETAK"))
                throw new Exception();
            ProjectPlanner.poruka = ProjectPlanner.in.readLine();
            if(ProjectPlanner.poruka.equals("IZUZETAK"))
                throw new Exception();
            listaPoruka.remove(tPristigliIzvjestajiRadnika.getSelectedRow());
            tfUnesiteSatnicu.setText("");
            taPoruka.setText("");
            taIzvjestajRadnika.setText("");
            Korisnik.sef.osvjeziPoruke();
            Korisnik.sef.prikaziProjekat();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Došlo je do greške!",
                                      "Poruka", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_bOdbaciActionPerformed

    private void bPotvrdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPotvrdiActionPerformed
        try {
            String satnica = "0";
            String tekstPoruke = "Vaš izvještaj za aktivnost " + 
                    listaPoruka.get(tPristigliIzvjestajiRadnika.getSelectedRow()).getNazivAktivnosti() + 
                    " je prihvaćen. ";
            if (taPoruka.isEnabled() && taPoruka.getText().length()<1) {
                JOptionPane.showMessageDialog(null, "Niste uneli tekst poruke!",
                        "Poruka", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            if(taPoruka.isEnabled())
                tekstPoruke += taPoruka.getText();
            if (tfUnesiteSatnicu.getText().length()<1) {
                JOptionPane.showMessageDialog(null, "Niste uneli satnicu!",
                        "Poruka", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            satnica = tfUnesiteSatnicu.getText();
            ProjectPlanner.out.println("KREIRAJ_PORUKU_SEF#" + listaPoruka.get(tPristigliIzvjestajiRadnika.getSelectedRow()).getIdAktivnosti()
                    + "#" + tekstPoruke + "#" + listaPoruka.get(tPristigliIzvjestajiRadnika.getSelectedRow()).getKorisnickoImeRadnika()
                    + "#" + listaPoruka.get(tPristigliIzvjestajiRadnika.getSelectedRow()).getIdPodcjeline()
                    + "#" + satnica + "#" + listaPoruka.get(tPristigliIzvjestajiRadnika.getSelectedRow()).getIdPoruke());
            ProjectPlanner.poruka = ProjectPlanner.in.readLine();
            if(ProjectPlanner.poruka.equals("IZUZETAK"))
                throw new Exception();
            ProjectPlanner.poruka = ProjectPlanner.in.readLine();
            if(ProjectPlanner.poruka.equals("IZUZETAK"))
                throw new Exception();
            listaPoruka.remove(tPristigliIzvjestajiRadnika.getSelectedRow());
            tfUnesiteSatnicu.setText("");
            taPoruka.setText("");
            taIzvjestajRadnika.setText("");
            Korisnik.sef.osvjeziPoruke();
            Korisnik.sef.prikaziProjekat();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Došlo je do greške!",
                                      "Poruka", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_bPotvrdiActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Korisnik.sef.setVisible(false);
        Login.korisnik.setEnabled(true);
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton bGenerisi;
    private javax.swing.JButton bKreirajPodcjelinu;
    private javax.swing.JButton bOdbaci;
    private javax.swing.JButton bPotvrdi;
    private javax.swing.JButton bRegulisiFinansije;
    private javax.swing.JCheckBox cbDodajPoruku;
    private javax.swing.JCheckBox cbFinansijskiPregled;
    private javax.swing.JCheckBox cbPregledAktivnosti;
    private javax.swing.JCheckBox cbStanjeProjekta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel lProcenatIzvrsenosti;
    private javax.swing.JProgressBar pbProcenatIzvrsenosti;
    private javax.swing.JTable tAktivnosti;
    private javax.swing.JTable tPodcjeline;
    private javax.swing.JTable tPrihodi;
    private javax.swing.JTable tPristigliIzvjestajiRadnika;
    private javax.swing.JTable tRashodi;
    private javax.swing.JTable tUcesniciNaProjektu;
    private javax.swing.JTable tUcesniciUPodcjelini;
    private javax.swing.JTextArea taIzvjestaj;
    private javax.swing.JTextArea taIzvjestajRadnika;
    private javax.swing.JTextArea taOpis;
    private javax.swing.JTextArea taOpisPrihoda;
    private javax.swing.JTextArea taOpisRashoda;
    private javax.swing.JTextArea taPoruka;
    private javax.swing.JTextField tfDatumPrihoda;
    private javax.swing.JTextField tfDatumRashoda;
    private javax.swing.JTextField tfIznosPrihoda;
    private javax.swing.JTextField tfIznosRashoda;
    private javax.swing.JTextField tfNadzor;
    private javax.swing.JTextField tfProcenatIzvrsenosti;
    private javax.swing.JTextField tfSef;
    private javax.swing.JTextField tfUkupnoPrihoda;
    private javax.swing.JTextField tfUkupnoRashoda;
    private javax.swing.JTextField tfUnesiteSatnicu;
    private javax.swing.JTextField tfVremenskiRok;
    private javax.swing.JTabbedPane tpTabovi;
    // End of variables declaration//GEN-END:variables
    public void osvjeziPoruke() {
        String matrica[][] = new String[listaPoruka.size()][1];
            for(int i=0;i<matrica.length;i++)
                matrica[i][0] = new String();
            for(int i=0;i<matrica.length;i++)
                matrica[i][0] = projekat.nadjiUcesnika(listaPoruka.get(i).getKorisnickoImeRadnika()).getIme() + 
                        " " + projekat.nadjiUcesnika(listaPoruka.get(i).getKorisnickoImeRadnika()).getPrezime() + 
                        " (" + listaPoruka.get(i).getNazivAktivnosti() + ")";
            Object m[][] = matrica;
            tPristigliIzvjestajiRadnika.setModel(new javax.swing.table.DefaultTableModel(                    
                m,
                new String [] {
                "PRISTIGLI IZVJEŠTAJI RADNIKA:"
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
    }

    public void prikaziProjekat() {
        try {
            tfVremenskiRok.setText(" ");
            tfProcenatIzvrsenosti.setText(" ");
            String matrica[][] = new String[0][0];            
            Object m[][] = matrica;
            tAktivnosti.setModel(new javax.swing.table.DefaultTableModel(                    
                m,
                new String [] {
                "AKTIVNOSTI:"
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
            tfVremenskiRok.setText(" ");
            tfProcenatIzvrsenosti.setText(" ");
            matrica = new String[0][0];            
            m = matrica;
            tUcesniciUPodcjelini.setModel(new javax.swing.table.DefaultTableModel(                    
                m,
                new String [] {
                "UČESNICI U PODCJELINI:"
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
            tPodcjeline.setModel(new javax.swing.table.DefaultTableModel(                    
                m,
                new String [] {
                "PODCJELINE:"
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
            tPrihodi.setModel(new javax.swing.table.DefaultTableModel(                    
                m,
                new String [] {
                "PRIHODI:"
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
            tRashodi.setModel(new javax.swing.table.DefaultTableModel(                    
                m,
                new String [] {
                "UČESNICI U PODCJELINI:"
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
            taOpisPrihoda.setText(" ");
            taOpisRashoda.setText(" ");
            tfIznosPrihoda.setText(" ");
            tfIznosRashoda.setText(" ");
            tfDatumPrihoda.setText(" ");
            tfDatumRashoda.setText(" ");
            projekat = new Projekat();
            projekat.setIdProjekta(listaIdProjekta.get(Login.korisnik.getSelectedRowTProjekti()));
            projekat.setNaziv(listaNazivProjekta.get(Login.korisnik.getSelectedRowTProjekti()));
            ProjectPlanner.out.println("PRIKAZI_PROJEKAT#SEF" + "#"
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
            matrica = new String[projekat.getListaUcesnici().size()][1];
            for(int i=0;i<matrica.length;i++)
                matrica[i][0] = new String();
            for(int i=0;i<matrica.length;i++)
                matrica[i][0] = projekat.getUcesnici(i).getIme() + " " + projekat.getUcesnici(i).getPrezime() + 
                        " (" + projekat.getUcesnici(i).getRadnoMjesto() + ")";
            m = matrica;
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
            while(!(ProjectPlanner.poruka = ProjectPlanner.in.readLine()).equals("KRAJ_PODCJELINA")) {
                System.out.println(ProjectPlanner.poruka);
                if(ProjectPlanner.poruka.equals("IZUZETAK"))
                    throw new Exception();
                Podcjelina podcjelina = new Podcjelina();
                podcjelina.setNazivPodcjeline(ProjectPlanner.poruka.split("#")[0]);
                podcjelina.setIdPodcjeline(Integer.parseInt(ProjectPlanner.poruka.split("#")[1]));
                podcjelina.setVremenskiRok(ProjectPlanner.poruka.split("#")[2]);
                podcjelina.setBrojRadnihCasova(Integer.parseInt(ProjectPlanner.poruka.split("#")[3]));
                podcjelina.setBrojOdradjenihCasova(Integer.parseInt(ProjectPlanner.poruka.split("#")[4]));
                podcjelina.setIdRoditeljskePodcjeline(Integer.parseInt(ProjectPlanner.poruka.split("#")[5]));
                while(!(ProjectPlanner.poruka = ProjectPlanner.in.readLine()).equals("KRAJ_UCESNIKA")) {
                    System.out.println(ProjectPlanner.poruka);
                    if(ProjectPlanner.poruka.equals("IZUZETAK"))
                        throw new Exception();
                    podcjelina.setUcesnici(projekat.nadjiUcesnika(ProjectPlanner.poruka));
                }                
                while(!(ProjectPlanner.poruka = ProjectPlanner.in.readLine()).equals("KRAJ_AKTIVNOSTI")) {
                    System.out.println(ProjectPlanner.poruka);
                    if(ProjectPlanner.poruka.equals("IZUZETAK"))
                        throw new Exception();
                    podcjelina.setAktivnosti(ProjectPlanner.poruka);
                }
                projekat.setPodcjeline(podcjelina);
            }
            System.out.println("PRIMIO_PODCJELINE");
            ProjectPlanner.out.println("PRIMIO_PODCJELINE");
            lProcenatIzvrsenosti.setText(projekat.getProcenatIzvrsenosti() + "%");
            pbProcenatIzvrsenosti.setValue(Integer.parseInt(projekat.getProcenatIzvrsenosti()));
            listaPodcjelina.clear();
            for(Podcjelina podcjelina: projekat.getListaPodcjeline()) {
                if(podcjelina.getIdPodcjeline() == podcjelina.getIdRoditeljskePodcjeline())
                    listaPodcjelina.add(podcjelina.getNazivPodcjeline());
                else
                    listaPodcjelina.add(projekat.nadjiRoditeljskuPodcjelinu(podcjelina.getIdRoditeljskePodcjeline()).getNazivPodcjeline() + 
                            ">" + podcjelina.getNazivPodcjeline());
            }            
            matrica = new String[projekat.getListaPodcjeline().size()][1];
            for(int i=0;i<matrica.length;i++)
                matrica[i][0] = new String();
            for(int i=0;i<matrica.length;i++)
                matrica[i][0] = listaPodcjelina.get(i);
            m = matrica;
            tPodcjeline.setModel(new javax.swing.table.DefaultTableModel(                    
                m,
                new String [] {
                "PODCJELINE:"
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
            while(!(ProjectPlanner.poruka = ProjectPlanner.in.readLine()).equals("KRAJ_PRIHODA")) {
                System.out.println(ProjectPlanner.poruka);
                if(ProjectPlanner.poruka.equals("IZUZETAK"))
                    throw new Exception();
                Prihod prihod = new Prihod();
                prihod.setNaziv(ProjectPlanner.poruka.split("#")[0]);
                prihod.setOpis(ProjectPlanner.poruka.split("#")[1]);
                prihod.setIznos(Double.parseDouble(ProjectPlanner.poruka.split("#")[2]));
                prihod.setDatum(ProjectPlanner.poruka.split("#")[3]);
                projekat.setPrihodi(prihod);
            }
            System.out.println("PRIMIO_PRIHODE");
            ProjectPlanner.out.println("PRIMIO_PRIHODE");
            matrica = new String[projekat.getListaPrihodi().size()][1];
            for(int i=0;i<matrica.length;i++)
                matrica[i][0] = new String();
            for(int i=0;i<matrica.length;i++)
                matrica[i][0] = projekat.getPrihodi(i).getNaziv();
            m = matrica;
            tPrihodi.setModel(new javax.swing.table.DefaultTableModel(                    
                m,
                new String [] {
                "LISTA PRIHODA:"
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
            tfUkupnoPrihoda.setText(projekat.getUkupnoPrihoda());
            while(!(ProjectPlanner.poruka = ProjectPlanner.in.readLine()).equals("KRAJ_RASHODA")) {
                System.out.println(ProjectPlanner.poruka);
                if(ProjectPlanner.poruka.equals("IZUZETAK"))
                    throw new Exception();
                Rashod rashod = new Rashod();                
                rashod.setNaziv(ProjectPlanner.poruka.split("#")[0]);
                rashod.setOpis(ProjectPlanner.poruka.split("#")[1]);
                rashod.setIznos(Double.parseDouble(ProjectPlanner.poruka.split("#")[2]));
                rashod.setDatum(ProjectPlanner.poruka.split("#")[3]);
                projekat.setRashodi(rashod);
            }
            ProjectPlanner.out.println("PRIMIO_RASHODE");
            System.out.println("PRIMIO_RASHODE");
            matrica = new String[projekat.getListaRashodi().size()][1];
            for(int i=0;i<matrica.length;i++)
                matrica[i][0] = new String();
            for(int i=0;i<matrica.length;i++)
                matrica[i][0] = projekat.getRashodi(i).getNaziv();
            m = matrica;
            tRashodi.setModel(new javax.swing.table.DefaultTableModel(                    
                m,
                new String [] {
                "LISTA RASHODA:"
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
            tfUkupnoRashoda.setText(projekat.getUkupnoRashoda());
            listaPoruka.clear();
            while(!(ProjectPlanner.poruka = ProjectPlanner.in.readLine()).equals("KRAJ_PORUKA")) {
                System.out.println(ProjectPlanner.poruka);
                if(ProjectPlanner.poruka.equals("IZUZETAK"))
                    throw new Exception();
                Poruka poruka = new Poruka();
                poruka.setIdPoruke(Integer.parseInt(ProjectPlanner.poruka.split("#")[0]));
                poruka.setIdPodcjeline(Integer.parseInt(ProjectPlanner.poruka.split("#")[5]));
                poruka.setIdAktivnosti(Integer.parseInt(ProjectPlanner.poruka.split("#")[3]));
                poruka.setTekstPoruke(ProjectPlanner.poruka.split("#")[1]);
                poruka.setKorisnickoImeRadnika(ProjectPlanner.poruka.split("#")[2]);
                poruka.setNazivAktivnosti(ProjectPlanner.poruka.split("#")[4]);
                listaPoruka.add(poruka);                
            }            
            ProjectPlanner.out.println("PRIMIO_PORUKE");
            System.out.println("PRIMIO_PORUKE");
            idZadnjeCjeline = Integer.parseInt(ProjectPlanner.in.readLine());
            ProjectPlanner.out.println("PRIMIO_ID");
            System.out.println("PRIMIO_ID");
            matrica = new String[listaPoruka.size()][1];
            for(int i=0;i<matrica.length;i++)
                matrica[i][0] = new String();
            for(int i=0;i<matrica.length;i++)
                matrica[i][0] = projekat.nadjiUcesnika(listaPoruka.get(i).getKorisnickoImeRadnika()).getIme() + 
                        " " + projekat.nadjiUcesnika(listaPoruka.get(i).getKorisnickoImeRadnika()).getPrezime() + 
                        " (" + listaPoruka.get(i).getNazivAktivnosti() + ")";
            m = matrica;
            tPristigliIzvjestajiRadnika.setModel(new javax.swing.table.DefaultTableModel(                    
                m,
                new String [] {
                "PRISTIGLI IZVJEŠTAJI RADNIKA:"
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
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Došlo je do greške!",
                                      "Poruka", JOptionPane.INFORMATION_MESSAGE);
            e.printStackTrace();
        }
    }
}

