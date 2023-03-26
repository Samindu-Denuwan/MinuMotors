package javaswingdev.form;

import com.bike.common.SystemConfigData;
import com.bike.db.DB;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.apache.log4j.Logger;

public class BikeRegister extends javax.swing.JPanel {

    private Logger log;

    public BikeRegister() {
        initComponents();
        log = Logger.getLogger("bikeLogger");
        log.info("Bike Registration Page Loaded");
        JT_bike.fixTable(jScrollPane1);
        loadBikeTable();
        loadBrand();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel1 = new javaswingdev.swing.RoundPanel();
        jLabel6 = new javax.swing.JLabel();
        delete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_bike_id = new javax.swing.JTextField();
        txt_model = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        save = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        combo_brand = new combobox.Combobox();
        btn_select_customer = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txt_customer_ID = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_customer_name = new javax.swing.JTextField();
        txt_mobileno = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        switchButton = new javaswingdev.swing.SwitchButton();
        jLabel18 = new javax.swing.JLabel();
        clearField = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        roundPanel2 = new javaswingdev.swing.RoundPanel();
        card1 = new javaswingdev.card.Card();
        jLabel13 = new javax.swing.JLabel();
        textFieldAnimation1 = new swing.TextFieldAnimation();
        jScrollPane1 = new javax.swing.JScrollPane();
        JT_bike = new javaswingdev.swing.table.Table();

        setBackground(new java.awt.Color(228, 232, 229));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel1.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setText("Bike Registration");
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
        roundPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 850, 160, 35));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("eg: BDO1234");
        roundPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, -1, -1));

        txt_bike_id.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_bike_id.setForeground(new java.awt.Color(102, 102, 102));
        txt_bike_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_bike_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        roundPanel1.add(txt_bike_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 340, 35));

        txt_model.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_model.setForeground(new java.awt.Color(102, 102, 102));
        txt_model.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_model.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        roundPanel1.add(txt_model, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 340, 35));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Model");
        roundPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        save.setBackground(new java.awt.Color(153, 204, 255));
        save.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        save.setForeground(new java.awt.Color(0, 102, 204));
        save.setText("SAVE BIKE");
        save.setBorder(null);
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        roundPanel1.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 790, 340, 35));

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
        roundPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 850, 160, 35));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Brand");
        roundPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        combo_brand.setBorder(null);
        combo_brand.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        combo_brand.setLabeText("");
        roundPanel1.add(combo_brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 340, 40));

        btn_select_customer.setBackground(new java.awt.Color(153, 204, 255));
        btn_select_customer.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_select_customer.setForeground(new java.awt.Color(0, 102, 204));
        btn_select_customer.setText("SELECT CUSTOMER");
        btn_select_customer.setBorder(null);
        btn_select_customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_select_customerActionPerformed(evt);
            }
        });
        roundPanel1.add(btn_select_customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 340, 35));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Customer ID");
        roundPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, -1, -1));

        txt_customer_ID.setEditable(false);
        txt_customer_ID.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_customer_ID.setForeground(new java.awt.Color(102, 102, 102));
        txt_customer_ID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_customer_ID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        roundPanel1.add(txt_customer_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 340, 35));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Customer Name");
        roundPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, -1, -1));

        txt_customer_name.setEditable(false);
        txt_customer_name.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_customer_name.setForeground(new java.awt.Color(102, 102, 102));
        txt_customer_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_customer_name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        roundPanel1.add(txt_customer_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, 340, 35));

        txt_mobileno.setEditable(false);
        txt_mobileno.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_mobileno.setForeground(new java.awt.Color(102, 102, 102));
        txt_mobileno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_mobileno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        roundPanel1.add(txt_mobileno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 700, 340, 35));

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("Mobile No");
        roundPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 670, -1, -1));

        switchButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        switchButton.setName(""); // NOI18N
        roundPanel1.add(switchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 40, 20));

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setText("Status");
        roundPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

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
        roundPanel1.add(clearField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 120, 40));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Bike ID");
        roundPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        add(roundPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 380, 1030));

        roundPanel2.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        card1.setDescription("");
        card1.setIcon(javaswingdev.GoogleMaterialDesignIcon.SEARCH);
        roundPanel2.add(card1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 60, 50));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel13.setText("Search Bike");
        roundPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        textFieldAnimation1.setBackground(new java.awt.Color(228, 232, 229));
        textFieldAnimation1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textFieldAnimation1KeyReleased(evt);
            }
        });
        roundPanel2.add(textFieldAnimation1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 330, -1));

        JT_bike.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bike ID", "Brand", "Model", "Customer ID", "Register Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JT_bike.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JT_bikeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JT_bike);

        roundPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 1220, 790));

        add(roundPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 1280, 1030));
    }// </editor-fold>//GEN-END:initComponents

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
           try {
          if (!txt_bike_id.getText().equals("")) {
                int deleteBike = JOptionPane.showConfirmDialog(null, "Do you want to Delete this Bike?", "Select", JOptionPane.YES_NO_OPTION);
                if (deleteBike == 0) {
                    ResultSet rs = DB.search("select * from bike where bike_id = '" + txt_bike_id.getText() + "'");
                    if (rs.next()) {
                        DB.push("update bike set stat = '0' where bike_id ='"
                                + txt_bike_id.getText().trim().toUpperCase() + "'");

                        DB.push("insert into system_activity (detail, date, time, employee) values ("
                                + "'Bike Deleted',CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP(),'" + SystemConfigData.getEmployee() + "')");
          
                        JOptionPane.showMessageDialog(this, "Bike Delete Successfuly!", "Deleted", JOptionPane.INFORMATION_MESSAGE);
//                   
                        log.info("Bike Deleted Successful. Bike : " + txt_bike_id.getText() + " | By : " + SystemConfigData.getEmployee());
                        clearFields();
                        loadBikeTable();
                    } else {
                        clearFields();
                        JOptionPane.showMessageDialog(this, "Invalid Bike ID!", "Error", JOptionPane.ERROR_MESSAGE);

                        log.error("Invalid Bike Id");
                    }

                }
            } else {
                JOptionPane.showMessageDialog(this, "Fill the Bike ID!", "Error", JOptionPane.ERROR_MESSAGE);

            }  
        } catch (Exception e) {
             log.error("Bike Delete Failed", e);
            
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        try {
            ResultSet rs = DB.search("select * from bike where bike_id ='" + txt_bike_id.getText() + "' ");
            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Bike ID is already Used.Please use UPDATE button to update details", "Error", JOptionPane.ERROR_MESSAGE);

            } else {
                if (!txt_bike_id.getText().equals("") && !txt_model.getText().equals("")
                        && !txt_customer_ID.getText().equals("")) {

                    String brand = combo_brand.getSelectedItem().toString();

                    String stat = null;
                    if (switchButton.isSelected()) {
                        stat = "1";
                    } else {
                        stat = "0";
                    }

                    ResultSet rs2 = DB.search("select * from brand where brand_name = '" + brand + "'");
                    if (rs2.next()) {
                        String brandId = (rs2.getString("brand_id"));

                        DB.push("insert into bike values('"
                                + txt_bike_id.getText().trim().toUpperCase() + "','"
                                + brandId + "','"
                                + txt_model.getText() + "','"
                                + txt_customer_ID.getText() + "',CURRENT_TIMESTAMP(),'"
                                + stat + "')");

                        DB.push("insert into system_activity (detail, date, time, employee) values ("
                                + "'Bike Saved',CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP(),'" + SystemConfigData.getEmployee() + "')");

                        log.info("Bike Saved Successful. Bike  : " + txt_bike_id.getText() + " |By : " + SystemConfigData.getEmployee());
                        clearFields();
                        JOptionPane.showMessageDialog(this, "Bike Saved Successfuly!", "Saved", JOptionPane.INFORMATION_MESSAGE);

                        loadBikeTable();

                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Fill All text Inpute!", "Error", JOptionPane.ERROR_MESSAGE);

                }
            }
        } catch (Exception e) {
            log.error("Bike Save Failed", e);
        }
    }//GEN-LAST:event_saveActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
         try {
            if (!txt_bike_id.getText().equals("") && !txt_model.getText().equals("")
                    && !txt_customer_ID.getText().equals("")) {
                ResultSet rs = DB.search("select * from bike where bike_id = '" + txt_bike_id.getText() + "'");
                if (rs.next()) {

                    String brand = combo_brand.getSelectedItem().toString();
                   
                    String stat = null;
                    if (switchButton.isSelected()) {
                        stat = "1";
                    } else {
                        stat = "0";
                    }

                    ResultSet rs2 = DB.search("select * from brand where brand_name = '" + brand + "'");
                    if (rs2.next()) {
                        String brandId = (rs2.getString("brand_id"));

                            DB.push("update bike set  model='" + txt_model.getText() + "'"
                                    + ", brand_id='" + brandId + "', customer_id='"
                                    + txt_customer_ID.getText() + "', stat='" + stat + "' "
                                    + "where bike_id ='"
                                    + txt_bike_id.getText().trim().toUpperCase() + "' ");
                            log.info("Bike Updated Successful. Bike : " + txt_bike_id.getText() + " By : " + SystemConfigData.getEmployee());
                            DB.push("insert into system_activity (detail, date, time, employee) values ("
                                    + "'Bike Updated',CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP(),'" + SystemConfigData.getEmployee() + "')");

                            clearFields();
                            JOptionPane.showMessageDialog(this, "Bike Updated Successfuly!", "Updated", JOptionPane.INFORMATION_MESSAGE);
                         
                            loadBikeTable();
                        
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Use SAVE button to Save Details!", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Fill All text Inpute!", "Error", JOptionPane.ERROR_MESSAGE);

                
            }
        } catch (Exception e) {
            log.error("Bike Update Failed", e);
        }
    }//GEN-LAST:event_updateActionPerformed

    private void btn_select_customerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_select_customerActionPerformed
         BikeCustomer bikeCustomer = new BikeCustomer(BikeRegister.this);
        bikeCustomer.setVisible(true);
    }//GEN-LAST:event_btn_select_customerActionPerformed

    private void textFieldAnimation1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldAnimation1KeyReleased
        DefaultTableModel dtm = (DefaultTableModel) JT_bike.getModel();
        String searchText = textFieldAnimation1.getText();
        TableRowSorter<DefaultTableModel> searchBike = new TableRowSorter<>(dtm);
        JT_bike.setRowSorter(searchBike);
        searchBike.setRowFilter(RowFilter.regexFilter(searchText));
    }//GEN-LAST:event_textFieldAnimation1KeyReleased

    private void JT_bikeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JT_bikeMouseClicked
        try {
            DefaultTableModel dtm = (DefaultTableModel) JT_bike.getModel();
            int selectRow = JT_bike.getSelectedRow();

            String bike_id = dtm.getValueAt(selectRow, 0).toString();
            txt_bike_id.setText(bike_id);

            ResultSet rs = DB.search("select * from bike where bike_id = '" + bike_id + "'");
            if (rs.next()) {
                txt_model.setText(rs.getString("model"));

                String status = (rs.getString("stat"));
                if (status.equals("1")) {
                    switchButton.setSelected(true);
                } else {
                    switchButton.setSelected(false);
                }
            }
            String BrandID = (rs.getString("brand_id"));
            ResultSet rs2 = DB.search("select * from brand where brand_id = '" + BrandID + "'");
            if (rs2.next()) {
                String brand = (rs2.getString("brand_name"));
                for (int i = 0; i < combo_brand.getItemCount(); i++) {
                    if (combo_brand.getItemAt(i).equals(brand)) {
                        combo_brand.setSelectedIndex(i);
                    }
                }

            }
            String customerID = (rs.getString("customer_id"));
            ResultSet rs3 = DB.search("select * from customer where customer_id = '" + customerID + "'");
            if (rs3.next()) {
                String name = (rs3.getString("name"));
                String mobile = (rs3.getString("mobileno"));

                txt_customer_ID.setText(customerID);
                txt_customer_name.setText(name);
                txt_mobileno.setText(mobile);

            }

        } catch (Exception e) {
            log.error("Load Product Details Failed", e);
        }
    }//GEN-LAST:event_JT_bikeMouseClicked

    private void clearFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearFieldMouseClicked
        clearFields();
    }//GEN-LAST:event_clearFieldMouseClicked

    private void clearFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearFieldMouseEntered

    }//GEN-LAST:event_clearFieldMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javaswingdev.swing.table.Table JT_bike;
    private javax.swing.JButton btn_select_customer;
    private javaswingdev.card.Card card1;
    private javax.swing.JLabel clearField;
    private combobox.Combobox combo_brand;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javaswingdev.swing.RoundPanel roundPanel1;
    private javaswingdev.swing.RoundPanel roundPanel2;
    private javax.swing.JButton save;
    private javaswingdev.swing.SwitchButton switchButton;
    private swing.TextFieldAnimation textFieldAnimation1;
    private javax.swing.JTextField txt_bike_id;
    public javax.swing.JTextField txt_customer_ID;
    public javax.swing.JTextField txt_customer_name;
    public javax.swing.JTextField txt_mobileno;
    private javax.swing.JTextField txt_model;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables

    
    private void loadBikeTable() {
        try {
            DefaultTableModel dtm = (DefaultTableModel) JT_bike.getModel();
            dtm.setRowCount(0);
            ResultSet rs = DB.search("select * from bike ORDER by Register_date DESC");
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("bike_id"));
                v.add(rs.getString("brand_id"));
                v.add(rs.getString("model"));
                v.add(rs.getString("customer_id"));
                v.add(rs.getString("Register_date"));
                dtm.addRow(v);

            }

        } catch (Exception e) {
            log.error("Load Bike Details Failed", e);
        }
    }

    private void loadBrand() {
        try {
            ResultSet resultSet = DB.search("select * from brand");
            Vector v = new Vector();
            while (resultSet.next()) {
                String data = resultSet.getString("brand_name");
                v.add(data);
            }
            combo_brand.setModel(new DefaultComboBoxModel(v));
            combo_brand.setSelectedIndex(-1);

        } catch (Exception e) {
            log.error("Bike Brand  Load Failed", e);
        }

    }

    private void clearFields() {
        txt_model.setText(null);
        txt_bike_id.setText(null);
        combo_brand.setSelectedIndex(-1);
        txt_customer_ID.setText(null);
        txt_customer_name.setText(null);
        txt_mobileno.setText(null);
        switchButton.setSelected(false);
      
    }
}
