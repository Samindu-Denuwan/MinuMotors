package javaswingdev.form;

import com.bike.common.SystemConfigData;
import com.bike.common.SystemVariableList;
import com.bike.db.DB;
import com.bike.dto.InvoiceItemRow;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import org.apache.log4j.Logger;

public class Invoice extends javax.swing.JPanel {

    private Logger log;

    public Invoice() {
        initComponents();
        log = Logger.getLogger("bikeLogger");
        log.info("Invoice Page Loaded");
        JT_invoice.fixTable(jScrollPane4);
        loadCashCus();
        generateInvID();
        btnSave.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel1 = new javaswingdev.swing.RoundPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_stock_id = new javax.swing.JTextField();
        txt_product_id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_product_name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_product_brand = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_product_category = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_product_price = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_avb_qty = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_inv_id = new javax.swing.JTextField();
        btnProduct = new javax.swing.JButton();
        clearField = new javax.swing.JLabel();
        roundPanel2 = new javaswingdev.swing.RoundPanel();
        btnSave = new javax.swing.JButton();
        card1 = new javaswingdev.card.Card();
        jLabel18 = new javax.swing.JLabel();
        txt_customer_id = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_total = new javax.swing.JTextField();
        txt_customer_name = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txt_customer_mobile = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txt_qty = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txt_discount = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txt_nettotal = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txt_payment = new javax.swing.JTextField();
        txt_balance = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        JT_invoice = new javaswingdev.swing.table.Table();
        addBtn = new javax.swing.JButton();
        btnCustomer = new javax.swing.JButton();

        setBackground(new java.awt.Color(228, 232, 229));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel1.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setText("Invoice");
        roundPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Stock ID");
        roundPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        txt_stock_id.setEditable(false);
        txt_stock_id.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_stock_id.setForeground(new java.awt.Color(102, 102, 102));
        txt_stock_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_stock_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        roundPanel1.add(txt_stock_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 340, 35));

