/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pages;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Student.Admin
 */
public final class User_Dashboard extends javax.swing.JFrame {

    DB db;
    DBCollection collect;

    MongoClient mongo;

    public User_Dashboard() {
        initComponents();

        display();

        this.setLocationRelativeTo(null);

        dropdown1.setVisible(false);
        about1.setVisible(false);
        about2.setVisible(false);
        about3.setVisible(false);
        about4.setVisible(false);
        about5.setVisible(false);
        about6.setVisible(false);
        about7.setVisible(false);
        about8.setVisible(false);

        otout();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ot1 = new javax.swing.JTextField();
        ot2 = new javax.swing.JLabel();
        ot3 = new javax.swing.JLabel();
        ot4 = new javax.swing.JTextField();
        ot5 = new javax.swing.JLabel();
        ot6 = new javax.swing.JTextField();
        ot7 = new javax.swing.JLabel();
        ot8 = new javax.swing.JTextField();
        ot9 = new javax.swing.JLabel();
        ot10 = new javax.swing.JTextField();
        ot11 = new javax.swing.JLabel();
        ot12 = new javax.swing.JLabel();
        ot13 = new javax.swing.JTextField();
        ot14 = new javax.swing.JTextField();
        dropdown1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        productss = new javax.swing.JButton();
        uname = new javax.swing.JLabel();
        about1 = new javax.swing.JLabel();
        about2 = new javax.swing.JLabel();
        about3 = new javax.swing.JLabel();
        about4 = new javax.swing.JLabel();
        about5 = new javax.swing.JLabel();
        about6 = new javax.swing.JLabel();
        about7 = new javax.swing.JLabel();
        about8 = new javax.swing.JLabel();
        btn1 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        arrow = new javax.swing.JLabel();
        jdate = new javax.swing.JLabel();
        dropdown = new javax.swing.JLabel();
        showtable1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        showtable2 = new javax.swing.JScrollPane();
        carttable = new javax.swing.JTable();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ot1.setBackground(new java.awt.Color(255, 0, 0));
        ot1.setFont(new java.awt.Font("Script MT Bold", 1, 18)); // NOI18N
        ot1.setForeground(new java.awt.Color(255, 255, 255));
        ot1.setText("Bejoc");
        getContentPane().add(ot1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, -1, 30));

