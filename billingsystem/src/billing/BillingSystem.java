/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billing;

//import java.awt.Color;

/**
 *
 * @author ROHIT
 */
public class BillingSystem extends javax.swing.JFrame {

    /**
     * Creates new form BillingSystem
     */
    String operation;
    String answer;
    double firstnum,secondnum,result;
    public BillingSystem() {
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

        jPanel1 = new javax.swing.JPanel();
        txtdisplay = new javax.swing.JTextField();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        badd = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        bsub = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        bmultiply = new javax.swing.JButton();
        b0 = new javax.swing.JButton();
        bdecimal = new javax.swing.JButton();
        bpercentage = new javax.swing.JButton();
        bdivide = new javax.swing.JButton();
        bclear = new javax.swing.JButton();
        bequal = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.black);
        setPreferredSize(new java.awt.Dimension(1300, 650));
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setPreferredSize(new java.awt.Dimension(330, 360));
        jPanel1.setLayout(null);

        txtdisplay.setEditable(false);
        txtdisplay.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        txtdisplay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(txtdisplay);
        txtdisplay.setBounds(20, 20, 290, 40);

        b8.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        b8.setText("8");
        b8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        b8.setPreferredSize(new java.awt.Dimension(60, 50));
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        jPanel1.add(b8);
        b8.setBounds(100, 80, 60, 50);

        b9.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        b9.setText("9");
        b9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        b9.setPreferredSize(new java.awt.Dimension(60, 50));
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        jPanel1.add(b9);
        b9.setBounds(170, 80, 60, 50);

        b7.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        b7.setText("7");
        b7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        b7.setPreferredSize(new java.awt.Dimension(60, 50));
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        jPanel1.add(b7);
        b7.setBounds(20, 80, 60, 50);

