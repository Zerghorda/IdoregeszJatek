package idoregesz;

import javax.swing.JOptionPane;

public class IdoregeszJatek extends javax.swing.JFrame {

    String[] leirasok = {"Egy óriási mezőn vagy. Nyugat felé egy hatalmas épület körvonalai tűnnek fel.",
        "Napfényes mezőn állsz. Nyugatra egy hatalmas kastélyt, délre egy kutat látsz.",
        "Napfényes mezőn állsz, egy kút előtt. Itt van: pénz. Nyugatra egy hatalmas kastélyt látsz.",
        "Rendben, a pénzt elraktad.",
        "A várudvaron állsz. Nyugatra nyitott kamrát, északra zárt ajtót látsz. Egy széles lépcső vezet fel a vártemplomhoz",
        "A templom előtt egy kéregető szerzetes mosolyog rád. Nyugatra nyitott kamrát, északra zárt ajtót látsz",
        "A szerzetes megköszöni, és kinyújtja feléd a kezét, a tenyerén egy kulcsot tart.",
        "Rendben, a kulcsot elraktad",
        "A kamrában vagy. Egyik oldalon hatalmas asztal áll mindenféle ételekkel, a másik oldalon egy nagy tűzhely,"
        + " szintén ételekkel.Délre egy faajtót látsz.",
        "Egy faajtó előtt állsz, zárva van, A kulcslyukon nem lehet belátni.",
        "Az ajtó könnyedén nyílik, egy kis ládikát pont fel tudsz kapni, amikor visszakerülsz a jelenbe!",
        "Újra életerősnek érzed magad!",
        "Egy masszív, zárt ajtó előtt állsz.",
        "Ezt az ajtót nem nyitja a kulcsod!"};

    public IdoregeszJatek() {
        initComponents();
        LeirasTxtA.setText(leirasok[0]);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JatekterJP = new javax.swing.JPanel();
        StatJp = new javax.swing.JPanel();
        EroLbl = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        KepJp = new javax.swing.JPanel();
        keplbl = new javax.swing.JLabel();
        IranyJp = new javax.swing.JPanel();
        SzovegekJp = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        LeirasTxtA = new javax.swing.JTextArea();
        ParancsTxtF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        JatekterJP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        StatJp.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        EroLbl.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        EroLbl.setText("E\nR\nŐ");
        EroLbl.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jProgressBar1.setForeground(new java.awt.Color(0, 102, 0));
        jProgressBar1.setMaximum(5);
        jProgressBar1.setToolTipText("");
        jProgressBar1.setValue(5);
        jProgressBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jProgressBar1.setName(""); // NOI18N

        javax.swing.GroupLayout StatJpLayout = new javax.swing.GroupLayout(StatJp);
        StatJp.setLayout(StatJpLayout);
        StatJpLayout.setHorizontalGroup(
            StatJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StatJpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EroLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        StatJpLayout.setVerticalGroup(
            StatJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StatJpLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(EroLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
            .addGroup(StatJpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        KepJp.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        keplbl.setText("                                               Kép helye");

        javax.swing.GroupLayout KepJpLayout = new javax.swing.GroupLayout(KepJp);
        KepJp.setLayout(KepJpLayout);
        KepJpLayout.setHorizontalGroup(
            KepJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KepJpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(keplbl, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                .addContainerGap())
        );
        KepJpLayout.setVerticalGroup(
            KepJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KepJpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(keplbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        IranyJp.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout IranyJpLayout = new javax.swing.GroupLayout(IranyJp);
        IranyJp.setLayout(IranyJpLayout);
        IranyJpLayout.setHorizontalGroup(
            IranyJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        IranyJpLayout.setVerticalGroup(
            IranyJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        SzovegekJp.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        LeirasTxtA.setColumns(20);
        LeirasTxtA.setRows(5);
        LeirasTxtA.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        LeirasTxtA.setEnabled(false);
        jScrollPane1.setViewportView(LeirasTxtA);

        ParancsTxtF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParancsTxtFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SzovegekJpLayout = new javax.swing.GroupLayout(SzovegekJp);
        SzovegekJp.setLayout(SzovegekJpLayout);
        SzovegekJpLayout.setHorizontalGroup(
            SzovegekJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SzovegekJpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SzovegekJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ParancsTxtF)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        SzovegekJpLayout.setVerticalGroup(
            SzovegekJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SzovegekJpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ParancsTxtF, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout JatekterJPLayout = new javax.swing.GroupLayout(JatekterJP);
        JatekterJP.setLayout(JatekterJPLayout);
        JatekterJPLayout.setHorizontalGroup(
            JatekterJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JatekterJPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JatekterJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SzovegekJp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(JatekterJPLayout.createSequentialGroup()
                        .addComponent(StatJp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(KepJp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(IranyJp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        JatekterJPLayout.setVerticalGroup(
            JatekterJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JatekterJPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JatekterJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(KepJp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(StatJp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(IranyJp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(SzovegekJp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JatekterJP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JatekterJP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        JOptionPane.showConfirmDialog(null, "Biztos ki akar lépni ?", "Kilépés", 2);
        System.exit(0);
    }//GEN-LAST:event_formWindowClosing

    private void ParancsTxtFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParancsTxtFActionPerformed
        String parancs = ParancsTxtF.getText();
        String leiras = LeirasTxtA.getText();
        if (parancs.equals("észak")) {
            LeirasTxtA.setText(leirasok[1]);
        } else if (parancs.equals("nyugat") & leiras.equals(leirasok[1])) {
            LeirasTxtA.setText(leirasok[4]);
        } else if (parancs.equals("nyugat") & leiras.equals(leirasok[4])) {
            LeirasTxtA.setText(leirasok[8]);
            JOptionPane.showConfirmDialog(rootPane, "Demo vége!", "Vége", 2);
            System.exit(0);
        }
        else{
            String uzenet="Nem jó parancsot adtál meg!";
            String cim = "Rossz parancs!";
            int ikon = JOptionPane.WARNING_MESSAGE;
            JOptionPane.showMessageDialog(null, uzenet, cim, ikon);
        }
    }//GEN-LAST:event_ParancsTxtFActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IdoregeszJatek().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EroLbl;
    private javax.swing.JPanel IranyJp;
    private javax.swing.JPanel JatekterJP;
    private javax.swing.JPanel KepJp;
    private javax.swing.JTextArea LeirasTxtA;
    private javax.swing.JTextField ParancsTxtF;
    private javax.swing.JPanel StatJp;
    private javax.swing.JPanel SzovegekJp;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel keplbl;
    // End of variables declaration//GEN-END:variables
}
