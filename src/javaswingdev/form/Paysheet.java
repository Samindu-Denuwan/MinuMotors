package javaswingdev.form;

import com.bike.common.SystemConfigData;
import com.bike.common.SystemVariableList;
import com.bike.db.DB;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import org.apache.log4j.Logger;

public class Paysheet extends javax.swing.JPanel {

    private Logger log;

    public Paysheet() {
        initComponents();
        log = Logger.getLogger("bikeLogger");
        log.info("Manage Paysheet Page Loaded");
        table.fixTable(jScrollPane1);
        generateSalaryID();
        loadTable();
        printBtn.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel1 = new javaswingdev.swing.RoundPanel();
        jLabel6 = new javax.swing.JLabel();
        btnSelect = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        txt_salary_id = new javax.swing.JTextField();
        txt_emp_name = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txt_emp_id = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txt_job_role = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        roundPanel2 = new javaswingdev.swing.RoundPanel();
        card1 = new javaswingdev.card.Card();
        jLabel13 = new javax.swing.JLabel();
        textFieldAnimation1 = new swing.TextFieldAnimation();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javaswingdev.swing.table.Table();
        roundPanel3 = new javaswingdev.swing.RoundPanel();
        printBtn = new javax.swing.JButton();
        clearField1 = new javax.swing.JLabel();
        txt_no_days = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txt_basic = new javax.swing.JTextField();
        txt_allowance = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txt_total = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txt_pfd_8 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txt_epf = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txt_PFtotal = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txt_etf_3 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txt_noPay = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        txt_netsalary = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(228, 232, 229));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel1.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setText("Manage Paysheet");
        roundPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        btnSelect.setBackground(new java.awt.Color(153, 204, 255));
        btnSelect.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSelect.setForeground(new java.awt.Color(0, 102, 204));
        btnSelect.setText("SELECT EMPLOYEE");
        btnSelect.setBorder(null);
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });
        roundPanel1.add(btnSelect, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 390, 35));

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Salary ID");
        roundPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 100, -1));

        txt_salary_id.setEditable(false);
        txt_salary_id.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_salary_id.setForeground(new java.awt.Color(102, 102, 102));
        txt_salary_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_salary_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        roundPanel1.add(txt_salary_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 130, 35));

        txt_emp_name.setEditable(false);
        txt_emp_name.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_emp_name.setForeground(new java.awt.Color(102, 102, 102));
        txt_emp_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_emp_name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        txt_emp_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emp_nameActionPerformed(evt);
            }
        });
        roundPanel1.add(txt_emp_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 390, 35));

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 102, 102));
        jLabel20.setText("Employee Name");
        roundPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        txt_emp_id.setEditable(false);
        txt_emp_id.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_emp_id.setForeground(new java.awt.Color(102, 102, 102));
        txt_emp_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_emp_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        roundPanel1.add(txt_emp_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 140, 35));

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 102, 102));
        jLabel21.setText("Employee ID");
        roundPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 100, -1));

        txt_job_role.setEditable(false);
        txt_job_role.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_job_role.setForeground(new java.awt.Color(102, 102, 102));
        txt_job_role.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_job_role.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        roundPanel1.add(txt_job_role, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 210, 35));

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 102, 102));
        jLabel22.setText("Job Role");
        roundPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 100, -1));

        add(roundPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 430, 350));

        roundPanel2.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        card1.setDescription("");
        card1.setIcon(javaswingdev.GoogleMaterialDesignIcon.SEARCH);
        roundPanel2.add(card1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 60, 50));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel13.setText("Search Salary Details");
        roundPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        textFieldAnimation1.setBackground(new java.awt.Color(228, 232, 229));
        textFieldAnimation1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldAnimation1ActionPerformed(evt);
            }
        });
        textFieldAnimation1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textFieldAnimation1KeyReleased(evt);
            }
        });
        roundPanel2.add(textFieldAnimation1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 330, -1));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Salary ID", "Employee ID", "Net Salary", "Month", "Paid Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
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

        roundPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 1160, 790));

        add(roundPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 1230, 1030));

        roundPanel3.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        printBtn.setBackground(new java.awt.Color(153, 204, 255));
        printBtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        printBtn.setForeground(new java.awt.Color(0, 102, 204));
        printBtn.setText("PRINT");
        printBtn.setBorder(null);
        printBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printBtnActionPerformed(evt);
            }
        });
        roundPanel3.add(printBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 610, 160, 35));

        clearField1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/burger/icon/close_1.png"))); // NOI18N
        clearField1.setText("Clear Fields");
        clearField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearField1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clearField1MouseEntered(evt);
            }
        });
        roundPanel3.add(clearField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 610, 120, 40));

        txt_no_days.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_no_days.setForeground(new java.awt.Color(102, 102, 102));
        txt_no_days.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_no_days.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        txt_no_days.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_no_daysActionPerformed(evt);
            }
        });
        txt_no_days.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_no_daysKeyTyped(evt);
            }
        });
        roundPanel3.add(txt_no_days, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 250, 35));

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 102, 102));
        jLabel23.setText("No. of Days Work");
        roundPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(102, 102, 102));
        jLabel24.setText("Basic Salary - LKR");
        roundPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        txt_basic.setEditable(false);
        txt_basic.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_basic.setForeground(new java.awt.Color(102, 102, 102));
        txt_basic.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_basic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        txt_basic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_basicActionPerformed(evt);
            }
        });
        roundPanel3.add(txt_basic, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 250, 35));

        txt_allowance.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_allowance.setForeground(new java.awt.Color(102, 102, 102));
        txt_allowance.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_allowance.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        txt_allowance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_allowanceActionPerformed(evt);
            }
        });
        txt_allowance.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_allowanceKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_allowanceKeyTyped(evt);
            }
        });
        roundPanel3.add(txt_allowance, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 250, 35));

        jLabel25.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(102, 102, 102));
        jLabel25.setText("Allowances");
        roundPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        txt_total.setEditable(false);
        txt_total.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_total.setForeground(new java.awt.Color(102, 102, 102));
        txt_total.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_total.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        txt_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_totalActionPerformed(evt);
            }
        });
        txt_total.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_totalKeyTyped(evt);
            }
        });
        roundPanel3.add(txt_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 250, 35));

        jLabel27.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(102, 102, 102));
        jLabel27.setText("Provident Fund Deducted (8%)");
        roundPanel3.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        txt_pfd_8.setEditable(false);
        txt_pfd_8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_pfd_8.setForeground(new java.awt.Color(102, 102, 102));
        txt_pfd_8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_pfd_8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        txt_pfd_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pfd_8ActionPerformed(evt);
            }
        });
        roundPanel3.add(txt_pfd_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 150, 35));

        jLabel28.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(102, 102, 102));
        jLabel28.setText("EPF Employer (12%)");
        roundPanel3.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        txt_epf.setEditable(false);
        txt_epf.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_epf.setForeground(new java.awt.Color(102, 102, 102));
        txt_epf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_epf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        txt_epf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_epfActionPerformed(evt);
            }
        });
        roundPanel3.add(txt_epf, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 150, 35));

        jLabel29.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(102, 102, 102));
        jLabel29.setText("Provident Fund Total");
        roundPanel3.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        txt_PFtotal.setEditable(false);
        txt_PFtotal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_PFtotal.setForeground(new java.awt.Color(102, 102, 102));
        txt_PFtotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_PFtotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        txt_PFtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PFtotalActionPerformed(evt);
            }
        });
        roundPanel3.add(txt_PFtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 150, 35));

        jLabel30.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(102, 102, 102));
        jLabel30.setText("ETF (3%)");
        roundPanel3.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, -1));

        txt_etf_3.setEditable(false);
        txt_etf_3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_etf_3.setForeground(new java.awt.Color(102, 102, 102));
        txt_etf_3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_etf_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        txt_etf_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_etf_3ActionPerformed(evt);
            }
        });
        roundPanel3.add(txt_etf_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, 150, 35));

        jLabel31.setBackground(new java.awt.Color(204, 204, 204));
        jLabel31.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(102, 102, 102));
        jLabel31.setOpaque(true);
        roundPanel3.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 390, 2));

        txt_noPay.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_noPay.setForeground(new java.awt.Color(102, 102, 102));
        txt_noPay.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_noPay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        txt_noPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_noPayActionPerformed(evt);
            }
        });
        txt_noPay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_noPayKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_noPayKeyTyped(evt);
            }
        });
        roundPanel3.add(txt_noPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, 150, 35));

        jLabel32.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel32.setText("Net Salary - LKR");
        roundPanel3.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, -1, -1));

        txt_netsalary.setEditable(false);
        txt_netsalary.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        txt_netsalary.setForeground(new java.awt.Color(204, 51, 0));
        txt_netsalary.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_netsalary.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        txt_netsalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_netsalaryActionPerformed(evt);
            }
        });
        roundPanel3.add(txt_netsalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 540, 250, 35));

        jLabel33.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel33.setText("Total");
        roundPanel3.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel34.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(102, 102, 102));
        jLabel34.setText("NO Pay & Other Deductions");
        roundPanel3.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, -1, -1));

        jLabel35.setBackground(new java.awt.Color(204, 204, 204));
        jLabel35.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(102, 102, 102));
        jLabel35.setOpaque(true);
        roundPanel3.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 390, 2));

        jLabel36.setBackground(new java.awt.Color(204, 204, 204));
        jLabel36.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(102, 102, 102));
        jLabel36.setOpaque(true);
        roundPanel3.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 390, 2));

        add(roundPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 430, 670));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
       clearFields();
        PopUpEmpSalary empSalary = new PopUpEmpSalary(Paysheet.this);
        empSalary.setVisible(true);
        txt_no_days.grabFocus();
    }//GEN-LAST:event_btnSelectActionPerformed

    private void textFieldAnimation1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldAnimation1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldAnimation1ActionPerformed

    private void textFieldAnimation1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldAnimation1KeyReleased
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        String searchText = textFieldAnimation1.getText();
        TableRowSorter<DefaultTableModel> searchEmp = new TableRowSorter<>(dtm);
        table.setRowSorter(searchEmp);
        searchEmp.setRowFilter(RowFilter.regexFilter(searchText));
    }//GEN-LAST:event_textFieldAnimation1KeyReleased

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        try {
            DefaultTableModel dtm = (DefaultTableModel) table.getModel();
            int selectRow = table.getSelectedRow();

            String salary_id = dtm.getValueAt(selectRow, 0).toString();
            txt_salary_id.setText(salary_id);

            ResultSet rs3 = DB.search("select * from salary where salary_id = '" + salary_id + "'");
            if (rs3.next()) {
                txt_no_days.setText(rs3.getString("no_of_days"));
                txt_basic.setText(rs3.getString("basic_salary"));
                txt_allowance.setText(rs3.getString("allowance"));
                txt_pfd_8.setText(rs3.getString("pfd_8"));
                txt_epf.setText(rs3.getString("epf_12"));
                txt_PFtotal.setText(rs3.getString("fund_total"));
                txt_etf_3.setText(rs3.getString("etf_3"));
                txt_noPay.setText(rs3.getString("no_pay"));
                txt_netsalary.setText(rs3.getString("netsalary"));
                txt_total.setText(rs3.getString("total"));
            }

            String emp_id = dtm.getValueAt(selectRow, 1).toString();
            txt_emp_id.setText(emp_id);

            ResultSet rs = DB.search("select * from employee where emp_id = '" + emp_id + "'");
            if (rs.next()) {
                txt_emp_name.setText(rs.getString("fname") + " " + rs.getString("lname"));
            }

            String role_id = rs.getString("role_id");
            ResultSet rs2 = DB.search("select * from role where role_id = '" + role_id + "'");
            if (rs2.next()) {
                txt_job_role.setText(rs2.getString("role"));
            }

        } catch (Exception e) {
            log.error("Load Salary Details Failed", e);
        }
    }//GEN-LAST:event_tableMouseClicked

    private void txt_emp_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emp_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emp_nameActionPerformed

    private void printBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printBtnActionPerformed
        try {
            LocalDateTime now = LocalDateTime.now();
            Month month = now.getMonth();
            int Year = now.getYear();

            DB.push("insert into salary values('"
                    + txt_salary_id.getText() + "','"
                    + txt_emp_id.getText() + "','"
                    + Year + "','"
                    + month + "','"
                    + txt_no_days.getText().trim() + "','"
                    + txt_basic.getText().trim() + "','"
                    + txt_allowance.getText().trim() + "','"
                    + txt_total.getText().trim() + "','"
                    + txt_pfd_8.getText().trim() + "','"
                    + txt_epf.getText().trim() + "','"
                    + txt_PFtotal.getText().trim() + "','"
                    + txt_etf_3.getText().trim() + "','"
                    + txt_noPay.getText().trim() + "','"
                    + txt_netsalary.getText().trim() + "',CURRENT_TIMESTAMP())");
            
             DB.push("update basic_salary set stat = '"+month+"-"+Year+"' where emp_id = '"+txt_emp_id.getText()+"' ");

            DB.push("insert into system_activity (detail, date, time, employee) values ("
                    + "'Salary Saved',CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP(),'" + SystemConfigData.getEmployee() + "')");

             print(txt_salary_id.getText());
            log.info("Salary Saved Successful. Salary  : " + txt_salary_id.getText() + " |By : " + SystemConfigData.getEmployee());
            clearFields();
            JOptionPane.showMessageDialog(this, "Product Saved Successfuly!", "Saved", JOptionPane.INFORMATION_MESSAGE);
          
            loadTable();
        } catch (Exception e) {
            log.error("Paysheet Save Failed", e);
        }
    }//GEN-LAST:event_printBtnActionPerformed

    private void clearField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearField1MouseClicked
        clearFields();
    }//GEN-LAST:event_clearField1MouseClicked

    private void clearField1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearField1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_clearField1MouseEntered

    private void txt_no_daysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_no_daysActionPerformed
        if (!txt_emp_id.getText().equals("")) {
            if (!txt_no_days.getText().equals("")) {
                txt_allowance.grabFocus();
            } else {
                JOptionPane.showMessageDialog(this, "Enter No of Days!", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Select Employee First!", "Error", JOptionPane.ERROR_MESSAGE);
            txt_no_days.setText(null);

        }
    }//GEN-LAST:event_txt_no_daysActionPerformed

    private void txt_basicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_basicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_basicActionPerformed

    private void txt_allowanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_allowanceActionPerformed
        if (!txt_emp_id.getText().equals("") && !txt_no_days.getText().equals("")
                && !txt_allowance.getText().equals("")) {
            Double basic = Double.valueOf(txt_basic.getText());
            Double allowance = Double.valueOf(txt_allowance.getText());
            double tot;
            tot = basic + allowance;
            txt_total.setText("" + tot);
            double pfd, EPF, PF_Total, ETF_3, netSalary;
            pfd = tot * 8 / 100;
            txt_pfd_8.setText("" + pfd);
            EPF = tot * 12 / 100;
            txt_epf.setText("" + EPF);
            PF_Total = pfd + EPF;
            txt_PFtotal.setText("" + PF_Total);
            ETF_3 = tot * 3 / 100;
            txt_etf_3.setText("" + ETF_3);
            netSalary = tot - PF_Total - ETF_3;
            txt_netsalary.setText("" + netSalary);
            txt_noPay.grabFocus();
            txt_allowance.setEnabled(false);

        } else {
            JOptionPane.showMessageDialog(this, "Fill All the Inputs!", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_txt_allowanceActionPerformed

    private void txt_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_totalActionPerformed

    private void txt_pfd_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pfd_8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pfd_8ActionPerformed

    private void txt_epfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_epfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_epfActionPerformed

    private void txt_PFtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PFtotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PFtotalActionPerformed

    private void txt_etf_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_etf_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_etf_3ActionPerformed

    private void txt_noPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_noPayActionPerformed
        if (txt_noPay.getText().equals("")) {
            printBtn.grabFocus();
        } else {
            Double total = Double.valueOf(txt_netsalary.getText().trim());
            Double other = Double.valueOf(txt_noPay.getText());
            double netsalary;
            netsalary = total - other;
            txt_netsalary.setText("" + netsalary);

        }

        printBtn.setEnabled(true);
        txt_noPay.setEnabled(false);


    }//GEN-LAST:event_txt_noPayActionPerformed

    private void txt_netsalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_netsalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_netsalaryActionPerformed

    private void txt_no_daysKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_no_daysKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_no_daysKeyTyped

    private void txt_allowanceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_allowanceKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_allowanceKeyTyped

    private void txt_totalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_totalKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_totalKeyTyped

    private void txt_noPayKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_noPayKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_noPayKeyTyped

    private void txt_allowanceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_allowanceKeyPressed

    }//GEN-LAST:event_txt_allowanceKeyPressed

    private void txt_noPayKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_noPayKeyPressed

    }//GEN-LAST:event_txt_noPayKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSelect;
    private javaswingdev.card.Card card1;
    private javax.swing.JLabel clearField1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton printBtn;
    private javaswingdev.swing.RoundPanel roundPanel1;
    private javaswingdev.swing.RoundPanel roundPanel2;
    private javaswingdev.swing.RoundPanel roundPanel3;
    private javaswingdev.swing.table.Table table;
    private swing.TextFieldAnimation textFieldAnimation1;
    private javax.swing.JTextField txt_PFtotal;
    private javax.swing.JTextField txt_allowance;
    public javax.swing.JTextField txt_basic;
    public javax.swing.JTextField txt_emp_id;
    public javax.swing.JTextField txt_emp_name;
    private javax.swing.JTextField txt_epf;
    private javax.swing.JTextField txt_etf_3;
    public javax.swing.JTextField txt_job_role;
    private javax.swing.JTextField txt_netsalary;
    private javax.swing.JTextField txt_noPay;
    private javax.swing.JTextField txt_no_days;
    private javax.swing.JTextField txt_pfd_8;
    private javax.swing.JTextField txt_salary_id;
    private javax.swing.JTextField txt_total;
    // End of variables declaration//GEN-END:variables

    private void clearFields() {
        txt_emp_id.setText(null);
        txt_emp_name.setText(null);
        txt_PFtotal.setText(null);
        txt_allowance.setText(null);
        txt_basic.setText(null);
        txt_epf.setText(null);
        txt_etf_3.setText(null);
        txt_job_role.setText(null);
        txt_netsalary.setText(null);
        txt_noPay.setText(null);
        txt_no_days.setText(null);
        txt_pfd_8.setText(null);
        txt_total.setText(null);
        txt_noPay.setEnabled(true);
        txt_allowance.setEnabled(true);
        printBtn.setEnabled(false);
        generateSalaryID();
    }

    private void generateSalaryID() {
        try {
            ResultSet rs = DB.search("select count(*) as emp_count from salary");
            if (rs.next()) {
                int count = rs.getInt("emp_count");
                int c = Integer.parseInt(new SimpleDateFormat("Mddyy").format(new Date()));
                int value = c + (++count);
                String empid = "SLR-" + value;
                txt_salary_id.setText(empid);
                log.info("Salary ID Loaded");
            }
            btnSelect.grabFocus();
        } catch (Exception e) {
            log.error("Generate Salary ID Failed", e);
        }
    }

    private void loadTable() {
        try {

            DefaultTableModel dtm = (DefaultTableModel) table.getModel();
            dtm.setRowCount(0);
            ResultSet rs = DB.search("select * from salary");
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("salary_id"));
                v.add(rs.getString("emp_id"));
                v.add(rs.getString("netsalary"));
                v.add(rs.getString("month"));
                v.add(rs.getString("date"));
             
                dtm.addRow(v);

            }

        } catch (Exception e) {
            log.error("Load Employee Details Failed", e);
        }
    }


    private void print(String SalaryId) {
              try {
            String path = SystemVariableList.REPORT_BASE_URL + "Paysheet.jasper";
            InputStream inputStream = new FileInputStream(path);
            Map<String, Object> params = new HashMap<>();
            params.put("SalaryId", SalaryId);

            JasperPrint fillReport = JasperFillManager.fillReport(inputStream, params, DB.getDBConnection());
            JasperViewer.viewReport(fillReport, false);
            JasperExportManager.exportReportToPdfFile(fillReport, "F:\\2023\\FINAL PROJECT\\SERVICE REPORTS\\Paysheet\\" + SalaryId + ".pdf");

             log.info("Paysheet Print Successful. ");
        } catch (Exception e) {
           log.error("Paysheet print Failed", e);
        }
   }

}
