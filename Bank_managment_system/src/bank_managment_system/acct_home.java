/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * acct_home.java
 *
 * Created on Jan 16, 2016, 11:50:17 PM
 */

package bank_managment_system;
import java.sql.*;
/**
 *
 * @author Sumu
 */
public class acct_home extends javax.swing.JFrame {

    
    public acct_home(log_in pd,DatabaseTest_1 dt) {
        this.pd=pd;
        this.dt=dt;
        initComponents();
    }

  

   



    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 500));
        setName("Form"); // NOI18N
        getContentPane().setLayout(null);

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(bank_managment_system.Bank_managment_systemApp.class).getContext().getResourceMap(acct_home.class);
        jButton1.setText(resourceMap.getString("jButton1.text")); // NOI18N
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(80, 130, 90, 23);

        jButton2.setText(resourceMap.getString("jButton2.text")); // NOI18N
        jButton2.setName("jButton2"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(200, 170, 110, 23);

        jButton3.setText(resourceMap.getString("jButton3.text")); // NOI18N
        jButton3.setName("jButton3"); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(360, 200, 73, 23);

        jLabel1.setIcon(resourceMap.getIcon("jLabel1.icon")); // NOI18N
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 290, 310, 110);

        jLabel2.setIcon(resourceMap.getIcon("jLabel2.icon")); // NOI18N
        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 110, 120, 60);

        jLabel3.setIcon(resourceMap.getIcon("jLabel3.icon")); // NOI18N
        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(190, 150, 130, 60);

        jLabel4.setIcon(resourceMap.getIcon("jLabel4.icon")); // NOI18N
        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(330, 180, 120, 60);

        jLabel5.setFont(resourceMap.getFont("jLabel5.font")); // NOI18N
        jLabel5.setForeground(resourceMap.getColor("jLabel5.foreground")); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText(resourceMap.getString("jLabel5.text")); // NOI18N
        jLabel5.setName("jLabel5"); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(130, 50, 250, 30);

        jLabel6.setIcon(resourceMap.getIcon("jLabel6.icon")); // NOI18N
        jLabel6.setText(resourceMap.getString("jLabel6.text")); // NOI18N
        jLabel6.setName("jLabel6"); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 30, 430, 410);

        jLabel7.setIcon(resourceMap.getIcon("jLabel7.icon")); // NOI18N
        jLabel7.setText(resourceMap.getString("jLabel7.text")); // NOI18N
        jLabel7.setName("jLabel7"); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 500, 480);

        pack();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        java.awt.Dimension dialogSize = getSize();
        setLocation((screenSize.width-dialogSize.width)/2,(screenSize.height-dialogSize.height)/2);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
            this.setVisible(false);
              log_in t=new log_in();
              t.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

         info p=new info(pd,dt );
       this.setVisible(false);
       p.setVisible(true);
       try{
            ResultSet rs=dt.dbc.searchDB("select * from news where NID='"+pd.NID+"'");
            while(rs.next()){
                NID=rs.getString("NID");
                Username=rs.getString("Username");
                Password=rs.getString("Password");
                Secw=rs.getString("Secw");
                Contact=rs.getString("Contact");
                Email=rs.getString("Email");
                Gender=rs.getString("Gender");
                System.out.println(Contact);
            }
            rs.close();
            p.jLabel1.setText(NID);
            p.jLabel2.setText(Username);
            p.jLabel3.setText(Password);
            p.jLabel4.setText(Secw);
            p.jLabel5.setText(Contact);
            p.jLabel6.setText(Email);
            p.jLabel7.setText(Gender);

       }catch(Exception s){System.out.println("Dint found");}
       // TODO add your handling code here:

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

          update uw=new update(pd,dt);
          this.setVisible(false);
          uw.setVisible(true);
          uw.jLabel1.setText(pd.NID);
          try{
            ResultSet rs=dt.dbc.searchDB("select * from news where NID='"+pd.NID+"'");
            while(rs.next()){
                NID=rs.getString("NID");
                Username=rs.getString("Username");
                Password=rs.getString("Password");
                Secw=rs.getString("Secw");
                Contact=rs.getString("Contact");
                Email=rs.getString("Email");
                Gender=rs.getString("Gender");
                System.out.println(Contact);
            }
            rs.close();

            uw.jLabel10.setText(Username);
            uw.jLabel11.setText(Password);
            uw.jLabel12.setText(Secw);
            uw.jLabel13.setText(Contact);
            uw.jLabel14.setText(Email);


       }catch(Exception s){System.out.println("Dint found");}

          System.out.println("one last "+ pd.NID);
         
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
    * @param args the command line arguments
    */
    // Variables declaration - do not modify
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration


      public log_in pd;
    public DatabaseTest_1 dt;

    String NID=new String();
    String Username=new String();
    String Password=new String();
    String Secw=new String();
    String Contact=new String();
    String Email=new String();
    String Gender=new String();





/*
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
*/
}