        ot2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/222.jpg"))); // NOI18N
        getContentPane().add(ot2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 100, 130));

        ot3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/unnamed (4).png"))); // NOI18N
        getContentPane().add(ot3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 100, 140));

        ot4.setBackground(new java.awt.Color(255, 0, 0));
        ot4.setFont(new java.awt.Font("Script MT Bold", 1, 18)); // NOI18N
        ot4.setForeground(new java.awt.Color(255, 255, 255));
        ot4.setText("Dasian");
        getContentPane().add(ot4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, -1, -1));

        ot5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/id.png"))); // NOI18N
        getContentPane().add(ot5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 100, 140));

        ot6.setBackground(new java.awt.Color(255, 0, 0));
        ot6.setFont(new java.awt.Font("Script MT Bold", 1, 18)); // NOI18N
        ot6.setForeground(new java.awt.Color(255, 255, 255));
        ot6.setText("Toquero");
        getContentPane().add(ot6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, -1, -1));

        ot7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/unnamed.png"))); // NOI18N
        getContentPane().add(ot7, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 150, 100, 140));

        ot8.setBackground(new java.awt.Color(255, 0, 0));
        ot8.setFont(new java.awt.Font("Script MT Bold", 1, 18)); // NOI18N
        ot8.setForeground(new java.awt.Color(255, 255, 255));
        ot8.setText("Umaran");
        getContentPane().add(ot8, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 290, -1, -1));

        ot9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/unnamed (2).png"))); // NOI18N
        getContentPane().add(ot9, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 290, -1, 140));

        ot10.setBackground(new java.awt.Color(255, 0, 0));
        ot10.setFont(new java.awt.Font("Script MT Bold", 1, 18)); // NOI18N
        ot10.setForeground(new java.awt.Color(255, 255, 255));
        ot10.setText("Enopia");
        getContentPane().add(ot10, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 430, -1, 30));

        ot11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Pi.png"))); // NOI18N
        getContentPane().add(ot11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 100, 200));

        ot12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/unnamed (1).png"))); // NOI18N
        getContentPane().add(ot12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 100, 150));

        ot13.setBackground(new java.awt.Color(255, 0, 0));
        ot13.setFont(new java.awt.Font("Script MT Bold", 1, 18)); // NOI18N
        ot13.setForeground(new java.awt.Color(255, 255, 255));
        ot13.setText("Cartalla");
        getContentPane().add(ot13, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, -1, -1));

        ot14.setBackground(new java.awt.Color(255, 0, 0));
        ot14.setFont(new java.awt.Font("Script MT Bold", 1, 18)); // NOI18N
        ot14.setForeground(new java.awt.Color(255, 255, 255));
        ot14.setText("Meguizo");
        getContentPane().add(ot14, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, -1, -1));

        dropdown1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logout (1).png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        dropdown1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 80, 40));

        productss.setBackground(new java.awt.Color(0, 255, 255));
        productss.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        productss.setText("PRODUCTS");
        productss.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productssMouseClicked(evt);
            }
        });
        dropdown1.add(productss, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 30));

        getContentPane().add(dropdown1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 70, 120, 100));

        uname.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        uname.setForeground(new java.awt.Color(0, 255, 255));
        uname.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, 120, 40));

        about1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        about1.setForeground(new java.awt.Color(0, 255, 255));
        about1.setText("Gaming G-Shop");
        getContentPane().add(about1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, -1, -1));

        about2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        about2.setForeground(new java.awt.Color(255, 255, 255));
        about2.setText(" opportunity to play better in different field of games. Non-gamer  can also purchase");
        getContentPane().add(about2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, -1, -1));

        about3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        about3.setForeground(new java.awt.Color(255, 255, 255));
        about3.setText("this products as it gives same benefits. Our team has seen that gaming in this 21st");
        getContentPane().add(about3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, -1, -1));

        about4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        about4.setForeground(new java.awt.Color(255, 255, 255));
        about4.setText("games, so there is a need to have gadgets which helps them play better.");
        getContentPane().add(about4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, -1, -1));

        about5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        about5.setForeground(new java.awt.Color(255, 255, 255));
        about5.setText("is a system created dedicated to ");
        getContentPane().add(about5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, 270, -1));

        about6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        about6.setForeground(new java.awt.Color(255, 255, 255));
        about6.setText("provide a very affordable and comfortable gaming gaddets for every gamer the");
        getContentPane().add(about6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, -1));

        about7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        about7.setForeground(new java.awt.Color(255, 255, 255));
        about7.setText("century generation has become rampant. Many have become more addicted to ");
        getContentPane().add(about7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, -1, -1));

        about8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        about8.setForeground(new java.awt.Color(255, 255, 255));
        about8.setText("So, our team decided to create this system, selling products with high quality.");
        getContentPane().add(about8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, -1, 50));

        btn1.setBackground(new java.awt.Color(255, 0, 0));
        btn1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setText("PURCHASED PRODUCTS");
        btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn1MouseClicked(evt);
            }
        });
        getContentPane().add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 180, 40));

        btn6.setBackground(new java.awt.Color(255, 0, 0));
        btn6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn6.setForeground(new java.awt.Color(255, 255, 255));
        btn6.setText("IN THE CART");
        btn6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn6MouseClicked(evt);
            }
        });
        getContentPane().add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, 180, 40));

        btn3.setBackground(new java.awt.Color(255, 0, 0));
        btn3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.setText("CONTACT US");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 480, 140, 40));

        btn4.setBackground(new java.awt.Color(255, 0, 0));
        btn4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn4.setForeground(new java.awt.Color(255, 255, 255));
        btn4.setText("OUR TEAM");
        btn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn4MouseClicked(evt);
            }
        });
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 480, 140, 40));

        btn2.setBackground(new java.awt.Color(255, 0, 0));
        btn2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setText("ABOUT ");
        btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn2MouseClicked(evt);
            }
        });
        getContentPane().add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, 140, 40));

        arrow.setBackground(new java.awt.Color(255, 0, 0));
        arrow.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        arrow.setForeground(new java.awt.Color(255, 0, 0));
        arrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/arrowback.png"))); // NOI18N
        arrow.setText("Go Back");
        arrow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                arrowMouseClicked(evt);
            }
        });
        getContentPane().add(arrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 170, 50));

        jdate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jdate.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 160, 20));

        dropdown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/profilelogo.png"))); // NOI18N
        dropdown.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dropdownMousePressed(evt);
            }
        });
        getContentPane().add(dropdown, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 0, -1, -1));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Product Name", "Price", "Quantity", "Total Price", "Date Purchased"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        showtable1.setViewportView(table);

        getContentPane().add(showtable1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 680, 320));

        carttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Description", "Price"
            }
        ));
        showtable2.setViewportView(carttable);

        getContentPane().add(showtable2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 680, 320));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dashinvert.jpg"))); // NOI18N
        bg.setText("jLabel1");
        bg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bgMouseClicked(evt);
            }
        });
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        contact cont = new contact();
        cont.namecontact.setText(uname.getText());
        cont.show();
        this.setVisible(false);
    }//GEN-LAST:event_btn3ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:

        System.exit(0);

    }//GEN-LAST:event_jLabel3MouseClicked

    private void productssMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productssMouseClicked
        // TODO add your handling code here:
        store toko = new store();
        toko.profname1.setText(uname.getText());
        toko.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_productssMouseClicked

    private void dropdownMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dropdownMousePressed
        // TODO add your handling code here:
        dropdown1.setVisible(true);
    }//GEN-LAST:event_dropdownMousePressed

    private void bgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgMouseClicked
        // TODO add your handling code here:
        dropdown1.setVisible(false);
    }//GEN-LAST:event_bgMouseClicked

    private void arrowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arrowMouseClicked
        // TODO add your handling code here:
        store back = new store();
        back.profname1.setText(uname.getText());
        back.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_arrowMouseClicked

    private void btn6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn6MouseClicked
        // TODO add your handling code here:
        
        otout();
        about1.setVisible(false);
        about2.setVisible(false);
        about3.setVisible(false);
        about4.setVisible(false);
        about5.setVisible(false);
        about6.setVisible(false);
        about7.setVisible(false);
        about8.setVisible(false);
        cartdisplay();
    }//GEN-LAST:event_btn6MouseClicked

    private void btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseClicked
        // TODO add your handling code here:
        otout();
        about1.setVisible(false);
        about2.setVisible(false);
        about3.setVisible(false);
        about4.setVisible(false);
        about5.setVisible(false);
        about6.setVisible(false);
        about7.setVisible(false);
        about8.setVisible(false);
        display();
    }//GEN-LAST:event_btn1MouseClicked

    private void btn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2MouseClicked

        otout();
        showtable2.setVisible(false);
        table.setVisible(false);
        showtable1.setVisible(false);
        carttable.setVisible(false);
        about1.setVisible(true);
        about2.setVisible(true);
        about3.setVisible(true);
        about4.setVisible(true);
        about5.setVisible(true);
        about6.setVisible(true);
        about7.setVisible(true);
        about8.setVisible(true);


    }//GEN-LAST:event_btn2MouseClicked

    private void btn4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4MouseClicked

        ourTeam1 n = new ourTeam1();
        n.otname.setText(uname.getText());
        n.show();
        this.setVisible(false);
                
