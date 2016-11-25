/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.machine;

import Control.OrderPotation;
import Control.UpdateMoney;
import Control.UpdatePotation;
import Produce.SodaMoney.ProdureMoney;
import java.awt.Desktop;
import java.awt.HeadlessException;
import java.awt.Image;
import java.net.URL;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MrYiYi
 */
public class HomePage extends javax.swing.JFrame {
    public static int index,bredMoney;
    OrderPotation orderPotation = new OrderPotation();
    
    public HomePage() {
            initComponents();
            index=0;
            /**  BEGIN SET  ICON FORM*/
            ImageIcon icon1 = new ImageIcon(getClass().getResource("logo.png"));
            Image image = icon1.getImage();
            setIconImage(image);
            /* END SET ICON FORM */
            /** BEGIN SET ICON HOME */
            ImageIcon icon2= new ImageIcon(getClass().getResource("icon.png"));
            Image image2 = icon2.getImage();
            ImageIcon icon= new ImageIcon(image2.getScaledInstance(LabelHome.getSize().width, LabelHome.getSize().height,100));
            LabelHome.setIcon(icon);
           /*END SET ICON HOME */
            sumOfMoneyInput.setText("0");
            sumOfMoneyOutput.setText("0");
            sumOfMoneyOrder.setText("0");
            sumOfMoneyOrder1.setText("0");
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupMoney = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        LabelHome = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        jButtonLogin = new java.awt.Button();
        jPanel2 = new javax.swing.JPanel();
        jButtonPepsi = new javax.swing.JButton();
        jButtonCocaCola = new javax.swing.JButton();
        jButtonAquafina = new javax.swing.JButton();
        jButtonC2 = new javax.swing.JButton();
        jButtonDrThanh = new javax.swing.JButton();
        jButtonTwister = new javax.swing.JButton();
        jButtonSting = new javax.swing.JButton();
        jButtonFanta = new javax.swing.JButton();
        jButtonSprite = new javax.swing.JButton();
        jButtonNutri = new javax.swing.JButton();
        jButtonLatte = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabOder = new javax.swing.JTable();
        label6 = new java.awt.Label();
        sumOfMoneyOrder1 = new java.awt.TextField();
        jButtonOLong1 = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        p1001 = new javax.swing.JRadioButton();
        p2001 = new javax.swing.JRadioButton();
        p5001 = new javax.swing.JRadioButton();
        p10001 = new javax.swing.JRadioButton();
        p20001 = new javax.swing.JRadioButton();
        p50001 = new javax.swing.JRadioButton();
        c1001 = new javax.swing.JRadioButton();
        c2001 = new javax.swing.JRadioButton();
        c5001 = new javax.swing.JRadioButton();
        btnPush1 = new javax.swing.JButton();
        label3 = new java.awt.Label();
        sumOfMoneyInput = new java.awt.TextField();
        jButtonOrder = new javax.swing.JButton();
        label4 = new java.awt.Label();
        sumOfMoneyOutput = new java.awt.TextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbMoneyInput = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbMoneyOutput = new javax.swing.JTable();
        label5 = new java.awt.Label();
        sumOfMoneyOrder = new java.awt.TextField();
        btnExit = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnFB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Soda Maker");
        setAlwaysOnTop(true);
        setAutoRequestFocus(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusCycleRoot(false);
        setIconImages(null);
        setName("Soda Maker"); // NOI18N

        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTabbedPane1.setFont(new java.awt.Font("VNtimes New Roman", 1, 14)); // NOI18N
        jTabbedPane1.setName("Oder"); // NOI18N

        jPanel1.setBackground(new java.awt.Color(250, 200, 100));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setFocusCycleRoot(true);

        LabelHome.setFont(new java.awt.Font("VPS Bien Hoa Hoa", 1, 24)); // NOI18N
        LabelHome.setForeground(new java.awt.Color(255, 0, 0));
        LabelHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/machine/icon.png"))); // NOI18N
        LabelHome.setToolTipText("");

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setFont(new java.awt.Font("VfFree40", 0, 18)); // NOI18N
        label1.setForeground(new java.awt.Color(204, 0, 0));
        label1.setText("Wellcome Soda Maker");

        jButtonLogin.setLabel("Login");
        jButtonLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonLoginMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addComponent(LabelHome, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelHome, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        jTabbedPane1.addTab("    Home Page", new javax.swing.ImageIcon(getClass().getResource("/GUI/machine/TrangChu.png")), jPanel1, ""); // NOI18N

        jPanel2.setBackground(java.awt.SystemColor.textHighlight);
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButtonPepsi.setBackground(new java.awt.Color(0, 51, 255));
        jButtonPepsi.setFont(new java.awt.Font("Planet NS", 1, 12)); // NOI18N
        jButtonPepsi.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPepsi.setLabel("Pepsi");
        jButtonPepsi.setMaximumSize(new java.awt.Dimension(60, 40));
        jButtonPepsi.setMinimumSize(null);
        jButtonPepsi.setPreferredSize(null);
        jButtonPepsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPepsiActionPerformed(evt);
            }
        });