        badd.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        badd.setText("+");
        badd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        badd.setPreferredSize(new java.awt.Dimension(60, 50));
        badd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baddActionPerformed(evt);
            }
        });
        jPanel1.add(badd);
        badd.setBounds(250, 80, 60, 50);

        b4.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        b4.setText("4");
        b4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        b4.setPreferredSize(new java.awt.Dimension(60, 50));
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        jPanel1.add(b4);
        b4.setBounds(20, 150, 60, 50);

        b5.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        b5.setText("5");
        b5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        b5.setPreferredSize(new java.awt.Dimension(60, 50));
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        jPanel1.add(b5);
        b5.setBounds(100, 150, 60, 50);

        b6.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        b6.setText("6");
        b6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        b6.setPreferredSize(new java.awt.Dimension(60, 50));
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        jPanel1.add(b6);
        b6.setBounds(170, 150, 60, 50);

        bsub.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        bsub.setText("-");
        bsub.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bsub.setPreferredSize(new java.awt.Dimension(60, 50));
        bsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsubActionPerformed(evt);
            }
        });
        jPanel1.add(bsub);
        bsub.setBounds(250, 150, 60, 50);

        b1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        b1.setText("1");
        b1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        b1.setPreferredSize(new java.awt.Dimension(60, 50));
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        jPanel1.add(b1);
        b1.setBounds(20, 220, 60, 50);

        b2.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        b2.setText("2");
        b2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        b2.setPreferredSize(new java.awt.Dimension(60, 50));
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        jPanel1.add(b2);
        b2.setBounds(100, 220, 60, 50);

        b3.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        b3.setText("3");
        b3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        b3.setPreferredSize(new java.awt.Dimension(60, 50));
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        jPanel1.add(b3);
        b3.setBounds(170, 220, 60, 50);

        bmultiply.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        bmultiply.setText("*");
        bmultiply.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bmultiply.setPreferredSize(new java.awt.Dimension(60, 50));
        bmultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmultiplyActionPerformed(evt);
            }
        });
        jPanel1.add(bmultiply);
        bmultiply.setBounds(250, 220, 60, 50);

        b0.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        b0.setText("0");
        b0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        b0.setPreferredSize(new java.awt.Dimension(60, 50));
        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b0ActionPerformed(evt);
            }
        });
        jPanel1.add(b0);
        b0.setBounds(20, 290, 60, 50);

        bdecimal.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        bdecimal.setText(".");
        bdecimal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bdecimal.setPreferredSize(new java.awt.Dimension(60, 50));
        bdecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdecimalActionPerformed(evt);
            }
        });
        jPanel1.add(bdecimal);
        bdecimal.setBounds(100, 290, 60, 50);

        bpercentage.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        bpercentage.setText("%");
        bpercentage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bpercentage.setPreferredSize(new java.awt.Dimension(60, 50));
        bpercentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpercentageActionPerformed(evt);
            }
        });
        jPanel1.add(bpercentage);
        bpercentage.setBounds(170, 290, 60, 50);

        bdivide.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        bdivide.setText("/");
        bdivide.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bdivide.setPreferredSize(new java.awt.Dimension(60, 50));
        bdivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdivideActionPerformed(evt);
            }
        });
        jPanel1.add(bdivide);
        bdivide.setBounds(250, 290, 60, 50);

        bclear.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        bclear.setText("CE");
        bclear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bclearActionPerformed(evt);
            }
        });
        jPanel1.add(bclear);
        bclear.setBounds(20, 350, 140, 40);

        bequal.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        bequal.setText("=");
        bequal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bequal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bequalActionPerformed(evt);
            }
        });
        jPanel1.add(bequal);
        bequal.setBounds(170, 350, 140, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 40, 330, 410);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.setPreferredSize(new java.awt.Dimension(930, 70));
        jPanel2.setLayout(null);

        jCheckBox3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jCheckBox3.setText("Fruits");
        jCheckBox3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jCheckBox3.setPreferredSize(new java.awt.Dimension(130, 97));
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox3);
        jCheckBox3.setBounds(10, 30, 110, 30);

        jCheckBox6.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jCheckBox6.setText("Vegitables");
        jCheckBox6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jCheckBox6.setPreferredSize(new java.awt.Dimension(130, 97));
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox6);
        jCheckBox6.setBounds(10, 80, 140, 40);

        jCheckBox7.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jCheckBox7.setText("Pizza");
        jCheckBox7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jCheckBox7.setPreferredSize(new java.awt.Dimension(130, 97));
        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox7);
        jCheckBox7.setBounds(10, 140, 110, 50);

        jCheckBox8.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jCheckBox8.setText("Milk");
        jCheckBox8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jCheckBox8.setPreferredSize(new java.awt.Dimension(130, 97));
        jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox8ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox8);
        jCheckBox8.setBounds(10, 210, 110, 50);

        jCheckBox9.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jCheckBox9.setText("Biscuits");
        jCheckBox9.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jCheckBox9.setPreferredSize(new java.awt.Dimension(130, 97));
        jCheckBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox9ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox9);
        jCheckBox9.setBounds(10, 270, 110, 50);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("0");
        jPanel2.add(jTextField1);
        jTextField1.setBounds(150, 40, 50, 30);

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("0");
        jPanel2.add(jTextField2);
        jTextField2.setBounds(150, 90, 50, 30);

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("0");
        jPanel2.add(jTextField3);
        jTextField3.setBounds(148, 150, 50, 30);

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("0");
        jPanel2.add(jTextField4);
        jTextField4.setBounds(148, 210, 50, 30);

        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("0");
        jPanel2.add(jTextField5);
        jTextField5.setBounds(148, 280, 50, 30);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.setToolTipText("Total Cost");
        jPanel3.setPreferredSize(new java.awt.Dimension(630, 330));
        jPanel3.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setText("Total  Cost");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(10, 20, 130, 30);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel2.setText("Total Delivery Cost");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(10, 60, 190, 30);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel3.setText("Total Cost Pakage");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(10, 100, 190, 30);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel4.setText("CGST");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(10, 140, 170, 30);

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel5.setText("SGST");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(10, 180, 80, 30);

        jTextField6.setEditable(false);
        jTextField6.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setText("0");
        jTextField6.setToolTipText("");
        jPanel3.add(jTextField6);
        jTextField6.setBounds(320, 20, 80, 30);

        jTextField7.setEditable(false);
        jTextField7.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setText("0");
        jTextField7.setToolTipText("");
        jPanel3.add(jTextField7);
        jTextField7.setBounds(320, 60, 80, 30);

        jTextField8.setEditable(false);
        jTextField8.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.setText("0");
        jTextField8.setToolTipText("");
        jPanel3.add(jTextField8);
        jTextField8.setBounds(320, 100, 80, 30);

        jTextField9.setEditable(false);
        jTextField9.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setText("0");
        jTextField9.setToolTipText("");
        jPanel3.add(jTextField9);
        jTextField9.setBounds(320, 140, 80, 30);

        jTextField10.setEditable(false);
        jTextField10.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.setText("0");
        jTextField10.setToolTipText("");
        jPanel3.add(jTextField10);
        jTextField10.setBounds(320, 180, 80, 30);

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel6.setText("SUB TOTALS");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(10, 230, 130, 40);

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel7.setText("TAXES");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(10, 274, 120, 40);

        jTextField11.setEditable(false);
        jTextField11.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jTextField11.setText("Rs. 0.0");
        jPanel3.add(jTextField11);
        jTextField11.setBounds(160, 240, 130, 30);

        jTextField12.setEditable(false);
        jTextField12.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jTextField12.setText("Rs. 0.0");
        jPanel3.add(jTextField12);
        jTextField12.setBounds(160, 280, 130, 30);

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel8.setText("TOTAL");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(20, 344, 90, 40);

        jTextField13.setEditable(false);
        jTextField13.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jTextField13.setText("Rs 0.0");
        jPanel3.add(jTextField13);
        jTextField13.setBounds(160, 340, 130, 40);

        jButton1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton1.setText("CLEAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(310, 240, 110, 50);

        jButton2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButton2.setText("CALCULATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(310, 320, 110, 50);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(210, 10, 430, 390);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(360, 40, 940, 410);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 980, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(50, 480, 980, 60);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setText("Online Billing System");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(430, 10, 260, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b0ActionPerformed
        
        String ans = txtdisplay.getText()+b0.getText();
        txtdisplay.setText(ans);
        
    }//GEN-LAST:event_b0ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
         String ans = txtdisplay.getText()+b1.getText();
        txtdisplay.setText(ans);
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
         String ans = txtdisplay.getText()+b2.getText();
        txtdisplay.setText(ans);
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
         String ans = txtdisplay.getText()+b3.getText();
        txtdisplay.setText(ans);
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        // TODO add your handling code here:
         String ans = txtdisplay.getText()+b4.getText();
        txtdisplay.setText(ans);
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        // TODO add your handling code here:
         String ans = txtdisplay.getText()+b5.getText();
        txtdisplay.setText(ans);
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        // TODO add your handling code here:
         String ans = txtdisplay.getText()+b6.getText();
        txtdisplay.setText(ans);
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        // TODO add your handling code here:
         String ans = txtdisplay.getText()+b7.getText();
        txtdisplay.setText(ans);
        //setBackground(Color.red);
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        // TODO add your handling code here:
         String ans = txtdisplay.getText()+b8.getText();
        txtdisplay.setText(ans);
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        // TODO add your handling code here:
         String ans = txtdisplay.getText()+b9.getText();
        txtdisplay.setText(ans);
    }//GEN-LAST:event_b9ActionPerformed

    private void baddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baddActionPerformed
       firstnum = Double.parseDouble(txtdisplay.getText());
       txtdisplay.setText("");
       operation="+";
    }//GEN-LAST:event_baddActionPerformed

    private void bdecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdecimalActionPerformed
         if(!txtdisplay.getText().contains("."))
         {
             txtdisplay.setText(txtdisplay.getText()+bdecimal.getText());
         }
    }//GEN-LAST:event_bdecimalActionPerformed

    private void bsubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsubActionPerformed
       firstnum = Double.parseDouble(txtdisplay.getText());
       txtdisplay.setText("");
       operation="-";
    }//GEN-LAST:event_bsubActionPerformed

    private void bmultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmultiplyActionPerformed
       firstnum = Double.parseDouble(txtdisplay.getText());
       txtdisplay.setText("");
       operation="*";
    }//GEN-LAST:event_bmultiplyActionPerformed

    private void bdivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdivideActionPerformed
        firstnum = Double.parseDouble(txtdisplay.getText());
       txtdisplay.setText("");
       operation="/";
    }//GEN-LAST:event_bdivideActionPerformed

    private void bpercentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bpercentageActionPerformed
        firstnum = Double.parseDouble(txtdisplay.getText());
       txtdisplay.setText("");
       operation="%";
    }//GEN-LAST:event_bpercentageActionPerformed

    private void bclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bclearActionPerformed
        txtdisplay.setText("");
    }//GEN-LAST:event_bclearActionPerformed

    private void bequalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bequalActionPerformed
             secondnum = Double.parseDouble(txtdisplay.getText());
             if(operation == "+")
             {
                 result = firstnum+secondnum;
                 answer = String.format("%.2f", result);
                 txtdisplay.setText(answer);
             }
             else if(operation == "-")
             {
                 result = firstnum-secondnum;
                 answer = String.format("%.2f", result);
                 txtdisplay.setText(answer);
             }
             else if(operation == "*")
             {
                 result = firstnum*secondnum;
                 answer = String.format("%.2f", result);
                 txtdisplay.setText(answer);
             }
             else if(operation == "/")
             {
                 result = firstnum/secondnum;
                 answer = String.format("%.2f", result);
                 txtdisplay.setText(answer);
             }
             else
                 {
                 result = firstnum%secondnum;
                 answer = String.format("%.2f", result);
                 txtdisplay.setText(answer);
             }
                 
    }//GEN-LAST:event_bequalActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        txtdisplay.setText("");
        jTextField1.setText("0");
        jTextField2.setText("0");
        jTextField3.setText("0");
        jTextField4.setText("0");
        jTextField5.setText("0");
        jTextField6.setText("0");
        jTextField7.setText("0");
        jTextField8.setText("0");
        jTextField9.setText("0");
        jTextField10.setText("0");
        jTextField11.setText("Rs. 0.0");
        jTextField12.setText("Rs. 0.0");
        jTextField13.setText("Rs. 0.0");
        
        jCheckBox3.setSelected(false);
        jCheckBox6.setSelected(false);
        jCheckBox7.setSelected(false);
        jCheckBox8.setSelected(false);
        jCheckBox9.setSelected(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
        if(jCheckBox3.isSelected())
        {
            jTextField1.setEditable(true);
            jTextField1.setText("");
            jTextField1.requestFocus();
 ;       }
        else
        {
             jTextField1.setEditable(false);
            jTextField1.setText("0");
        }
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        // TODO add your handling code here:
         if(jCheckBox6.isSelected())
        {
            jTextField2.setEditable(true);
            jTextField2.setText("");
            jTextField2.requestFocus();
 ;       }
        else
        {
             jTextField2.setEditable(false);
            jTextField2.setText("0");
        }
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed
        // TODO add your handling code here:
         if(jCheckBox7.isSelected())
        {
            jTextField3.setEditable(true);
            jTextField3.setText("");
            jTextField3.requestFocus();
 ;       }
        else
        {
             jTextField3.setEditable(false);
            jTextField3.setText("0");
        }
    }//GEN-LAST:event_jCheckBox7ActionPerformed

    private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox8ActionPerformed
        // TODO add your handling code here:
         if(jCheckBox8.isSelected())
        {
            jTextField4.setEditable(true);
            jTextField4.setText("");
            jTextField4.requestFocus();
 ;       }
        else
        {
             jTextField4.setEditable(false);
            jTextField4.setText("0");
        }
    }//GEN-LAST:event_jCheckBox8ActionPerformed

    private void jCheckBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox9ActionPerformed
        // TODO add your handling code here:
         if(jCheckBox9.isSelected())
        {
            jTextField5.setEditable(true);
            jTextField5.setText("");
            jTextField5.requestFocus();
 ;       }
        else
        {
             jTextField5.setEditable(false);
            jTextField5.setText("0");
        }
    }//GEN-LAST:event_jCheckBox9ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(jCheckBox3.isSelected()|| jCheckBox6.isSelected() || jCheckBox7.isSelected()||jCheckBox8.isSelected()||jCheckBox9.isSelected() )
        {
            double f = Double.parseDouble(jTextField1.getText()) * 20;
            double v = Double.parseDouble(jTextField2.getText()) * 30;
            double p = Double.parseDouble(jTextField3.getText()) * 100;
            double m = Double.parseDouble(jTextField4.getText()) * 50;
            double b = Double.parseDouble(jTextField5.getText()) * 15;
            double totalitem = f+v+p+m+b;
            double del = totalitem * 5/100;
            double mil = del * 50/100;
            double subtotal = totalitem+del+mil;
            double cgst = subtotal*9/100;
            double sgst = cgst;
            double tax = cgst+sgst;
            double amount = subtotal+tax;
            String item = String.format("%.2f",totalitem);
            jTextField6.setText((String)item);
            String de = String.format("%.2f",del);
            jTextField7.setText((String)de);
            String mi = String.format("%.2f",mil);
            jTextField8.setText((String)mi);
            String cg = String.format("%.2f",cgst);
            jTextField9.setText((String)cg);
            String sg = String.format("%.2f",sgst);
            jTextField10.setText((String)sg);
            String sub= String.format("%.2f",subtotal);
            jTextField11.setText((String)sub);
            String ta = String.format("%.2f",tax);
            jTextField12.setText((String)ta);
            String am = String.format("%.2f",amount);
            jTextField13.setText((String)am);
        }
        else
        {
         txtdisplay.setText("Empty Items");   
        }
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
            java.util.logging.Logger.getLogger(BillingSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BillingSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BillingSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BillingSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillingSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b0;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton badd;
    private javax.swing.JButton bclear;
    private javax.swing.JButton bdecimal;
    private javax.swing.JButton bdivide;
    private javax.swing.JButton bequal;
    private javax.swing.JButton bmultiply;
    private javax.swing.JButton bpercentage;
    private javax.swing.JButton bsub;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField txtdisplay;
    // End of variables declaration//GEN-END:variables
}
