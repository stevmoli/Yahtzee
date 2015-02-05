
package my.Yahtzee;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

//by Steven Molitor and Chloe Revery

public class YahtzeeUI extends javax.swing.JFrame {

   
    public YahtzeeUI() {
        
        initComponents();
        
    }

    int dice1, dice2, dice3, dice4, dice5, dice6;
    
    
    @SuppressWarnings("unchecked") //unnecessary?
   
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jToggleButton11 = new javax.swing.JToggleButton();
        jToggleButton12 = new javax.swing.JToggleButton();
        jToggleButton13 = new javax.swing.JToggleButton();
        jToggleButton14 = new javax.swing.JToggleButton();
        jToggleButton15 = new javax.swing.JToggleButton();
        jLabel21 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        jToggleButton7 = new javax.swing.JToggleButton();
        jToggleButton8 = new javax.swing.JToggleButton();
        jToggleButton9 = new javax.swing.JToggleButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jToggleButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); 
        jToggleButton1.setText("   CP'S TURN    ");
        jToggleButton1.setBackground(Color.RED);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 180, 0, 0);
        jPanel1.add(jToggleButton1, gridBagConstraints);

        jToggleButton2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); 
        jToggleButton2.setText("YOUR TURN");
        jToggleButton2.setBackground(Color.GREEN);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 6, 0, 0);
        jPanel1.add(jToggleButton2, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Noteworthy", 3, 18)); 
        jLabel1.setText("          YAHTZEE!");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 49;
        gridBagConstraints.ipady = 22;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 221, 0, 0);
        jPanel1.add(jLabel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.ipadx = 397;
        gridBagConstraints.ipady = -1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(jPanel1, gridBagConstraints);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/Yahtzee/blankdiceresized.jpeg"))); 
        jLabel5.setMaximumSize(new java.awt.Dimension(300, 200));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 96, 0, 0);
        jPanel2.add(jLabel5, gridBagConstraints);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/Yahtzee/blankdiceresized.jpeg"))); 
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 88, 0, 0);
        jPanel2.add(jLabel7, gridBagConstraints);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/Yahtzee/blankdiceresized.jpeg"))); 
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 59, 0, 0);
        jPanel2.add(jLabel8, gridBagConstraints);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/Yahtzee/blankdiceresized.jpeg"))); 
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 88, 0, 100);
        jPanel2.add(jLabel9, gridBagConstraints);

        jToggleButton11.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); 
        jToggleButton11.setText("HOLD");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 96, 22, 0);
        jPanel2.add(jToggleButton11, gridBagConstraints);

        jToggleButton12.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); 
        jToggleButton12.setText("HOLD");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 105, 22, 0);
        jPanel2.add(jToggleButton12, gridBagConstraints);

        jToggleButton13.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); 
        jToggleButton13.setText("HOLD");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 88, 22, 0);
        jPanel2.add(jToggleButton13, gridBagConstraints);

        jToggleButton14.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); 
        jToggleButton14.setText("HOLD");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 59, 22, 0);
        jPanel2.add(jToggleButton14, gridBagConstraints);

        jToggleButton15.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); 
        jToggleButton15.setText("HOLD");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 88, 22, 0);
        jPanel2.add(jToggleButton15, gridBagConstraints);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/Yahtzee/blankdiceresized.jpeg")));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 105, 0, 0);
        jPanel2.add(jLabel21, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 138;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        getContentPane().add(jPanel2, gridBagConstraints);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jToggleButton3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); 
        jToggleButton3.setText("3 OF A KIND");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 202, 3, 0);
        jPanel3.add(jToggleButton3, gridBagConstraints);

        jToggleButton4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13));
        jToggleButton4.setText("4 OF A KIND");
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 0, 3, 0);
        jPanel3.add(jToggleButton4, gridBagConstraints);

        
        
        jToggleButton5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); 
        jToggleButton5.setText("FULL HOUSE");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 0, 3, 0);
        jPanel3.add(jToggleButton5, gridBagConstraints);

        jToggleButton6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); 
        jToggleButton6.setText("CHANCE");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 38;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 0, 3, 0);
        jPanel3.add(jToggleButton6, gridBagConstraints);

        jToggleButton7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); 
        jToggleButton7.setText("YAHTZEE!");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 41;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 0, 3, 202);
        jPanel3.add(jToggleButton7, gridBagConstraints);

        jToggleButton8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); 
        jToggleButton8.setText("SM. STRAIGHT");
        jToggleButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 0, 3, 0);
        jPanel3.add(jToggleButton8, gridBagConstraints);

        jToggleButton9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); 
        jToggleButton9.setText("LG. STRAIGHT");
        jToggleButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 0, 3, 0);
        jPanel3.add(jToggleButton9, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.ipadx = -88;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        getContentPane().add(jPanel3, gridBagConstraints);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13));
        jLabel2.setText("YOU");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 7, 0, 0);
        jPanel4.add(jLabel2, gridBagConstraints);

        jLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); 
        jLabel11.setText("ROLL SCORE:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(42, 6, 0, 0);
        jPanel4.add(jLabel11, gridBagConstraints);

        jLabel14.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13));
        jLabel14.setText("TOTAL SCORE:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 107, 0);
        jPanel4.add(jLabel14, gridBagConstraints);

        jLabel15.setText("00");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 22;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(42, 9, 0, 0);
        jPanel4.add(jLabel15, gridBagConstraints);

        jLabel16.setText("00");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 42;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 9, 0, 34);
        jPanel4.add(jLabel16, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipady = -8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        getContentPane().add(jPanel4, gridBagConstraints);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new java.awt.GridBagLayout());

        jButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); 
        jButton1.setText("ROLL");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 31;
        gridBagConstraints.ipady = 31;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 134, 0, 0);
        jPanel6.add(jButton1, gridBagConstraints);

        jButton2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); 
        jButton2.setText("SUBMIT");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 31;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 15, 0, 139);
        jPanel6.add(jButton2, gridBagConstraints);

        jButton3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); 
        jButton3.setText("RULES");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 31;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 130, 0, 0);
        jPanel6.add(jButton3, gridBagConstraints);

        jButton4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); 
        jButton4.setText("RESTART");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 15, 0, 139);
        jPanel6.add(jButton4, gridBagConstraints);

        jLabel19.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); 
        jLabel19.setText("Roll Number:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 165, 47, 0);
        jPanel6.add(jLabel19, gridBagConstraints);

        jLabel20.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); 
        jLabel20.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 25, 47, 0);
        jPanel6.add(jLabel20, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 228;
        gridBagConstraints.ipady = -8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        getContentPane().add(jPanel6, gridBagConstraints);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.GridBagLayout());

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); 
        jLabel4.setText("CP");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 101, 0, 0);
        jPanel5.add(jLabel4, gridBagConstraints);

        jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); 
        jLabel12.setText("ROLL SCORE:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 29;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(44, 6, 0, 0);
        jPanel5.add(jLabel12, gridBagConstraints);

        jLabel13.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); 
        jLabel13.setText("TOTAL SCORE:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 31;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 110, 0);
        jPanel5.add(jLabel13, gridBagConstraints);

        jLabel17.setText("00");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 14;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(44, 12, 0, 0);
        jPanel5.add(jLabel17, gridBagConstraints);

        jLabel18.setText("00");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 24;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 12, 110, 43);
        jPanel5.add(jLabel18, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.ipady = -8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        getContentPane().add(jPanel5, gridBagConstraints);

        pack();
    }

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {
        restart();
    }
    
    public void restart() {
        
        jLabel15.setText("00");
        jLabel16.setText("00");
        jLabel17.setText("00");
        jLabel18.setText("00");
        jLabel20.setText("00");
        jLabel20.setText("0");
        
        setDiceNull();
        deselectHoldButtons();
        deselectRollDescriptions();
        
        jToggleButton1.setBackground(Color.RED);
        jToggleButton2.setBackground(Color.GREEN);
        jPanel4.setBackground(Color.WHITE);
        jPanel5.setBackground(Color.WHITE);
        total=0;
        cptotal=0;
    }

    
    JFrame frame = new JFrame();
    
    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {
        if (jToggleButton1.getBackground().equals(Color.GREEN)) {
            JOptionPane.showMessageDialog(frame,
                                                "It's not your turn!",
                                                "Error",
                                                 JOptionPane.PLAIN_MESSAGE);
        } else if (jPanel4.getBackground().equals(Color.GREEN)) {
            JOptionPane.showMessageDialog(frame,
                                                "You win. Press the RESTART button to play again.",
                                                "GAME OVER!",
                                                 JOptionPane.PLAIN_MESSAGE);
        } else if (jPanel5.getBackground().equals(Color.GREEN)) {
            JOptionPane.showMessageDialog(frame,
                                                "CP wins. Press the RESTART button to play again.",
                                                "GAME OVER!",
                                                 JOptionPane.PLAIN_MESSAGE);
        } else {
            
            if (jLabel20.getText().equals("0")) {
                JOptionPane.showMessageDialog(frame,
                                                "Please roll first.",
                                                "Error",
                                                 JOptionPane.PLAIN_MESSAGE);
            }
            else if (buttonCheck() == 0) {JOptionPane.showMessageDialog(frame,
                                                "Please select a button.",
                                                "Error",
                                                 JOptionPane.PLAIN_MESSAGE);
            } else {
                if (jLabel20.getText().equals("1") || jLabel20.getText().equals("2") || jLabel20.getText().equals("3")) {
                    if (buttonCheck() > 1) {
                        JOptionPane.showMessageDialog(frame,
                                                "You have selected more than one button. Please deselect and try again.",
                                                "Error",
                                                 JOptionPane.PLAIN_MESSAGE);
                    }
                    else {
                        
                        if (jToggleButton3.isSelected()) {
                            if (!(checkForTriples())) {
                                JOptionPane.showMessageDialog(frame,
                                                "You do not have a 3 of a kind.",
                                                "Error",
                                                 JOptionPane.PLAIN_MESSAGE);
                                deselectRollDescriptions();
                            }
                            if (checkForTriples()) {
                                jLabel15.setText("" + (10 + addAllDice()));
                                jLabel16.setText("" + (10 + total + addAllDice()));
                                setDiceNull();
                                deselectHoldButtons();
                                jLabel20.setText("0");
                                try { //please ignore the interrupted exceptions; it's a relic from when we were using a timer.
                                    turnSwitch();
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(YahtzeeUI.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        }
                        if (jToggleButton4.isSelected()) {
                            if (!(checkForQuadruples())) {
                                JOptionPane.showMessageDialog(frame,
                                                "You do not have a 4 of a kind.",
                                                "Error",
                                                 JOptionPane.PLAIN_MESSAGE);
                                deselectRollDescriptions();
                            }
                            if (checkForQuadruples()) {
                                jLabel15.setText("" + (addAllDice() + 15));
                                jLabel16.setText("" + (total + 15 + addAllDice()));
                                setDiceNull();
                                deselectHoldButtons();
                                jLabel20.setText("0");
                                try {
                                    turnSwitch();
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(YahtzeeUI.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        }
                        if (jToggleButton5.isSelected()) {
                            if (!(checkForFullHouse())) {
                                JOptionPane.showMessageDialog(frame,
                                                "You do not have a full house.",
                                                "Error",
                                                 JOptionPane.PLAIN_MESSAGE);
                                deselectRollDescriptions();
                            }
                            if (checkForFullHouse()) {
                                jLabel15.setText("" + 25);
                                jLabel16.setText("" + (total + 25));
                                setDiceNull();
                                deselectHoldButtons();
                                jLabel20.setText("0");
                                try {
                                    turnSwitch();
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(YahtzeeUI.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        }
                        if (jToggleButton8.isSelected()) {
                            if (!(checkForSmallStraight())) {
                                JOptionPane.showMessageDialog(frame,
                                                "You do not have a small straight.",
                                                "Error",
                                                 JOptionPane.PLAIN_MESSAGE);
                               
                                deselectRollDescriptions();
                            }
                            if (checkForSmallStraight()) {
                                jLabel15.setText("" + 30);
                                jLabel16.setText("" + (total + 30));
                                setDiceNull();
                                deselectHoldButtons();
                                jLabel20.setText("0");
                                try {
                                    turnSwitch();
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(YahtzeeUI.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        }
                        if (jToggleButton9.isSelected()) {
                            if (!(checkForLargeStraight())) {
                                JOptionPane.showMessageDialog(frame,
                                                "You do not have a large straight.",
                                                "Error",
                                                 JOptionPane.PLAIN_MESSAGE);
                                deselectRollDescriptions();
                            }
                            if (checkForLargeStraight()) {
                                jLabel15.setText("" + 40);
                                jLabel16.setText("" + (total + 40));
                                setDiceNull();
                                deselectHoldButtons();
                                jLabel20.setText("0");
                                try {
                                    turnSwitch();
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(YahtzeeUI.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }

                        }
                        if (jToggleButton6.isSelected()) {
                            jLabel15.setText("" + addAllDice());
                            jLabel16.setText("" + (total + addAllDice()));
                            deselectRollDescriptions();
                            setDiceNull();
                            deselectHoldButtons();
                            jLabel20.setText("0");
                            try {
                                turnSwitch();
                            } catch (InterruptedException ex) {
                                Logger.getLogger(YahtzeeUI.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        if (jToggleButton7.isSelected()) {
                            if (!(checkForYahtzee())) {
                                JOptionPane.showMessageDialog(frame,
                                                "You do not have a yahtzee.",
                                                "Error",
                                                 JOptionPane.PLAIN_MESSAGE);
                                deselectRollDescriptions();
                            }
                            if (checkForYahtzee()) {
                                jLabel15.setText("" + 50);
                                jLabel16.setText("" + (total + 50));
                                setDiceNull();
                                deselectHoldButtons();
                                jLabel20.setText("0");
                                try {
                                    turnSwitch();
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(YahtzeeUI.class.getName()).log(Level.SEVERE, null, ex);
                                }

                            }

                        }

                    }
                }
            }
            
        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) { //not needed? delete all these?
        
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void jToggleButton9ActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void jToggleButton8ActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) { //roll button pressed

        if (jToggleButton1.getBackground().equals(Color.GREEN)) {
            JOptionPane.showMessageDialog(frame,
                                                "It's not your turn!",
                                                "Error",
                                                 JOptionPane.PLAIN_MESSAGE);
        } else if (jPanel4.getBackground().equals(Color.GREEN)) {
            JOptionPane.showMessageDialog(frame,
                                                "GAME OVER! You win. Press the RESTART button to play again.",
                                                "Error",
                                                 JOptionPane.PLAIN_MESSAGE);
        } else if (jPanel5.getBackground().equals(Color.GREEN)) {
            JOptionPane.showMessageDialog(frame,
                                                "GAME OVER! CP wins. Press the RESTART button to play again.",
                                                "Error",
                                                 JOptionPane.PLAIN_MESSAGE);
        } else {
            deselectRollDescriptions();
            
            if (jLabel20.getText().equals("3")) {
                JOptionPane.showMessageDialog(frame,
                                                "No more rolls available.",
                                                "Error",
                                                 JOptionPane.PLAIN_MESSAGE);
            }
            else {
                if (jToggleButton11.isSelected() == false) {
                    dice1 = 1 + (int) (java.lang.Math.random() * 6);
                    jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource(imageSelector(dice1))));
                }
                if (jToggleButton12.isSelected() == false) {
                    dice2 = 1 + (int) (java.lang.Math.random() * 6);
                    jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource(imageSelector(dice2))));
                }
                if (jToggleButton13.isSelected() == false) {
                    dice3 = 1 + (int) (java.lang.Math.random() * 6);
                    jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource(imageSelector(dice3))));
                }
                if (jToggleButton14.isSelected() == false) {
                    dice4 = 1 + (int) (java.lang.Math.random() * 6);
                    jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource(imageSelector(dice4))));
                }
                if (jToggleButton15.isSelected() == false) {
                    dice5 = 1 + (int) (java.lang.Math.random() * 6);
                    jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource(imageSelector(dice5))));
                }
                jLabel20.setText("" + (java.lang.Integer.parseInt(jLabel20.getText()) + 1));
            }
        }
    }

    
    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {
        JOptionPane.showMessageDialog(frame,
                 ("Each time it is your turn, you may roll up to 3 times by clicking the “ROLL” button.\n"
                + "Between each roll, you are able to “hold” individual die that will not be rolled when\n"
                + "you click the roll button by pressing the “HOLD” button located under the die you wish\n"
                + "to keep.  When you are finished rolling the dice, you select the most valuable dice\n"
                + "combination you have and press the submit button.  You are awarded points for each\n"
                + "correct “hand” you submit.  Here are all of the hand names, their descriptions, and\n"
                + "their point values:\n" +
                
"\n" +
"3 OF A KIND: \n" +
"Description: 3 dice with the same value.\n" +
"Point Value: The sum of all the dice values plus 10\n" +
"4 OF A KIND: \n" +
"Description: 4 dice with the same value.\n" +
"Point Value: The sum of all the dice values plus 15\n" +
"FULL HOUSE: \n" +
"Description: 3 dice with the same value and 2 dice with another value\n" +
"Point Value: 25 points\n" +
"SM. STRAIGHT: \n" +
"Description: Dice with numbers 1-4, 2-5, or 3-6\n" +
"Point Value: 30 points\n" +
"LG. STRAIGHT: \n" +
"Description: Dice with numbers 1-5 or 2-6.\n" +
"Point Value: 40 points\n" +
"CHANCE: \n" +
"Description: Any hand\n" +
"Point Value: The sum of all the dice values\n" +
"YAHTZEE: \n" +
"Description: 5 identically-numbered dice\n" +
"Point Value: 50 points\n" +
"\n" +
"The first player to reach 300 (or more) points wins."),
                                                "YAHTZEE RULES",
                                                 JOptionPane.PLAIN_MESSAGE);
    }
boolean CPdone = false;

    
    
   
    
    public void computerTurn() throws InterruptedException {
        
        CPdone=false;
       
         
        
        
        CPRoll();
        checkForMatches();
        while (CPdone == false) {
            CPRoll();
            checkForMatches();
        }
        
        JOptionPane.showMessageDialog(frame,
                                                ("CP rolled "+cptext+" time(s) for a "+cprollstring+"."),
                                                "CP roll completed",
                                                 JOptionPane.PLAIN_MESSAGE);
        
        turnSwitch();
    }
    
    int cptotal = 0;
    
    String cprollstring;
    
    public void checkForMatches() {
        if (checkForYahtzee()) {
            jLabel17.setText("" + 50);
            jLabel18.setText("" + (cptotal + 50));
            setDiceNull();
            deselectHoldButtons();
            cprollstring = ("YAHTZEE");
            
            CPdone = true;
        }
        if (checkForLargeStraight()) {
            jLabel17.setText("" + 40);
            jLabel18.setText("" + (cptotal + 40));
            setDiceNull();
            deselectHoldButtons();
            cprollstring = ("LG. STRAIGHT");
            
            CPdone = true;

        }
        if (checkForSmallStraight()) {
            jLabel17.setText("" + 30);
            jLabel18.setText("" + (cptotal + 30));
            setDiceNull();
            deselectHoldButtons();
            cprollstring = ("SM. STRAIGHT");
            
            CPdone = true;
        }
        if (checkForFullHouse()) {
            jLabel17.setText("" + 25);
            jLabel18.setText("" + (cptotal + 25));
            setDiceNull();
            deselectHoldButtons();
            cprollstring = ("FULL HOUSE");
            
            CPdone = true;
        }
        if (checkForQuadruples()) {
            jLabel17.setText("" + (15 + addAllDice()));
            jLabel18.setText("" + ((15 + cptotal) + addAllDice()));
            setDiceNull();
            deselectHoldButtons();
            cprollstring = ("4 OF A KIND");
            
            CPdone = true;
        }
        if (checkForTriples()) {
            jLabel17.setText("" + (10 + addAllDice()));
            jLabel18.setText("" + ((10 + cptotal) + addAllDice()));
            setDiceNull();
            deselectHoldButtons();
            cprollstring = ("3 OF A KIND");
            
            CPdone = true;
        } else if (jLabel20.getText().equals("3")) {
                jLabel17.setText("" + addAllDice());
                jLabel18.setText("" + (cptotal + addAllDice()));
                deselectRollDescriptions();
                setDiceNull();
                deselectHoldButtons();
                cprollstring = ("CHANCE");
                
                CPdone = true;
        } else {
            holdDoubles();
            
        }
        
        
    }
    
    public void holdDoubles() { //this is how the computer player plays: it searches for a match after each roll and if it has a hand it submits. else, it holds any dice with two or more instances and rolls again, checking for matches after. if after roll three no matches are found, it submits chance.
        if (dice1 == dice2) {
            jToggleButton1.setSelected(true);
            jToggleButton2.setSelected(true);
        }
        if (dice1 == dice3) {
            jToggleButton1.setSelected(true);
            jToggleButton3.setSelected(true);
        }
        if (dice1 == dice4) {
            jToggleButton1.setSelected(true);
            jToggleButton4.setSelected(true);
        }
        if (dice1 == dice5) {
            jToggleButton1.setSelected(true);
            jToggleButton5.setSelected(true);
        }
        if (dice2 == dice3) {
            jToggleButton2.setSelected(true);
            jToggleButton3.setSelected(true);
        }
        if (dice2 == dice4) {
            jToggleButton2.setSelected(true);
            jToggleButton4.setSelected(true);
        }
        if (dice2 == dice5) {
            jToggleButton2.setSelected(true);
            jToggleButton5.setSelected(true);
        }
        if (dice3 == dice4) {
            jToggleButton3.setSelected(true);
            jToggleButton4.setSelected(true);
        }
        if (dice3 == dice5) {
            jToggleButton3.setSelected(true);
            jToggleButton5.setSelected(true);
        }
        if (dice4 == dice5) {
            jToggleButton4.setSelected(true);
            jToggleButton5.setSelected(true);
        }
    }
    
   
    String cptext;
    
    public void CPRoll()throws InterruptedException {
        
     
        
        
        
        
       
        deselectRollDescriptions();
        if (jToggleButton11.isSelected() == false) {
            dice1 = 1 + (int) (java.lang.Math.random() * 6);
            jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource(imageSelector(dice1)))); // NOI18N
        }
        if (jToggleButton12.isSelected() == false) {                        
            dice2 = 1 + (int) (java.lang.Math.random() * 6);                        
            jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource(imageSelector(dice2))));                    
        }                    
        if (jToggleButton13.isSelected() == false) {                        
            dice3 = 1 + (int) (java.lang.Math.random() * 6);                        
            jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource(imageSelector(dice3))));                    
        }                    
        if (jToggleButton14.isSelected() == false) {                        
            dice4 = 1 + (int) (java.lang.Math.random() * 6);                        
            jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource(imageSelector(dice4))));                    
        }                    
        if (jToggleButton15.isSelected() == false) {                        
            dice5 = 1 + (int) (java.lang.Math.random() * 6);                        
            jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource(imageSelector(dice5))));                    
        }
        
        jLabel20.setText("" + (java.lang.Integer.parseInt(jLabel20.getText()) + 1));
        cptext = ("" + (java.lang.Integer.parseInt(jLabel20.getText())));
        
       
        
               
    }
        
    public int addAllDice() {
        return (dice1 + dice2 + dice3 + dice4 + dice5);
    }
    

    int total = 0;
    
    public void isWinner() {
        if (total > 299) {
            jPanel4.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(frame,
                                                "Press OK to play again.",
                                                "YOU WIN!",
                                                 JOptionPane.PLAIN_MESSAGE);
            restart();
        }
        
        if (cptotal > 299) {
            jPanel5.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(frame,
                                                "Press OK to play again.",
                                                "CP WINS!",
                                                 JOptionPane.PLAIN_MESSAGE);
            restart();
        }
    }
    
    public void turnSwitch() throws InterruptedException {
        cptotal = java.lang.Integer.parseInt(jLabel18.getText());
        total = java.lang.Integer.parseInt(jLabel16.getText());
        jLabel20.setText("0");
        isWinner();
        deselectRollDescriptions();
        if (jToggleButton1.getBackground().equals(Color.GREEN)) {
            jToggleButton1.setBackground(Color.RED);
            jToggleButton2.setBackground(Color.GREEN);
        }
        else if (jToggleButton1.getBackground().equals(Color.RED)) {
            jToggleButton1.setBackground(Color.GREEN); 
            jToggleButton2.setBackground(Color.RED);
            computerTurn();
        }
    }
       
    public void deselectRollDescriptions() {
        jToggleButton3.setSelected(false);
        jToggleButton4.setSelected(false);
        jToggleButton5.setSelected(false);
        jToggleButton6.setSelected(false);
        jToggleButton7.setSelected(false);
        jToggleButton8.setSelected(false);
        jToggleButton9.setSelected(false);
    }
    
    public void setDiceNull() {
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/Yahtzee/blankdiceresized.jpeg")));
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/Yahtzee/blankdiceresized.jpeg")));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/Yahtzee/blankdiceresized.jpeg")));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/Yahtzee/blankdiceresized.jpeg")));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/Yahtzee/blankdiceresized.jpeg")));
    }
    
    public void deselectHoldButtons() {
        jToggleButton11.setSelected(false);
        jToggleButton12.setSelected(false);
        jToggleButton13.setSelected(false);
        jToggleButton14.setSelected(false);
        jToggleButton15.setSelected(false);
    }
    
    public int buttonCheck() { //checks if more than one roll description button is selected
        int count = 0;
        if (jToggleButton3.isSelected()) count++;
        if (jToggleButton4.isSelected()) count++;
        if (jToggleButton5.isSelected()) count++;
        if (jToggleButton6.isSelected()) count++;
        if (jToggleButton7.isSelected()) count++;
        if (jToggleButton8.isSelected()) count++;
        if (jToggleButton9.isSelected()) count++;
        return count;
    }
    
    public boolean checkForFullHouse() {
        if ((dice1 == dice2) & (dice1 == dice3) & (dice4 == dice5)) return true;
        if ((dice1 == dice2) & (dice1 == dice4) & (dice3 == dice5)) return true;
        if ((dice1 == dice2) & (dice1 == dice5) & (dice3 == dice4)) return true;
        if ((dice1 == dice3) & (dice1 == dice4) & (dice2 == dice5)) return true;
        if ((dice1 == dice3) & (dice1 == dice5) & (dice2 == dice4)) return true;
        if ((dice1 == dice4) & (dice1 == dice5) & (dice2 == dice3)) return true;
        if ((dice2 == dice3) & (dice2 == dice4) & (dice1 == dice5)) return true;
        if ((dice2 == dice3) & (dice2 == dice5) & (dice1 == dice4)) return true;
        if ((dice2 == dice4) & (dice2 == dice5) & (dice1 == dice3)) return true;
        if ((dice3 == dice4) & (dice3 == dice5) & (dice1 == dice2)) return true;
        else return false;
    }
    
    public boolean checkForSmallStraight() {
        int count = 0;
        if (dice1 == dice2) count++;
        if (dice1 == dice3) count++;
        if (dice1 == dice4) count++;
        if (dice1 == dice5) count++;
        if (dice2 == dice3) count++;
        if (dice2 == dice4) count++;
        if (dice2 == dice5) count++;
        if (dice3 == dice4) count++;
        if (dice3 == dice5) count++;
        if (dice4 == dice5) count++;
        if (count > 1) return false;
        else return true;
    }
    
    public boolean checkForLargeStraight() {
        if (dice1 == dice2) return false;
        if (dice1 == dice3) return false;
        if (dice1 == dice4) return false;
        if (dice1 == dice5) return false;
        if (dice2 == dice3) return false;
        if (dice2 == dice4) return false;
        if (dice2 == dice5) return false;
        if (dice3 == dice4) return false;
        if (dice3 == dice5) return false;
        if (dice4 == dice5) return false;
        else return true;
    }
    
    public boolean checkForYahtzee() {
        if ((dice1 == dice2) & (dice2 == dice3) & (dice3 == dice4) & (dice4 == dice5)) return true;
        else return false;
    }
    
    public boolean checkForQuadruples() {
       if ((dice1 == dice2) & (dice1 == dice3) & (dice1 == dice4)) return true;
       if ((dice1 == dice2) & (dice1 == dice3) & (dice1 == dice5)) return true;
       if ((dice1 == dice2) & (dice1 == dice4) & (dice1 == dice5)) return true;
       if ((dice1 == dice3) & (dice1 == dice4) & (dice1 == dice5)) return true;
       if ((dice2 == dice3) & (dice2 == dice4) & (dice2 == dice5)) return true;
       else return false;
    }
    
    public boolean checkForTriples() {
       if ((dice1 == dice2) & (dice1 == dice3)) return true;
       if ((dice1 == dice2) & (dice1 == dice4)) return true;
       if ((dice1 == dice2) & (dice1 == dice5)) return true;
       if ((dice1 == dice3) & (dice1 == dice4)) return true;
       if ((dice1 == dice3) & (dice1 == dice5)) return true;
       if ((dice1 == dice4) & (dice1 == dice5)) return true;
       if ((dice2 == dice3) & (dice2 == dice4)) return true;
       if ((dice2 == dice3) & (dice2 == dice5)) return true;
       if ((dice2 == dice4) & (dice2 == dice5)) return true;
       if ((dice3 == dice4) & (dice3 == dice5)) return true;
       else return false;
    }
    
    public String imageSelector(int num) {
        if (num == 1) return ("/my/Yahtzee/dice1finalresized.jpg");
        if (num == 2) return ("/my/Yahtzee/dice2finalresized.jpg");
        if (num == 3) return ("/my/Yahtzee/dice3finalresized.jpg");
        if (num == 4) return ("/my/Yahtzee/dice4finalresized.jpg");
        if (num == 5) return ("/my/Yahtzee/dice5finalresized.jpg");
        else return ("/my/Yahtzee/dice6finalresized.jpg");
    }
   
    
   
    
    public static void main(String args[]) {
        
        try { //we used the nimbus look and feel from the oracle website
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(YahtzeeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(YahtzeeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(YahtzeeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(YahtzeeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new YahtzeeUI().setVisible(true);
            }
        });
    }
    
    
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    public javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton11;
    private javax.swing.JToggleButton jToggleButton12;
    private javax.swing.JToggleButton jToggleButton13;
    private javax.swing.JToggleButton jToggleButton14;
    private javax.swing.JToggleButton jToggleButton15;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToggleButton jToggleButton8;
    private javax.swing.JToggleButton jToggleButton9;
    

    
}