        txt_product_id.setEditable(false);
        txt_product_id.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_product_id.setForeground(new java.awt.Color(102, 102, 102));
        txt_product_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_product_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        roundPanel1.add(txt_product_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 340, 35));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Product ID");
        roundPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        txt_product_name.setEditable(false);
        txt_product_name.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_product_name.setForeground(new java.awt.Color(102, 102, 102));
        txt_product_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_product_name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        roundPanel1.add(txt_product_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 340, 35));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Product Name");
        roundPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));

        txt_product_brand.setEditable(false);
        txt_product_brand.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_product_brand.setForeground(new java.awt.Color(102, 102, 102));
        txt_product_brand.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_product_brand.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        roundPanel1.add(txt_product_brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 340, 35));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Unit Price");
        roundPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 690, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Available Quantity");
        roundPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 780, -1, -1));

        txt_product_category.setEditable(false);
        txt_product_category.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_product_category.setForeground(new java.awt.Color(102, 102, 102));
        txt_product_category.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_product_category.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        roundPanel1.add(txt_product_category, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 630, 340, 35));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Category");
        roundPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, -1, -1));

        txt_product_price.setEditable(false);
        txt_product_price.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_product_price.setForeground(new java.awt.Color(102, 102, 102));
        txt_product_price.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_product_price.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        roundPanel1.add(txt_product_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 720, 340, 35));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Brand");
        roundPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, -1, -1));

        txt_avb_qty.setEditable(false);
        txt_avb_qty.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_avb_qty.setForeground(new java.awt.Color(102, 102, 102));
        txt_avb_qty.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_avb_qty.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        roundPanel1.add(txt_avb_qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 810, 340, 35));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Invoice ID");
        roundPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        txt_inv_id.setEditable(false);
        txt_inv_id.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_inv_id.setForeground(new java.awt.Color(102, 102, 102));
        txt_inv_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_inv_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        roundPanel1.add(txt_inv_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 340, 35));

        btnProduct.setBackground(new java.awt.Color(153, 204, 255));
        btnProduct.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnProduct.setForeground(new java.awt.Color(0, 102, 204));
        btnProduct.setText("SELECT PRODUCT");
        btnProduct.setBorder(null);
        btnProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductActionPerformed(evt);
            }
        });
        roundPanel1.add(btnProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 340, 35));

        clearField.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/burger/icon/close_1.png"))); // NOI18N
        clearField.setText("Clear Fields");
        clearField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearFieldMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clearFieldMouseEntered(evt);
            }
        });
        roundPanel1.add(clearField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 910, 120, 40));

        add(roundPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 380, 1030));

        roundPanel2.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSave.setBackground(new java.awt.Color(153, 204, 255));
        btnSave.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(0, 102, 204));
        btnSave.setText("SAVE AND PRINT");
        btnSave.setBorder(null);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        roundPanel2.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 950, 190, 35));

        card1.setDescription("");
        card1.setIcon(javaswingdev.GoogleMaterialDesignIcon.PLAYLIST_ADD);
        roundPanel2.add(card1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 60, 50));

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setText("Customer ID");
        roundPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        txt_customer_id.setEditable(false);
        txt_customer_id.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_customer_id.setForeground(new java.awt.Color(102, 102, 102));
        txt_customer_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_customer_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        roundPanel2.add(txt_customer_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 250, 35));

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setText("Total");
        roundPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 770, -1, -1));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel13.setText("Add");
        roundPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        txt_total.setEditable(false);
        txt_total.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_total.setForeground(new java.awt.Color(102, 102, 102));
        txt_total.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_total.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        roundPanel2.add(txt_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 810, 280, 35));

        txt_customer_name.setEditable(false);
        txt_customer_name.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_customer_name.setForeground(new java.awt.Color(102, 102, 102));
        txt_customer_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_customer_name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        roundPanel2.add(txt_customer_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 320, 35));

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 102, 102));
        jLabel20.setText("Customer Name");
        roundPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, -1, -1));

        txt_customer_mobile.setEditable(false);
        txt_customer_mobile.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_customer_mobile.setForeground(new java.awt.Color(102, 102, 102));
        txt_customer_mobile.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_customer_mobile.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        roundPanel2.add(txt_customer_mobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 50, 300, 35));

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 102, 102));
        jLabel21.setText("Mobile No");
        roundPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 20, 100, -1));

        txt_qty.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_qty.setForeground(new java.awt.Color(102, 102, 102));
        txt_qty.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_qty.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        txt_qty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_qtyKeyTyped(evt);
            }
        });
        roundPanel2.add(txt_qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 140, 150, 35));

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 102, 102));
        jLabel22.setText("Quantity");
        roundPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 150, -1, -1));

        txt_discount.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_discount.setForeground(new java.awt.Color(102, 102, 102));
        txt_discount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_discount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        txt_discount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_discountActionPerformed(evt);
            }
        });
        txt_discount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_discountKeyTyped(evt);
            }
        });
        roundPanel2.add(txt_discount, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 810, 150, 35));

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 102, 102));
        jLabel23.setText("LKR");
        roundPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 820, -1, -1));

        txt_nettotal.setEditable(false);
        txt_nettotal.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        txt_nettotal.setForeground(new java.awt.Color(102, 102, 102));
        txt_nettotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_nettotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        txt_nettotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nettotalActionPerformed(evt);
            }
        });
        roundPanel2.add(txt_nettotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 790, 270, 80));

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(204, 0, 0));
        jLabel24.setText("Net Total");
        roundPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 810, -1, -1));

        jLabel25.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(102, 102, 102));
        jLabel25.setText("Payment");
        roundPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 880, -1, -1));

        txt_payment.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_payment.setForeground(new java.awt.Color(102, 102, 102));
        txt_payment.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_payment.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        txt_payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_paymentActionPerformed(evt);
            }
        });
        txt_payment.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_paymentKeyTyped(evt);
            }
        });
        roundPanel2.add(txt_payment, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 910, 280, 35));

        txt_balance.setEditable(false);
        txt_balance.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_balance.setForeground(new java.awt.Color(102, 102, 102));
        txt_balance.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_balance.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        roundPanel2.add(txt_balance, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 910, 300, 35));

        jLabel26.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(102, 102, 102));
        jLabel26.setText("Balance");
        roundPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 880, 110, -1));

        jLabel27.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(102, 102, 102));
        jLabel27.setText("Discount");
        roundPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 780, -1, -1));

        JT_invoice.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Stock ID", "Name", "Unit Price", "Quantity", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JT_invoice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JT_invoiceMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(JT_invoice);

        roundPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 1240, 510));

        addBtn.setBackground(new java.awt.Color(153, 204, 255));
        addBtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        addBtn.setForeground(new java.awt.Color(0, 102, 204));
        addBtn.setText("ADD TO INVOICE");
        addBtn.setBorder(null);
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        roundPanel2.add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 140, 190, 35));

        btnCustomer.setBackground(new java.awt.Color(153, 204, 255));
        btnCustomer.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnCustomer.setForeground(new java.awt.Color(0, 102, 204));
        btnCustomer.setText("SELECT CUSTOMER");
        btnCustomer.setBorder(null);
        btnCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerActionPerformed(evt);
            }
        });
        roundPanel2.add(btnCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 210, 35));

        add(roundPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 1280, 1030));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (!txt_payment.getText().equals("") && !txt_nettotal.getText().equals("")
                && !txt_balance.getText().equals("")&& !txt_total.getText().equals("")) {
            try {
                DB.push("insert into invoice values('"
                        + txt_inv_id.getText() + "','"
                        + txt_customer_id.getText() + "',CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP(),'"
                        + txt_total.getText() + "','"
                        + txt_discount.getText() + "','"
                        + txt_nettotal.getText() + "','"
                        + txt_payment.getText() + "','"
                        + txt_balance.getText() + "','" + SystemConfigData.getEmployee() + "')");

                DefaultTableModel dtm = (DefaultTableModel) JT_invoice.getModel();
                for (int row = 0; row < dtm.getRowCount(); row++) {
                    String stk_id = dtm.getValueAt(row, 0).toString();
                    String pro_id = dtm.getValueAt(row, 1).toString();
                    String uprice = dtm.getValueAt(row, 3).toString();
                    String qty = dtm.getValueAt(row, 4).toString();
                    String subtotal = dtm.getValueAt(row, 5).toString();

                    DB.push("insert into invoice_item (invoice_id,stock_id,product_id,selling_price,qty,subtotal) values('"
                            + txt_inv_id.getText() + "','"
                            + stk_id + "','"
                            + pro_id + "','"
                            + uprice + "','"
                            + qty + "','"
                            + subtotal + "')");
                    
                    loadSales(txt_nettotal.getText());
                    

                    DB.push("update stock set quantity = quantity-'" + qty + "' where stock_id = '" + stk_id + "'");

                }
                JOptionPane.showMessageDialog(this, "Invoice Saved!", "Saved", JOptionPane.INFORMATION_MESSAGE);
                log.info("Invoice Saved Successful. Invoice : " + txt_inv_id.getText() + " | By : " + SystemConfigData.getEmployee());
                DB.push("insert into system_activity (detail, date, time, employee) values ("
                        + "'Create Invoice',CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP(),'" + SystemConfigData.getEmployee() + "')");

                printInvoice(txt_inv_id.getText());
                createNewInvoice();
                btnSave.setEnabled(false);

            } catch (Exception e) {
                log.error("Invoice save Failed", e);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Fill all inputs", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txt_nettotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nettotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nettotalActionPerformed

    private void JT_invoiceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JT_invoiceMouseClicked
        DefaultTableModel model = (DefaultTableModel) JT_invoice.getModel();
        try {
            int selectRow = JT_invoice.getSelectedRow();
            model.removeRow(selectRow);

        } catch (Exception e) {
            //log.error("Remove Row Failed", e);
        }
    }//GEN-LAST:event_JT_invoiceMouseClicked

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        btnSave.setEnabled(true);
        if (txt_product_id.getText() != null && !txt_product_id.getText().trim().equals("")) {
            if (txt_qty.getText() != null && !txt_qty.getText().trim().equals("")) {
                double qty = Double.parseDouble(txt_qty.getText());
                double qtyAvb = Double.parseDouble(txt_avb_qty.getText());
                if (qty <= qtyAvb) {
                    double uprice = Double.parseDouble(txt_product_price.getText());
                    double total = qty * uprice;

                    DefaultTableModel dtm = (DefaultTableModel) JT_invoice.getModel();
                    Vector v = new Vector();
                    v.add(txt_stock_id.getText());
                    v.add(txt_product_id.getText());
                    v.add(txt_product_name.getText());
                    v.add(txt_product_price.getText());

                    InvoiceItemRow checkRowRepeating = checkRowRepeatingInv(txt_stock_id.getText());
                    if (checkRowRepeating != null) {
                        total += checkRowRepeating.getTotal();
                        qty += checkRowRepeating.getQty();
                    }

                    v.add(qty);
                    v.add(total);
                    dtm.addRow(v);
                    clearFieldInv();
                    calculaTotalInv();

                } else {
                    JOptionPane.showMessageDialog(this, "Qty not Available!!", "Error", JOptionPane.ERROR_MESSAGE);

                    txt_qty.setText(null);
                    txt_qty.grabFocus();

                }

            } else {
                JOptionPane.showMessageDialog(this, "Please Enter Quantity", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Please Select Product!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void btnCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerActionPerformed
        PopUpInvCustomer customer = new PopUpInvCustomer(Invoice.this);
        customer.setVisible(true);
    }//GEN-LAST:event_btnCustomerActionPerformed

    private void btnProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductActionPerformed
        PopUpInvoice invoice = new PopUpInvoice(Invoice.this);
        invoice.setVisible(true);
        txt_qty.grabFocus();
    }//GEN-LAST:event_btnProductActionPerformed

    private void clearFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearFieldMouseClicked
        clearFields();
        btnSave.setEnabled(false);
    }//GEN-LAST:event_clearFieldMouseClicked

    private void clearFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearFieldMouseEntered

    }//GEN-LAST:event_clearFieldMouseEntered

    private void txt_qtyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_qtyKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_qtyKeyTyped

    private void txt_discountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_discountKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_discountKeyTyped

    private void txt_discountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_discountActionPerformed
        if (!txt_total.getText().equals("") && txt_discount.getText() != null && !txt_discount.getText().trim().equals("")) {
            double discount = Double.parseDouble(txt_discount.getText());
            double total = Double.parseDouble(txt_total.getText());
            if (total > 500) {
                txt_nettotal.setText("" + (total - discount));
            } else {
                JOptionPane.showMessageDialog(this, "This Invoice not eligible for Discount!", "Error", JOptionPane.ERROR_MESSAGE);

                txt_discount.setText("0");
                txt_nettotal.setText("" + total);
            }
            txt_payment.grabFocus();
        } else {
            JOptionPane.showMessageDialog(this, "Fill All Inputs", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txt_discountActionPerformed

    private void txt_paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_paymentActionPerformed
        if (txt_payment.getText() != null && !txt_payment.getText().trim().equals("")) {
            double payment = Double.parseDouble(txt_payment.getText());
            double netTotal = Double.parseDouble(txt_nettotal.getText());
            if (payment >= netTotal) {
                txt_balance.setText("" + (payment - netTotal));
                btnSave.grabFocus();
            } else {
                JOptionPane.showMessageDialog(this, "Payment not Enough!", "Error", JOptionPane.ERROR_MESSAGE);

                txt_payment.setText(" ");
                txt_payment.grabFocus();
            }
        }
    }//GEN-LAST:event_txt_paymentActionPerformed

    private void txt_paymentKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_paymentKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_paymentKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javaswingdev.swing.table.Table JT_invoice;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton btnCustomer;
    private javax.swing.JButton btnProduct;
    private javax.swing.JButton btnSave;
    private javaswingdev.card.Card card1;
    private javax.swing.JLabel clearField;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane4;
    private javaswingdev.swing.RoundPanel roundPanel1;
    private javaswingdev.swing.RoundPanel roundPanel2;
    public javax.swing.JTextField txt_avb_qty;
    private javax.swing.JTextField txt_balance;
    public javax.swing.JTextField txt_customer_id;
    public javax.swing.JTextField txt_customer_mobile;
    public javax.swing.JTextField txt_customer_name;
    private javax.swing.JTextField txt_discount;
    private javax.swing.JTextField txt_inv_id;
    private javax.swing.JTextField txt_nettotal;
    private javax.swing.JTextField txt_payment;
    public javax.swing.JTextField txt_product_brand;
    public javax.swing.JTextField txt_product_category;
    public javax.swing.JTextField txt_product_id;
    public javax.swing.JTextField txt_product_name;
    public javax.swing.JTextField txt_product_price;
    private javax.swing.JTextField txt_qty;
    public javax.swing.JTextField txt_stock_id;
    private javax.swing.JTextField txt_total;
    // End of variables declaration//GEN-END:variables

    private void clearFields() {

        loadCashCus();
        txt_customer_mobile.setText(null);

        txt_discount.setText(null);
        txt_nettotal.setText(null);
        txt_payment.setText(null);
        txt_balance.setText(null);
        txt_total.setText(null);
        clearFieldInv();
        DefaultTableModel dtm = (DefaultTableModel) JT_invoice.getModel();
        dtm.setRowCount(0);

    }

    private void generateInvID() {
        try {
            ResultSet rs = DB.search("select count(*) as inv_count from invoice");
            if (rs.next()) {
                int count = rs.getInt("inv_count");
                int c = Integer.parseInt(new SimpleDateFormat("Mddyy").format(new Date()));
                int value = c + (++count);
                String Id = "INV-" + value;
                txt_inv_id.setText(Id);
            }
            btnCustomer.grabFocus();
        } catch (Exception e) {
            log.error("Inv ID generate Failed", e);
        }
    }

    private void loadCashCus() {
        txt_customer_id.setText("CUS-00000");
        txt_customer_name.setText("Cash Customer");
    }

    private InvoiceItemRow checkRowRepeatingInv(String text) {
        InvoiceItemRow itemRow = null;
        DefaultTableModel dtm = (DefaultTableModel) JT_invoice.getModel();
        for (int row = 0; row < JT_invoice.getRowCount(); row++) {
            if (text.trim().equals(JT_invoice.getValueAt(row, 0).toString())) {
                itemRow = new InvoiceItemRow();
                double qty = Double.parseDouble(JT_invoice.getValueAt(row, 4).toString());
                double total = Double.parseDouble(JT_invoice.getValueAt(row, 5).toString());
                itemRow.setQty(qty);
                itemRow.setTotal(total);
                dtm.removeRow(row);
                break;

            }
        }
        return itemRow;
    }

    private void clearFieldInv() {
        txt_stock_id.setText(null);
        txt_product_name.setText(null);
        txt_product_price.setText(null);
        txt_qty.setText(null);
        txt_product_brand.setText(null);
        txt_product_category.setText(null);
        txt_product_id.setText(null);
        txt_avb_qty.setText(null);
    }

    private void calculaTotalInv() {
        double tot = 0;
        DefaultTableModel dtm = (DefaultTableModel) JT_invoice.getModel();
        for (int row = 0; row < dtm.getRowCount(); row++) {
            tot += Double.parseDouble(dtm.getValueAt(row, 5).toString());

        }
        txt_total.setText("" + tot);
        txt_discount.setText("0");
        txt_discount.grabFocus();
    }

    private void createNewInvoice() {
        clearFields();
        generateInvID();

    }

    private void printInvoice(String InvId) {
          try {
            String path = SystemVariableList.REPORT_BASE_URL + "MainReport.jasper";
            InputStream inputStream = new FileInputStream(path);
            Map<String, Object> params = new HashMap<>();
            params.put("InvId", InvId);

            JasperPrint fillReport = JasperFillManager.fillReport(inputStream, params, DB.getDBConnection());
            JasperViewer.viewReport(fillReport, false);
            JasperExportManager.exportReportToPdfFile(fillReport, "F:\\2023\\FINAL PROJECT\\SERVICE REPORTS\\INVOICE REPORTS\\" + InvId + ".pdf");

             log.info("Invoice Print Successful. ");
        } catch (Exception e) {
           log.error("Invoice print Failed", e);
        }
    }

    private void loadSales(String total) {
        LocalDate date = java.time.LocalDate.now();
         Double nettotal = Double.valueOf(total);
           try {
            ResultSet rs = DB.search("select * from sales where date = '"+date+"'");
           
            if (rs.next()) {
                DB.push("update sales set total = total+'" + nettotal + "' where date = '"+date+"'");
                log.info("Sales update Successful."+"'"+date+"','"+nettotal+"'");
            }else{
              DB.push("insert into sales values('"+date+"','" + nettotal + "')");
              log.info("Sales Save Successful."+"'"+date+"','"+nettotal+"'");
            }
        
        } catch (Exception e) {
            log.error("Sales save Failed", e);
        }
    }

}
