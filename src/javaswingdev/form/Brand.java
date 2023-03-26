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

public class Brand extends javax.swing.JPanel {

    private Logger log;

    public Brand() {
        initComponents();
        log = Logger.getLogger("bikeLogger");
        log.info("Brand Registration Page Loaded");
        JT_brand.fixTable(jScrollPane1);
        generateBrandID();
        loadBrandTable();
       
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel1 = new javaswingdev.swing.RoundPanel();
        jLabel6 = new javax.swing.JLabel();
        delete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_brandID = new javax.swing.JTextField();
        txt_brandName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        save = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        switchButton = new javaswingdev.swing.SwitchButton();
        jLabel11 = new javax.swing.JLabel();
        clearField = new javax.swing.JLabel();
        roundPanel2 = new javaswingdev.swing.RoundPanel();
        card1 = new javaswingdev.card.Card();
        jLabel13 = new javax.swing.JLabel();
        textFieldAnimation1 = new swing.TextFieldAnimation();
        jScrollPane1 = new javax.swing.JScrollPane();
        JT_brand = new javaswingdev.swing.table.Table();

        setBackground(new java.awt.Color(228, 232, 229));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel1.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setText("Brand Registration");
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
        roundPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 550, 160, 35));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Brand  ID");
        roundPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        txt_brandID.setEditable(false);
        txt_brandID.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_brandID.setForeground(new java.awt.Color(102, 102, 102));
        txt_brandID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_brandID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        roundPanel1.add(txt_brandID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 340, 35));

        txt_brandName.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_brandName.setForeground(new java.awt.Color(102, 102, 102));
        txt_brandName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_brandName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        roundPanel1.add(txt_brandName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 340, 35));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Brand Name");
        roundPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        save.setBackground(new java.awt.Color(153, 204, 255));
        save.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        save.setForeground(new java.awt.Color(0, 102, 204));
        save.setText("SAVE BRAND");
        save.setBorder(null);
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        roundPanel1.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 340, 35));

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
        roundPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 160, 35));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("After that you can save the brand to system.");
        roundPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 700, 320, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Fill all these fields then click SAVE BRAND button, ");
        roundPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 680, 320, -1));

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("UPDATE or DELETE Brand.");
        roundPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 770, 320, -1));

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("Double-Click to select Brand using this table.");
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

        switchButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        switchButton.setName(""); // NOI18N
        roundPanel1.add(switchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 40, 20));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Status");
        roundPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

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
        roundPanel1.add(clearField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 120, 40));

        add(roundPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 380, 1030));

        roundPanel2.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        card1.setDescription("");
        card1.setIcon(javaswingdev.GoogleMaterialDesignIcon.SEARCH);
        roundPanel2.add(card1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 60, 50));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel13.setText("Search Brand");
        roundPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        textFieldAnimation1.setBackground(new java.awt.Color(228, 232, 229));
        textFieldAnimation1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textFieldAnimation1KeyReleased(evt);
            }
        });
        roundPanel2.add(textFieldAnimation1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 330, -1));

        JT_brand.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Brand ID", "Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JT_brand.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JT_brandMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JT_brand);

        roundPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 1230, 790));

        add(roundPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 1290, 1030));
    }// </editor-fold>//GEN-END:initComponents

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        try {
            if (!txt_brandID.getText().equals("")) {
                int deleteBrand = JOptionPane.showConfirmDialog(null, "Do you want to Delete this Brand?", "Select", JOptionPane.YES_NO_OPTION);
                if (deleteBrand == 0) {
                    ResultSet rs = DB.search("select * from brand where brand_id = '" + txt_brandID.getText() + "'");
                    if (rs.next()) {
                        DB.push("update brand set status = '0' where brand_id ='"
                            + txt_brandID.getText() + "'");

                        DB.push("insert into system_activity (detail, date, time, employee) values ("
                            + "'Brand Deleted',CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP(),'" + SystemConfigData.getEmployee() + "')");

                        JOptionPane.showMessageDialog(this, "Brand Delete Successfuly!", "Deleted", JOptionPane.INFORMATION_MESSAGE);
                        //
                        JT_brand.setEnabled(true);
                        log.info("Brand Deleted Successful. Brand : " + txt_brandID.getText() + " | By : " + SystemConfigData.getEmployee());
                        clearFields();
                        loadBrandTable();
                    } else {
                        clearFields();
                        JOptionPane.showMessageDialog(this, "Invalid Brand ID!", "Error", JOptionPane.ERROR_MESSAGE);

                        log.error("Invalid Brand Id");
                    }

                }
            } else {
                JOptionPane.showMessageDialog(this, "Fill the Brand ID!", "Error", JOptionPane.ERROR_MESSAGE);

            }
        } catch (Exception e) {
            log.error("Brand Delete Failed", e);

        }
    }//GEN-LAST:event_deleteActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        try {
            if (!txt_brandID.getText().equals("") && !txt_brandName.getText().equals("")) {
                ResultSet rs = DB.search("select * from brand where brand_id = '" + txt_brandID.getText() + "'");
                if (rs.next()) {

                    String stat = null;
                    if (switchButton.isSelected()) {
                        stat = "1";
                    } else {
                        stat = "0";
                    }

                    DB.push("update brand set  brand_name='"
                        + txt_brandName.getText().toUpperCase() + "'"
                        + ",status='" + stat + "' "
                        + "where brand_id ='"
                        + txt_brandID.getText() + "' ");

                    DB.push("insert into system_activity (detail, date, time, employee) values ("
                        + "'Brand Updated',CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP(),'" + SystemConfigData.getEmployee() + "')");

                    JOptionPane.showMessageDialog(this, "Brand Updated Successfuly!!", "Updated", JOptionPane.INFORMATION_MESSAGE);
                    JT_brand.setEnabled(true);
                    log.info("Brand Updated Successful. Brand : " + txt_brandName.getText() + " | By : " + SystemConfigData.getEmployee());
                    loadBrandTable();
                    clearFields();
                } else {
                    JOptionPane.showMessageDialog(this, "Use SAVE button to Save Details!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Fill All text Inpute!", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            log.error("Brand Update Failed", e);
        }
    }//GEN-LAST:event_updateActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        try {
            ResultSet rs = DB.search("select * from brand where brand_id ='" + txt_brandID.getText() + "' ");
            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Brand ID Already Have. Please use UPDATE button to update Details!", "Error", JOptionPane.ERROR_MESSAGE);

            } else {
                if (!txt_brandID.getText().equals("") && !txt_brandName.getText().equals("")) {
                    String stat = null;
                    if (switchButton.isSelected()) {
                        stat = "1";
                    } else {
                        stat = "0";
                    }

                    DB.push("insert into brand values('"
                        + txt_brandID.getText() + "','"
                        + txt_brandName.getText().toUpperCase() + "'"
                        + ",'" + stat + "')");

                    DB.push("insert into system_activity (detail, date, time, employee) values ("
                        + "'Brand Saved',CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP(),'" + SystemConfigData.getEmployee() + "')");

                    JOptionPane.showMessageDialog(this, "Brand Saved Successfuly!!", "Saved", JOptionPane.INFORMATION_MESSAGE);
                    JT_brand.setEnabled(true);
                    generateBrandID();
                    loadBrandTable();
                    log.info("Brand Saved Successful. Brand : " + txt_brandID.getText() + " | By : " + SystemConfigData.getEmployee());
                    clearFields();
                } else {
                    JOptionPane.showMessageDialog(this, "Fill All text Inpute!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (Exception e) {
            log.error("Brand Save Failed", e);
        }
    }//GEN-LAST:event_saveActionPerformed

    private void clearFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearFieldMouseEntered

    }//GEN-LAST:event_clearFieldMouseEntered

    private void clearFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearFieldMouseClicked
        clearFields();
    }//GEN-LAST:event_clearFieldMouseClicked

    private void textFieldAnimation1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldAnimation1KeyReleased
        DefaultTableModel dtm = (DefaultTableModel) JT_brand.getModel();
        String searchText = textFieldAnimation1.getText();
        TableRowSorter<DefaultTableModel> searchBrand = new TableRowSorter<>(dtm);
        JT_brand.setRowSorter(searchBrand);
        searchBrand.setRowFilter(RowFilter.regexFilter(searchText));
    }//GEN-LAST:event_textFieldAnimation1KeyReleased

    private void JT_brandMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JT_brandMouseClicked
        try {
            DefaultTableModel dtm = (DefaultTableModel) JT_brand.getModel();
            int selectRow = JT_brand.getSelectedRow();

            String brd_id = dtm.getValueAt(selectRow, 0).toString();
            txt_brandID.setText(brd_id);

            ResultSet rs = DB.search("select * from brand where brand_id = '" + brd_id + "'");
            if (rs.next()) {
                txt_brandName.setText(rs.getString("brand_name"));

                String status = (rs.getString("status"));
                if (status.equals("1")) {
                    switchButton.setSelected(true);
                } else {
                    switchButton.setSelected(false);
                }
            }
        } catch (Exception e) {
            log.error("Load Brand Details Failed", e);
        }
    }//GEN-LAST:event_JT_brandMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javaswingdev.swing.table.Table JT_brand;
    private javaswingdev.card.Card card1;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javaswingdev.swing.RoundPanel roundPanel1;
    private javaswingdev.swing.RoundPanel roundPanel2;
    private javax.swing.JButton save;
    private javaswingdev.swing.SwitchButton switchButton;
    private swing.TextFieldAnimation textFieldAnimation1;
    private javax.swing.JTextField txt_brandID;
    private javax.swing.JTextField txt_brandName;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables

    private void generateBrandID() {
        try {
            ResultSet rs = DB.search("select count(*) as brd_count from brand");
            if (rs.next()) {
                int count = rs.getInt("brd_count");
                int c = Integer.parseInt(new SimpleDateFormat("Mddyy").format(new Date()));
                int value = c+(++count);
                String brandid = "BRD-"+value;
                txt_brandID.setText(brandid);
                log.info("Brand ID Loaded");
            }
            txt_brandName.grabFocus();
        } catch (Exception e) {
            log.error("Generate Brand ID Failed", e);
        }
    }

    private void loadBrandTable() {
        try {

            DefaultTableModel dtm = (DefaultTableModel) JT_brand.getModel();
            dtm.setRowCount(0);
            ResultSet rs = DB.search("select * from brand");
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("brand_id"));
                v.add(rs.getString("brand_name"));

                dtm.addRow(v);

            }

        } catch (Exception e) {
            log.error("Load Customer Details Failed", e);
        }
    }

    private void clearFields() {
        txt_brandName.setText(null);
        switchButton.setSelected(false);
        generateBrandID();
    }
}
