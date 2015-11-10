/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundary;

import changea.Control;
import interfaces.ChangeAInterface;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Christian
 */
public class GUIMain extends javax.swing.JFrame {

    DefaultListModel listCountry = new DefaultListModel();
    private ChangeAInterface control;
    GUIStart n = new GUIStart();
    

    /**
     * Creates new form GUIDenmark
     */
    public GUIMain(ChangeAInterface control) {
	initComponents();
	this.setLocationRelativeTo(null);
	this.setSize(600, 425);
	this.control = control;
	jListCountry.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	control.getRandomDrugStats();
	control.makeInventory();
	jLabelName.setText(control.getName());
	jLabelCountry.setText("Denmark");
	jListCountry.setModel(listCountry);
	addToList();
	jLabelData.setText(control.userStock(2));
	if (control.travel() == true) {
	    //System.out.println("test");
	    GameOver go = new GameOver();
	    go.setVisible(true);
	    this.setVisible(false);
	}
	
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jLabelTitle = new javax.swing.JLabel();
        jLabelFlag = new javax.swing.JLabel();
        jLabelData = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jLabelCountry = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListCountry = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jLabelBaggrund = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabelTitle.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(153, 0, 153));
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("MAFIA GAME");
        getContentPane().add(jLabelTitle);
        jLabelTitle.setBounds(0, 0, 600, 40);

        jLabelFlag.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boundary/images/denmark-flag.png"))); // NOI18N
        getContentPane().add(jLabelFlag);
        jLabelFlag.setBounds(90, 70, 100, 76);

        jLabelData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelData.setText("Data About Drugs");
        jLabelData.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabelData);
        jLabelData.setBounds(150, 360, 300, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Player name");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 160, 200, 30);

        jLabelName.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabelName.setForeground(new java.awt.Color(0, 51, 204));
        jLabelName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelName.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        getContentPane().add(jLabelName);
        jLabelName.setBounds(20, 190, 200, 30);

        jLabelCountry.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabelCountry.setForeground(new java.awt.Color(153, 0, 153));
        jLabelCountry.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCountry.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(jLabelCountry);
        jLabelCountry.setBounds(240, 120, 130, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 0, 204));
        jButton1.setText("Buy/Sell Drugs");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(240, 260, 150, 50);

        jButton3.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 0, 204));
        jButton3.setText("High Scores");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(70, 260, 125, 50);

        jListCountry.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jListCountry.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 6" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jListCountry.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jListCountry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListCountryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jListCountry);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(450, 160, 100, 120);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("You are in:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(220, 80, 170, 30);

        jLabelBaggrund.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boundary/images/verden2.PNG"))); // NOI18N
        getContentPane().add(jLabelBaggrund);
        jLabelBaggrund.setBounds(0, 0, 600, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
	GUIHighScores sell = new GUIHighScores();
	sell.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
	GUIBuySell buy = new GUIBuySell(control);
	buy.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jListCountryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListCountryMouseClicked
	GUITravel t = new GUITravel();
	t.setVisible(true);
	control.getRandomDrugStats();
	String a = (String) jListCountry.getSelectedValue();
	jLabelCountry.setText(a);
	jLabelData.setText(control.userStock(2));
	if (control.travel() == true) {
	    //System.out.println("test");
	    GameOver go = new GameOver();
	    go.setVisible(true);
	    this.setVisible(false);
	}

	String[] country = control.loadCountries();
	if (jListCountry.getSelectedValue() == "Columbia") {
	    ImageIcon background = new ImageIcon("Images/verden3.png");
	    ImageIcon iconLogo = new ImageIcon("Images/colombiasflag.png");
	    jLabelFlag.setIcon(iconLogo);
	    jLabelBaggrund.setIcon(background);
	} else if (jListCountry.getSelectedValue() == "Denmark") {
	    ImageIcon background = new ImageIcon("Images/verden2.png");
	    ImageIcon iconLogo = new ImageIcon("Images/denmark-flag.png");
	    jLabelFlag.setIcon(iconLogo);
	    jLabelBaggrund.setIcon(background);
	} else if (jListCountry.getSelectedValue() == "Germany") {
	    ImageIcon background = new ImageIcon("Images/Germany.png");
	    ImageIcon iconLogo = new ImageIcon("Images/germanyflag.jpg");
	    jLabelFlag.setIcon(iconLogo);
	    jLabelBaggrund.setIcon(background);
	} else if (jListCountry.getSelectedValue() == "USA") {
	    ImageIcon background = new ImageIcon("Images/USA.png");
	    ImageIcon iconLogo = new ImageIcon("Images/American-flag.png");
	    jLabelFlag.setIcon(iconLogo);
	    jLabelBaggrund.setIcon(background);
	} else if (jListCountry.getSelectedValue() == "France") {
	    ImageIcon background = new ImageIcon("Images/FRance.png");
	    ImageIcon iconLogo = new ImageIcon("Images/Frankrigflag.jpg");
	    jLabelFlag.setIcon(iconLogo);
	    jLabelBaggrund.setIcon(background);
	} else if (jListCountry.getSelectedValue() == "Afghanistan") {
	    ImageIcon background = new ImageIcon("Images/afganistan.png");
	    ImageIcon iconLogo = new ImageIcon("Images/FlagAfghanistan.png");
	    jLabelFlag.setIcon(iconLogo);
	    jLabelBaggrund.setIcon(background);
	}
    }//GEN-LAST:event_jListCountryMouseClicked


    private void addToList() {
	String[] country = control.loadCountries();
	for (int i = 0; i < 6; i++) {
	    listCountry.addElement(country[i]);

	}
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelBaggrund;
    private javax.swing.JLabel jLabelCountry;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelFlag;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JList jListCountry;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}