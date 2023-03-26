package javaswingdev.form;

import com.bike.common.SystemConfigData;
import com.bike.db.DB;
import java.awt.Color;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.apache.log4j.Logger;

public class CheckStock1 extends javax.swing.JPanel {

    private Logger log;

    public CheckStock1() {
        initComponents();
        log = Logger.getLogger("bikeLogger");
        log.info("Stock Page Loaded");
        tableStock.fixTable(jScrollPane1);
        loadStock();
        grandTotal();
        lowStock();
        txt_seling_price.setEnabled(false);

 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel2 = new javaswingdev.swing.RoundPanel();
        jLabel13 = new javax.swing.JLabel();
        card1 = new javaswingdev.card.Card();
        searchBar = new swing.TextFieldAnimation();
        lowStockPanel = new swing.PanelRoundNew();
        lowStock_lbl = new javax.swing.JLabel();
        roundPanel3 = new javaswingdev.swing.RoundPanel();
        card2 = new javaswingdev.card.Card();
        jLabel17 = new javax.swing.JLabel();
        txt_stock_id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_buying_price = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_seling_price = new javax.swing.JTextField();
        print = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        viewTotal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableStock = new javaswingdev.swing.table.Table();
        clearField = new javax.swing.JLabel();
        viewCount = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(228, 232, 229));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel2.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel13.setText("Check Stock");
        roundPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        card1.setDescription("");
        card1.setIcon(javaswingdev.GoogleMaterialDesignIcon.CHECK_CIRCLE);
        roundPanel2.add(card1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 60, 50));

        searchBar.setBackground(new java.awt.Color(228, 232, 229));
        searchBar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchBarKeyReleased(evt);
            }
        });
        roundPanel2.add(searchBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 330, -1));

        lowStockPanel.setBackground(new java.awt.Color(255, 51, 51));
        lowStockPanel.setRoundBottomLeft(50);
        lowStockPanel.setRoundBottomRight(50);
        lowStockPanel.setRoundTopLeft(50);
        lowStockPanel.setRoundTopRight(50);
        lowStockPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lowStockPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lowStockPanelMouseExited(evt);
            }
        });
        lowStockPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lowStock_lbl.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lowStock_lbl.setForeground(new java.awt.Color(255, 255, 255));
        lowStock_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/warning.png"))); // NOI18N
        lowStock_lbl.setText("Low Stock Alert");
        lowStock_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lowStock_lblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lowStock_lblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lowStock_lblMouseExited(evt);
            }
        });
        lowStockPanel.add(lowStock_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 180, -1));

        roundPanel2.add(lowStockPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 40, 210, 50));

        add(roundPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1660, 170));

        roundPanel3.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        card2.setDescription("");
        card2.setIcon(javaswingdev.GoogleMaterialDesignIcon.UPDATE);
        roundPanel3.add(card2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 60, 50));

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel17.setText("Update Stock");
        roundPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        txt_stock_id.setEditable(false);
        txt_stock_id.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_stock_id.setForeground(new java.awt.Color(102, 102, 102));
        txt_stock_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_stock_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        roundPanel3.add(txt_stock_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 180, 35));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Stock ID");
        roundPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        txt_buying_price.setEditable(false);
        txt_buying_price.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_buying_price.setForeground(new java.awt.Color(102, 102, 102));
        txt_buying_price.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_buying_price.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        roundPanel3.add(txt_buying_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 180, 35));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Buying Price");
        roundPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, -1, -1));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("New Selling Price");
        roundPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, -1, -1));

        txt_seling_price.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_seling_price.setForeground(new java.awt.Color(102, 102, 102));
        txt_seling_price.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_seling_price.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        txt_seling_price.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_seling_price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_seling_priceKeyTyped(evt);
            }
        });
        roundPanel3.add(txt_seling_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 220, 35));

        print.setBackground(new java.awt.Color(153, 204, 255));
        print.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        print.setForeground(new java.awt.Color(0, 102, 204));
        print.setText("PRINT STOCK");
        print.setBorder(null);
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        roundPanel3.add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(1510, 130, 130, 35));

        update.setBackground(new java.awt.Color(153, 204, 255));
        update.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        update.setForeground(new java.awt.Color(0, 102, 204));
        update.setText("UPDATE SELLING PRICE");
        update.setBorder(null);
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        roundPanel3.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 130, 210, 35));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Grand Total : ");
        roundPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 730, -1, -1));

        viewTotal.setEditable(false);
        viewTotal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        viewTotal.setForeground(new java.awt.Color(102, 102, 102));
        viewTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        viewTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        roundPanel3.add(viewTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1430, 720, 200, 40));

        tableStock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Stock ID", "Product ID", "Product Name", "Brand", "Category", "Buying Price", "Selling Price", "Quantity", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableStockMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableStock);

        roundPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 1620, 480));

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
        roundPanel3.add(clearField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 130, 120, 40));

        viewCount.setEditable(false);
        viewCount.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        viewCount.setForeground(new java.awt.Color(102, 102, 102));
        viewCount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        viewCount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        roundPanel3.add(viewCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 720, 120, 40));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Total Product Count :");
        roundPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 730, -1, -1));

        add(roundPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 1660, 840));
    }// </editor-fold>//GEN-END:initComponents

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_printActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        try {
            if (!txt_stock_id.getText().equals("") && !txt_seling_price.getText().equals("")
                    && !txt_buying_price.getText().equals("")) {

                String newSellingPrice = txt_seling_price.getText().trim();
                DB.push("update stock set  selling_price='" +
                        newSellingPrice+ "' where stock_id ='"
                        + txt_stock_id.getText() + "' ");
                log.info("New Selling Price Updated Successful. Stock : " + txt_stock_id.getText() + " By : " + SystemConfigData.getEmployee());
                DB.push("insert into system_activity (detail, date, time, employee) values ("
                        + "'New Selling Price Updated',CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP(),'" + SystemConfigData.getEmployee() + "')");

                clearFields();
                JOptionPane.showMessageDialog(this, "New Selling Price Updated Successfuly!", "Updated", JOptionPane.INFORMATION_MESSAGE);

                loadStock();

            } else {
                JOptionPane.showMessageDialog(this, "Fill All text Inpute!", "Error", JOptionPane.ERROR_MESSAGE);

            }
        } catch (Exception e) {
            log.error("New Selling Price Update Failed", e);
        }
    }//GEN-LAST:event_updateActionPerformed

    private void searchBarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchBarKeyReleased
        DefaultTableModel dtm = (DefaultTableModel) tableStock.getModel();
        String searchText = searchBar.getText();
        TableRowSorter<DefaultTableModel> searchProduct = new TableRowSorter<>(dtm);
        tableStock.setRowSorter(searchProduct);
        searchProduct.setRowFilter(RowFilter.regexFilter(searchText));
    }//GEN-LAST:event_searchBarKeyReleased

    private void tableStockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableStockMouseClicked
        try {
            DefaultTableModel dtm = (DefaultTableModel) tableStock.getModel();
            int selectRow = tableStock.getSelectedRow();

            String stk_id = dtm.getValueAt(selectRow, 0).toString();
            txt_stock_id.setText(stk_id);
            String by_price = dtm.getValueAt(selectRow, 5).toString();
            txt_buying_price.setText(by_price);
            txt_seling_price.setEnabled(true);
            txt_seling_price.grabFocus();

        } catch (Exception e) {
            log.error("Load Product Details Failed", e);
        }
    }//GEN-LAST:event_tableStockMouseClicked

    private void txt_seling_priceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_seling_priceKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_seling_priceKeyTyped

    private void clearFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearFieldMouseClicked
        clearFields();
    }//GEN-LAST:event_clearFieldMouseClicked

    private void clearFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearFieldMouseEntered

    }//GEN-LAST:event_clearFieldMouseEntered

    private void lowStock_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lowStock_lblMouseClicked
       PopUpLowQty lowQty = new PopUpLowQty(CheckStock1.this);
       lowQty.setVisible(true);
    }//GEN-LAST:event_lowStock_lblMouseClicked

    private void lowStockPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lowStockPanelMouseEntered
      
    }//GEN-LAST:event_lowStockPanelMouseEntered

    private void lowStockPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lowStockPanelMouseExited
       
    }//GEN-LAST:event_lowStockPanelMouseExited

    private void lowStock_lblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lowStock_lblMouseEntered
         lowStock_lbl.setForeground(Color.red);
    }//GEN-LAST:event_lowStock_lblMouseEntered

    private void lowStock_lblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lowStock_lblMouseExited
        lowStock_lbl.setForeground(Color.WHITE);
    }//GEN-LAST:event_lowStock_lblMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javaswingdev.card.Card card1;
    private javaswingdev.card.Card card2;
    private javax.swing.JLabel clearField;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private swing.PanelRoundNew lowStockPanel;
    private javax.swing.JLabel lowStock_lbl;
    private javax.swing.JButton print;
    private javaswingdev.swing.RoundPanel roundPanel2;
    private javaswingdev.swing.RoundPanel roundPanel3;
    private swing.TextFieldAnimation searchBar;
    private javaswingdev.swing.table.Table tableStock;
    private javax.swing.JTextField txt_buying_price;
    private javax.swing.JTextField txt_seling_price;
    private javax.swing.JTextField txt_stock_id;
    private javax.swing.JButton update;
    public javax.swing.JTextField viewCount;
    private javax.swing.JTextField viewTotal;
    // End of variables declaration//GEN-END:variables

    private void loadStock() {
        try {

            DefaultTableModel dtm = (DefaultTableModel) tableStock.getModel();
            dtm.setRowCount(0);
            ResultSet rs = DB.search("select s.stock_id, p.product_id, "
                    + "p.product_name,b.brand_name, c.category, "
                    + "s.buying_price, s.selling_price, s.quantity "
                    + "from stock as s ,product as p, brand as b, "
                    + "item_category as c where s.product_id = "
                    + "p.product_id && p.brand_id= b.brand_id && "
                    + "p.category_id=c.category_id");
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("stock_id"));
                v.add(rs.getString("product_id"));
                v.add(rs.getString("product_name"));
                v.add(rs.getString("brand_name"));
                v.add(rs.getString("category"));
                v.add(rs.getString("buying_price"));
                v.add(rs.getString("selling_price"));
                v.add(rs.getString("quantity"));
                
                double buyingPrice = Double.parseDouble(rs.getString("buying_price"));
                double qty = Double.parseDouble(rs.getString("quantity"));
                double total = qty * buyingPrice;
                v.add(total);
                

                dtm.addRow(v);

            }

        } catch (Exception e) {
            log.error("Load Product Details Failed", e);
        }
    }

    private void clearFields() {
        txt_stock_id.setText(null);
        txt_seling_price.setText(null);
        txt_buying_price.setText(null);
        txt_seling_price.setEnabled(false);
        loadStock();
        
    }

    private void grandTotal() {
         double tot = 0;
         int count =0;
        DefaultTableModel dtm = (DefaultTableModel) tableStock.getModel();
        for (int row = 0; row < dtm.getRowCount(); row++) {
            tot += Double.parseDouble(dtm.getValueAt(row, 8).toString());

        }
         for (int row = 0; row < dtm.getRowCount(); row++) {
            count += Integer.parseInt(dtm.getValueAt(row, 7).toString());

        }
        viewTotal.setText(" " + tot);
        viewCount.setText(" " + count);
   }

    private void lowStock() {
        try {
            ResultSet rs = DB.search("select count(*) as low_item_count from stock where status = 1 AND quantity <= 10");
                    if (rs.next()) {
                        String lowCount = rs.getString("low_item_count");
                        Double count = Double.valueOf(lowCount);
                        if(count>1){
                            lowStockPanel.setVisible(true);
                        }else{
                            lowStockPanel.setVisible(false);  
                        }
                        
                    }
        } catch (Exception e) {
              log.error("Load lowcout Details Failed", e);
        }
         
       
    }

}
