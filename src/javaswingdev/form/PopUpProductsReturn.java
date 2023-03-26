package javaswingdev.form;

import com.bike.common.SystemConfigData;
import static com.bike.common.SystemLogger.initLogger;
import com.bike.db.DB;
import java.sql.ResultSet;
import java.util.Vector;
import javaswingdev.form.User;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.apache.log4j.Logger;

public class PopUpProductsReturn extends javax.swing.JFrame {

    private Logger log;
    private GoodsReturnNote returnNote;

    public PopUpProductsReturn() {
        initComponents();
        setLocationRelativeTo(null);

        initLogger();
        log = Logger.getLogger("bikeLogger");
        log.info("Select Product Return Popup Page Loaded");
        table.fixTable(jScrollPane1);
        loadTable();

    }

    PopUpProductsReturn(GoodsReturnNote returnNote) {
        this();
        this.returnNote = returnNote;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        modelCard1 = new javaswingdev.card.ModelCard();
        roundPanel2 = new javaswingdev.swing.RoundPanel();
        textFieldAnimation1 = new swing.TextFieldAnimation();
        jLabel13 = new javax.swing.JLabel();
        card1 = new javaswingdev.card.Card();
        closeLBL = new javax.swing.JLabel();
        roundPanel1 = new javaswingdev.swing.RoundPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javaswingdev.swing.table.Table();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(java.awt.Color.white);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel2.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        roundPanel2.setRound(10);
        roundPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textFieldAnimation1.setBackground(new java.awt.Color(228, 232, 229));
        textFieldAnimation1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textFieldAnimation1KeyReleased(evt);
            }
        });
        roundPanel2.add(textFieldAnimation1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 330, -1));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel13.setText("SELECT PRODUCT");
        roundPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        card1.setDescription("");
        card1.setIcon(javaswingdev.GoogleMaterialDesignIcon.SEARCH);
        roundPanel2.add(card1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 60, 50));

        closeLBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/burger/icon/close_1.png"))); // NOI18N
        closeLBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeLBLMouseClicked(evt);
            }
        });
        roundPanel2.add(closeLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, -1, 38));

        getContentPane().add(roundPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 910, 100));

        roundPanel1.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        roundPanel1.setRound(10);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Stock ID", "Product ID", "Buying Price", "Supplier", "GRN ID", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 876, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(roundPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 910, 480));

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/burger/icon/background.jpg"))); // NOI18N
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldAnimation1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldAnimation1KeyReleased
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        String searchText = textFieldAnimation1.getText();
        TableRowSorter<DefaultTableModel> searchCus = new TableRowSorter<>(dtm);
        table.setRowSorter(searchCus);
        searchCus.setRowFilter(RowFilter.regexFilter(searchText));
    }//GEN-LAST:event_textFieldAnimation1KeyReleased

    private void closeLBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLBLMouseClicked
        dispose();
    }//GEN-LAST:event_closeLBLMouseClicked

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        try {
            DefaultTableModel dtm = (DefaultTableModel) table.getModel();
            int selectRow = table.getSelectedRow();

            String stock_id = dtm.getValueAt(selectRow, 0).toString();
            String pro_id = dtm.getValueAt(selectRow, 1).toString();
            String buyingPrice = dtm.getValueAt(selectRow, 2).toString();
            String grn_id = dtm.getValueAt(selectRow, 4).toString();
            String supplier_id = dtm.getValueAt(selectRow, 3).toString();
            String qty = dtm.getValueAt(selectRow, 5).toString();

            returnNote.txt_stock_id.setText(stock_id);
            returnNote.txt_product_id.setText(pro_id);
            returnNote.txt_grn_id.setText(grn_id);
            ResultSet rs = DB.search("select * from product where product_id ='" + pro_id + "' ");
            if (rs.next()) {
                String name = rs.getString("product_name");

                returnNote.txt_product_name.setText(name);

                String brandID = rs.getString("brand_id");
                ResultSet rs2 = DB.search("select * from brand where brand_id ='" + brandID + "' ");
                if (rs2.next()) {
                    String brand = rs2.getString("brand_name");

                    returnNote.txt_product_brand.setText(brand);

                }

            }
            returnNote.txt_buying_price.setText(buyingPrice);
            returnNote.txt_supplier_id.setText(supplier_id);
            ResultSet rs3 = DB.search("select * from supplier where supplier_id ='" + supplier_id + "' ");
            if (rs3.next()) {
                String supName = rs3.getString("name");
                String supMobile = rs3.getString("mobileno");
                returnNote.txt_supplier_name.setText(supName);
                returnNote.txt_supplier_mobile.setText(supMobile);

            }
            returnNote.txt_avbQty.setText(qty);
            dispose();

        } catch (Exception e) {
            log.error("Load Product Details Failed", e);
        }
    }//GEN-LAST:event_tableMouseClicked

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
            java.util.logging.Logger.getLogger(PopUpProductsReturn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PopUpProductsReturn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PopUpProductsReturn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PopUpProductsReturn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PopUpProductsReturn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javaswingdev.card.Card card1;
    private javax.swing.JLabel closeLBL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JScrollPane jScrollPane1;
    private javaswingdev.card.ModelCard modelCard1;
    private javaswingdev.swing.RoundPanel roundPanel1;
    private javaswingdev.swing.RoundPanel roundPanel2;
    private javaswingdev.swing.table.Table table;
    private swing.TextFieldAnimation textFieldAnimation1;
    // End of variables declaration//GEN-END:variables

    private void loadTable() {
        try {

            DefaultTableModel dtm = (DefaultTableModel) table.getModel();
            dtm.setRowCount(0);
            ResultSet rs = DB.search("select s.stock_id, s.product_id, "
                    + "s.buying_price, s.grn_id, s.quantity, g.supplier"
                    + " from stock as s, grn as g where s.grn_id = g.grn_id");
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("stock_id"));
                v.add(rs.getString("product_id"));
                v.add(rs.getString("buying_price"));
                v.add(rs.getString("supplier"));
                v.add(rs.getString("grn_id"));
                v.add(rs.getString("quantity"));

                dtm.addRow(v);

            }

        } catch (Exception e) {
            log.error("Load Product Details Failed", e);
        }
    }
}