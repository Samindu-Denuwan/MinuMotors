package javaswingdev.form;

import com.bike.common.SystemConfigData;
import com.bike.common.SystemVariableList;
import com.bike.db.DB;
import com.bike.dto.PoItemRow;
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

public class PurchaseOrder extends javax.swing.JPanel {

    private Logger log;

    public PurchaseOrder() {
        initComponents();
        log = Logger.getLogger("bikeLogger");
        log.info("Purchase Order Page Loaded");
        tablePo.fixTable(jScrollPane3);
        generatePoID();
        save.setEnabled(false);
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel1 = new javaswingdev.swing.RoundPanel();
        jLabel6 = new javax.swing.JLabel();
        btn_product = new javax.swing.JButton();
        txt_Po_Id = new javax.swing.JLabel();
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
        jLabel10 = new javax.swing.JLabel();
        roundPanel2 = new javaswingdev.swing.RoundPanel();
        jLabel11 = new javax.swing.JLabel();
        txt_qty = new javax.swing.JTextField();
        card1 = new javaswingdev.card.Card();
        btnViewPo = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        btnAddPo = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablePo = new javaswingdev.swing.table.Table();
        clearField = new javax.swing.JLabel();
        save = new javax.swing.JButton();

        setBackground(new java.awt.Color(228, 232, 229));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel1.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setText("Purchase Order");
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
        roundPanel1.add(btn_product, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 340, 35));

