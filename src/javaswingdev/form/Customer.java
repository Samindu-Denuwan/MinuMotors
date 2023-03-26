package javaswingdev.form;

import com.bike.common.SystemConfigData;
import com.bike.db.DB;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.apache.log4j.Logger;

public class Customer extends javax.swing.JPanel {

    private Logger log;

    public Customer() {
        initComponents();
        log = Logger.getLogger("bikeLogger");
        log.info("Manage Customer Page Loaded");
        JT_customer.fixTable(jScrollPane1);
        generateCustomerID();
        loadCustomerTable();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel1 = new javaswingdev.swing.RoundPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_customerId = new javax.swing.JTextField();
        txt_customerName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_customerMobile = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_customerAddress = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        delete = new javax.swing.JButton();
        clearField = new javax.swing.JLabel();
        switchButton = new javaswingdev.swing.SwitchButton();
        jLabel11 = new javax.swing.JLabel();
        roundPanel2 = new javaswingdev.swing.RoundPanel();
        jLabel13 = new javax.swing.JLabel();
        textFieldAnimation1 = new swing.TextFieldAnimation();
        jScrollPane1 = new javax.swing.JScrollPane();
        JT_customer = new javaswingdev.swing.table.Table();
        card2 = new javaswingdev.card.Card();

        setBackground(new java.awt.Color(228, 232, 229));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel1.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setText("Manage Customer");
        roundPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Customer ID");
        roundPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        txt_customerId.setEditable(false);
        txt_customerId.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_customerId.setForeground(new java.awt.Color(102, 102, 102));
        txt_customerId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_customerId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        roundPanel1.add(txt_customerId, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 340, 35));

