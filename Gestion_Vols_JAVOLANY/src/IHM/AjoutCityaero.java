/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;

import DAO.ConnexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ayoub
 */
public class AjoutCityaero extends javax.swing.JFrame {

    /**
     * Creates new form Accueil
     */
    Connection con =ConnexionBD.Conexion();
    public AjoutCityaero() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
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

        jLabel3.setFont(new java.awt.Font("Trajan Pro", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Ajouter Ville/Aero");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(210, 30, 380, 130);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nom Ville :");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(40, 220, 180, 30);

        jButton1.setText("Valider");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(450, 360, 100, 40);

        jButton2.setText("Annuler");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(260, 360, 100, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Aeroport :");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(400, 220, 180, 30);

        ArrayList<String> aeros = new ArrayList<String>();
        String quer = "SELECT nomAeroport FROM aeroport";
        try{
            PreparedStatement stm = con.prepareStatement(quer);

            ResultSet rs = stm.executeQuery(quer);

            while (rs.next()) {
                String aero = rs.getString("nomAeroport");
                // add group names to the array list
                aeros.add(aero);

            }

            rs.close();
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
        DefaultComboBoxModel mod = new DefaultComboBoxModel(aeros.toArray());
        jComboBox4.setModel(mod);
        jComboBox4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox4);
        jComboBox4.setBounds(520, 220, 230, 30);

        ArrayList<String> villes = new ArrayList<String>();
        String query = "SELECT nomVille FROM ville";
        try{
            PreparedStatement stm = con.prepareStatement(query);

            ResultSet rs = stm.executeQuery(query);

            while (rs.next()) {
                String ville = rs.getString("nomVille");
                // add group names to the array list
                villes.add(ville);

            }

            rs.close();
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
        DefaultComboBoxModel model = new DefaultComboBoxModel(villes.toArray());
        jComboBox5.setModel(model);
        jComboBox5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox5);
        jComboBox5.setBounds(130, 222, 230, 30);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Home page.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel10);
        jLabel10.setBounds(10, 0, 50, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/JFrame.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 490);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_closeMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new AccueilAdmin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       int vl = 0;
       String aero = null;
       String quer1 = "SELECT idVille FROM ville where nomVille ='"+(String)jComboBox5.getSelectedItem()+"'";
       String quer2 = "SELECT idAeroport FROM aeroport where nomAeroport ='"+(String)jComboBox4.getSelectedItem()+"'";
       System.out.println(quer1);
       System.out.println(quer2);
        try {
            PreparedStatement stm1=con.prepareStatement(quer1);
            PreparedStatement stm2=con.prepareStatement(quer2);
            
        
       ResultSet res = stm1.executeQuery();
       ResultSet res2 = stm2.executeQuery();
       if(res.next())
       {
           vl=res.getInt("idVille");
           
       }
       if(res2.next())
       {
           aero=res2.getString("idAeroport");
           
       }
               } catch (SQLException ex) {
            Logger.getLogger(AjoutCityaero.class.getName()).log(Level.SEVERE, null, ex);
        }
        String query1 = "INSERT INTO dessert (idVille,idAeroport) VALUES ('"+vl+"','"+aero+"');"; 
        System.out.println(query1);
        try{
        Statement stm=con.prepareStatement(query1);
             

            int rs = stm.executeUpdate(query1);

    

   
    
    

}
catch(SQLException e) {
    JOptionPane.showMessageDialog(rootPane, "L'aeroport/ville n'a pas été Ajouté");
      e.printStackTrace();
    }
JOptionPane.showMessageDialog(rootPane, "L'aeroport/ville a été bien Ajouté");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        new AccueilAdmin().setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseClicked

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}