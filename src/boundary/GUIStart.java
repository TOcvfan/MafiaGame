/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundary;

import changea.Control;
import entity.User;
import interfaces.ChangeAInterface;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

/**
 *
 * @author TOcvfan
 */
public class GUIStart extends javax.swing.JFrame {
    
    private ChangeAInterface control = new Control();
    
    private String name;
    
    ArrayList<User> list;

    /**
     * Creates new form GUI1
     */
    public GUIStart() {
	initComponents();
	this.setLocationRelativeTo(null);
	this.setSize(600, 425);
	//control.load();
}

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonStart = new javax.swing.JButton();
        jButtonHighScores = new javax.swing.JButton();
        jTextFieldName = new javax.swing.JTextField();
        jLabelName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelBaggrund = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButtonStart.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonStart.setText("GO");
        jButtonStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStartActionPerformed(evt);
            }
        });
        jButtonStart.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonStartKeyPressed(evt);
            }
        });
        getContentPane().add(jButtonStart);
        jButtonStart.setBounds(480, 120, 100, 40);

        jButtonHighScores.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonHighScores.setText("High scores");
        jButtonHighScores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHighScoresActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonHighScores);
        jButtonHighScores.setBounds(20, 340, 110, 40);

        jTextFieldName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldNameKeyPressed(evt);
            }
        });
        getContentPane().add(jTextFieldName);
        jTextFieldName.setBounds(140, 120, 310, 40);

        jLabelName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelName.setText("Player Name");
        getContentPane().add(jLabelName);
        jLabelName.setBounds(30, 120, 110, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MAFIA GAME");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 600, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Enter your name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 210, 600, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Click go or press enter to start the game");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 250, 600, 30);

        jLabelBaggrund.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boundary/images/verden.PNG"))); // NOI18N
        jLabelBaggrund.setLabelFor(this);
        getContentPane().add(jLabelBaggrund);
        jLabelBaggrund.setBounds(0, 0, 600, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStartActionPerformed
        control.addName(jTextFieldName.getText());
	GUIMain play = new GUIMain(control);
        play.setVisible(true);
	this.setVisible(false);
    }//GEN-LAST:event_jButtonStartActionPerformed

    private void jButtonStartKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonStartKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonStartKeyPressed

    private void jTextFieldNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNameKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
	    control.addName(jTextFieldName.getText());
	    //System.out.println("fisk");
	    GUIMain play = new GUIMain(control);
	    play.setVisible(true);
	    this.setVisible(false);
	}
    }//GEN-LAST:event_jTextFieldNameKeyPressed

    private void jButtonHighScoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHighScoresActionPerformed
        GUIHighScores h = new GUIHighScores();
	h.setVisible(true);
	this.setVisible(false);
    }//GEN-LAST:event_jButtonHighScoresActionPerformed

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
	    java.util.logging.Logger.getLogger(GUIStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (InstantiationException ex) {
	    java.util.logging.Logger.getLogger(GUIStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (IllegalAccessException ex) {
	    java.util.logging.Logger.getLogger(GUIStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (javax.swing.UnsupportedLookAndFeelException ex) {
	    java.util.logging.Logger.getLogger(GUIStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	}
        //</editor-fold>
        //</editor-fold>

	/* Create and display the form */
	java.awt.EventQueue.invokeLater(new Runnable() {
	    public void run() {
		new GUIStart().setVisible(true);
	    }
	});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonHighScores;
    private javax.swing.JButton jButtonStart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelBaggrund;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JTextField jTextFieldName;
    // End of variables declaration//GEN-END:variables
}