        txt_customerName.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_customerName.setForeground(new java.awt.Color(102, 102, 102));
        txt_customerName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_customerName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        txt_customerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_customerNameActionPerformed(evt);
            }
        });
        roundPanel1.add(txt_customerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 340, 35));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Customer Name");
        roundPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        txt_customerMobile.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_customerMobile.setForeground(new java.awt.Color(102, 102, 102));
        txt_customerMobile.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_customerMobile.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        txt_customerMobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_customerMobileActionPerformed(evt);
            }
        });
        roundPanel1.add(txt_customerMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 340, 35));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Mobile NO");
        roundPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        txt_customerAddress.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_customerAddress.setForeground(new java.awt.Color(102, 102, 102));
        txt_customerAddress.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_customerAddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        roundPanel1.add(txt_customerAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 340, 35));

        save.setBackground(new java.awt.Color(153, 204, 255));
        save.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        save.setForeground(new java.awt.Color(0, 102, 204));
        save.setText("SAVE CUSTOMER");
        save.setBorder(null);
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        roundPanel1.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 340, 35));

        update.setBackground(new java.awt.Color(153, 204, 255));
        update.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        update.setForeground(new java.awt.Color(0, 102, 204));
        update.setText("UPDATE");
        update.setBorder(null);
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        roundPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 160, 35));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("After that you can save the customer to system.");
        roundPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 700, 320, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Address");
        roundPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Fill all these fields then click SAVE CUSTOMER button, ");
        roundPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 680, 320, -1));

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("UPDATE or DELETE customer.");
        roundPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 770, 320, -1));

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("Double-Click to select customer using this table.");
        roundPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 730, 320, -1));

        jLabel16.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("Then automatically fill all these fields. After that you can ");
        roundPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 750, 320, -1));

        jLabel1.setBackground(new java.awt.Color(51, 204, 255));
        jLabel1.setOpaque(true);
        roundPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 740, 10, 40));

        jLabel5.setBackground(new java.awt.Color(51, 204, 255));
        jLabel5.setOpaque(true);
        roundPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 680, 10, 40));

        delete.setBackground(new java.awt.Color(153, 204, 255));
        delete.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        delete.setForeground(new java.awt.Color(0, 102, 204));
        delete.setText("DELETE");
        delete.setBorder(null);
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        roundPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 580, 160, 35));

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
        roundPanel1.add(clearField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 460, 120, 40));

        switchButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        switchButton.setName(""); // NOI18N
        roundPanel1.add(switchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 40, 20));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Status");
        roundPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));

        add(roundPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 380, 1030));

        roundPanel2.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel13.setText("Search Customer");
        roundPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        textFieldAnimation1.setBackground(new java.awt.Color(228, 232, 229));
        textFieldAnimation1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textFieldAnimation1KeyReleased(evt);
            }
        });
        roundPanel2.add(textFieldAnimation1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 330, -1));

        JT_customer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ID", "Name", "Mobile No", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JT_customer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JT_customerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JT_customer);

        roundPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 200, 1220, 800));

        card2.setDescription("");
        card2.setIcon(javaswingdev.GoogleMaterialDesignIcon.SEARCH);
        roundPanel2.add(card2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 60, 50));

        add(roundPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 1280, 1030));
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        try {
             ResultSet rs = DB.search("select * from customer where customer_id ='" + txt_customerId.getText() + "' ");
            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Customer ID Already Have. Please use UPDATE button to update Details!", "Error", JOptionPane.ERROR_MESSAGE);

            } else {
            if (!txt_customerName.getText().equals("") && !txt_customerAddress.getText().equals("")
                    && !txt_customerMobile.getText().equals("")) {
                String stat = null;
                if (switchButton.isSelected()) {
                    stat = "1";
                } else {
                    stat = "0";
                }

                DB.push("insert into customer values('"
                        + txt_customerId.getText() + "','"
                        + txt_customerName.getText() + "','"
                        + txt_customerMobile.getText() + "','"
                        + txt_customerAddress.getText() + "','" + stat + "')");

                DB.push("insert into system_activity (detail, date, time, employee) values ("
                        + "'Customer Saved',CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP(),'" + SystemConfigData.getEmployee() + "')");

                JOptionPane.showMessageDialog(this, "Customer Saved Successfuly!!", "Saved", JOptionPane.INFORMATION_MESSAGE);
                JT_customer.setEnabled(true);
                generateCustomerID();
                loadCustomerTable();
                log.info("Customer Saved Successful. Customer : " + txt_customerId.getText() + " | By : " + SystemConfigData.getEmployee());
                clearFieldsCustomer();
            } else {
                JOptionPane.showMessageDialog(this, "Fill All text Inpute!", "Error", JOptionPane.ERROR_MESSAGE);
            }
            }
        } catch (Exception e) {
            log.error("Customer Save Failed", e);
        }
    }//GEN-LAST:event_saveActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        try {
            if (!txt_customerId.getText().equals("") && !txt_customerName.getText().equals("")
                    && !txt_customerAddress.getText().equals("")
                    && !txt_customerMobile.getText().equals("")) {
                 ResultSet rs = DB.search("select * from customer where customer_id = '" + txt_customerId.getText() + "'");
                    if (rs.next()) {

                String stat = null;
                if (switchButton.isSelected()) {
                    stat = "1";
                } else {
                    stat = "0";
                }

                DB.push("update customer set  name='"
                        + txt_customerName.getText() + "', mobileno='"
                        + txt_customerMobile.getText() + "', address='"
                        + txt_customerAddress.getText() + "',stat='" + stat + "' "
                        + "where customer_id ='"
                        + txt_customerId.getText() + "' ");

                DB.push("insert into system_activity (detail, date, time, employee) values ("
                        + "'Customer Updated',CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP(),'" + SystemConfigData.getEmployee() + "')");
                
                JOptionPane.showMessageDialog(this, "Customer Updated Successfuly!!", "Updated", JOptionPane.INFORMATION_MESSAGE);
                JT_customer.setEnabled(true);
                log.info("Customer Updated Successful. Customer : " + txt_customerName.getText() + " | By : " + SystemConfigData.getEmployee());
                loadCustomerTable();
                clearFieldsCustomer();
            } else {
                JOptionPane.showMessageDialog(this, "Use SAVE button to Save Details!", "Error", JOptionPane.ERROR_MESSAGE);
                    }
            }else {
                JOptionPane.showMessageDialog(this, "Fill All text Inpute!", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
        } catch (Exception e) {
             log.error("Customer Update Failed", e);
        }
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        try {
          if (!txt_customerId.getText().equals("")) {
                int deleteCustomer = JOptionPane.showConfirmDialog(null, "Do you want to Delete this Customer?", "Select", JOptionPane.YES_NO_OPTION);
                if (deleteCustomer == 0) {
                    ResultSet rs = DB.search("select * from customer where customer_id = '" + txt_customerId.getText() + "'");
                    if (rs.next()) {
                        DB.push("update customer set stat = '0' where customer_id ='"
                                + txt_customerId.getText() + "'");

                        DB.push("insert into system_activity (detail, date, time, employee) values ("
                                + "'Customer Deleted',CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP(),'" + SystemConfigData.getEmployee() + "')");
          
                        JOptionPane.showMessageDialog(this, "Customer Delete Successfuly!", "Deleted", JOptionPane.INFORMATION_MESSAGE);
//                   
                        JT_customer.setEnabled(true);
                        log.info("Customer Deleted Successful. Customer : " + txt_customerId.getText() + " | By : " + SystemConfigData.getEmployee());
                        clearFieldsCustomer();
                        loadCustomerTable();
                    } else {
                        clearFieldsCustomer();
                        JOptionPane.showMessageDialog(this, "Invalid customer ID!", "Error", JOptionPane.ERROR_MESSAGE);

                        log.error("Invalid Customer Id");
                    }

                }
            } else {
                JOptionPane.showMessageDialog(this, "Fill the Customer ID!", "Error", JOptionPane.ERROR_MESSAGE);

            }  
        } catch (Exception e) {
             log.error("Customer Delete Failed", e);
            
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void txt_customerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_customerNameActionPerformed
       txt_customerMobile.grabFocus();
    }//GEN-LAST:event_txt_customerNameActionPerformed

    private void txt_customerMobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_customerMobileActionPerformed
        txt_customerAddress.grabFocus();
    }//GEN-LAST:event_txt_customerMobileActionPerformed

    private void clearFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearFieldMouseClicked
       clearFieldsCustomer();
    }//GEN-LAST:event_clearFieldMouseClicked

    private void clearFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearFieldMouseEntered
        
    }//GEN-LAST:event_clearFieldMouseEntered

    private void JT_customerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JT_customerMouseClicked
        try {
            DefaultTableModel dtm = (DefaultTableModel) JT_customer.getModel();
            int selectRow = JT_customer.getSelectedRow();

            String cus_id = dtm.getValueAt(selectRow, 0).toString();
            txt_customerId.setText(cus_id);

            ResultSet rs = DB.search("select * from customer where customer_id = '" + cus_id + "'");
            if (rs.next()) {
                txt_customerName.setText(rs.getString("name"));
                txt_customerAddress.setText(rs.getString("address"));
                txt_customerMobile.setText(rs.getString("mobileno"));

                String status = (rs.getString("stat"));
                if (status.equals("1")) {
                    switchButton.setSelected(true);
                } else {
                    switchButton.setSelected(false);
                }
            }
        } catch (Exception e) {
             log.error("Load Customer Details Failed", e);
        }
    }//GEN-LAST:event_JT_customerMouseClicked

    private void textFieldAnimation1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldAnimation1KeyReleased
       DefaultTableModel dtm = (DefaultTableModel) JT_customer.getModel();
        String searchText = textFieldAnimation1.getText();
        TableRowSorter<DefaultTableModel> searchCustomer = new TableRowSorter<>(dtm);
        JT_customer.setRowSorter(searchCustomer);
        searchCustomer.setRowFilter(RowFilter.regexFilter(searchText));
    }//GEN-LAST:event_textFieldAnimation1KeyReleased

    private void loadCustomerTable() {
        try {

            DefaultTableModel dtm = (DefaultTableModel) JT_customer.getModel();
            dtm.setRowCount(0);
            ResultSet rs = DB.search("select * from customer");
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("customer_id"));
                v.add(rs.getString("name"));
                v.add(rs.getString("mobileno"));
                v.add(rs.getString("address"));
                dtm.addRow(v);

            }

        } catch (Exception e) {
            log.error("Load Customer Details Failed", e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javaswingdev.swing.table.Table JT_customer;
    private javaswingdev.card.Card card2;
    private javax.swing.JLabel clearField;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javaswingdev.swing.RoundPanel roundPanel1;
    private javaswingdev.swing.RoundPanel roundPanel2;
    private javax.swing.JButton save;
    private javaswingdev.swing.SwitchButton switchButton;
    private swing.TextFieldAnimation textFieldAnimation1;
    private javax.swing.JTextField txt_customerAddress;
    private javax.swing.JTextField txt_customerId;
    private javax.swing.JTextField txt_customerMobile;
    private javax.swing.JTextField txt_customerName;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables

    private void generateCustomerID() {
        try {
            ResultSet rs = DB.search("select count(*) as cus_count from customer");
            if (rs.next()) {
                int count = rs.getInt("cus_count");
                int c = Integer.parseInt(new SimpleDateFormat("Mddyy").format(new Date()));
                int value = c+(++count);
                String customerid = "CUS-"+value;
                txt_customerId.setText(customerid);
                log.info("Customer ID Loaded");
            }
            txt_customerName.grabFocus();
        } catch (Exception e) {
            log.error("Generate Customer ID Failed", e);
        }
    }

    private void clearFieldsCustomer() {
        
        txt_customerName.setText(null);
        txt_customerAddress.setText(null);
        txt_customerMobile.setText(null);
        switchButton.setSelected(false);
        generateCustomerID();
    }
}