        jButtonCocaCola.setBackground(new java.awt.Color(255, 0, 0));
        jButtonCocaCola.setFont(new java.awt.Font("VnBandit2", 1, 11)); // NOI18N
        jButtonCocaCola.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCocaCola.setLabel("Coca Cola");
        jButtonCocaCola.setMaximumSize(new java.awt.Dimension(60, 40));
        jButtonCocaCola.setMinimumSize(null);
        jButtonCocaCola.setPreferredSize(null);
        jButtonCocaCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCocaColaActionPerformed(evt);
            }
        });

        jButtonAquafina.setLabel("Aquafina");
        jButtonAquafina.setMaximumSize(new java.awt.Dimension(60, 40));
        jButtonAquafina.setMinimumSize(null);
        jButtonAquafina.setPreferredSize(null);
        jButtonAquafina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAquafinaActionPerformed(evt);
            }
        });

        jButtonC2.setBackground(new java.awt.Color(255, 255, 51));
        jButtonC2.setFont(new java.awt.Font("VnTiffanyHeavy2", 3, 14)); // NOI18N
        jButtonC2.setForeground(new java.awt.Color(255, 255, 255));
        jButtonC2.setLabel("C2");
        jButtonC2.setMaximumSize(new java.awt.Dimension(60, 40));
        jButtonC2.setMinimumSize(null);
        jButtonC2.setPreferredSize(null);
        jButtonC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonC2ActionPerformed(evt);
            }
        });

        jButtonDrThanh.setBackground(new java.awt.Color(255, 0, 0));
        jButtonDrThanh.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButtonDrThanh.setLabel("Dr Thanh");
        jButtonDrThanh.setMaximumSize(new java.awt.Dimension(60, 40));
        jButtonDrThanh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDrThanhActionPerformed(evt);
            }
        });

        jButtonTwister.setBackground(new java.awt.Color(255, 204, 0));
        jButtonTwister.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        jButtonTwister.setForeground(new java.awt.Color(0, 153, 0));
        jButtonTwister.setLabel("Twister");
        jButtonTwister.setMaximumSize(new java.awt.Dimension(60, 40));
        jButtonTwister.setMinimumSize(new java.awt.Dimension(60, 40));
        jButtonTwister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTwisterActionPerformed(evt);
            }
        });

        jButtonSting.setBackground(new java.awt.Color(255, 0, 0));
        jButtonSting.setFont(new java.awt.Font("Lucida Sans Typewriter", 3, 11)); // NOI18N
        jButtonSting.setForeground(new java.awt.Color(51, 0, 0));
        jButtonSting.setLabel("Sting");
        jButtonSting.setMaximumSize(new java.awt.Dimension(60, 40));
        jButtonSting.setMinimumSize(null);
        jButtonSting.setPreferredSize(null);
        jButtonSting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStingActionPerformed(evt);
            }
        });

        jButtonFanta.setBackground(new java.awt.Color(255, 153, 0));
        jButtonFanta.setFont(new java.awt.Font("VNI-Bodon-Poster", 3, 14)); // NOI18N
        jButtonFanta.setForeground(new java.awt.Color(0, 0, 153));
        jButtonFanta.setLabel("Fanta");
        jButtonFanta.setMaximumSize(new java.awt.Dimension(60, 40));
        jButtonFanta.setMinimumSize(null);
        jButtonFanta.setPreferredSize(null);
        jButtonFanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFantaActionPerformed(evt);
            }
        });

        jButtonSprite.setBackground(new java.awt.Color(0, 204, 153));
        jButtonSprite.setFont(new java.awt.Font("Prestige Elite Std", 3, 14)); // NOI18N
        jButtonSprite.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSprite.setLabel("Sprite");
        jButtonSprite.setMaximumSize(new java.awt.Dimension(60, 40));
        jButtonSprite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSpriteActionPerformed(evt);
            }
        });

        jButtonNutri.setBackground(new java.awt.Color(255, 0, 0));
        jButtonNutri.setFont(new java.awt.Font("Segoe UI Semibold", 3, 14)); // NOI18N
        jButtonNutri.setForeground(new java.awt.Color(0, 102, 0));
        jButtonNutri.setLabel("Nutri Boots");
        jButtonNutri.setMaximumSize(new java.awt.Dimension(60, 40));
        jButtonNutri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNutriActionPerformed(evt);
            }
        });

        jButtonLatte.setBackground(new java.awt.Color(102, 51, 0));
        jButtonLatte.setFont(new java.awt.Font("Quangngai", 3, 12)); // NOI18N
        jButtonLatte.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLatte.setLabel("Latte");
        jButtonLatte.setMaximumSize(new java.awt.Dimension(60, 40));
        jButtonLatte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLatteActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 240, 240));
        jLabel2.setText("List Order");

        tabOder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name Potation", "Price Potation"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabOder);

        label6.setText(" Sum of money order");

        sumOfMoneyOrder1.setEditable(false);

        jButtonOLong1.setBackground(new java.awt.Color(51, 102, 0));
        jButtonOLong1.setFont(new java.awt.Font("Pirate Keg", 0, 12)); // NOI18N
        jButtonOLong1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonOLong1.setLabel("O Long");
        jButtonOLong1.setMaximumSize(new java.awt.Dimension(60, 40));
        jButtonOLong1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOLong1ActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(sumOfMoneyOrder1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButtonFanta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonCocaCola, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonNutri, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonSting, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonPepsi, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonLatte, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButtonSprite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonC2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonTwister, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButtonOLong1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButtonDrThanh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonAquafina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addContainerGap(41, Short.MAX_VALUE))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCocaCola, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPepsi, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonC2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAquafina, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonFanta, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSting, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonTwister, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDrThanh, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonOLong1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonLatte, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonNutri, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSprite, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sumOfMoneyOrder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 40, Short.MAX_VALUE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 40, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Oder Drinking", new javax.swing.ImageIcon(getClass().getResource("/GUI/machine/ChonNuoc.png")), jPanel2, ""); // NOI18N

        jPanel3.setBackground(new java.awt.Color(250, 200, 100));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        groupMoney.add(p1001);
        p1001.setText("Paper1000");

        groupMoney.add(p2001);
        p2001.setText("Paper2000");

        groupMoney.add(p5001);
        p5001.setText("Paper5000");

        groupMoney.add(p10001);
        p10001.setText("Paper10000");

        groupMoney.add(p20001);
        p20001.setText("Paper20000");

        groupMoney.add(p50001);
        p50001.setText("Paper50000");

        groupMoney.add(c1001);
        c1001.setText("Coin1000");

        groupMoney.add(c2001);
        c2001.setText("Coin2000");

        groupMoney.add(c5001);
        c5001.setText("Coin5000");

        btnPush1.setText("Push");
        btnPush1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPush1ActionPerformed(evt);
            }
        });

        label3.setText(" Sum of money input");

        sumOfMoneyInput.setEditable(false);

        jButtonOrder.setText("Order Drinking");
        jButtonOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOrderActionPerformed(evt);
            }
        });

        label4.setText(" Sum of money output");

        sumOfMoneyOutput.setEditable(false);

        tbMoneyInput.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Denominations", "Bred Money"
            }
        ));
        jScrollPane4.setViewportView(tbMoneyInput);

        tbMoneyOutput.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Denominations", "Bred Money"
            }
        ));
        jScrollPane1.setViewportView(tbMoneyOutput);

        label5.setText(" Sum of money order");

        sumOfMoneyOrder.setEditable(false);

        btnExit.setText("EXIT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(16, 20, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(p1001)
                                    .addComponent(p2001))
                                .addComponent(p5001))
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(p50001, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(p10001, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(p20001, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sumOfMoneyInput, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(c5001, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(c2001, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(c1001)
                                    .addComponent(btnPush1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(sumOfMoneyOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(sumOfMoneyOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonOrder))))
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(sumOfMoneyOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(p1001)
                                .addComponent(c1001)
                                .addComponent(p10001)))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(p2001)
                            .addComponent(p50001)
                            .addComponent(c2001))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(c5001)
                            .addComponent(p20001)
                            .addComponent(p5001))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sumOfMoneyInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPush1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sumOfMoneyOrder, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButtonOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11))
        );

        jTabbedPane1.addTab("        Pay       ", new javax.swing.ImageIcon(getClass().getResource("/GUI/machine/ThanhToan.png")), jPanel3, ""); // NOI18N

        jPanel4.setBackground(new java.awt.Color(250, 200, 100));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Call Number : 01635220904 - MrYiYi");

        btnFB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/machine/FaceBook_64x64.png"))); // NOI18N
        btnFB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFB, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(303, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFB, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(227, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("   Information", new javax.swing.ImageIcon(getClass().getResource("/GUI/machine/ThongTin.png")), jPanel4); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 727, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLoginMouseClicked
        this.hide();
        try{
            Login frame=new Login();
            frame.setSize(300,100);
            frame.pack();
            frame.setLocationRelativeTo(null);       //cua so ve chinh giua 
            frame.setVisible(true);
            }
            catch(Exception e)
            {JOptionPane.showMessageDialog(null, e.getMessage());
            }
    }//GEN-LAST:event_jButtonLoginMouseClicked

    private void btnPush1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPush1ActionPerformed
          
       ProdureMoney money = new ProdureMoney();
       if(groupMoney.getSelection()!=null){
       if(orderPotation.getSumMoneyInput()<orderPotation.getSumMoneyOrder()){
            if(groupMoney.getSelection()==p1001.getModel()){
                bredMoney=1;
                money.setPaper1000();
               orderPotation.setMoneyInput(money.getPaper1000());
               System.out.print(money.getPaper1000().getDenominations());
            }
            if(groupMoney.getSelection()==p2001.getModel()){
                bredMoney=1;
                money.setPaper2000();
               orderPotation.setMoneyInput(money.getPaper2000());
            }
            if(groupMoney.getSelection()==p5001.getModel()){
                bredMoney=1;
                money.setPaper5000();
               orderPotation.setMoneyInput(money.getPaper5000());
               
            }
            if(groupMoney.getSelection()==p10001.getModel()){
                bredMoney=1;
                money.setPaper10000();
               orderPotation.setMoneyInput(money.getPaper10000());
            }
            if(groupMoney.getSelection()==p20001.getModel()){
                bredMoney=1;
                money.setPaper20000();
                orderPotation.setMoneyInput(money.getPaper20000());
            }
            if(groupMoney.getSelection()==p50001.getModel()){
                bredMoney=1;
                money.setPaper50000();
                orderPotation.setMoneyInput(money.getPaper50000());
            }
            if(groupMoney.getSelection()==c1001.getModel()){
                bredMoney=0;
                money.setCoin1000();
                orderPotation.setMoneyInput(money.getCoin1000());
            }
             if(groupMoney.getSelection()==c2001.getModel()){
                 bredMoney=0;
                 money.setCoin2000();
                orderPotation.setMoneyInput(money.getCoin2000());
            }
              if(groupMoney.getSelection()==c5001.getModel()){
                  bredMoney=0;
                  money.setCoin5000();
                orderPotation.setMoneyInput(money.getCoin5000());
            }
     //  }
    index++;
    try{
    DefaultTableModel model=(DefaultTableModel)tbMoneyInput.getModel();
    model.addRow(new Object[]{orderPotation.getMoney(index-1).getDenominations(),bredMoney});
    orderPotation.setSumMoneyInput();
    sumOfMoneyInput.setText(String.valueOf(orderPotation.getSumMoneyInput()));
    }
    catch(Exception e){
    JOptionPane.showMessageDialog(this,e.getMessage(),
    "INFORMATION_MESSAGE",JOptionPane.INFORMATION_MESSAGE);
    }
   }else
         JOptionPane.showMessageDialog(this,"Enough!!!!",
            "INFORMATION_MESSAGE",JOptionPane.INFORMATION_MESSAGE);
 }else 
        JOptionPane.showMessageDialog(this,"Choose the money!!",
            "ERROR",JOptionPane.ERROR_MESSAGE);
    
    }//GEN-LAST:event_btnPush1ActionPerformed

    private void jButtonCocaColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCocaColaActionPerformed
       
        try {
            if(orderPotation.checkPotation(1)){
             orderPotation.setPotationOrder(orderPotation.orderPotation(1));
             DefaultTableModel model=(DefaultTableModel)tabOder.getModel();
             model.addRow(new Object[]{orderPotation.orderPotation(1).getPotationName(),orderPotation.orderPotation(1).getPrice()});
             orderPotation.setSumMoneyOrder();
             sumOfMoneyOrder1.setText(String.valueOf(orderPotation.getSumMoneyOrder()));
             sumOfMoneyOrder.setText(String.valueOf(orderPotation.getSumMoneyOrder()));
            }
            else
            {JOptionPane.showMessageDialog(this,"Potation is over!!!",
            "ERROR",JOptionPane.ERROR_MESSAGE);
            }
        } catch(SQLException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage(),
            "ERROR",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButtonCocaColaActionPerformed

    private void jButtonPepsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPepsiActionPerformed
       
        int key =2;
        try {
            if(orderPotation.checkPotation(key)){
             orderPotation.setPotationOrder(orderPotation.orderPotation(key));
             DefaultTableModel model=(DefaultTableModel)tabOder.getModel();
             model.addRow(new Object[]{orderPotation.orderPotation(key).getPotationName(),orderPotation.orderPotation(key).getPrice()});
             orderPotation.setSumMoneyOrder();
             sumOfMoneyOrder1.setText(String.valueOf(orderPotation.getSumMoneyOrder()));
             sumOfMoneyOrder.setText(String.valueOf(orderPotation.getSumMoneyOrder()));
            }
            else
            {JOptionPane.showMessageDialog(this,"Potation is over!!!",
            "ERROR",JOptionPane.ERROR_MESSAGE);
            }
        } catch(SQLException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage(),
            "ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonPepsiActionPerformed

    private void jButtonC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonC2ActionPerformed
          
        int key =3;
        try {
            if(orderPotation.checkPotation(key)){
             orderPotation.setPotationOrder(orderPotation.orderPotation(key));
             DefaultTableModel model=(DefaultTableModel)tabOder.getModel();
             model.addRow(new Object[]{orderPotation.orderPotation(key).getPotationName(),orderPotation.orderPotation(key).getPrice()});
             orderPotation.setSumMoneyOrder();
             sumOfMoneyOrder1.setText(String.valueOf(orderPotation.getSumMoneyOrder()));
             sumOfMoneyOrder.setText(String.valueOf(orderPotation.getSumMoneyOrder()));
            }
            else
            {JOptionPane.showMessageDialog(this,"Potation is over!!!",
            "ERROR",JOptionPane.ERROR_MESSAGE);
            }
        } catch(SQLException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage(),
            "ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonC2ActionPerformed

    private void jButtonAquafinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAquafinaActionPerformed
           
        int key =4;
        try {
            if(orderPotation.checkPotation(key)){
             orderPotation.setPotationOrder(orderPotation.orderPotation(key));
             DefaultTableModel model=(DefaultTableModel)tabOder.getModel();
             model.addRow(new Object[]{orderPotation.orderPotation(key).getPotationName(),orderPotation.orderPotation(key).getPrice()});
             orderPotation.setSumMoneyOrder();
             sumOfMoneyOrder1.setText(String.valueOf(orderPotation.getSumMoneyOrder()));
             sumOfMoneyOrder.setText(String.valueOf(orderPotation.getSumMoneyOrder()));
            }
            else
            {JOptionPane.showMessageDialog(this,"Potation is over!!!",
            "ERROR",JOptionPane.ERROR_MESSAGE);
            }
        } catch(SQLException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage(),
            "ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonAquafinaActionPerformed

    private void jButtonFantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFantaActionPerformed
           
        int key =5;
        try {
            if(orderPotation.checkPotation(key)){
             orderPotation.setPotationOrder(orderPotation.orderPotation(key));
             DefaultTableModel model=(DefaultTableModel)tabOder.getModel();
             model.addRow(new Object[]{orderPotation.orderPotation(key).getPotationName(),orderPotation.orderPotation(key).getPrice()});
             orderPotation.setSumMoneyOrder();
             sumOfMoneyOrder1.setText(String.valueOf(orderPotation.getSumMoneyOrder()));
             sumOfMoneyOrder.setText(String.valueOf(orderPotation.getSumMoneyOrder()));
            }
            else
            {JOptionPane.showMessageDialog(this,"Potation is over!!!",
            "ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }catch(SQLException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage(),
            "ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonFantaActionPerformed

    private void jButtonStingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStingActionPerformed
         
        int key =6;
        try {
            if(orderPotation.checkPotation(key)){
             orderPotation.setPotationOrder(orderPotation.orderPotation(key));
             DefaultTableModel model=(DefaultTableModel)tabOder.getModel();
             model.addRow(new Object[]{orderPotation.orderPotation(key).getPotationName(),orderPotation.orderPotation(key).getPrice()});
             orderPotation.setSumMoneyOrder();
             sumOfMoneyOrder1.setText(String.valueOf(orderPotation.getSumMoneyOrder()));
             sumOfMoneyOrder.setText(String.valueOf(orderPotation.getSumMoneyOrder()));
            }
            else
            {JOptionPane.showMessageDialog(this,"Potation is over!!!",
            "ERROR",JOptionPane.ERROR_MESSAGE);
            }
        } catch(SQLException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage(),
            "ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonStingActionPerformed

    private void jButtonTwisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTwisterActionPerformed
           
        int key =7;
        try {
            if(orderPotation.checkPotation(key)){
             orderPotation.setPotationOrder(orderPotation.orderPotation(key));
             DefaultTableModel model=(DefaultTableModel)tabOder.getModel();
             model.addRow(new Object[]{orderPotation.orderPotation(key).getPotationName(),orderPotation.orderPotation(key).getPrice()});
             orderPotation.setSumMoneyOrder();
             sumOfMoneyOrder1.setText(String.valueOf(orderPotation.getSumMoneyOrder()));
             sumOfMoneyOrder.setText(String.valueOf(orderPotation.getSumMoneyOrder()));
            }
            else
            {JOptionPane.showMessageDialog(this,"Potation is over!!!",
            "ERROR",JOptionPane.ERROR_MESSAGE);
            }
        } catch(SQLException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage(),
            "ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonTwisterActionPerformed

    private void jButtonDrThanhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDrThanhActionPerformed
         
        int key =8;
        try {
            if(orderPotation.checkPotation(key)){
             orderPotation.setPotationOrder(orderPotation.orderPotation(key));
             DefaultTableModel model=(DefaultTableModel)tabOder.getModel();
             model.addRow(new Object[]{orderPotation.orderPotation(key).getPotationName(),orderPotation.orderPotation(key).getPrice()});
             orderPotation.setSumMoneyOrder();
             sumOfMoneyOrder1.setText(String.valueOf(orderPotation.getSumMoneyOrder()));
             sumOfMoneyOrder.setText(String.valueOf(orderPotation.getSumMoneyOrder()));
            }
            else
            {JOptionPane.showMessageDialog(this,"Potation is over!!!",
            "ERROR",JOptionPane.ERROR_MESSAGE);
            }
        } catch(SQLException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage(),
            "ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonDrThanhActionPerformed

    private void jButtonNutriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNutriActionPerformed
           
        int key =9;
        try {
            if(orderPotation.checkPotation(key)){
             orderPotation.setPotationOrder(orderPotation.orderPotation(key));
             DefaultTableModel model=(DefaultTableModel)tabOder.getModel();
             model.addRow(new Object[]{orderPotation.orderPotation(key).getPotationName(),orderPotation.orderPotation(key).getPrice()});
             orderPotation.setSumMoneyOrder();
             sumOfMoneyOrder1.setText(String.valueOf(orderPotation.getSumMoneyOrder()));
             sumOfMoneyOrder.setText(String.valueOf(orderPotation.getSumMoneyOrder()));
            }
            else
            {JOptionPane.showMessageDialog(this,"Potation is over!!!",
            "ERROR",JOptionPane.ERROR_MESSAGE);
            }
        } catch(SQLException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage(),
            "ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonNutriActionPerformed

    private void jButtonLatteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLatteActionPerformed
          
        int key =10;
        try {
            if(orderPotation.checkPotation(key)){
             orderPotation.setPotationOrder(orderPotation.orderPotation(key));
             DefaultTableModel model=(DefaultTableModel)tabOder.getModel();
             model.addRow(new Object[]{orderPotation.orderPotation(key).getPotationName(),orderPotation.orderPotation(key).getPrice()});
             orderPotation.setSumMoneyOrder();
             sumOfMoneyOrder1.setText(String.valueOf(orderPotation.getSumMoneyOrder()));
             sumOfMoneyOrder.setText(String.valueOf(orderPotation.getSumMoneyOrder()));
            }
            else
            {JOptionPane.showMessageDialog(this,"Potation is over!!!",
            "ERROR",JOptionPane.ERROR_MESSAGE);
            }
        } catch(SQLException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage(),
            "ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonLatteActionPerformed

    private void jButtonSpriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSpriteActionPerformed
          
        int key =11;
        try {
            if(orderPotation.checkPotation(key)){
             orderPotation.setPotationOrder(orderPotation.orderPotation(key));
             DefaultTableModel model=(DefaultTableModel)tabOder.getModel();
             model.addRow(new Object[]{orderPotation.orderPotation(key).getPotationName(),orderPotation.orderPotation(key).getPrice()});
             orderPotation.setSumMoneyOrder();
             sumOfMoneyOrder1.setText(String.valueOf(orderPotation.getSumMoneyOrder()));
             sumOfMoneyOrder.setText(String.valueOf(orderPotation.getSumMoneyOrder()));
            }
            else
            {JOptionPane.showMessageDialog(this,"Potation is over!!!",
            "ERROR",JOptionPane.ERROR_MESSAGE);
            }
        } catch(SQLException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage(),
            "ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonSpriteActionPerformed

    private void jButtonOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOrderActionPerformed
       try{
        if (orderPotation.getSumMoneyInput()==0){
            JOptionPane.showMessageDialog(this,"No Money input!!!",
            "ERROR",JOptionPane.ERROR_MESSAGE);
        }else{ 
                if(orderPotation.getSumMoneyInput()<orderPotation.getSumMoneyOrder()){
                    JOptionPane.showMessageDialog(this,"Not enough Money to Oder!!!",
                    "ERROR",JOptionPane.ERROR_MESSAGE);
                    orderPotation.setMoneyOutput(orderPotation.getMoneyInput());
                    DefaultTableModel model=(DefaultTableModel)tbMoneyOutput.getModel();
                    for(int i=0;i<orderPotation.getMoneyOutput().size();i++){      
                        int b;
                        if ("Cotton".equals(orderPotation.getMoney1(i).getMaterial()) || "Polymer".equals(orderPotation.getMoney1(i).getMaterial()))
                                 b=1;
                            else b=0;
                            model.addRow(new Object[]{orderPotation.getMoney1(i).getDenominations(),b});
                            
                    }
                }else{
                        orderPotation.setSumMoneyOutput();
                        tbMoneyOutput.clearSelection();
                        sumOfMoneyOutput.setText(String.valueOf(orderPotation.getSumMoneyOutput()));
                        try {
                            orderPotation.setMoneyOutput();
                        } catch (SQLException ex) {
                            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
                          }
                        if(orderPotation.getMoneyOutput().isEmpty()&&orderPotation.getSumMoneyOutput()!=0){
                            JOptionPane.showMessageDialog(this,"Sr Money is over!!!!",
                            "INFORMATION_MESSAGE",JOptionPane.INFORMATION_MESSAGE);
                            orderPotation.setSumMoneyOutput(orderPotation.getSumMoneyInput());
                            sumOfMoneyOutput.setText(String.valueOf(orderPotation.getSumMoneyOutput()));
                            orderPotation.setMoneyOutput(orderPotation.getMoneyInput());
                            DefaultTableModel model=(DefaultTableModel)tbMoneyOutput.getModel();
                            
                            for(int i=0;i<model.getRowCount();i++){
                            model.removeRow(i);
                            }
                            for(int i=0;i<orderPotation.getMoneyOutput().size();i++)
                            {       int b;
                                if ("Cotton".equals(orderPotation.getMoney1(i).getMaterial()) || "Polymer".equals(orderPotation.getMoney1(i).getMaterial()))
                                     b=1;
                                else b=0;
                            model.addRow(new Object[]{orderPotation.getMoney1(i).getDenominations(),b});
                            }
                        }else {
                        DefaultTableModel model=(DefaultTableModel)tbMoneyOutput.getModel();
                        for(int i=0;i<orderPotation.getMoneyOutput().size();i++)
                        {       int b;
                            if ("Cotton".equals(orderPotation.getMoney1(i).getMaterial()) || "Polymer".equals(orderPotation.getMoney1(i).getMaterial()))
                                 b=1;
                            else b=0;
                        model.addRow(new Object[]{orderPotation.getMoney1(i).getDenominations(),b});
                        }
                 //  begin connect database      
                            UpdatePotation potation = new UpdatePotation();
                            for(int i=0 ;i<orderPotation.getPotationOrder().size();i++){

                                System.out.print(orderPotation.getPotationOrder(i).getPotationKey());
                                potation.runUpdate("popPotation","1",
                                        orderPotation.getPotationOrder(i).getPotationName(),
                                        String.valueOf(orderPotation.getPotationOrder(i).getPotationKey()),
                                        String.valueOf(orderPotation.getPotationOrder(i).getPrice()));
                            }
                            UpdateMoney money =new UpdateMoney();
                            for(int i=0;i<orderPotation.getMoneyOutput().size();i++) {
                                int b;
                                if ("Cotton".equals(orderPotation.getMoney1(i).getMaterial()) || "Polymer".equals(orderPotation.getMoney1(i).getMaterial()))
                                     b=1;
                                else b=0;
                                money.runUpdateMoney("popMoney",orderPotation.getMoney1(i), "1",b);
                            }  
                            for(int i=0;i<orderPotation.getMoneyInput().size();i++) {
                                int b;
                                if ("Cotton".equals(orderPotation.getMoney(i).getMaterial()) || "Polymer".equals(orderPotation.getMoney(i).getMaterial()))
                                     b=1;
                                else b=0;
                                money.runUpdateMoney("updateMoney",orderPotation.getMoney(i), "1",b);
                            }  
                        // end connect database  
                      JOptionPane.showMessageDialog(this,"Order succes , click exit !!!!",
                            "INFORMATION_MESSAGE",JOptionPane.INFORMATION_MESSAGE);
                }
        }
     }
        jButtonOrder.setVisible(false);
        btnPush1.setVisible(false);
    }catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage(),
            "ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonOrderActionPerformed

    private void jButtonOLong1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOLong1ActionPerformed
       int key =12;
        try {
            if(orderPotation.checkPotation(key)){
             orderPotation.setPotationOrder(orderPotation.orderPotation(key));
             DefaultTableModel model=(DefaultTableModel)tabOder.getModel();
             model.addRow(new Object[]{orderPotation.orderPotation(key).getPotationName(),orderPotation.orderPotation(key).getPrice()});
             orderPotation.setSumMoneyOrder();
             sumOfMoneyOrder1.setText(String.valueOf(orderPotation.getSumMoneyOrder()));
             sumOfMoneyOrder.setText(String.valueOf(orderPotation.getSumMoneyOrder()));
            }
            else
            {JOptionPane.showMessageDialog(this,"Potation is over!!!",
            "ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(SQLException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage(),
            "ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonOLong1ActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int i= tabOder.getSelectedRow();
        DefaultTableModel model=(DefaultTableModel)tabOder.getModel();
        try{
        model.removeRow(i);
        orderPotation.getPotationOrder().remove(i);
        orderPotation.setSumMoneyOrder(orderPotation.getPotationOrder());
        sumOfMoneyOrder1.setText(String.valueOf(orderPotation.getSumMoneyOrder()));
        sumOfMoneyOrder.setText(String.valueOf(orderPotation.getSumMoneyOrder()));
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage(),
            "ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.setVisible(false);
        new HomePage().setVisible(true); 
        orderPotation.resetOrder();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnFBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFBActionPerformed
        try {
            Desktop.getDesktop().browse(new URL("https://www.facebook.com/quanghi.95").toURI());
            } catch (Exception e) {
            JOptionPane.showMessageDialog(this,e.getMessage(),
            "ERROR",JOptionPane.ERROR_MESSAGE);
            }    
    }//GEN-LAST:event_btnFBActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelHome;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFB;
    private javax.swing.JButton btnPush1;
    private javax.swing.JRadioButton c1001;
    private javax.swing.JRadioButton c2001;
    private javax.swing.JRadioButton c5001;
    private javax.swing.ButtonGroup groupMoney;
    private javax.swing.JButton jButtonAquafina;
    private javax.swing.JButton jButtonC2;
    private javax.swing.JButton jButtonCocaCola;
    private javax.swing.JButton jButtonDrThanh;
    private javax.swing.JButton jButtonFanta;
    private javax.swing.JButton jButtonLatte;
    private java.awt.Button jButtonLogin;
    private javax.swing.JButton jButtonNutri;
    private javax.swing.JButton jButtonOLong1;
    private javax.swing.JButton jButtonOrder;
    private javax.swing.JButton jButtonPepsi;
    private javax.swing.JButton jButtonSprite;
    private javax.swing.JButton jButtonSting;
    private javax.swing.JButton jButtonTwister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private java.awt.Label label1;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private javax.swing.JRadioButton p10001;
    private javax.swing.JRadioButton p1001;
    private javax.swing.JRadioButton p20001;
    private javax.swing.JRadioButton p2001;
    private javax.swing.JRadioButton p50001;
    private javax.swing.JRadioButton p5001;
    private java.awt.TextField sumOfMoneyInput;
    private java.awt.TextField sumOfMoneyOrder;
    private java.awt.TextField sumOfMoneyOrder1;
    private java.awt.TextField sumOfMoneyOutput;
    private javax.swing.JTable tabOder;
    private javax.swing.JTable tbMoneyInput;
    private javax.swing.JTable tbMoneyOutput;
    // End of variables declaration//GEN-END:variables
}
