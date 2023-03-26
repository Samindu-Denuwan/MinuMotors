
package javaswingdev.form;

import com.bike.common.SystemConfigData;
import static com.bike.common.SystemLogger.initLogger;
import com.bike.db.DB;
import java.sql.ResultSet;
import java.util.Vector;
import javaswingdev.form.User;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.apache.log4j.Logger;

public class BikeServicePopUp extends javax.swing.JFrame {

     private Logger log;
     private ServiceInvoice invoice;
    
    public BikeServicePopUp() {
        initComponents();
        setLocationRelativeTo(null);
        
         initLogger();
        log = Logger.getLogger("bikeLogger");
        log.info("Select Bike  Page Loaded");
        table.fixTable(jScrollPane1);
        loadTable();
        
    }
    
    BikeServicePopUp (ServiceInvoice invoice){
        this();
        this.invoice = invoice;
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
        jLabel13.setText("SELECT BIKE");
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
                "Bike ID", "Brand ", "Model", "Customer ID", "Customer", "Mobile No"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
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

            String bike_id = dtm.getValueAt(selectRow, 0).toString();
            String brand = dtm.getValueAt(selectRow, 1).toString();
            String model = dtm.getValueAt(selectRow, 2).toString();
            String cus_id = dtm.getValueAt(selectRow, 3).toString();
            String cus_name = dtm.getValueAt(selectRow, 4).toString();
            String mobile = dtm.getValueAt(selectRow, 5).toString();
           
            invoice.txt_bike_id.setText(bike_id);
            invoice.txt_bike_brand.setText(brand);
            invoice.txt_bike_model.setText(model);
            invoice.txt_bike_customer_id.setText(cus_id);
            invoice.txt_bike_cus_name.setText(cus_name);
            invoice.txt_bike_mobile.setText(mobile);
            dispose();

 
        } catch (Exception e) {
            log.error("Load Bike Customer Details Failed", e);
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
            java.util.logging.Logger.getLogger(BikeServicePopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BikeServicePopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BikeServicePopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BikeServicePopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BikeServicePopUp().setVisible(true);
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
            ResultSet rs = DB.search("SELECT b.bike_id, b.model, b.customer_id,"
                    + "c.name, br.brand_name,c.mobileno from bike as b,"
                    + "customer as c,brand as br where b.customer_id="
                    + " c.customer_id && b.brand_id=br.brand_id;");
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("bike_id"));
                v.add(rs.getString("brand_name"));
                v.add(rs.getString("model"));
                v.add(rs.getString("customer_id"));
                 v.add(rs.getString("name"));
                v.add(rs.getString("mobileno"));
              
                dtm.addRow(v);

            }

        } catch (Exception e) {
            log.error("Load Customer Details Failed", e);
        }
    }
}
