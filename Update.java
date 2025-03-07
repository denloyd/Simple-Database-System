/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pakage1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
import javax.swing.JOptionPane;
import java.lang.*;
/**
 *
 * @author denlo
 */
public class Update extends javax.swing.JFrame {
    boolean search=true;
     Connection con;
    PreparedStatement pst;
    ResultSet rs;
    /**
     * Creates new form Update
     */
    public Update() {
        initComponents();
        Connect();
        textName.setText("");
        textName.setEnabled(true);
        textLast.setText("");
        textLast.setEnabled(false);
        textAddress.setText("");
        textAddress.setEnabled(false);
        textNum.setText("");
        textNum.setEnabled(false);
        textEmail.setText("");
        textEmail.setEnabled(false);
        textPass.setText("");
        textPass.setEnabled(false);
        
        editButton.setEnabled(false);

        Update.this.setLocation(330,140);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        searchId = new javax.swing.JTextField();
        textName = new javax.swing.JTextField();
        textLast = new javax.swing.JTextField();
        textAddress = new javax.swing.JTextField();
        textNum = new javax.swing.JTextField();
        textEmail = new javax.swing.JTextField();
        editButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        SearchButton = new javax.swing.JButton();
        textPass = new javax.swing.JPasswordField();
        exitButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel1.setText("ID Number:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 85, 38));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel9.setText("First Name:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, -1, 40));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel4.setText("Last Name:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 96, 38));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel7.setText("City:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 71, 38));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel6.setText("Mobile No.");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 80, 38));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel8.setText("Email:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, 62, 38));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel2.setText("Password:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, -1, 38));

        searchId.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(searchId, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 110, 40));

        textName.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(textName, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 110, 40));

        textLast.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(textLast, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 110, 40));

        textAddress.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(textAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, 110, 40));

        textNum.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(textNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 230, 110, 40));

        textEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(textEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 280, 110, 40));

        editButton.setBackground(new java.awt.Color(153, 255, 153));
        editButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 14)); // NOI18N
        editButton.setText("EDIT");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });
        getContentPane().add(editButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 450, -1, -1));

        deleteButton.setBackground(new java.awt.Color(0, 0, 0));
        deleteButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 14)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("DELETE");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 450, -1, -1));

        SearchButton.setBackground(new java.awt.Color(51, 204, 255));
        SearchButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 14)); // NOI18N
        SearchButton.setText("SEARCH");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SearchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 450, -1, -1));

        textPass.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(textPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 330, 110, 40));

        exitButton.setBackground(new java.awt.Color(255, 51, 51));
        exitButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 14)); // NOI18N
        exitButton.setText("EXIT");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 450, 80, 30));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 255));
        jLabel3.setText("UPDATE YOUR INFORMATION");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\denlo\\Downloads\\border-template-with-space-theme-in-background-vector-28558467.jpg")); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        
        int answer;
        answer = JOptionPane.showConfirmDialog(null, "Are you sure you want to update this record?","System Message",JOptionPane.YES_NO_OPTION);
        if(answer==JOptionPane.YES_OPTION){
        
            try {
                deleteButton.setEnabled(false);
            Connection cn;
            Statement st;
            String url;
            url = "jdbc:mysql://localhost:3306/final_oopdb";
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = (Connection) DriverManager.getConnection(url, "root","loydi");
            st = (Statement) cn.createStatement();
             st.executeUpdate("UPDATE reg_table SET  fname= '"
                     +textName.getText()+"',lname= '"
                     +textLast.getText()+"', city= '"
                     +textAddress.getText()+"',mobileno= '"
                     +textNum.getText()+"',email = '"
                     +textEmail.getText()+"',pass='"
                     +textPass.getText()
                     +"'Where id = '"
                     +searchId.getText()+"' ");
                      
            textName.setEnabled(true);
            textLast.setEnabled(true);
            textAddress.setEnabled(true);
            textNum.setEnabled(true);
            textEmail.setEnabled(true);
             textPass.setEnabled(true);
              JOptionPane.showMessageDialog(null, "Record Updated","System Message",JOptionPane.INFORMATION_MESSAGE);
           
        } catch (ClassNotFoundException ex) {
            //Logger.getLogger(frameTerminateEdit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            //Logger.getLogger(frameTerminateEdit.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        
        int answer;
        answer = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this record?","System Message",JOptionPane.YES_NO_OPTION);
        if(answer==JOptionPane.YES_OPTION){
            try {
             Connection cn;
            Statement st;
            String url;



            url = "jdbc:mysql://localhost:3306/final_oopdb";
            cn = (Connection) DriverManager.getConnection(url, "root","loydi");
            st = (Statement) cn.createStatement();
             st.executeUpdate("UPDATE reg_table SET  fname= '"+textName.getText()+
                     "',lname= '"+textLast.getText()+
                     "', city= '"+textAddress.getText()+
                     "',mobileno= '"+textNum.getText()+
                     "',email = '"+textEmail.getText()+
                      "',pass = '"+textPass.getText()+
                     "'Where id = '"+searchId.getText()+"' ");

                String query;
                query = "Delete From reg_table Where id='" + searchId.getText() + "'";
                st.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Record Deleted","System Message",JOptionPane.INFORMATION_MESSAGE);
                 textName.setText("");
            textLast.setText("");
            textAddress.setText("");
            textNum.setText("");
            textEmail.setText("");
            textPass.setText("");
           
            
            } catch (SQLException ex) {
            }
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

 public void Connect()
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/final_oopdb","root","loydi");
            
        } catch (ClassNotFoundException ex) {
          
        } catch (SQLException ex) {
          
        }
    }   
    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
       
        try {
             pst = con.prepareStatement("select id, fname, lname, city,mobileno, email, pass from reg_table where  id = ?");
            int Id = Integer.parseInt(searchId.getText());
            pst.setInt(1, Id);
            ResultSet rs1 = pst.executeQuery();
            if(rs1.next()==false)
                {
                JOptionPane.showMessageDialog(this, "Sorry Record Not Found");
                                textName.setText("");
                                textLast.setText("");
                                textAddress.setText("");
                                textNum.setText("");
                                textEmail.setText("");
                                textPass.setText("");
                                searchId.requestFocus();
              }
            else
            {
            textName.setText(rs1.getString("fname"));
            textLast.setText(rs1.getString("lname"));
            textAddress.setText(rs1.getString("city"));
            textNum.setText(rs1.getString("mobileno"));
            textEmail.setText(rs1.getString("email"));
            textPass.setText(rs1.getString("pass"));
            editButton.setEnabled(true);
        }
            
        } catch (SQLException ex) {
            //Logger.getLogger(SearchJdbc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SearchButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        int answer = JOptionPane.showConfirmDialog(
                null, "Are you sure you want to exit?", "Exit Confirmation", JOptionPane.YES_NO_OPTION);
        if (answer == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_exitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SearchButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField searchId;
    private javax.swing.JTextField textAddress;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textLast;
    private javax.swing.JTextField textName;
    private javax.swing.JTextField textNum;
    private javax.swing.JPasswordField textPass;
    // End of variables declaration//GEN-END:variables
}
