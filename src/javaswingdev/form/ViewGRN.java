package javaswingdev.form;

import com.bike.common.SystemConfigData;
import com.bike.db.DB;
import java.sql.ResultSet;
import java.util.Vector;
import static javaswingdev.form.ViewInvoice.txt_inv_total;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;

public class ViewGRN extends javax.swing.JPanel {

    private Logger log;

    public ViewGRN() {
        initComponents();
        log = Logger.getLogger("bikeLogger");
        log.info("View All Grn Page Loaded");
        table.fixTable(jScrollPane6);
        loadTable();
        calculateTot();
       

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
        jLabel19 = new javax.swing.JLabel();
        txt_grn_total = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel2.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        card1.setDescription("");
        card1.setIcon(javaswingdev.GoogleMaterialDesignIcon.RECEIPT);
        roundPanel2.add(card1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 50));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("VIEW ALL GRNS");
        roundPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 240, 40));

        add(roundPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 1670, 80));

        roundPanel3.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "GRN ID", "Supplier ID", "Date", "PO ID", "Total", "Issued Empliyee"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, true, true
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

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setText("LKR");
        roundPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 830, -1, -1));

        txt_grn_total.setEditable(false);
        txt_grn_total.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_grn_total.setForeground(new java.awt.Color(102, 102, 102));
        txt_grn_total.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_grn_total.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        txt_grn_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_grn_totalActionPerformed(evt);
            }
        });
        roundPanel3.add(txt_grn_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 820, 230, 35));

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 102, 102));
        jLabel20.setText("Total");
        roundPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 780, -1, -1));

        add(roundPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 1670, 900));
    }// </editor-fold>//GEN-END:initComponents

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
       try {
            DefaultTableModel dtm = (DefaultTableModel) table.getModel();
            int selectRow = table.getSelectedRow();

            String grnID = dtm.getValueAt(selectRow, 0).toString();
            SystemConfigData.setAllGrnID(grnID);

            PopUpGrnItems grnItems = new PopUpGrnItems(ViewGRN.this);
            grnItems.setVisible(true);
            

        } catch (Exception e) {
            log.error("invoice id Details Failed", e);
        }
    }//GEN-LAST:event_tableMouseClicked

    private void txt_grn_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_grn_totalActionPerformed

    }//GEN-LAST:event_txt_grn_totalActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javaswingdev.card.Card card1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JScrollPane jScrollPane6;
    private javaswingdev.swing.RoundPanel roundPanel2;
    private javaswingdev.swing.RoundPanel roundPanel3;
    public javaswingdev.swing.table.Table table;
    private javax.swing.JTextField txt_grn_total;
    // End of variables declaration//GEN-END:variables

    private void loadTable() {
        try {

            DefaultTableModel dtm = (DefaultTableModel) table.getModel();
            dtm.setRowCount(0);
            ResultSet rs = DB.search("select * from grn ORDER BY date && time DESC");
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("grn_id"));
                v.add(rs.getString("supplier"));
                v.add(rs.getString("date") + " " + rs.getString("time"));
                v.add(rs.getString("po_id"));
                v.add(rs.getString("total"));
                v.add(rs.getString("employee"));

                dtm.addRow(v);
            }

        } catch (Exception e) {
            log.error("Load GRN Details Failed", e);
        }
    }
    
       private void calculateTot() {
//        int sum = 0;
//        for (int i = 0; i < table.getRowCount(); i++) {
//            sum = sum + Integer.parseInt(table.getValueAt(i, 4).toString());
//        }
//        txt_grn_total.setText(Integer.toString(sum));

    double tot = 0;
    
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        for (int row = 0; row < dtm.getRowCount(); row++) {
            tot += Double.parseDouble(dtm.getValueAt(row, 4).toString());

        }
         txt_grn_total.setText(" " + tot);
              log.info("Inv Total Loaded");
       
    }


}
