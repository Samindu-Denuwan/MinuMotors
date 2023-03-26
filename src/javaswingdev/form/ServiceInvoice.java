package javaswingdev.form;

import com.bike.common.SystemConfigData;
import com.bike.common.SystemVariableList;
import com.bike.db.DB;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import org.apache.log4j.Logger;

public class ServiceInvoice extends javax.swing.JPanel {

    private Logger log;

    public ServiceInvoice() {
        initComponents();
        log = Logger.getLogger("bikeLogger");
        log.info("Service Invoice Page Loaded");
        JT_service.fixTable(jScrollPane1);
        disableFields();

        generateServInvID();
        loadServType();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel1 = new javaswingdev.swing.RoundPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_bike_id = new javax.swing.JTextField();
        txt_bike_brand = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_bike_model = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_bike_customer_id = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_bike_cus_name = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_bike_mobile = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnSelectBike = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txt_ser_inv = new javax.swing.JTextField();
        roundPanel2 = new javaswingdev.swing.RoundPanel();
        addBtn = new javax.swing.JButton();
        card1 = new javaswingdev.card.Card();
        jLabel18 = new javax.swing.JLabel();
        txt_mechanic = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_total = new javax.swing.JTextField();
        btnMechanic = new javax.swing.JButton();
        txt_discount = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txt_netTotal = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txt_payment = new javax.swing.JTextField();
        txt_balance = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        comboService = new combobox.Combobox();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JT_service = new javaswingdev.swing.table.Table();
        clearField = new javax.swing.JLabel();
        txt_amount = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        save = new javax.swing.JButton();

        setBackground(new java.awt.Color(228, 232, 229));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel1.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setText("Service Invoice");
        roundPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Bike ID");
        roundPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        txt_bike_id.setEditable(false);
        txt_bike_id.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_bike_id.setForeground(new java.awt.Color(102, 102, 102));
        txt_bike_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_bike_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        roundPanel1.add(txt_bike_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 340, 35));

