
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


public class Category extends javax.swing.JPanel {
    
   private Logger log;
 
    public Category() {
        initComponents();
        log = Logger.getLogger("bikeLogger");
        log.info("Category Registration Page Loaded");
        JT_category.fixTable(jScrollPane1);
        generateCateID();
        loadCateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel1 = new javaswingdev.swing.RoundPanel();
        jLabel6 = new javax.swing.JLabel();
        delete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_cate_id = new javax.swing.JTextField();
        txt_cate_name = new javax.swing.JTextField();
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
        JT_category = new javaswingdev.swing.table.Table();

        setBackground(new java.awt.Color(228, 232, 229));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel1.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setText("Category Registration");
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
        jLabel2.setText("Category  ID");
        roundPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        txt_cate_id.setEditable(false);
        txt_cate_id.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_cate_id.setForeground(new java.awt.Color(102, 102, 102));
        txt_cate_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_cate_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        roundPanel1.add(txt_cate_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 340, 35));

        txt_cate_name.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_cate_name.setForeground(new java.awt.Color(102, 102, 102));
        txt_cate_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_cate_name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        roundPanel1.add(txt_cate_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 340, 35));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Category Name");
        roundPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        save.setBackground(new java.awt.Color(153, 204, 255));
        save.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        save.setForeground(new java.awt.Color(0, 102, 204));
        save.setText("SAVE CATEGORY");
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
        jLabel7.setText("After that you can save the category to system.");
        roundPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 700, 320, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Fill all these fields then click SAVE CATEGORY button, ");
        roundPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 680, 320, -1));

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("UPDATE or DELETE category.");
        roundPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 770, 320, -1));

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("Double-Click to select category using this table.");
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
        roundPanel1.add(clearField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 120, 40));

        add(roundPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 380, 1030));

        roundPanel2.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        card1.setDescription("");
        card1.setIcon(javaswingdev.GoogleMaterialDesignIcon.SEARCH);
        roundPanel2.add(card1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 60, 50));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel13.setText("Search Category");
        roundPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        textFieldAnimation1.setBackground(new java.awt.Color(228, 232, 229));
        textFieldAnimation1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textFieldAnimation1KeyReleased(evt);
            }
        });
        roundPanel2.add(textFieldAnimation1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 330, -1));

        JT_category.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Category ID", "Category"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JT_category.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JT_categoryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JT_category);

        roundPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 1240, 770));

        add(roundPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 1280, 1030));
    }// </editor-fold>//GEN-END:initComponents

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
         try {
          if (!txt_cate_id.getText().equals("")) {
                int deleteBrand = JOptionPane.showConfirmDialog(null, "Do you want to Delete this Category?", "Select", JOptionPane.YES_NO_OPTION);
                if (deleteBrand == 0) {
                    ResultSet rs = DB.search("select * from item_category where category_id = '" + txt_cate_id.getText() + "'");
                    if (rs.next()) {
                        DB.push("update item_category set stat = '0' where category_id ='"
                                + txt_cate_id.getText() + "'");

                        DB.push("insert into system_activity (detail, date, time, employee) values ("
                                + "'Category Deleted',CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP(),'" + SystemConfigData.getEmployee() + "')");
          
                        JOptionPane.showMessageDialog(this, "Category Delete Successfuly!", "Deleted", JOptionPane.INFORMATION_MESSAGE);

                        log.info("Category Deleted Successful. Category : " + txt_cate_id.getText() + " | By : " + SystemConfigData.getEmployee());
                        clearFields();
                        loadCateTable();
                    } else {
                        clearFields();
                        JOptionPane.showMessageDialog(this, "Invalid Category ID!", "Error", JOptionPane.ERROR_MESSAGE);

                        log.error("Invalid Category Id");
                    }

                }
            } else {
                JOptionPane.showMessageDialog(this, "Fill the Category ID!", "Error", JOptionPane.ERROR_MESSAGE);

            }  
        } catch (Exception e) {
             log.error("Category Delete Failed", e);
            
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
             try {
            ResultSet rs = DB.search("select * from item_category where category_id ='" + txt_cate_id.getText() + "' ");
            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Category ID Already Have. Please use UPDATE button to update Details!", "Error", JOptionPane.ERROR_MESSAGE);

            } else {
                if (!txt_cate_id.getText().equals("") && !txt_cate_name.getText().equals("")) {
                    String stat = null;
                    if (switchButton.isSelected()) {
                        stat = "1";
                    } else {
                        stat = "0";
                    }

                    DB.push("insert into item_category values('"
                            + txt_cate_id.getText() + "','"
                            + txt_cate_name.getText() + "'"
                            + ",'" + stat + "')");

                    DB.push("insert into system_activity (detail, date, time, employee) values ("
                            + "'Category Saved',CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP(),'" + SystemConfigData.getEmployee() + "')");

                    JOptionPane.showMessageDialog(this, "Category Saved Successfuly!!", "Saved", JOptionPane.INFORMATION_MESSAGE);
                    
                    generateCateID();
                    loadCateTable();
                    log.info("Category Saved Successful. Category : " + txt_cate_id.getText() + " | By : " + SystemConfigData.getEmployee());
                    clearFields();
                } else {
                    JOptionPane.showMessageDialog(this, "Fill All text Inpute!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (Exception e) {
            log.error("Category Save Failed", e);
        }
    }//GEN-LAST:event_saveActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
         try {
            if (!txt_cate_id.getText().equals("") && !txt_cate_name.getText().equals("")) {
                ResultSet rs = DB.search("select * from item_category where category_id = '" + txt_cate_id.getText() + "'");
                if (rs.next()) {

                    String stat = null;
                    if (switchButton.isSelected()) {
                        stat = "1";
                    } else {
                        stat = "0";
                    }

                    DB.push("update item_category set  category='"
                            + txt_cate_name.getText() + "'"
                            + ",stat='" + stat + "' "
                            + "where category_id ='"
                            + txt_cate_id.getText() + "' ");

                    DB.push("insert into system_activity (detail, date, time, employee) values ("
                            + "'Category Updated',CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP(),'" + SystemConfigData.getEmployee() + "')");

                    JOptionPane.showMessageDialog(this, "Category Updated Successfuly!!", "Updated", JOptionPane.INFORMATION_MESSAGE);
                    
                    log.info("Category Updated Successful. Category : " + txt_cate_name.getText() + " | By : " + SystemConfigData.getEmployee());
                    loadCateTable();
                    clearFields();
                } else {
                    JOptionPane.showMessageDialog(this, "Use SAVE button to Save Details!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Fill All text Inpute!", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            log.error("Category Update Failed", e);
        }
    }//GEN-LAST:event_updateActionPerformed

    private void clearFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearFieldMouseClicked
        clearFields();
    }//GEN-LAST:event_clearFieldMouseClicked

    private void clearFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearFieldMouseEntered

    }//GEN-LAST:event_clearFieldMouseEntered

    private void textFieldAnimation1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldAnimation1KeyReleased
        DefaultTableModel dtm = (DefaultTableModel) JT_category.getModel();
        String searchText = textFieldAnimation1.getText();
        TableRowSorter<DefaultTableModel> searchCate = new TableRowSorter<>(dtm);
        JT_category.setRowSorter(searchCate);
        searchCate.setRowFilter(RowFilter.regexFilter(searchText));
    }//GEN-LAST:event_textFieldAnimation1KeyReleased

    private void JT_categoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JT_categoryMouseClicked
          try {
            DefaultTableModel dtm = (DefaultTableModel) JT_category.getModel();
            int selectRow = JT_category.getSelectedRow();

            String cat_id = dtm.getValueAt(selectRow, 0).toString();
            txt_cate_id.setText(cat_id);

            ResultSet rs = DB.search("select * from item_category where category_id = '" + cat_id+ "'");
            if (rs.next()) {
                txt_cate_name.setText(rs.getString("category"));

                String status = (rs.getString("stat"));
                if (status.equals("1")) {
                    switchButton.setSelected(true);
                } else {
                    switchButton.setSelected(false);
                }
            }
        } catch (Exception e) {
            log.error("Load Category Details Failed", e);
        }
    }//GEN-LAST:event_JT_categoryMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javaswingdev.swing.table.Table JT_category;
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
    private javax.swing.JTextField txt_cate_id;
    private javax.swing.JTextField txt_cate_name;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables

    private void clearFields() {
        txt_cate_name.setText(null);
        switchButton.setSelected(false);
        generateCateID();
    }

    private void generateCateID() {
            try {
            ResultSet rs = DB.search("select count(*) as cat_count from item_category");
            if (rs.next()) {
                int count = rs.getInt("cat_count");
                int c = Integer.parseInt(new SimpleDateFormat("Mddyy").format(new Date()));
                int value = c+(++count);
                String cateid = "CAT-"+value;
                txt_cate_id.setText(cateid);
                log.info("Category ID Loaded");
            }
            txt_cate_name.grabFocus();
        } catch (Exception e) {
            log.error("Generate Category ID Failed", e);
        }
   }

    private void loadCateTable() {
           try {

            DefaultTableModel dtm = (DefaultTableModel) JT_category.getModel();
            dtm.setRowCount(0);
            ResultSet rs = DB.search("select * from item_category");
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("category_id"));
                v.add(rs.getString("category"));

                dtm.addRow(v);

            }

        } catch (Exception e) {
            log.error("Load category Details Failed", e);
        }
    }
}