//        showtable1.setVisible(false);
//        showtable2.setVisible(false);
//        
//        about1.setVisible(false);
//        about2.setVisible(false);
//        about3.setVisible(false);
//        about4.setVisible(false);
//        about5.setVisible(false);
//        about6.setVisible(false);
//        about7.setVisible(false);
//        about8.setVisible(false);
//        
//        ot1.setVisible(true);
//        ot2.setVisible(true);
//        ot3.setVisible(true);
//        ot4.setVisible(true);
//        ot5.setVisible(true);
//        ot6.setVisible(true);
//        ot7.setVisible(true);
//        ot8.setVisible(true);
//        ot9.setVisible(true);
//        ot10.setVisible(true);
//        ot11.setVisible(true);
//        ot12.setVisible(true);
//        ot13.setVisible(true);
//        ot14.setVisible(true);


    }//GEN-LAST:event_btn4MouseClicked

    public void cartdisplay() {
        showtable1.setVisible(false);
        showtable2.setVisible(true);
        carttable.setVisible(true);
        String indentity = uname.getText();

        try {
            DBCursor cursor;
            mongo = new MongoClient("localhost", 27017);
            db = mongo.getDB("BigData");
            DBCollection coll = db.getCollection("listed");
            cursor = coll.find();
            String[] columnNames = {"Name", "Description", " Price"};
            DefaultTableModel model = new DefaultTableModel(columnNames, 0);

            while (cursor.hasNext()) {
                DBObject obj = cursor.next();
                String u = (String) obj.get("UserID");
                if (u.equals(indentity)) {
                    String n = (String) obj.get("Name");
                    String q = (String) obj.get("Description");
                    String p = (String) obj.get("Price");
                    model.addRow(new Object[]{n, q, p});
                    carttable.setModel(model);
                }

            }

            cursor.close();
        } catch (Exception ex) {
            System.out.println(ex);

        }
    }
    
    public void otout(){
        ot1.setVisible(false);
        ot2.setVisible(false);
        ot3.setVisible(false);
        ot4.setVisible(false);
        ot5.setVisible(false);
        ot6.setVisible(false);
        ot7.setVisible(false);
        ot8.setVisible(false);
        ot9.setVisible(false);
        ot10.setVisible(false);
        ot11.setVisible(false);
        ot12.setVisible(false);
        ot13.setVisible(false);
        ot14.setVisible(false);
    }

    public void display() {
        showtable1.setVisible(true);
        showtable2.setVisible(false);
        table.setVisible(true);
        carttable.setVisible(false);
        String indentity = uname.getText();
        try {
            DBCursor cursor;
            mongo = new MongoClient("localhost", 27017);
            db = mongo.getDB("BigData");
            DBCollection coll = db.getCollection("sold");
            cursor = coll.find();
            String[] columnNames = {"Name", "Price", "Quantity", "Total Price", " Date Purchased"};
            DefaultTableModel model = new DefaultTableModel(columnNames, 0);

            while (cursor.hasNext()) {
                DBObject obj = cursor.next();
                String u = (String) obj.get("Username");
                if (u.equals(indentity)) {
                    String a = (String) obj.get("P_Name");
                    String b = (String) obj.get("P_Price");
                    String c = (String) obj.get("P_Quantity");
                    String d = (String) obj.get("P_Total");
                    String e = (String) obj.get("Date");
                    model.addRow(new Object[]{a, b, c, d, e});
                    table.setModel(model);
                }

            }

            cursor.close();
        } catch (Exception ex) {
            System.out.println(ex);

        }
    }

