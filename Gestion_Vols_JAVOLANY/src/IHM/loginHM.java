/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;
import DAO.ConnexionBD;
import Reservation.Users;
import com.sun.org.glassfish.gmbal.Description;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 *
 * @author Admin
 */
public class loginHM extends javax.swing.JFrame {
    int xMouse;
    int yMouse;
    Connection conn=null;
    ResultSet rs=null;
    PreparedStatement ps=null;
    /**
     * Creates new form LoginGUI
     */
    public loginHM() {
        initComponents();
        
        conn=ConnexionBD.Conexion();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn = new javax.swing.JLabel();
        txtlogin = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        close = new javax.swing.JLabel();
        MouveJframe = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMousePressed(evt);
            }
        });
        btn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnKeyReleased(evt);
            }
        });
        getContentPane().add(btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 160, 50));

        txtlogin.setBackground(new java.awt.Color(255, 255, 255));
        txtlogin.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        txtlogin.setForeground(new java.awt.Color(153, 153, 153));
        txtlogin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtlogin.setBorder(null);
        txtlogin.setCaretColor(new java.awt.Color(102, 102, 102));
        txtlogin.setOpaque(false);
        txtlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtloginActionPerformed(evt);
            }
        });
        txtlogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtloginKeyPressed(evt);
            }
        });
        getContentPane().add(txtlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 300, 50));

        txtpassword.setBackground(new java.awt.Color(255, 255, 255));
        txtpassword.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        txtpassword.setForeground(new java.awt.Color(153, 153, 153));
        txtpassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtpassword.setBorder(null);
        txtpassword.setCaretColor(new java.awt.Color(102, 102, 102));
        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });
        getContentPane().add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 300, 50));

        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 50, 50));

        MouveJframe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/login.png"))); // NOI18N
        MouveJframe.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MouveJframeMouseDragged(evt);
            }
        });
        MouveJframe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MouveJframeMousePressed(evt);
            }
        });
        getContentPane().add(MouveJframe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 400));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/login.png"))); // NOI18N
        background.setText("jLabel2");
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtloginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtloginActionPerformed

    private void txtloginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtloginKeyPressed
       
    }//GEN-LAST:event_txtloginKeyPressed

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordActionPerformed

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void MouveJframeMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MouveJframeMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_MouveJframeMouseDragged

    private void MouveJframeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MouveJframeMousePressed
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_MouveJframeMousePressed

    private void btnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnKeyReleased
        ImageIcon img=new ImageIcon(getClass().getResource("/Images/button_Hover.png"));
        btn.setIcon(img);
    }//GEN-LAST:event_btnKeyReleased

    private void btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMouseEntered
        ImageIcon img=new ImageIcon(getClass().getResource("/Images/button_Hover.png"));
        btn.setIcon(img);
    }//GEN-LAST:event_btnMouseEntered

    private void btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMouseExited
        ImageIcon img=new ImageIcon(getClass().getResource("/Images/button_Large.png"));
        btn.setIcon(img);
    }//GEN-LAST:event_btnMouseExited

    private void btnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMousePressed
       ImageIcon img=new ImageIcon(getClass().getResource("/Images/button_Pressed.png"));
        btn.setIcon(img);
    }//GEN-LAST:event_btnMousePressed

    private void btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMouseClicked
        String requete="select * from users where Pseudo=? and Password=md5(?)";
        try{
            ps=conn.prepareStatement(requete);
            ps.setString(1,txtlogin.getText());
            ps.setString(2,txtpassword.getText());
            rs=ps.executeQuery();
            
        if(rs.next()){
            Users.Name=rs.getString("Pseudo");
            Users.Type=rs.getString("Type");
            Users.Id=rs.getInt("ID");
            if(Users.Type.equals("Admin"))
            {
                new AccueilAdmin().setVisible(true);
                this.dispose();
            }
            else if(Users.Type.equals("Client"))
            {
                new Accueil().setVisible(true);
                this.dispose();
            }
            else if(Users.Type.equals("Comp"))
            {
                new AccueilCompanie().setVisible(true);
                this.dispose();
            }
            
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Invalid Username Or Password");
        }
         
             
        }catch(SQLException e){
            System.out.println("-->Exception : "+e);
                   }
              
    }//GEN-LAST:event_btnMouseClicked
                          
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
            java.util.logging.Logger.getLogger(loginHM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginHM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginHM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginHM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new loginHM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MouveJframe;
    private javax.swing.JLabel background;
    private javax.swing.JLabel btn;
    private javax.swing.JLabel close;
    private javax.swing.JTextField txtlogin;
    private javax.swing.JPasswordField txtpassword;
    // End of variables declaration//GEN-END:variables
}
