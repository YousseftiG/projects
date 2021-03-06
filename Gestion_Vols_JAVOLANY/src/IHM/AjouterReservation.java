/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;

import DAO.ConnexionBD;
import Reservation.Users;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.soap.SOAPBinding;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ayoub
 */
public class AjouterReservation extends javax.swing.JFrame {

    /**
     * Creates new form Accueil
     */
    int xMouse;
    int yMouse;
    DefaultTableModel dtm;
    Connection con =ConnexionBD.Conexion();
    
    public AjouterReservation() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();
        jLabel7 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Accueil");
        setBackground(new java.awt.Color(91, 155, 213));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.white);
        setMinimumSize(new java.awt.Dimension(802, 496));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ferme.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(750, 0, 50, 50);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Aeroport D'Arrivé :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(350, 130, 115, 50);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Date :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(120, 190, 110, 30);

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(210, 450, 100, 25);

        jButton3.setText("Valider");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(460, 450, 100, 25);

        jXDatePicker1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jXDatePicker1ActionPerformed(evt);
            }
        });
        getContentPane().add(jXDatePicker1);
        jXDatePicker1.setBounds(180, 200, 125, 24);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Passager :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(240, 380, 90, 50);

        ArrayList<Integer> passagers = new ArrayList<Integer>();
        String q = "SELECT * FROM passager";
        try{
            PreparedStatement stmnt = con.prepareStatement(q);

            ResultSet result = stmnt.executeQuery(q);

            while (result.next()) {
                Integer passager = result.getInt("idPassager");
                // add group names to the array list
                passagers.add(passager);

            }

            result.close();
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
        DefaultComboBoxModel mode = new DefaultComboBoxModel(passagers.toArray());
        jComboBox3.setModel(mode);
        jComboBox3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jComboBox3);
        jComboBox3.setBounds(330, 400, 170, 22);

        jButton1.setText("Valider");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(530, 200, 100, 25);

        ArrayList<String> villes = new ArrayList<String>();
        String query = "SELECT idAeroport FROM aeroport";
        try{
            PreparedStatement stmnt = con.prepareStatement(query);

            ResultSet res = stmnt.executeQuery(query);

            while (res.next()) {
                String ville = res.getString("idAeroport");
                // add group names to the array list
                villes.add(ville);

            }

            res.close();
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
        DefaultComboBoxModel model = new DefaultComboBoxModel(villes.toArray());
        jComboBox2.setModel(model);
        jComboBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(510, 150, 170, 22);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Aeroport :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 130, 110, 50);

        jLabel3.setFont(new java.awt.Font("Trajan Pro", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Ajouter une reservation");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(210, 30, 380, 130);

        jComboBox4.setModel(model);
        jComboBox4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox4);
        jComboBox4.setBounds(140, 150, 170, 22);

        dtm = new DefaultTableModel(new String[] { "IdVol", "Aeroport de Depart", "Aeroport d'Arrivé","Nombre d'escale","Date de Départ","Date d'arrivé", "Confirmed" }, 0);
        jTable1.setModel(dtm
        );
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 240, 760, 150);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Home page.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel9);
        jLabel9.setBounds(10, 0, 50, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/JFrame.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 490);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_closeMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        jXDatePicker1.setFormats(dateFormat);
        
        DateFormat sysDate = new SimpleDateFormat("yyyy-MM-dd");
        String date_to_store = sysDate.format(jXDatePicker1.getDate()).toString();
        String q = "SELECT * FROM volcomplet WHERE AeroportDepart='"+(String)jComboBox4.getSelectedItem()+"' AND AeroportDarriv='"+(String)jComboBox4.getSelectedItem()+"' AND DateDepart='"+date_to_store+"' AND Statut='1';"; 
        System.out.println(q);
        try{
        PreparedStatement stm = con.prepareStatement(q); 

        ResultSet rs = stm.executeQuery(q); 
        while (rs.next()) { 
        dtm.addRow(new Object[]{ rs.getInt("numeroVol"), rs.getString("AeroportDepart"), rs.getString("AeroportDarriv"), rs.getInt("nbVol")-1, rs.getDate("DateDepart"),rs.getDate("DateDarrive"),rs.getBoolean("Statut")});
        } 
        jTable1.setModel(dtm);
        rs.close();
        }
        catch(SQLException e) {
          e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jXDatePicker1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXDatePicker1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jXDatePicker1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new Accueil().setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int idvol =(int) jTable1.getValueAt(jTable1.getSelectedRow(), 0);
        String query1 = "INSERT INTO reservation (CIN,	idPassager,numeroVol,dateReservation) VALUES ('"+Users.Id+"','"+(int)jComboBox3.getSelectedItem()+"','"+idvol+"',NOW());"; 
        System.out.println(query1);
        try{
        Statement stm=con.prepareStatement(query1);
             

            int rs = stm.executeUpdate(query1);

    

   
    
    
    

}
catch(SQLException e) {
    JOptionPane.showMessageDialog(rootPane, "La reservation n'a pas été effectué");
      e.printStackTrace();
    }
        JOptionPane.showMessageDialog(rootPane, "La reservation a été bien effectué");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed
    
    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        new Accueil().setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseClicked

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    // End of variables declaration//GEN-END:variables
}