//    public static void main(String args[]) {
//
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new User_Dashboard().setVisible(true);
//            }
//        });
//    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel about1;
    private javax.swing.JLabel about2;
    private javax.swing.JLabel about3;
    private javax.swing.JLabel about4;
    private javax.swing.JLabel about5;
    private javax.swing.JLabel about6;
    private javax.swing.JLabel about7;
    private javax.swing.JLabel about8;
    private javax.swing.JLabel arrow;
    private javax.swing.JLabel bg;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn6;
    private javax.swing.JTable carttable;
    private javax.swing.JLabel dropdown;
    private javax.swing.JPanel dropdown1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jdate;
    private javax.swing.JTextField ot1;
    private javax.swing.JTextField ot10;
    private javax.swing.JLabel ot11;
    private javax.swing.JLabel ot12;
    private javax.swing.JTextField ot13;
    private javax.swing.JTextField ot14;
    private javax.swing.JLabel ot2;
    private javax.swing.JLabel ot3;
    private javax.swing.JTextField ot4;
    private javax.swing.JLabel ot5;
    private javax.swing.JTextField ot6;
    private javax.swing.JLabel ot7;
    private javax.swing.JTextField ot8;
    private javax.swing.JLabel ot9;
    private javax.swing.JButton productss;
    private javax.swing.JScrollPane showtable1;
    private javax.swing.JScrollPane showtable2;
    private javax.swing.JTable table;
    public javax.swing.JLabel uname;
    // End of variables declaration//GEN-END:variables
}