        txt_bike_brand.setEditable(false);
        txt_bike_brand.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_bike_brand.setForeground(new java.awt.Color(102, 102, 102));
        txt_bike_brand.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_bike_brand.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        roundPanel1.add(txt_bike_brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 340, 35));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Brand");
        roundPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        txt_bike_model.setEditable(false);
        txt_bike_model.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_bike_model.setForeground(new java.awt.Color(102, 102, 102));
        txt_bike_model.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_bike_model.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        roundPanel1.add(txt_bike_model, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 340, 35));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Model");
        roundPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        txt_bike_customer_id.setEditable(false);
        txt_bike_customer_id.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_bike_customer_id.setForeground(new java.awt.Color(102, 102, 102));
        txt_bike_customer_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_bike_customer_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        roundPanel1.add(txt_bike_customer_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 340, 35));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Mobile No");
        roundPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 680, -1, -1));

        txt_bike_cus_name.setEditable(false);
        txt_bike_cus_name.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_bike_cus_name.setForeground(new java.awt.Color(102, 102, 102));
        txt_bike_cus_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_bike_cus_name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        roundPanel1.add(txt_bike_cus_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, 340, 35));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Customer Name");
        roundPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, -1, -1));

        txt_bike_mobile.setEditable(false);
        txt_bike_mobile.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_bike_mobile.setForeground(new java.awt.Color(102, 102, 102));
        txt_bike_mobile.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_bike_mobile.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        roundPanel1.add(txt_bike_mobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 710, 340, 35));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Customer ID");
        roundPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, -1, -1));

        btnSelectBike.setBackground(new java.awt.Color(153, 204, 255));
        btnSelectBike.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSelectBike.setForeground(new java.awt.Color(0, 102, 204));
        btnSelectBike.setText("SELECT BIKE");
        btnSelectBike.setBorder(null);
        btnSelectBike.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectBikeActionPerformed(evt);
            }
        });
        roundPanel1.add(btnSelectBike, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 340, 35));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Service Invoice No");
        roundPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        txt_ser_inv.setEditable(false);
        txt_ser_inv.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_ser_inv.setForeground(new java.awt.Color(102, 102, 102));
        txt_ser_inv.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_ser_inv.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        roundPanel1.add(txt_ser_inv, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 340, 35));

        add(roundPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 380, 1030));

        roundPanel2.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addBtn.setBackground(new java.awt.Color(153, 204, 255));
        addBtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        addBtn.setForeground(new java.awt.Color(0, 102, 204));
        addBtn.setText("Add to Invoice");
        addBtn.setBorder(null);
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        roundPanel2.add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 180, 190, 35));

        card1.setDescription("");
        roundPanel2.add(card1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 60, 50));

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setText("Employee ID");
        roundPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        txt_mechanic.setEditable(false);
        txt_mechanic.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_mechanic.setForeground(new java.awt.Color(102, 102, 102));
        txt_mechanic.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_mechanic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        roundPanel2.add(txt_mechanic, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 250, 35));

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setText("Total");
        roundPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 780, -1, -1));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel13.setText("Add");
        roundPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        txt_total.setEditable(false);
        txt_total.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_total.setForeground(new java.awt.Color(102, 102, 102));
        txt_total.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        roundPanel2.add(txt_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 820, 280, 35));

        btnMechanic.setBackground(new java.awt.Color(153, 204, 255));
        btnMechanic.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnMechanic.setForeground(new java.awt.Color(0, 102, 204));
        btnMechanic.setText("ASSIGN  MECHANIC");
        btnMechanic.setBorder(null);
        btnMechanic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMechanicActionPerformed(evt);
            }
        });
        roundPanel2.add(btnMechanic, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 180, 35));

        txt_discount.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_discount.setForeground(new java.awt.Color(102, 102, 102));
        txt_discount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        txt_discount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_discountActionPerformed(evt);
            }
        });
        txt_discount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_discountKeyTyped(evt);
            }
        });
        roundPanel2.add(txt_discount, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 820, 150, 35));

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 102, 102));
        jLabel23.setText("LKR");
        roundPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 830, -1, -1));

        txt_netTotal.setEditable(false);
        txt_netTotal.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        txt_netTotal.setForeground(new java.awt.Color(102, 102, 102));
        txt_netTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        txt_netTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_netTotalActionPerformed(evt);
            }
        });
        roundPanel2.add(txt_netTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 800, 270, 80));

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(204, 0, 0));
        jLabel24.setText("Net Total");
        roundPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 820, -1, -1));

        jLabel25.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(102, 102, 102));
        jLabel25.setText("Payment");
        roundPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 890, -1, -1));

        txt_payment.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_payment.setForeground(new java.awt.Color(102, 102, 102));
        txt_payment.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        txt_payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_paymentActionPerformed(evt);
            }
        });
        txt_payment.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_paymentKeyTyped(evt);
            }
        });
        roundPanel2.add(txt_payment, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 920, 280, 35));

        txt_balance.setEditable(false);
        txt_balance.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_balance.setForeground(new java.awt.Color(102, 102, 102));
        txt_balance.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        txt_balance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_balanceActionPerformed(evt);
            }
        });
        roundPanel2.add(txt_balance, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 920, 300, 35));

        jLabel26.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(102, 102, 102));
        jLabel26.setText("Balance");
        roundPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 890, 110, -1));

        jLabel27.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(102, 102, 102));
        jLabel27.setText("Discount");
        roundPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 790, -1, -1));

        comboService.setBorder(null);
        comboService.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        comboService.setLabeText("");
        comboService.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboServiceItemStateChanged(evt);
            }
        });
        roundPanel2.add(comboService, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, 340, 40));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Select Service Type");
        roundPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, -1, -1));

        JT_service.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bike ID", "Customer Name", "Service Type", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JT_service.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JT_serviceMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JT_service);

        roundPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 1220, 460));

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
        roundPanel2.add(clearField, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 180, 120, 40));

        txt_amount.setEditable(false);
        txt_amount.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_amount.setForeground(new java.awt.Color(102, 102, 102));
        txt_amount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_amount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        roundPanel2.add(txt_amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 60, 250, 35));

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 102, 102));
        jLabel20.setText("Service Amount");
        roundPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 30, -1, -1));

        save.setBackground(new java.awt.Color(153, 204, 255));
        save.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        save.setForeground(new java.awt.Color(0, 102, 204));
        save.setText("SAVE AND PRINT");
        save.setBorder(null);
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        roundPanel2.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 950, 190, 35));

        add(roundPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 1280, 1030));
    }// </editor-fold>//GEN-END:initComponents

    private void btnMechanicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMechanicActionPerformed
        PopUpMechanics mechanics = new PopUpMechanics(ServiceInvoice.this);
        mechanics.setVisible(true);
        addBtn.setEnabled(true);
        comboService.setEnabled(true);
        btnSelectBike.setEnabled(false);
    }//GEN-LAST:event_btnMechanicActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        txt_total.setEnabled(true);
        txt_balance.setEnabled(true);
        txt_discount.setEnabled(true);
         txt_discount.setText("0");
        txt_netTotal.setEnabled(true);
        txt_payment.setEnabled(true);
        

        int combo = comboService.getSelectedIndex();
        String type = comboService.getSelectedItem().toString();

        if (!txt_bike_id.getText().equals("") && !txt_mechanic.getText().equals("")) {
            if (combo != (-1)) {
                DefaultTableModel dtm = (DefaultTableModel) JT_service.getModel();
                Vector v = new Vector();
                v.add(txt_bike_id.getText());
                v.add(txt_bike_cus_name.getText());
                v.add(type);
                v.add(txt_amount.getText());
                dtm.addRow(v);
                txt_total.setText(txt_amount.getText());
                txt_discount.grabFocus();
                addBtn.setEnabled(false);
                comboService.setEnabled(false);

            } else {
                JOptionPane.showMessageDialog(this, "Select Service Type", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Fill All text Inpute!", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_addBtnActionPerformed

    private void btnSelectBikeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectBikeActionPerformed
        BikeServicePopUp popUp = new BikeServicePopUp(ServiceInvoice.this);
        popUp.setVisible(true);
        btnMechanic.setEnabled(true);
    }//GEN-LAST:event_btnSelectBikeActionPerformed

    private void txt_netTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_netTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_netTotalActionPerformed

    private void clearFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearFieldMouseClicked
        clearFields();
    }//GEN-LAST:event_clearFieldMouseClicked

    private void clearFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearFieldMouseEntered

    }//GEN-LAST:event_clearFieldMouseEntered

    private void comboServiceItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboServiceItemStateChanged
        int combo = comboService.getSelectedIndex();
        if (combo != (-1)) {
            String type = comboService.getSelectedItem().toString();
            try {
                ResultSet rs = DB.search("select * from service_type where service_name = '" + type + "'");
                if (rs.next()) {
                    String amount = (rs.getString("amount"));
                    txt_amount.setText(amount);
                }
            } catch (Exception e) {
                log.error("Service TypeAmount load Failed", e);
            }
        }
    }//GEN-LAST:event_comboServiceItemStateChanged

    private void txt_discountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_discountKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_discountKeyTyped

    private void txt_discountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_discountActionPerformed
        if (txt_discount.getText() != null && !txt_discount.getText().trim().equals("")) {
            double discount = Double.parseDouble(txt_discount.getText());
            double total = Double.parseDouble(txt_total.getText());
            if (discount < 1000) {
                txt_netTotal.setText("" + (total - discount));
            } else {
                JOptionPane.showMessageDialog(this, "This Amount not eligible for Discount!", "Error", JOptionPane.ERROR_MESSAGE);

                txt_discount.setText("0");
                txt_netTotal.setText("" + total);
            }
            txt_payment.grabFocus();
        }
    }//GEN-LAST:event_txt_discountActionPerformed

    private void JT_serviceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JT_serviceMouseClicked
        DefaultTableModel model = (DefaultTableModel) JT_service.getModel();
        try {
            int selectRow = JT_service.getSelectedRow();
            model.removeRow(selectRow);
            comboService.setEnabled(true);
            disableFields();
            addBtn.setEnabled(true);
        } catch (Exception e) {
            log.error("Remove Row Failed", e);
        }
    }//GEN-LAST:event_JT_serviceMouseClicked

    private void txt_paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_paymentActionPerformed
        if (txt_payment.getText() != null && !txt_payment.getText().trim().equals("")) {
            double payment = Double.parseDouble(txt_payment.getText());
            double netTotal = Double.parseDouble(txt_netTotal.getText());
            if (payment >= netTotal) {
                txt_balance.setText("" + (payment - netTotal));
                txt_balance.grabFocus();
                save.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(this, "Payment not Enough!", "Error", JOptionPane.ERROR_MESSAGE);

                txt_payment.setText(" ");
                txt_payment.grabFocus();
            }
        }
    }//GEN-LAST:event_txt_paymentActionPerformed

    private void txt_balanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_balanceActionPerformed

    }//GEN-LAST:event_txt_balanceActionPerformed

    private void txt_paymentKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_paymentKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_paymentKeyTyped

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed

        try {
            String type = comboService.getSelectedItem().toString();
            ResultSet rs2 = DB.search("select * from service_type where service_name = '" + type + "'");
            if (rs2.next()) {
                String typeId = (rs2.getString("service_id"));
                DB.push("insert into service_invoice values('"
                        + txt_ser_inv.getText() + "','"
                        + txt_bike_customer_id.getText() + "','"
                        + txt_bike_id.getText() + "','"
                         + typeId + "','"
                        + txt_amount.getText() + "','"
                        + txt_total.getText() + "','"
                        + txt_discount.getText() + "','"
                        + txt_netTotal.getText() + "','"
                        + txt_payment.getText() + "','"
                        + txt_balance.getText() + "',CURRENT_TIMESTAMP(),'"
                        + txt_mechanic.getText() + "','"
                        + SystemConfigData.getEmployee() + "')");
                
                loadAllTotal(txt_netTotal.getText());

                JOptionPane.showMessageDialog(this, "Invoice Saved!", "Saved", JOptionPane.INFORMATION_MESSAGE);
                log.info("Service Invoice Saved Successful. Service Invoice : " + txt_ser_inv.getText() + " | By : " + SystemConfigData.getEmployee());
                printInv(txt_ser_inv.getText());
                DB.push("insert into system_activity (detail, date, time, employee) values ("
                        + "'Create Service Invoice',CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP(),'" + SystemConfigData.getEmployee() + "')");
                //printInvoice(txt_ser_inv.getText());
                createNewInvoice();
                btnSelectBike.setEnabled(true);
            }
        } catch (Exception e) {
            log.error("Invoice save Failed", e);
        }
    }//GEN-LAST:event_saveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javaswingdev.swing.table.Table JT_service;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton btnMechanic;
    private javax.swing.JButton btnSelectBike;
    private javaswingdev.card.Card card1;
    private javax.swing.JLabel clearField;
    private combobox.Combobox comboService;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
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
    public javax.swing.JTextField txt_amount;
    private javax.swing.JTextField txt_balance;
    public javax.swing.JTextField txt_bike_brand;
    public javax.swing.JTextField txt_bike_cus_name;
    public javax.swing.JTextField txt_bike_customer_id;
    public javax.swing.JTextField txt_bike_id;
    public javax.swing.JTextField txt_bike_mobile;
    public javax.swing.JTextField txt_bike_model;
    private javax.swing.JTextField txt_discount;
    public javax.swing.JTextField txt_mechanic;
    private javax.swing.JTextField txt_netTotal;
    private javax.swing.JTextField txt_payment;
    public javax.swing.JTextField txt_ser_inv;
    private javax.swing.JTextField txt_total;
    // End of variables declaration//GEN-END:variables

    private void generateServInvID() {

        try {
            ResultSet rs = DB.search("select count(*) as pro_count from service_invoice");
            if (rs.next()) {
                int count = rs.getInt("pro_count");
                int c = Integer.parseInt(new SimpleDateFormat("Mddyy").format(new Date()));
                int value = c + (++count);
                String Invid = "SIV-" + value;
                txt_ser_inv.setText(Invid);
                log.info("Service Invoice ID Loaded");
            }
            btnSelectBike.grabFocus();
        } catch (Exception e) {
            log.error("Generate Service Invoice ID Failed", e);
        }

    }

    private void loadServType() {
        try {
            ResultSet resultSet = DB.search("select * from service_type");
            Vector v = new Vector();
            while (resultSet.next()) {
                String data = resultSet.getString("service_name");
                v.add(data);
            }
            comboService.setModel(new DefaultComboBoxModel(v));
            comboService.setSelectedIndex(-1);

        } catch (Exception e) {
            log.error("Service Type  Load Failed", e);
        }

    }

    private void clearFields() {
        disableFields();
        txt_total.setText(null);
        txt_balance.setText(null);
        txt_bike_brand.setText(null);
        txt_bike_cus_name.setText(null);
        txt_bike_customer_id.setText(null);
        txt_bike_id.setText(null);
        txt_bike_mobile.setText(null);
        txt_bike_model.setText(null);
        txt_discount.setText(null);
        txt_mechanic.setText(null);
        txt_netTotal.setText(null);
        txt_payment.setText(null);
        txt_total.setText(null);
        txt_amount.setText(null);
        comboService.setSelectedIndex(-1);
         DefaultTableModel dtm = (DefaultTableModel) JT_service.getModel();
        dtm.setRowCount(0);

    }

    private void disableFields() {
        txt_total.setEnabled(false);
        txt_balance.setEnabled(false);
        txt_discount.setEnabled(false);
        txt_netTotal.setEnabled(false);
        txt_payment.setEnabled(false);
        btnMechanic.setEnabled(false);
        addBtn.setEnabled(false);
        save.setEnabled(false);

    }

    private void createNewInvoice() {
        DefaultTableModel dtm = (DefaultTableModel) JT_service.getModel();
        dtm.setRowCount(0);
        clearFields();
        txt_total.setText(null);
        txt_balance.setText(null);
        txt_discount.setText(null);
        txt_netTotal.setText(null);
        txt_payment.setText(null);
        generateServInvID();
    }

    private void printInv(String ServiceInv) {
            try {
            String path = SystemVariableList.REPORT_BASE_URL + "ServiceInv.jasper";
            InputStream inputStream = new FileInputStream(path);
            Map<String, Object> params = new HashMap<>();
            params.put("ServiceInv", ServiceInv);

            JasperPrint fillReport = JasperFillManager.fillReport(inputStream, params, DB.getDBConnection());
            JasperViewer.viewReport(fillReport, false);
            JasperExportManager.exportReportToPdfFile(fillReport, "F:\\2023\\FINAL PROJECT\\SERVICE REPORTS\\SERVICE INV REPORTS\\" + ServiceInv + ".pdf");

             log.info("Service Invoice Print Successful. ");
        } catch (Exception e) {
           log.error("Service Invoice print Failed", e);
        }
    }

    private void loadAllTotal(String total) {
         LocalDate date = java.time.LocalDate.now();
         Double nettotal = Double.valueOf(total);
           try {
            ResultSet rs = DB.search("select * from total_services where date = '"+date+"'");
           
            if (rs.next()) {
                DB.push("update total_services set total = total+'" + nettotal + "' where date = '"+date+"'");
                log.info("Service Sales update Successful."+"'"+date+"','"+nettotal+"'");
            }else{
              DB.push("insert into total_services values('"+date+"','" + nettotal + "')");
              log.info("Service Sales Save Successful."+"'"+date+"','"+nettotal+"'");
            }
        
        } catch (Exception e) {
            log.error("Service Sales save Failed", e);
        }
    }
    

}