        txt_Po_Id.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_Po_Id.setForeground(new java.awt.Color(102, 102, 102));
        txt_Po_Id.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        roundPanel1.add(txt_Po_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 100, 35));

        txt_supplier_id.setEditable(false);
        txt_supplier_id.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_supplier_id.setForeground(new java.awt.Color(102, 102, 102));
        txt_supplier_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_supplier_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        roundPanel1.add(txt_supplier_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 340, 35));

        txt_supplier_name.setEditable(false);
        txt_supplier_name.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_supplier_name.setForeground(new java.awt.Color(102, 102, 102));
        txt_supplier_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_supplier_name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        roundPanel1.add(txt_supplier_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 340, 35));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Supplier Name");
        roundPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        txt_supplier_mobile.setEditable(false);
        txt_supplier_mobile.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_supplier_mobile.setForeground(new java.awt.Color(102, 102, 102));
        txt_supplier_mobile.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_supplier_mobile.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        roundPanel1.add(txt_supplier_mobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 340, 35));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Mobile NO");
        roundPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        txt_supplier_email.setEditable(false);
        txt_supplier_email.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_supplier_email.setForeground(new java.awt.Color(102, 102, 102));
        txt_supplier_email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_supplier_email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        roundPanel1.add(txt_supplier_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 340, 35));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Email");
        roundPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

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
        roundPanel1.add(btn_supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 340, 35));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Product ID");
        roundPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, -1, -1));

        txt_product_id.setEditable(false);
        txt_product_id.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_product_id.setForeground(new java.awt.Color(102, 102, 102));
        txt_product_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_product_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        roundPanel1.add(txt_product_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, 340, 35));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Product Name");
        roundPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 670, -1, -1));

        txt_product_name.setEditable(false);
        txt_product_name.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_product_name.setForeground(new java.awt.Color(102, 102, 102));
        txt_product_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_product_name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        roundPanel1.add(txt_product_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 700, 340, 35));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Brand");
        roundPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 760, -1, -1));

        txt_product_brand.setEditable(false);
        txt_product_brand.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_product_brand.setForeground(new java.awt.Color(102, 102, 102));
        txt_product_brand.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_product_brand.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        roundPanel1.add(txt_product_brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 790, 340, 35));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Supplier ID");
        roundPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        add(roundPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 380, 1030));

        roundPanel2.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Quantity");
        roundPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 730, 110, -1));

        txt_qty.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_qty.setForeground(new java.awt.Color(102, 102, 102));
        txt_qty.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_qty.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        txt_qty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_qtyKeyTyped(evt);
            }
        });
        roundPanel2.add(txt_qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 760, 220, 35));

        card1.setDescription("");
        card1.setIcon(javaswingdev.GoogleMaterialDesignIcon.PLAYLIST_ADD);
        roundPanel2.add(card1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 50));

        btnViewPo.setBackground(new java.awt.Color(228, 232, 229));
        btnViewPo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnViewPo.setForeground(new java.awt.Color(102, 102, 102));
        btnViewPo.setText("View Previous POs");
        btnViewPo.setBorder(null);
        btnViewPo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPoActionPerformed(evt);
            }
        });
        roundPanel2.add(btnViewPo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 20, 190, 40));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel13.setText("Add");
        roundPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        btnAddPo.setBackground(new java.awt.Color(153, 204, 255));
        btnAddPo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAddPo.setForeground(new java.awt.Color(0, 102, 204));
        btnAddPo.setText("ADD TO PO");
        btnAddPo.setBorder(null);
        btnAddPo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPoActionPerformed(evt);
            }
        });
        roundPanel2.add(btnAddPo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 760, 190, 35));

        tablePo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Name", "Brand", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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

        roundPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 1240, 400));

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
        roundPanel2.add(clearField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 690, 120, 40));

        save.setBackground(new java.awt.Color(153, 204, 255));
        save.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        save.setForeground(new java.awt.Color(0, 102, 204));
        save.setText("SAVE PO");
        save.setBorder(null);
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        roundPanel2.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 760, 190, 35));

        add(roundPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 1280, 1030));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_productActionPerformed
       PopUpProducts pup = new PopUpProducts(PurchaseOrder.this);
        pup.setVisible(true);
        txt_qty.grabFocus();
    }//GEN-LAST:event_btn_productActionPerformed

    private void btn_supplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_supplierActionPerformed
        PopUpSuppliers pus = new PopUpSuppliers(PurchaseOrder.this);
        pus.setVisible(true);
        
    }//GEN-LAST:event_btn_supplierActionPerformed

    private void btnViewPoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPoActionPerformed
      PopUpPo po = new PopUpPo(PurchaseOrder.this);
        po.setVisible(true);
    }//GEN-LAST:event_btnViewPoActionPerformed

    private void btnAddPoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPoActionPerformed
            if (!txt_product_id.getText().trim().equals("") && !txt_qty.getText().trim().equals("")
                    && !txt_supplier_id.getText().trim().equals("")&& !txt_Po_Id.getText().trim().equals("")) {
            double qty = Double.parseDouble(txt_qty.getText());

            DefaultTableModel dtm = (DefaultTableModel) tablePo.getModel();
            Vector v = new Vector();
            v.add(txt_product_id.getText());
            v.add(txt_product_name.getText());
             v.add(txt_product_brand.getText());

            PoItemRow checkRowRepeating = checkRowRepeatingPo(txt_product_id.getText());
            if (checkRowRepeating != null) {

                qty += checkRowRepeating.getQty();
            }

            v.add(qty);

            dtm.addRow(v);
            clearFeild();

      
            save.setEnabled(true);
            btn_supplier.setEnabled(false);

        } else {
            JOptionPane.showMessageDialog(this, "Please Enter Quantity!!", "Error", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_btnAddPoActionPerformed

    private void clearFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearFieldMouseClicked
        clearFields();
    }//GEN-LAST:event_clearFieldMouseClicked

    private void clearFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearFieldMouseEntered

    }//GEN-LAST:event_clearFieldMouseEntered

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        try {
            String stat = "PENDING";
            DB.push("insert into purchase_order values('"
                    + txt_Po_Id.getText() + "','"
                    + txt_supplier_id.getText() + "',CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP()"
                    + ",'" + SystemConfigData.getEmployee() + "')");

            DefaultTableModel dtm = (DefaultTableModel) tablePo.getModel();
            for (int row = 0; row < dtm.getRowCount(); row++) {
                String itemid = dtm.getValueAt(row, 0).toString();
                String qty = dtm.getValueAt(row, 3).toString();

                DB.push("insert into purchase_order_item (purchase_order_id,product_id,qty,stat) values('"
                        + txt_Po_Id.getText() + "','"
                        + itemid + "','"
                        + qty + "','"
                        + stat + "')");

            }
                      PrintPO(txt_Po_Id.getText());
            DB.push("insert into system_activity (detail, date, time, employee) values ("
                    + "'Create PO',CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP(),'" + SystemConfigData.getEmployee() + "')");

            log.info("Purchase order Saved. PO : " + txt_Po_Id.getText() + " | By : " + SystemConfigData.getEmployee());
            JOptionPane.showMessageDialog(this, "Purchase Order Saved!!", "Saved", JOptionPane.INFORMATION_MESSAGE);

            // printPo(lbl_po.getText());
            createNewPO();

        } catch (Exception e) {
            log.error("Purchase order saved Failed", e);
        }
    }//GEN-LAST:event_saveActionPerformed

    private void txt_qtyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_qtyKeyTyped
         char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_qtyKeyTyped

    private void tablePoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePoMouseClicked
      DefaultTableModel model = (DefaultTableModel)tablePo.getModel();
        try {
            int selectRow = tablePo.getSelectedRow();
            model.removeRow(selectRow);
        } catch (Exception e) {
             log.error("Remove Row Failed", e);
        }
    }//GEN-LAST:event_tablePoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPo;
    private javax.swing.JButton btnViewPo;
    private javax.swing.JButton btn_product;
    private javax.swing.JButton btn_supplier;
    private javaswingdev.card.Card card1;
    private javax.swing.JLabel clearField;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javaswingdev.swing.RoundPanel roundPanel1;
    private javaswingdev.swing.RoundPanel roundPanel2;
    private javax.swing.JButton save;
    private javaswingdev.swing.table.Table tablePo;
    private javax.swing.JLabel txt_Po_Id;
    public javax.swing.JTextField txt_product_brand;
    public javax.swing.JTextField txt_product_id;
    public javax.swing.JTextField txt_product_name;
    private javax.swing.JTextField txt_qty;
    public javax.swing.JTextField txt_supplier_email;
    public javax.swing.JTextField txt_supplier_id;
    public javax.swing.JTextField txt_supplier_mobile;
    public javax.swing.JTextField txt_supplier_name;
    // End of variables declaration//GEN-END:variables

    private void clearFields() {
        DefaultTableModel dtm = (DefaultTableModel) tablePo.getModel();
        dtm.setRowCount(0);
        
        txt_supplier_id.setText(null);
        txt_supplier_name.setText(null);
        txt_supplier_email.setText(null);
        txt_supplier_mobile.setText(null);
        txt_product_id.setText(null);
        txt_product_name.setText(null);
        txt_product_brand.setText(null);
        txt_qty.setText(null);
        btn_supplier.setEnabled(true);
      

    }

    private void generatePoID() {
        try {
            ResultSet rs = DB.search("select count(*) as po_count from purchase_order");
            if (rs.next()) {
                int count = rs.getInt("po_count");
               int c = Integer.parseInt(new SimpleDateFormat("Mddyy").format(new Date()));
                int value = c+(++count);
                String Id = "POI-"+value;
                txt_Po_Id.setText(Id);
            }
            btn_supplier.grabFocus();
        } catch (Exception e) {
            log.error("PO generate Failed", e);
        }
    }

    private void createNewPO() {
        clearFields();
        txt_Po_Id.setText(null);
        generatePoID();
    }
    
        private PoItemRow checkRowRepeatingPo(String text) {
        PoItemRow itemRow = null;
        DefaultTableModel dtm = (DefaultTableModel) tablePo.getModel();
        for (int row = 0; row < tablePo.getRowCount(); row++) {
            if (text.trim().equals(tablePo.getValueAt(row, 0).toString())) {
                itemRow = new PoItemRow();
                double qty = Double.parseDouble(tablePo.getValueAt(row, 3).toString());
                itemRow.setQty(qty);
                dtm.removeRow(row);
                break;

            }
        }
        return itemRow;

    }

    private void clearFeild() {
        txt_product_id.setText(null);
        txt_product_name.setText(null);
        txt_product_brand.setText(null);
        txt_qty.setText(null);
    }

    private void PrintPO(String PoID) {
           try {
            String path = SystemVariableList.REPORT_BASE_URL + "PO_main.jasper";
            InputStream inputStream = new FileInputStream(path);
            Map<String, Object> params = new HashMap<>();
            params.put("PoId", PoID);

            JasperPrint fillReport = JasperFillManager.fillReport(inputStream, params, DB.getDBConnection());
            JasperViewer.viewReport(fillReport, false);
            JasperExportManager.exportReportToPdfFile(fillReport, "F:\\2023\\FINAL PROJECT\\SERVICE REPORTS\\PO REPORTS\\" + PoID + ".pdf");

             log.info("PO Print Successful. ");
        } catch (Exception e) {
           log.error("PO print Failed", e);
        }
    }
}
