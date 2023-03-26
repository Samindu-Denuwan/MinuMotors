package javaswingdev.form;

import com.bike.common.SystemConfigData;
import com.bike.db.DB;
import java.sql.ResultSet;
import java.util.Vector;
import javaswingdev.card.ModelCard;
import static javaswingdev.form.ViewInvoice.txt_inv_total;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;

public class ViewReturn1 extends javax.swing.JPanel {

    private Logger log;

    public ViewReturn1() {
        initComponents();
        log = Logger.getLogger("bikeLogger");
        log.info("View All Return Page Loaded");
        table.fixTable(jScrollPane6);
        loadTable();
     
       

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel2 = new javaswingdev.swing.RoundPanel();
        card1 = new javaswingdev.card.Card();
        jLabel1 = new javax.swing.JLabel();
        roundPanel3 = new javaswingdev.swing.RoundPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        table = new javaswingdev.swing.table.Table();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel2.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        card1.setDescription("");
        card1.setIcon(javaswingdev.GoogleMaterialDesignIcon.RECEIPT);
        roundPanel2.add(card1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 50));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("VIEW ALL RETURN GOODS");
        roundPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 360, 40));

        add(roundPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 1670, 80));

        roundPanel3.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Return ID", "Stock ID", "Product ID", "Qty", "Date", "Supplier ID", "Issued Empliyee"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true, true, true
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
        jScrollPane6.setViewportView(table);

        roundPanel3.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1630, 730));

        add(roundPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 1670, 900));
    }// </editor-fold>//GEN-END:initComponents

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
      
    }//GEN-LAST:event_tableMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javaswingdev.card.Card card1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane6;
    private javaswingdev.swing.RoundPanel roundPanel2;
    private javaswingdev.swing.RoundPanel roundPanel3;
    public javaswingdev.swing.table.Table table;
    // End of variables declaration//GEN-END:variables

    private void loadTable() {
        try {

            DefaultTableModel dtm = (DefaultTableModel) table.getModel();
            dtm.setRowCount(0);
            ResultSet rs = DB.search("select * from return_item ORDER BY date DESC");
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("return_id"));
                v.add(rs.getString("stock_id"));
                v.add(rs.getString("product_id"));
                v.add(rs.getString("qty"));
                v.add(rs.getString("date"));
                v.add(rs.getString("supplier"));
                v.add(rs.getString("employee"));

                dtm.addRow(v);
            }

        } catch (Exception e) {
            log.error("Load Return Details Failed", e);
        }
    }
    
    


}
