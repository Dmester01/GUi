/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oraimunka;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Dani
 */
public class Szamolo extends javax.swing.JFrame {

    /**
     * Creates new form Szamolo
     */
    public Szamolo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ujfeladatButton = new javax.swing.JButton();
        megoldasButton = new javax.swing.JButton();
        ellenorzésButton = new javax.swing.JButton();
        ellenorzesLabel = new javax.swing.JLabel();
        gyakorlasLabel = new javax.swing.JLabel();
        visszajelzesLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        statisztikaLabel = new javax.swing.JLabel();
        osszkerdesekszamaLabel = new javax.swing.JLabel();
        osszeadLabel = new javax.swing.JLabel();
        KivonLabel = new javax.swing.JLabel();
        osztasLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        eredmenyLabel = new javax.swing.JLabel();
        osszprobálkozásokszamaLabel = new javax.swing.JLabel();
        osszeadasLabel1 = new javax.swing.JLabel();
        kivonasLabel1 = new javax.swing.JLabel();
        osztasLabel1 = new javax.swing.JLabel();
        SzorzasLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        megnyitMenuItem = new javax.swing.JMenuItem();
        mentMenuItem = new javax.swing.JMenuItem();
        MenuItemMentésmasként = new javax.swing.JMenuItem();
        KilepMenuItem = new javax.swing.JMenuItem();
        muveletekMenu = new javax.swing.JMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem3 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem4 = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ujfeladatButton.setText("Új Feladat");

        megoldasButton.setText("Megoldás");

        ellenorzésButton.setText("Ellenörzés");

        gyakorlasLabel.setText("Gyakorlás");

        visszajelzesLabel.setText("Visszajelzés");

        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        statisztikaLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        statisztikaLabel.setText("Statisztika");

        osszkerdesekszamaLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        osszkerdesekszamaLabel.setText("Össz kérdések száma:");

        osszeadLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        osszeadLabel.setText("Összeadás:");

        KivonLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        KivonLabel.setText("Kivonás:");

        osztasLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        osztasLabel.setText("Osztás:");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Szorzás:");

        eredmenyLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        eredmenyLabel.setText("Eredmény:");

        osszprobálkozásokszamaLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        osszprobálkozásokszamaLabel.setText("Őssz probálkozások száma:");

        osszeadasLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        osszeadasLabel1.setText("Összeadás: ");

        kivonasLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        kivonasLabel1.setText("Kivonás:");

        osztasLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        osztasLabel1.setText("Osztás:");

        SzorzasLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        SzorzasLabel1.setText("Szorzás:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(statisztikaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eredmenyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(osztasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(KivonLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(osszkerdesekszamaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(osszeadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(osszprobálkozásokszamaLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(osszeadasLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(SzorzasLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(osztasLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(kivonasLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(statisztikaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(osszkerdesekszamaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(osszeadLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(KivonLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(osztasLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(eredmenyLabel))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(osszprobálkozásokszamaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(osszeadasLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kivonasLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(osztasLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SzorzasLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fileMenu.setText("Fájl");

        megnyitMenuItem.setText("Megnyit");
        fileMenu.add(megnyitMenuItem);

        mentMenuItem.setText("Ment");
        mentMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mentMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(mentMenuItem);

        MenuItemMentésmasként.setText("Mentés Másként");
        MenuItemMentésmasként.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemMentésmaskéntActionPerformed(evt);
            }
        });
        fileMenu.add(MenuItemMentésmasként);

        KilepMenuItem.setText("Kilép");
        fileMenu.add(KilepMenuItem);

        jMenuBar1.add(fileMenu);

        muveletekMenu.setText("Müveletek");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("Összeadás");
        muveletekMenu.add(jRadioButtonMenuItem1);

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("Kivonás");
        muveletekMenu.add(jRadioButtonMenuItem2);

        jRadioButtonMenuItem3.setSelected(true);
        jRadioButtonMenuItem3.setText("Szorzás");
        muveletekMenu.add(jRadioButtonMenuItem3);

        jRadioButtonMenuItem4.setSelected(true);
        jRadioButtonMenuItem4.setText("Osztás");
        muveletekMenu.add(jRadioButtonMenuItem4);

        jMenuBar1.add(muveletekMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(megoldasButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(gyakorlasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ujfeladatButton)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ellenorzesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ellenorzésButton))
                            .addComponent(visszajelzesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(151, 151, 151))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ujfeladatButton)
                    .addComponent(gyakorlasLabel))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ellenorzesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ellenorzésButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(megoldasButton)
                    .addComponent(visszajelzesLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuItemMentésmaskéntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemMentésmaskéntActionPerformed
        JFileChooser fc = new JFileChooser(new File("."));
        fc.setDialogTitle("Mentés Másként ");
        
        FileNameExtensionFilter imgfilter = new FileNameExtensionFilter("PING és GIF képek","png","gif");
        fc.addChoosableFileFilter(imgfilter);
        FileNameExtensionFilter txtfilter = new FileNameExtensionFilter("PING és GIF képek","png","gif");
        fc.addChoosableFileFilter(txtfilter);
        FileNameExtensionFilter mdfilter = new FileNameExtensionFilter("PING és GIF képek","png","gif");
        fc.addChoosableFileFilter(mdfilter);
        
        fc.setFileFilter(txtfilter);
        
        int valastottGomb = (fc.showSaveDialog(this));
        if (valastottGomb == JFileChooser.APPROVE_OPTION) {
            File f = fc.getSelectedFile();
            String[] kit = ((FileNameExtensionFilter)fc.getFileFilter()).getExtensions();
            String fn = f.getPath() + "." +kit[0];
            
            if(!fn.endsWith("."+kit[0])){
                fn +="."+kit[0];
            }
            
            Path path =Paths.get(fn);
            boolean mentes=true;
            
            if(Files.exists(path)){
                valastottGomb = JOptionPane.showConfirmDialog(this,"Felülírjam?", "A Fájl létezik",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
                if(valastottGomb  == JOptionPane.NO_OPTION){
                    mentes= false;
                }
            }
            eredmenyLabel.setText("<html>elérés: " + fn + "<br>könytár: " +getName()+"."+ kit[0]);
            try {
                if(mentes){
                Files.write(path, "statisztika:".getBytes());
                }
                
            } catch (IOException ex) {
                Logger.getLogger(Szamolo.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_MenuItemMentésmaskéntActionPerformed

    private void mentMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mentMenuItemActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.setDialogTitle("Fájl mentése");
        fc.setCurrentDirectory(new File("."));
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int valastottGomb = (fc.showSaveDialog(this));
        if (valastottGomb == JFileChooser.APPROVE_OPTION) {
            File f = fc.getSelectedFile();
            if (f.isDirectory()) {
                eredmenyLabel.setText("<html>elérés: " + f.getPath() + "<br>könytár: " + f.getName());
                try {
                    Files.write(Paths.get(f.getPath(), "Stat.txt"), "statisztika:".getBytes());
                } catch (IOException ex) {
                    Logger.getLogger(Szamolo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_mentMenuItemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Szamolo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Szamolo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Szamolo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Szamolo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Szamolo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem KilepMenuItem;
    private javax.swing.JLabel KivonLabel;
    private javax.swing.JMenuItem MenuItemMentésmasként;
    private javax.swing.JLabel SzorzasLabel1;
    private javax.swing.JLabel ellenorzesLabel;
    private javax.swing.JButton ellenorzésButton;
    private javax.swing.JLabel eredmenyLabel;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JLabel gyakorlasLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem3;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem4;
    private javax.swing.JLabel kivonasLabel1;
    private javax.swing.JMenuItem megnyitMenuItem;
    private javax.swing.JButton megoldasButton;
    private javax.swing.JMenuItem mentMenuItem;
    private javax.swing.JMenu muveletekMenu;
    private javax.swing.JLabel osszeadLabel;
    private javax.swing.JLabel osszeadasLabel1;
    private javax.swing.JLabel osszkerdesekszamaLabel;
    private javax.swing.JLabel osszprobálkozásokszamaLabel;
    private javax.swing.JLabel osztasLabel;
    private javax.swing.JLabel osztasLabel1;
    private javax.swing.JLabel statisztikaLabel;
    private javax.swing.JButton ujfeladatButton;
    private javax.swing.JLabel visszajelzesLabel;
    // End of variables declaration//GEN-END:variables
}
