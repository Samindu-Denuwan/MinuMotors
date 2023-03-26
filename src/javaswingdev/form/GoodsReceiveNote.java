package javaswingdev.form;

import com.bike.common.SystemConfigData;
import com.bike.common.SystemVariableList;
import com.bike.common.grnItemRow;
import com.bike.db.DB;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
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

public class GoodsReceiveNote extends javax.swing.JPanel {

    private Logger log;

    public GoodsReceiveNote() {
        initComponents();
        log = Logger.getLogger("bikeLogger");
        log.info("GRN Page Loaded");
        tablePo.fixTable(jScrollPane3);
        tableGrn.fixTable(jScrollPane4);
        generateGrnID();
        txt_total.setEnabled(false);
        loadPO();
        tablePo.setVisible(false);
        txt_po.setVisible(false);
        btn_product.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel1 = new javaswingdev.swing.RoundPanel();
        jLabel6 = new javax.swing.JLabel();
        btn_product = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_supplier_id = new javax.swing.JTextField();
        txt_supplier_name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_supplier_mobile = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_supplier_email = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btn_supplier = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txt_product_id = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_product_name = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_product_brand = new javax.swing.JTextField();
        txt_grn_Id = new javax.swing.JLabel();
        roundPanel2 = new javaswingdev.swing.RoundPanel();
        switchButton = new javaswingdev.swing.SwitchButton();
        jLabel10 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txt_qty = new javax.swing.JTextField();
        txt_bPrice = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        card1 = new javaswingdev.card.Card();
        jLabel18 = new javax.swing.JLabel();
        btn_viewGRN = new javax.swing.JButton();
        txt_sPrice = new javax.swing.JTextField();
        txt_po = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_total = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablePo = new javaswingdev.swing.table.Table();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableGrn = new javaswingdev.swing.table.Table();
        clearField = new javax.swing.JLabel();

        setBackground(new java.awt.Color(228, 232, 229));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel1.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setText("Goods Receive Notes");
        roundPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        btn_product.setBackground(new java.awt.Color(153, 204, 255));
        btn_product.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_product.setForeground(new java.awt.Color(0, 102, 204));
        btn_product.setText("SELECT PRODUCT");
        btn_product.setBorder(null);
        btn_product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_productActionPerformed(evt);
            }
        });
        roundPanel1.add(btn_product, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 340, 35));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Supplier ID");
        roundPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        txt_supplier_id.setEditable(false);
        txt_supplier_id.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_supplier_id.setForeground(new java.awt.Color(102, 102, 102));
        txt_supplier_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_supplier_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        roundPanel1.add(txt_supplier_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 340, 35));

        txt_supplier_name.setEditable(false);
        txt_supplier_name.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_supplier_name.setForeground(new java.awt.Color(102, 102, 102));
        txt_supplier_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_supplier_name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        roundPanel1.add(txt_supplier_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 340, 35));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Supplier Name");
        roundPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        txt_supplier_mobile.setEditable(false);
        txt_supplier_mobile.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_supplier_mobile.setForeground(new java.awt.Color(102, 102, 102));
        txt_supplier_mobile.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_supplier_mobile.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        roundPanel1.add(txt_supplier_mobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 340, 35));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Mobile No");
        roundPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        txt_supplier_email.setEditable(false);
        txt_supplier_email.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_supplier_email.setForeground(new java.awt.Color(102, 102, 102));
        txt_supplier_email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_supplier_email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        roundPanel1.add(txt_supplier_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 340, 35));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Email");
        roundPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));

        btn_supplier.setBackground(new java.awt.Color(153, 204, 255));
        btn_supplier.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_supplier.setForeground(new java.awt.Color(0, 102, 204));
        btn_supplier.setText("SELECT SUPPLIER");
        btn_supplier.setBorder(null);
        btn_supplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_supplierActionPerformed(evt);
            }
        });
        roundPanel1.add(btn_supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 340, 35));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Product ID");
        roundPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 640, -1, -1));

        txt_product_id.setEditable(false);
        txt_product_id.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_product_id.setForeground(new java.awt.Color(102, 102, 102));
        txt_product_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_product_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        roundPanel1.add(txt_product_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 670, 340, 35));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Product Name");
        roundPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 730, -1, -1));

        txt_product_name.setEditable(false);
        txt_product_name.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_product_name.setForeground(new java.awt.Color(102, 102, 102));
        txt_product_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_product_name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        roundPanel1.add(txt_product_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 760, 340, 35));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Brand");
        roundPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 820, -1, -1));

        txt_product_brand.setEditable(false);
        txt_product_brand.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_product_brand.setForeground(new java.awt.Color(102, 102, 102));
        txt_product_brand.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_product_brand.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        roundPanel1.add(txt_product_brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 850, 340, 35));

        txt_grn_Id.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_grn_Id.setForeground(new java.awt.Color(102, 102, 102));
        txt_grn_Id.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        roundPanel1.add(txt_grn_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 100, 35));

        add(roundPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 380, 1030));

        roundPanel2.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        switchButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        switchButton.setName(""); // NOI18N
        switchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                switchButtonMouseClicked(evt);
            }
        });
        roundPanel2.add(switchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 670, 40, 20));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel10.setText("PENDING PURCHASING ORDERS");
        roundPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 660, -1, -1));

        btnAdd.setBackground(new java.awt.Color(153, 204, 255));
        btnAdd.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(0, 102, 204));
        btnAdd.setText("ADD TO GRN");
        btnAdd.setBorder(null);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        roundPanel2.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 120, 190, 35));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Quantity");
        roundPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        txt_qty.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_qty.setForeground(new java.awt.Color(102, 102, 102));
        txt_qty.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_qty.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        txt_qty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_qtyActionPerformed(evt);
            }
        });
        txt_qty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_qtyKeyTyped(evt);
            }
        });
        roundPanel2.add(txt_qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 170, 35));

        txt_bPrice.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_bPrice.setForeground(new java.awt.Color(102, 102, 102));
        txt_bPrice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_bPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        txt_bPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_bPriceActionPerformed(evt);
            }
        });
        txt_bPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_bPriceKeyTyped(evt);
            }
        });
        roundPanel2.add(txt_bPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 280, 35));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Buying Price");
        roundPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, -1, -1));

        card1.setDescription("");
        card1.setIcon(javaswingdev.GoogleMaterialDesignIcon.PLAYLIST_ADD);
        roundPanel2.add(card1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 50));

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setText("Selling Price");
        roundPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, -1, -1));

        btn_viewGRN.setBackground(new java.awt.Color(228, 232, 229));
        btn_viewGRN.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_viewGRN.setForeground(new java.awt.Color(102, 102, 102));
        btn_viewGRN.setText("View Previous GRNs");
        btn_viewGRN.setBorder(null);
        btn_viewGRN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewGRNActionPerformed(evt);
            }
        });
        roundPanel2.add(btn_viewGRN, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 20, 190, 40));

        txt_sPrice.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_sPrice.setForeground(new java.awt.Color(102, 102, 102));
        txt_sPrice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_sPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        txt_sPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_sPriceKeyTyped(evt);
            }
        });
        roundPanel2.add(txt_sPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, 280, 35));

        txt_po.setEditable(false);
        txt_po.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_po.setForeground(new java.awt.Color(102, 102, 102));
        txt_po.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_po.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        roundPanel2.add(txt_po, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 720, 280, 35));

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setText("Total");
        roundPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 660, -1, -1));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel13.setText("Add");
        roundPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        txt_total.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_total.setForeground(new java.awt.Color(102, 102, 102));
        txt_total.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_total.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        txt_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_totalActionPerformed(evt);
            }
        });
        roundPanel2.add(txt_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 700, 280, 35));

        tablePo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "PO ID", "Product ID", "Supplier ID", "Quantity", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablePo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablePo);

        roundPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 770, 1240, 230));

        tableGrn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Name", "Buying Price", "Quantity", "Selling Price", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableGrn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableGrnMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tableGrn);

        roundPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 1240, 440));

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
        roundPanel2.add(clearField, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 700, 120, 40));

        add(roundPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 1280, 1030));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_productActionPerformed
        PopUpProductsGrn grn = new PopUpProductsGrn(GoodsReceiveNote.this);
        grn.setVisible(true);
        txt_qty.grabFocus();
        btn_supplier.setEnabled(false);
    }//GEN-LAST:event_btn_productActionPerformed

    private void btn_supplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_supplierActionPerformed
        PopUpSuppliers1 pus = new PopUpSuppliers1(GoodsReceiveNote.this);
        pus.setVisible(true);
        btn_product.setEnabled(true);
    }//GEN-LAST:event_btn_supplierActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if (!txt_supplier_id.getText().trim().equals("") && !txt_product_id.getText().trim().equals("")
                && !txt_qty.getText().trim().equals("") && !txt_sPrice.getText().trim().equals("")
                && !txt_bPrice.getText().trim().equals("")) {

            double qty = Double.parseDouble(txt_qty.getText());
            double buyingPrice = Double.parseDouble(txt_bPrice.getText());
            double Sprice = Double.parseDouble(txt_sPrice.getText());
            double total = qty * buyingPrice;

            DefaultTableModel dtm = (DefaultTableModel) tableGrn.getModel();
            Vector v = new Vector();
            v.add(txt_product_id.getText());
            v.add(txt_product_name.getText());
            v.add(txt_bPrice.getText());

            grnItemRow checkRowRepeating = checkRowRepeatingGrn(txt_product_id.getText());
            if (checkRowRepeating != null) {
                total += checkRowRepeating.getTotal();
                qty += checkRowRepeating.getQty();
            }

            v.add(qty);
            v.add(txt_sPrice.getText());
            v.add(total);

            dtm.addRow(v);

            clearFieldGrn();
            calculateGrnTotal();
            txt_total.setEnabled(true);
            btn_product.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(this, "Please Fill Inputs!!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void txt_qtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_qtyActionPerformed

        if (txt_qty.getText() != null && !txt_qty.getText().trim().equals("")) {
            txt_bPrice.grabFocus();
            btn_product.setEnabled(false);

        } else {
            JOptionPane.showMessageDialog(this, "Please Enter Quantity!!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txt_qtyActionPerformed

    private void txt_bPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_bPriceActionPerformed

        if (txt_bPrice.getText() != null && !txt_bPrice.getText().trim().equals("")) {
            txt_sPrice.grabFocus();
        } else {
            JOptionPane.showMessageDialog(this, "Please Enter Buying Price!!", "Error", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_txt_bPriceActionPerformed

    private void btn_viewGRNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewGRNActionPerformed
        PopUpGrn grn = new PopUpGrn(GoodsReceiveNote.this);
        grn.setVisible(true);
    }//GEN-LAST:event_btn_viewGRNActionPerformed

    private void clearFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearFieldMouseClicked
        clearFields();
    }//GEN-LAST:event_clearFieldMouseClicked

    private void clearFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearFieldMouseEntered

    }//GEN-LAST:event_clearFieldMouseEntered

    private void tablePoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePoMouseClicked
        try {
            DefaultTableModel dtm = (DefaultTableModel) tablePo.getModel();
            int selectRow = tablePo.getSelectedRow();

            tablePo.setEnabled(false);
            btn_supplier.setEnabled(false);

            String po_id = dtm.getValueAt(selectRow, 1).toString();
            txt_po.setText(po_id);
            String qty = dtm.getValueAt(selectRow, 4).toString();
            txt_qty.setText(qty);

            String pro_id = dtm.getValueAt(selectRow, 2).toString();
            txt_product_id.setText(pro_id);
            ResultSet rs = DB.search("select * from product where product_id = '" + pro_id + "'");
            if (rs.next()) {
                txt_product_name.setText(rs.getString("product_name"));
                String brand_id = (rs.getString("brand_id"));

                ResultSet rs2 = DB.search("select * from brand where brand_id = '" + brand_id + "'");
                if (rs2.next()) {
                    String brand = (rs2.getString("brand_name"));
                    txt_product_brand.setText(brand);
                }

            }

            String sup_id = dtm.getValueAt(selectRow, 3).toString();
            txt_supplier_id.setText(sup_id);
            ResultSet rs3 = DB.search("select * from supplier where supplier_id='" + sup_id + "'");
            if (rs3.next()) {

                txt_supplier_name.setText(rs3.getString("name"));
                txt_supplier_mobile.setText(rs3.getString("mobileno"));
                txt_supplier_email.setText(rs3.getString("email"));

            }

            btn_product.setEnabled(false);
            txt_qty.grabFocus();

        } catch (Exception e) {
            log.error("Load PO Details Failed", e);
        }
    }//GEN-LAST:event_tablePoMouseClicked

    private void txt_qtyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_qtyKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_qtyKeyTyped

    private void txt_bPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_bPriceKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_bPriceKeyTyped

    private void txt_sPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_sPriceKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_sPriceKeyTyped

    private void txt_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_totalActionPerformed
        if (txt_po.getText().equals("")) {

            withoutPoGrn();
        } else {
            try {
                DB.push("insert into grn values('"
                        + txt_grn_Id.getText() + "','"
                        + txt_supplier_id.getText() + "',CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP(),'"
                        + txt_po.getText() + "','"
                        + txt_total.getText() + "','" + SystemConfigData.getEmployee() + "')");

                DefaultTableModel dtm = (DefaultTableModel) tableGrn.getModel();
                for (int row = 0; row < dtm.getRowCount(); row++) {
                    String itemid = dtm.getValueAt(row, 0).toString();
                    String uprice = dtm.getValueAt(row, 4).toString();
                    String buyingPrice = dtm.getValueAt(row, 2).toString();
                    String qty = dtm.getValueAt(row, 3).toString();
                    String total = dtm.getValueAt(row, 5).toString();

                    DB.push("insert into grn_item (grn_id,item_id,qty,buying_price,unit_price,subtotal) values('"
                            + txt_grn_Id.getText() + "','"
                            + itemid + "','"
                            + qty + "','"
                            + buyingPrice + "','"
                            + uprice + "','"
                            + total + "')");

                    try {
                        ResultSet rs = DB.search("select count(*) as stk_count from stock");
                        if (rs.next()) {
                            int count = rs.getInt("stk_count");
                            int c = Integer.parseInt(new SimpleDateFormat("Mddyy").format(new Date()));
                            int value = c + (++count);
                            String Id = "STK-" + value;
                            
                             DB.push("insert into stock values('"+Id+"','"
                            + itemid + "','"
                            + buyingPrice + "','"
                            + uprice + "','"
                            + qty + "','"
                            + txt_grn_Id.getText() + "','1')");
                            
                        }
                       
                    } catch (Exception e) {
                        log.error("Return ID generate Failed", e);
                    }

                   

                }
                DB.push("insert into system_activity (detail, date, time, employee) values ("
                        + "'Create GRN',CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP(),'" + SystemConfigData.getEmployee() + "')");

                log.info("GRN Saved Successful.GRN : " + txt_grn_Id.getText() + " | By : " + SystemConfigData.getEmployee());
                JOptionPane.showMessageDialog(this, "Goods Receive Note Saved!!", "Saved", JOptionPane.INFORMATION_MESSAGE);

                printGrn(txt_grn_Id.getText());
                updateComplete();
                createNewGrn();
                clearGrnPo();
                loadPO();
                txt_total.setEnabled(false);

            } catch (Exception e) {
                log.error("GRN Save Failed", e);
            }
        }
    }//GEN-LAST:event_txt_totalActionPerformed

    private void switchButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_switchButtonMouseClicked
        if (switchButton.isSelected()) {
            tablePo.setVisible(true);
            txt_po.setVisible(true);
            txt_po.setText(null);

        } else {
            tablePo.setVisible(false);
            txt_po.setVisible(false);
            txt_po.setText(null);
        }
    }//GEN-LAST:event_switchButtonMouseClicked

    private void tableGrnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableGrnMouseClicked
        DefaultTableModel model = (DefaultTableModel) tableGrn.getModel();
        try {
            int selectRow = tableGrn.getSelectedRow();
            model.removeRow(selectRow);
        } catch (Exception e) {
            log.error("Remove Row Failed", e);
        }
    }//GEN-LAST:event_tableGrnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btn_product;
    private javax.swing.JButton btn_supplier;
    private javax.swing.JButton btn_viewGRN;
    private javaswingdev.card.Card card1;
    private javax.swing.JLabel clearField;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javaswingdev.swing.RoundPanel roundPanel1;
    private javaswingdev.swing.RoundPanel roundPanel2;
    private javaswingdev.swing.SwitchButton switchButton;
    private javaswingdev.swing.table.Table tableGrn;
    private javaswingdev.swing.table.Table tablePo;
    private javax.swing.JTextField txt_bPrice;
    private javax.swing.JLabel txt_grn_Id;
    private javax.swing.JTextField txt_po;
    public javax.swing.JTextField txt_product_brand;
    public javax.swing.JTextField txt_product_id;
    public javax.swing.JTextField txt_product_name;
    private javax.swing.JTextField txt_qty;
    private javax.swing.JTextField txt_sPrice;
    public javax.swing.JTextField txt_supplier_email;
    public javax.swing.JTextField txt_supplier_id;
    public javax.swing.JTextField txt_supplier_mobile;
    public javax.swing.JTextField txt_supplier_name;
    private javax.swing.JTextField txt_total;
    // End of variables declaration//GEN-END:variables

    private void generateGrnID() {
        try {
            ResultSet rs = DB.search("select count(*) as grn_count from grn");
            if (rs.next()) {
                int count = rs.getInt("grn_count");
                int c = Integer.parseInt(new SimpleDateFormat("Mddyy").format(new Date()));
                int value = c + (++count);
                String Id = "GRN-" + value;
                txt_grn_Id.setText(Id);
            }
            btn_supplier.grabFocus();
        } catch (Exception e) {
            log.error("GRN ID generate Failed", e);
        }
    }

    private void loadPO() {
        try {

            DefaultTableModel dtm = (DefaultTableModel) tablePo.getModel();
            dtm.setRowCount(0);
            ResultSet rs = DB.search("select po.purchase_order_item_id,  "
                    + "p.purchase_order_id, po.product_id,p.supplier_id,"
                    + "po.qty, p.date, p.time ,   po.stat from purchase_order as p "
                    + ", purchase_order_item as po "
                    + "where p.purchase_order_id = po.purchase_order_id "
                    + "&& po.stat = 'PENDING' ORDER BY purchase_order_item_id DESC");
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("purchase_order_item_id"));
                v.add(rs.getString("purchase_order_id"));
                v.add(rs.getString("product_id"));
                v.add(rs.getString("supplier_id"));
                v.add(rs.getString("qty"));
                v.add(rs.getString("date") + " " + rs.getString("time"));

                dtm.addRow(v);
            }

        } catch (Exception e) {
            log.error("Load PO Details Failed", e);
        }
    }

    private grnItemRow checkRowRepeatingGrn(String text) {
        grnItemRow itemRow = null;
        DefaultTableModel dtm = (DefaultTableModel) tableGrn.getModel();
        for (int row = 0; row < tableGrn.getRowCount(); row++) {
            if (text.trim().equals(tableGrn.getValueAt(row, 0).toString())) {
                itemRow = new grnItemRow();
                double qty = Double.parseDouble(tableGrn.getValueAt(row, 3).toString());
                double total = Double.parseDouble(tableGrn.getValueAt(row, 5).toString());
                itemRow.setQty(qty);
                itemRow.setTotal(total);
                dtm.removeRow(row);
                break;

            }
        }
        return itemRow;
    }

    private void calculateGrnTotal() {
        double tot = 0;
        DefaultTableModel dtm = (DefaultTableModel) tableGrn.getModel();
        for (int row = 0; row < dtm.getRowCount(); row++) {
            tot += Double.parseDouble(dtm.getValueAt(row, 5).toString());

        }
        txt_total.setText("" + tot);

    }

    private void clearFieldGrn() {
        txt_product_id.setText(null);
        txt_product_name.setText(null);
        txt_product_brand.setText(null);
        txt_sPrice.setText(null);
        txt_bPrice.setText(null);
        txt_qty.setText(null);

    }

    private void withoutPoGrn() {
        try {
            DB.push("insert into grn (grn_id,supplier,date,time,total,employee) values('"
                    + txt_grn_Id.getText() + "','"
                    + txt_supplier_id.getText() + "',CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP(),'"
                    + txt_total.getText() + "','" + SystemConfigData.getEmployee() + "')");

            DefaultTableModel dtm = (DefaultTableModel) tableGrn.getModel();
            for (int row = 0; row < dtm.getRowCount(); row++) {
                String itemid = dtm.getValueAt(row, 0).toString();
                String uprice = dtm.getValueAt(row, 4).toString();
                String buyingPrice = dtm.getValueAt(row, 2).toString();
                String qty = dtm.getValueAt(row, 3).toString();
                String total = dtm.getValueAt(row, 5).toString();

                DB.push("insert into grn_item (grn_id,item_id,qty,buying_price,unit_price,subtotal) values('"
                        + txt_grn_Id.getText() + "','"
                        + itemid + "','"
                        + qty + "','"
                        + buyingPrice + "','"
                        + uprice + "','"
                        + total + "')");

                  try {
                        ResultSet rs = DB.search("select count(*) as stk_count from stock");
                        if (rs.next()) {
                            int count = rs.getInt("stk_count");
                            int c = Integer.parseInt(new SimpleDateFormat("Mddyy").format(new Date()));
                            int value = c + (++count);
                            String Id = "STK-" + value;
                            
                             DB.push("insert into stock values('"+Id+"','"
                            + itemid + "','"
                            + buyingPrice + "','"
                            + uprice + "','"
                            + qty + "','"
                            + txt_grn_Id.getText() + "','1')");
                            
                        }
                       
                    } catch (Exception e) {
                        log.error("Return ID generate Failed", e);
                    }

            }
            DB.push("insert into system_activity (detail, date, time, employee) values ("
                    + "'Create GRN',CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP(),'" + SystemConfigData.getEmployee() + "')");

            log.info("GRN Saved Successful.GRN : " + txt_grn_Id.getText() + " | By : " + SystemConfigData.getEmployee());
            //printGrn(txt_grnId.getText());
            createNewGrn();
            clearFieldGrn();

            JOptionPane.showMessageDialog(this, "Goods Receive Note Saved!!", "Saved", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            log.error("GRN Save Failed", e);
        }
    }

    private void clearFields() {
        clearFieldGrn();
        txt_supplier_email.setText(null);
        txt_supplier_id.setText(null);
        txt_supplier_mobile.setText(null);
        txt_supplier_name.setText(null);
        txt_total.setText(null);
        tablePo.setEnabled(true);
        btn_supplier.setEnabled(true);
        btn_product.setEnabled(true);
        txt_po.setText(null);
        btn_product.setEnabled(true);

    }

    private void createNewGrn() {
        DefaultTableModel dtm = (DefaultTableModel) tableGrn.getModel();
        dtm.setRowCount(0);
        txt_grn_Id.setText(null);
        clearFields();
        generateGrnID();
    }

    private void updateComplete() {
        try {

            DefaultTableModel dtm = (DefaultTableModel) tablePo.getModel();
            int selectRow = tablePo.getSelectedRow();

            String POrderTableId = dtm.getValueAt(selectRow, 0).toString();
            DB.push("update purchase_order_item set stat = 'COMPLETED'  where purchase_order_item_id = '" + POrderTableId + "'");
        } catch (Exception e) {
            log.error("update purchase_order_item Error", e);
        }
    }

    private void clearGrnPo() {
        txt_po.setText(null);
        DefaultTableModel dtm = (DefaultTableModel) tablePo.getModel();
        dtm.setRowCount(0);
    }

    private void printGrn(String GrnId) {
           try {
            String path = SystemVariableList.REPORT_BASE_URL + "GrnMain.jasper";
            InputStream inputStream = new FileInputStream(path);
            Map<String, Object> params = new HashMap<>();
            params.put("GrnId", GrnId);

            JasperPrint fillReport = JasperFillManager.fillReport(inputStream, params, DB.getDBConnection());
            JasperViewer.viewReport(fillReport, false);
            JasperExportManager.exportReportToPdfFile(fillReport, "F:\\2023\\FINAL PROJECT\\SERVICE REPORTS\\GRN REPORTS\\" + GrnId + ".pdf");

             log.info("GRN Print Successful. ");
        } catch (Exception e) {
           log.error("GRN print Failed", e);
        }
   }

}
