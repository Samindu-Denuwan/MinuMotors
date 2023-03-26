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

public class Supplier extends javax.swing.JPanel {

    private Logger log;

    public Supplier() {
        initComponents();
        log = Logger.getLogger("bikeLogger");
        log.info("Manage Supplier Page Loaded");
        JT_supplier.fixTable(jScrollPane1);
        generateSupplierID();
        loadSupplierTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel1 = new javaswingdev.swing.RoundPanel();
        jLabel6 = new javax.swing.JLabel();
        delete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_supplier_id = new javax.swing.JTextField();
        txt_supplier_name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_supplier_mobile = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_supplier_email = new javax.swing.JTextField();
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
        txt_supplier_address = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        switchButton = new javaswingdev.swing.SwitchButton();
        jLabel11 = new javax.swing.JLabel();
        clearField = new javax.swing.JLabel();
        roundPanel2 = new javaswingdev.swing.RoundPanel();
        card1 = new javaswingdev.card.Card();
        jLabel13 = new javax.swing.JLabel();
        textFieldAnimation1 = new swing.TextFieldAnimation();
        jScrollPane1 = new javax.swing.JScrollPane();
        JT_supplier = new javaswingdev.swing.table.Table();

        setBackground(new java.awt.Color(228, 232, 229));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel1.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setText("Manage Supplier");
        roundPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

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
        roundPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 690, 160, 35));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Supplier ID");
        roundPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        txt_supplier_id.setEditable(false);
        txt_supplier_id.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_supplier_id.setForeground(new java.awt.Color(102, 102, 102));
        txt_supplier_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_supplier_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        roundPanel1.add(txt_supplier_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 340, 35));

        txt_supplier_name.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_supplier_name.setForeground(new java.awt.Color(102, 102, 102));
        txt_supplier_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_supplier_name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        txt_supplier_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_supplier_nameActionPerformed(evt);
            }
        });
        roundPanel1.add(txt_supplier_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 340, 35));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Supplier Name");
        roundPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        txt_supplier_mobile.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_supplier_mobile.setForeground(new java.awt.Color(102, 102, 102));
        txt_supplier_mobile.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_supplier_mobile.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        txt_supplier_mobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_supplier_mobileActionPerformed(evt);
            }
        });
        roundPanel1.add(txt_supplier_mobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 340, 35));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Mobile No");
        roundPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        txt_supplier_email.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_supplier_email.setForeground(new java.awt.Color(102, 102, 102));
        txt_supplier_email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_supplier_email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        txt_supplier_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_supplier_emailActionPerformed(evt);
            }
        });
        roundPanel1.add(txt_supplier_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 340, 35));

        save.setBackground(new java.awt.Color(153, 204, 255));
        save.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        save.setForeground(new java.awt.Color(0, 102, 204));
        save.setText("SAVE SUPPLIER");
        save.setBorder(null);
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        roundPanel1.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 630, 340, 35));

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
        roundPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 690, 160, 35));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("After that you can save the supplier to system.");
        roundPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 770, 320, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Email");
        roundPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Fill all these fields then click SAVE SUPPLIER button, ");
        roundPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 750, 320, -1));

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("UPDATE or DELETE supplier.");
        roundPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 840, 320, -1));

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("Double-Click to select supplier using this table.");
        roundPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 800, 320, -1));

        jLabel16.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("Then automatically fill all these fields. After that you can ");
        roundPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 820, 320, -1));

        jLabel1.setBackground(new java.awt.Color(51, 204, 255));
        jLabel1.setOpaque(true);
        roundPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 810, 10, 40));

        jLabel5.setBackground(new java.awt.Color(51, 204, 255));
        jLabel5.setOpaque(true);
        roundPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 750, 10, 40));

        txt_supplier_address.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_supplier_address.setForeground(new java.awt.Color(102, 102, 102));
        txt_supplier_address.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_supplier_address.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        roundPanel1.add(txt_supplier_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 340, 35));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Address");
        roundPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));

        switchButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        switchButton.setName(""); // NOI18N
        roundPanel1.add(switchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 560, 40, 20));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Status");
        roundPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, -1, -1));

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
        roundPanel1.add(clearField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 550, 120, 40));

        add(roundPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 380, 1030));

        roundPanel2.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        card1.setDescription("");
        card1.setIcon(javaswingdev.GoogleMaterialDesignIcon.SEARCH);
        roundPanel2.add(card1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 60, 50));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel13.setText("Search Supplier");
        roundPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        textFieldAnimation1.setBackground(new java.awt.Color(228, 232, 229));
        textFieldAnimation1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textFieldAnimation1KeyReleased(evt);
            }
        });
        roundPanel2.add(textFieldAnimation1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 330, -1));

        JT_supplier.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Supplier ID", "Supplier Name", "Mobile No", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JT_supplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JT_supplierMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JT_supplier);

        roundPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 200, 1220, 800));

        add(roundPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 1280, 1030));
    }// </editor-fold>//GEN-END:initComponents

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
          try {
          if (!txt_supplier_id.getText().equals("")) {
                int deleteSup = JOptionPane.showConfirmDialog(null, "Do you want to Delete this Supplier?", "Select", JOptionPane.YES_NO_OPTION);
                if (deleteSup == 0) {
                    ResultSet rs = DB.search("select * from supplier where supplier_id = '" + txt_supplier_id.getText() + "'");
                    if (rs.next()) {
                        DB.push("update supplier set stat = '0' where supplier_id ='"
                                + txt_supplier_id.getText() + "'");

                        DB.push("insert into system_activity (detail, date, time, employee) values ("
                                + "'Supplier Deleted',CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP(),'" + SystemConfigData.getEmployee() + "')");
          
                        JOptionPane.showMessageDialog(this, "Supplier Delete Successfuly!", "Deleted", JOptionPane.INFORMATION_MESSAGE);
//                   
                       
                        log.info("Supplier Deleted Successful. Supplier : " + txt_supplier_id.getText() + " | By : " + SystemConfigData.getEmployee());
                        clearFields();
                        loadSupplierTable();
                    } else {
                        clearFields();
                        JOptionPane.showMessageDialog(this, "Invalid Supplier ID!", "Error", JOptionPane.ERROR_MESSAGE);

                        log.error("Invalid Supplier Id");
                    }

                }
            } else {
                JOptionPane.showMessageDialog(this, "Fill the Supplier ID!", "Error", JOptionPane.ERROR_MESSAGE);

            }  
        } catch (Exception e) {
             log.error("Supplier Delete Failed", e);
            
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
         try {
             ResultSet rs = DB.search("select * from supplier where supplier_id ='" + txt_supplier_id.getText() + "' ");
            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Supplier ID Already Have. Please use UPDATE button to update Details!", "Error", JOptionPane.ERROR_MESSAGE);

            } else {
            if (!txt_supplier_name.getText().equals("") && !txt_supplier_mobile.getText().equals("")
                    && !txt_supplier_email.getText().equals("") && !txt_supplier_address.getText().equals("")
                     && !txt_supplier_id.getText().equals("")) {
                String stat = null;
                if (switchButton.isSelected()) {
                    stat = "1";
                } else {
                    stat = "0";
                }

                DB.push("insert into supplier values('"
                        + txt_supplier_id.getText() + "','"
                        + txt_supplier_name.getText() + "','"
                        + txt_supplier_mobile.getText() + "','"
                        + txt_supplier_email.getText() + "','" 
                          + txt_supplier_address.getText() + "','" 
                        + stat + "')");

                DB.push("insert into system_activity (detail, date, time, employee) values ("
                        + "'Supplier Saved',CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP(),'" + SystemConfigData.getEmployee() + "')");

                JOptionPane.showMessageDialog(this, "Supplier Saved Successfuly!!", "Saved", JOptionPane.INFORMATION_MESSAGE);
              
                generateSupplierID();
                loadSupplierTable();
                log.info("Supplier Saved Successful. Supplier : " + txt_supplier_id.getText() + " | By : " + SystemConfigData.getEmployee());
                clearFields();
            } else {
                JOptionPane.showMessageDialog(this, "Fill All text Inpute!", "Error", JOptionPane.ERROR_MESSAGE);
            }
            }
        } catch (Exception e) {
            log.error("Supplier Save Failed", e);
        }
    }//GEN-LAST:event_saveActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
       try {
            if (!txt_supplier_id.getText().equals("") && !txt_supplier_name.getText().equals("")
                    && !txt_supplier_mobile.getText().equals("")
                    && !txt_supplier_email.getText().equals("")
                    && !txt_supplier_address.getText().equals("")) {
                 ResultSet rs = DB.search("select * from supplier where supplier_id = '" + txt_supplier_id.getText() + "'");
                    if (rs.next()) {

                String stat = null;
                if (switchButton.isSelected()) {
                    stat = "1";
                } else {
                    stat = "0";
                }

                DB.push("update supplier set  name='"+ txt_supplier_name.getText() 
                        + "', mobileno='"+ txt_supplier_mobile.getText() 
                        + "', address='"+ txt_supplier_address.getText() 
                        + "', email='"+ txt_supplier_email.getText() 
                        + "',stat='" + stat + "' "
                        + "where supplier_id ='"
                        + txt_supplier_id.getText() + "' ");

                DB.push("insert into system_activity (detail, date, time, employee) values ("
                        + "'Supplier Updated',CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP(),'" + SystemConfigData.getEmployee() + "')");
                
                JOptionPane.showMessageDialog(this, "Supplier Updated Successfuly!!", "Updated", JOptionPane.INFORMATION_MESSAGE);
                
                log.info("Supplier Updated Successful. Supplier : " + txt_supplier_name.getText() + " | By : " + SystemConfigData.getEmployee());
                loadSupplierTable();
                clearFields();
            } else {
                JOptionPane.showMessageDialog(this, "Use SAVE button to Save Details!", "Error", JOptionPane.ERROR_MESSAGE);
                    }
            }else {
                JOptionPane.showMessageDialog(this, "Fill All text Inpute!", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
        } catch (Exception e) {
             log.error("Supplier Update Failed", e);
        }
    }//GEN-LAST:event_updateActionPerformed

    private void JT_supplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JT_supplierMouseClicked
      try {
            DefaultTableModel dtm = (DefaultTableModel) JT_supplier.getModel();
            int selectRow = JT_supplier.getSelectedRow();

            String sup_id = dtm.getValueAt(selectRow, 0).toString();
            txt_supplier_id.setText(sup_id);

            ResultSet rs = DB.search("select * from supplier where supplier_id = '" + sup_id + "'");
            if (rs.next()) {
                txt_supplier_name.setText(rs.getString("name"));
                txt_supplier_mobile.setText(rs.getString("mobileno"));
                txt_supplier_email.setText(rs.getString("email"));
                txt_supplier_address.setText(rs.getString("address"));

                String status = (rs.getString("stat"));
                if (status.equals("1")) {
                    switchButton.setSelected(true);
                } else {
                    switchButton.setSelected(false);
                }
            }
        } catch (Exception e) {
             log.error("Load Supplier Details Failed", e);
        }
    }//GEN-LAST:event_JT_supplierMouseClicked

    private void clearFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearFieldMouseClicked
        clearFields();
    }//GEN-LAST:event_clearFieldMouseClicked

    private void clearFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearFieldMouseEntered

    }//GEN-LAST:event_clearFieldMouseEntered

    private void textFieldAnimation1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldAnimation1KeyReleased
        DefaultTableModel dtm = (DefaultTableModel) JT_supplier.getModel();
        String searchText = textFieldAnimation1.getText();
        TableRowSorter<DefaultTableModel> searchSup = new TableRowSorter<>(dtm);
        JT_supplier.setRowSorter(searchSup);
        searchSup.setRowFilter(RowFilter.regexFilter(searchText));
    }//GEN-LAST:event_textFieldAnimation1KeyReleased

    private void txt_supplier_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_supplier_nameActionPerformed
        txt_supplier_mobile.grabFocus();
    }//GEN-LAST:event_txt_supplier_nameActionPerformed

    private void txt_supplier_mobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_supplier_mobileActionPerformed
        txt_supplier_email.grabFocus();       
    }//GEN-LAST:event_txt_supplier_mobileActionPerformed

    private void txt_supplier_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_supplier_emailActionPerformed
       txt_supplier_address.grabFocus();
    }//GEN-LAST:event_txt_supplier_emailActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javaswingdev.swing.table.Table JT_supplier;
    private javaswingdev.card.Card card1;
    private javax.swing.JLabel clearField;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JTextField txt_supplier_address;
    private javax.swing.JTextField txt_supplier_email;
    private javax.swing.JTextField txt_supplier_id;
    private javax.swing.JTextField txt_supplier_mobile;
    private javax.swing.JTextField txt_supplier_name;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables

    private void clearFields() {
        txt_supplier_name.setText(null);
        txt_supplier_mobile.setText(null);
        txt_supplier_email.setText(null);
         txt_supplier_address.setText(null);
        switchButton.setSelected(false);
        generateSupplierID();
    }

    private void generateSupplierID() {
            try {
            ResultSet rs = DB.search("select count(*) as sup_count from supplier");
            if (rs.next()) {
                int count = rs.getInt("sup_count");
                int c = Integer.parseInt(new SimpleDateFormat("Mddyy").format(new Date()));
                int value = c+(++count);
                String supid = "SUP-"+value;
                txt_supplier_id.setText(supid);
                log.info("Supplier ID Loaded");
            }
            txt_supplier_name.grabFocus();
        } catch (Exception e) {
            log.error("Generate Supplier ID Failed", e);
        }
    }

    private void loadSupplierTable() {
          try {

            DefaultTableModel dtm = (DefaultTableModel) JT_supplier.getModel();
            dtm.setRowCount(0);
            ResultSet rs = DB.search("select * from supplier");
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("supplier_id"));
                v.add(rs.getString("name"));
                v.add(rs.getString("mobileno"));
                v.add(rs.getString("email"));
                v.add(rs.getString("address"));
                dtm.addRow(v);

            }

        } catch (Exception e) {
            log.error("Load Supplier Details Failed", e);
        }
    }
}
