package javaswingdev.form;

import com.bike.common.SystemConfigData;
import com.bike.common.grnItemRow;
import com.bike.db.DB;
import com.bike.dto.ReturnItemRow;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;

public class GoodsReturnNote extends javax.swing.JPanel {

    private Logger log;
    private double qtyReturn;

    public GoodsReturnNote() {
        initComponents();
        log = Logger.getLogger("bikeLogger");
        log.info("Return Page Loaded");
        tableReturn.fixTable(jScrollPane4);
        generateReturnID();
        save.setEnabled(false);

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
        txt_buying_price = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnProduct = new javax.swing.JButton();
        txt_return_Id = new javax.swing.JLabel();
        txt_grn_id = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        roundPanel2 = new javaswingdev.swing.RoundPanel();
        addBtn = new javax.swing.JButton();
        clearField = new javax.swing.JLabel();
        card1 = new javaswingdev.card.Card();
        jLabel18 = new javax.swing.JLabel();
        txt_supplier_id = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_supplier_name = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txt_supplier_mobile = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txt_qty = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableReturn = new javaswingdev.swing.table.Table();
        save = new javax.swing.JButton();
        txt_avbQty = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(228, 232, 229));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel1.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setText("Goods Return Notes");
        roundPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Stock ID");
        roundPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        txt_stock_id.setEditable(false);
        txt_stock_id.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_stock_id.setForeground(new java.awt.Color(102, 102, 102));
        txt_stock_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_stock_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        roundPanel1.add(txt_stock_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 340, 35));

        txt_product_id.setEditable(false);
        txt_product_id.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_product_id.setForeground(new java.awt.Color(102, 102, 102));
        txt_product_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_product_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        roundPanel1.add(txt_product_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 340, 35));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Product ID");
        roundPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        txt_product_name.setEditable(false);
        txt_product_name.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_product_name.setForeground(new java.awt.Color(102, 102, 102));
        txt_product_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_product_name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        roundPanel1.add(txt_product_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 340, 35));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Product Name");
        roundPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        txt_product_brand.setEditable(false);
        txt_product_brand.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_product_brand.setForeground(new java.awt.Color(102, 102, 102));
        txt_product_brand.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_product_brand.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        roundPanel1.add(txt_product_brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 340, 35));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Buying Price");
        roundPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, -1, -1));

        txt_buying_price.setEditable(false);
        txt_buying_price.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_buying_price.setForeground(new java.awt.Color(102, 102, 102));
        txt_buying_price.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_buying_price.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        roundPanel1.add(txt_buying_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, 340, 35));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Brand");
        roundPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));

        btnProduct.setBackground(new java.awt.Color(153, 204, 255));
        btnProduct.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnProduct.setForeground(new java.awt.Color(0, 102, 204));
        btnProduct.setText("Select Product");
        btnProduct.setBorder(null);
        btnProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductActionPerformed(evt);
            }
        });
        roundPanel1.add(btnProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 340, 35));

        txt_return_Id.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_return_Id.setForeground(new java.awt.Color(102, 102, 102));
        txt_return_Id.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        roundPanel1.add(txt_return_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 100, 35));

        txt_grn_id.setEditable(false);
        txt_grn_id.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_grn_id.setForeground(new java.awt.Color(102, 102, 102));
        txt_grn_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_grn_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        roundPanel1.add(txt_grn_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 690, 340, 35));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("GRN ID");
        roundPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 660, -1, -1));

        add(roundPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 380, 1030));

        roundPanel2.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addBtn.setBackground(new java.awt.Color(153, 204, 255));
        addBtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        addBtn.setForeground(new java.awt.Color(0, 102, 204));
        addBtn.setText("Add ");
        addBtn.setBorder(null);
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        roundPanel2.add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 170, 130, 35));

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
        roundPanel2.add(clearField, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 880, 120, 40));

        card1.setDescription("");
        card1.setIcon(javaswingdev.GoogleMaterialDesignIcon.PLAYLIST_ADD);
        roundPanel2.add(card1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 60, 50));

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setText("Supplier ID");
        roundPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        txt_supplier_id.setEditable(false);
        txt_supplier_id.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_supplier_id.setForeground(new java.awt.Color(102, 102, 102));
        txt_supplier_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_supplier_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        roundPanel2.add(txt_supplier_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 250, 35));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel13.setText("Add");
        roundPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        txt_supplier_name.setEditable(false);
        txt_supplier_name.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_supplier_name.setForeground(new java.awt.Color(102, 102, 102));
        txt_supplier_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_supplier_name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        roundPanel2.add(txt_supplier_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 380, 35));

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 102, 102));
        jLabel20.setText("Supplier Name");
        roundPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 170, -1));

        txt_supplier_mobile.setEditable(false);
        txt_supplier_mobile.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_supplier_mobile.setForeground(new java.awt.Color(102, 102, 102));
        txt_supplier_mobile.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_supplier_mobile.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        roundPanel2.add(txt_supplier_mobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 50, 340, 35));

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 102, 102));
        jLabel21.setText("Mobile No");
        roundPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 20, 100, -1));

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
        roundPanel2.add(txt_qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 170, 150, 35));

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 102, 102));
        jLabel22.setText("Quantity");
        roundPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 180, -1, -1));

        tableReturn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Name", "Buying Price", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableReturnMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tableReturn);

        roundPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 1240, 520));

        save.setBackground(new java.awt.Color(153, 204, 255));
        save.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        save.setForeground(new java.awt.Color(0, 102, 204));
        save.setText("SAVE");
        save.setBorder(null);
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        roundPanel2.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 880, 130, 35));

        txt_avbQty.setEditable(false);
        txt_avbQty.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_avbQty.setForeground(new java.awt.Color(102, 102, 102));
        txt_avbQty.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_avbQty.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        roundPanel2.add(txt_avbQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 340, 35));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Available Quantity");
        roundPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, -1, -1));

        add(roundPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 1280, 1030));
    }// </editor-fold>//GEN-END:initComponents

    private void btnProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductActionPerformed
        PopUpProductsReturn pr = new PopUpProductsReturn(GoodsReturnNote.this);
        pr.setVisible(true);
        txt_qty.grabFocus();
    }//GEN-LAST:event_btnProductActionPerformed

    private void tableReturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableReturnMouseClicked
        DefaultTableModel model = (DefaultTableModel) tableReturn.getModel();
        try {
            int selectRow = tableReturn.getSelectedRow();
            model.removeRow(selectRow);
        } catch (Exception e) {
            log.error("Remove Row Failed", e);
        }
    }//GEN-LAST:event_tableReturnMouseClicked

    private void clearFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearFieldMouseClicked
        clearFields();
    }//GEN-LAST:event_clearFieldMouseClicked

    private void clearFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearFieldMouseEntered

    }//GEN-LAST:event_clearFieldMouseEntered

    private void txt_qtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_qtyActionPerformed

    }//GEN-LAST:event_txt_qtyActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        try {
            DefaultTableModel dtm = (DefaultTableModel) tableReturn.getModel();
            for (int row = 0; row < dtm.getRowCount(); row++) {
                String itemReturnId = dtm.getValueAt(row, 0).toString();
                String qty = dtm.getValueAt(row, 3).toString();

                DB.push("insert into return_item (stock_id,product_id,qty,date,supplier,employee) values('"
                        + txt_stock_id.getText() + "','"
                        + itemReturnId + "','"
                        + qty + "',CURRENT_TIMESTAMP(),'"
                        + txt_supplier_id.getText() + "','"
                        + SystemConfigData.getEmployee() + "')");

            }
            log.info("Return Item Saved Successful. By : " + SystemConfigData.getEmployee());

            JOptionPane.showMessageDialog(this, "Return Item Saved!!", "Saved", JOptionPane.INFORMATION_MESSAGE);

            clearFields();

        } catch (Exception e) {
            log.error("Return Item Saved Failed", e);
        }
    }//GEN-LAST:event_saveActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed

        try {
            if (!txt_product_id.getText().equals("") && !txt_qty.getText().equals("")) {
       
                    int rItem = Integer.parseInt(txt_qty.getText());
                    int allItem = Integer.parseInt(txt_avbQty.getText());
                    if (rItem <= allItem && rItem != 0) {
                        qtyReturn = Double.parseDouble(txt_qty.getText());

                        DefaultTableModel dtm = (DefaultTableModel) tableReturn.getModel();
                        Vector v = new Vector();
                        v.add(txt_product_id.getText());
                        v.add(txt_product_name.getText());

                        ReturnItemRow checkRowRepeating = checkRowRepeatingReturn(txt_product_id.getText());
                        if (checkRowRepeating != null) {

                            qtyReturn += checkRowRepeating.getQty();

                        }

                        v.add(txt_buying_price.getText());
                        v.add(qtyReturn);

                        dtm.addRow(v);
                        txt_qty.setText(null);
                        save.setEnabled(true);

                    } else {
                        JOptionPane.showMessageDialog(this, "Please Input  Right Quantity!!", "Error", JOptionPane.ERROR_MESSAGE);

                        txt_qty.setText(null);
                        txt_qty.grabFocus();

                    }
               
            } else {
                JOptionPane.showMessageDialog(this, "Please Fill All Input!!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            log.error("Qty Error", e);
        }


    }//GEN-LAST:event_addBtnActionPerformed

    private void txt_qtyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_qtyKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_qtyKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton btnProduct;
    private javaswingdev.card.Card card1;
    private javax.swing.JLabel clearField;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
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
    private javax.swing.JButton save;
    private javaswingdev.swing.table.Table tableReturn;
    public javax.swing.JTextField txt_avbQty;
    public javax.swing.JTextField txt_buying_price;
    public javax.swing.JTextField txt_grn_id;
    public javax.swing.JTextField txt_product_brand;
    public javax.swing.JTextField txt_product_id;
    public javax.swing.JTextField txt_product_name;
    private javax.swing.JTextField txt_qty;
    private javax.swing.JLabel txt_return_Id;
    public javax.swing.JTextField txt_stock_id;
    public javax.swing.JTextField txt_supplier_id;
    public javax.swing.JTextField txt_supplier_mobile;
    public javax.swing.JTextField txt_supplier_name;
    // End of variables declaration//GEN-END:variables

    private void generateReturnID() {
        try {
            ResultSet rs = DB.search("select count(*) as ret_count from return_item");
            if (rs.next()) {
                int count = rs.getInt("ret_count");
                int c = Integer.parseInt(new SimpleDateFormat("Mddyy").format(new Date()));
                int value = c + (++count);
                String Id = "RTN-" + value;
                txt_return_Id.setText(Id);
            }
            btnProduct.grabFocus();
        } catch (Exception e) {
            log.error("Return ID generate Failed", e);
        }
    }

    private void clearFields() {
        txt_stock_id.setText(null);
        txt_avbQty.setText(null);
        txt_buying_price.setText(null);
        txt_grn_id.setText(null);
        txt_product_brand.setText(null);
        txt_product_id.setText(null);
        txt_product_name.setText(null);
        txt_qty.setText(null);
        txt_supplier_id.setText(null);
        txt_supplier_id.setText(null);
        txt_supplier_mobile.setText(null);
        txt_supplier_name.setText(null);
        DefaultTableModel dtm = (DefaultTableModel) tableReturn.getModel();
        dtm.setRowCount(0);
        save.setEnabled(false);

    }

    private ReturnItemRow checkRowRepeatingReturn(String text) {
        ReturnItemRow itemRowReturn = null;
        DefaultTableModel dtm = (DefaultTableModel) tableReturn.getModel();
        for (int row = 0; row < tableReturn.getRowCount(); row++) {
            if (text.trim().equals(tableReturn.getValueAt(row, 0).toString())) {
                itemRowReturn = new ReturnItemRow();
                double qty = Double.parseDouble(tableReturn.getValueAt(row, 3).toString());
                itemRowReturn.setQty(qty);
                dtm.removeRow(row);
                break;

            }
        }
        return itemRowReturn;
    }

}
