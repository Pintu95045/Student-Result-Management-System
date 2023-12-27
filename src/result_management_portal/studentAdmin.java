/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package result_management_portal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import org.apache.commons.dbutils.DbUtils;

/**
 *
 * @author Pintu Giri
 */
public class studentAdmin extends javax.swing.JFrame {

	/**
	 * Creates new form studentAdmin
	 */
	public studentAdmin() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jLabel2 = new javax.swing.JLabel();
                jLabel1 = new javax.swing.JLabel();
                jTextField1 = new javax.swing.JTextField();
                jButton1 = new javax.swing.JButton();
                jButton2 = new javax.swing.JButton();
                jLabel3 = new javax.swing.JLabel();

                jLabel2.setText("jLabel2");

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel1.setText("Enter Your Roll Number");
                getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 174, -1));

                jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 149, -1));

                jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/result_management_portal/icons8-search-20.png"))); // NOI18N
                jButton1.setText("Search");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton1ActionPerformed(evt);
                        }
                });
                getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, -1, -1));

                jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/result_management_portal/icons8-cancel-20.png"))); // NOI18N
                jButton2.setText("Cancel");
                jButton2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton2ActionPerformed(evt);
                        }
                });
                getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, -1, -1));

                jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/result_management_portal/pexels-alexander-kovalev-2847648.jpg"))); // NOI18N
                jLabel3.setText("jLabel3");
                getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 510));

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                // TODO add your handling code here:
		String rollno=jTextField1.getText();
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/SRMS","root","1234");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from result where result.rollno='"+rollno+"'");
			if(rs.next()){
				setVisible(false);
				new studentIndex(rollno).setVisible(true);
			}
			else{
				JOptionPane.showMessageDialog(null, "Incorrect roll number");
			}
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null, e.toString());
		}
        }//GEN-LAST:event_jButton1ActionPerformed

        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                // TODO add your handling code here:
		setVisible(false);
		new index().setVisible(true);
        }//GEN-LAST:event_jButton2ActionPerformed

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
			java.util.logging.Logger.getLogger(studentAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(studentAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(studentAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(studentAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new studentAdmin().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton2;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JTextField jTextField1;
        // End of variables declaration//GEN-END:variables
}
