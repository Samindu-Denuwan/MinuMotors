package javaswingdev.form;

import com.bike.chart.ModelChart;
import com.bike.chart.ModelPieChart;
import com.bike.common.SystemConfigData;
import com.bike.db.DB;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.RowFilter;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.apache.log4j.Logger;
import scrollbar.ScrollBarCustom;

public class DashboardViewCashier extends javax.swing.JPanel {

    private Logger log;

    public DashboardViewCashier() {
        initComponents();
        log = Logger.getLogger("bikeLogger");
        log.info("Dashboard View Page Loaded");
        loadChart();
        loadUser();
        loadPieChart();
        table.fixTable(jScrollPane1);
        scroll.setVerticalScrollBar(new ScrollBarCustom());
        ScrollBarCustom sp = new ScrollBarCustom();
        sp.setOrientation(JScrollBar.HORIZONTAL);
        scroll.setHorizontalScrollBar(sp);
        loadTable();
        init();
        showDate();
        showTime();

    }

    private void init() {
        LocalDate date = java.time.LocalDate.now();
        //total Income
        try {
            ResultSet rs = DB.search("select * from sales where date = '" + date + "'");
            if (rs.next()) {
                String total = rs.getString("total");
                card1.setValues("LKR " + total);
                card1.setDescription("TODAY SALES");
            } else {
                card1.setValues("0");
                card1.setDescription("TODAY SALES");
            }

        } catch (Exception e) {
            log.error("Today sales Failed", e);
        }

        //total services
        try {
            ResultSet rs3 = DB.search("select * from total_services where date = '" + date + "'");
            if (rs3.next()) {
                String total = rs3.getString("total");
                card2.setValues("LKR " + total);
                card2.setDescription("TODAY SERVICES INCOME");
            } else {
                card2.setValues("0");
                card2.setDescription("TODAY SERVICES INCOME");
            }

        } catch (Exception e) {
            log.error("Today sales Failed", e);
        }

        //low stock
        try {
            ResultSet rs2 = DB.search("select count(*) as stk_count from stock where quantity <= 10 && status =1");
            if (rs2.next()) {
                int count = rs2.getInt("stk_count");
                card3.setValues("" + count);
                card3.setDescription("LOW PRODUCT COUNT");
            }

        } catch (Exception e) {
            log.error("low stock count generate Failed", e);
        }

        //All products
//        String pro_count = checkStock1.viewCount.getText().trim();
//        card2.setValues(""+pro_count);
//        card2.setDescription("ALL PRODUCTS");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel5 = new javaswingdev.swing.RoundPanel();
        lbl_date = new javax.swing.JLabel();
        lbl_time = new javax.swing.JLabel();
        card4 = new javaswingdev.card.Card();
        roundPanel1 = new javaswingdev.swing.RoundPanel();
        scroll = new javax.swing.JScrollPane();
        chart1 = new com.bike.chart.Chart();
        jLabel5 = new javax.swing.JLabel();
        roundPanel2 = new javaswingdev.swing.RoundPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javaswingdev.swing.table.Table();
        jLabel4 = new javax.swing.JLabel();
        card1 = new javaswingdev.card.Card();
        card2 = new javaswingdev.card.Card();
        card3 = new javaswingdev.card.Card();
        roundPanel3 = new javaswingdev.swing.RoundPanel();
        pieChart1 = new com.bike.chart.PieChart();
        jLabel3 = new javax.swing.JLabel();
        roundPanel4 = new javaswingdev.swing.RoundPanel();
        lbl_username = new javax.swing.JLabel();
        imageAvatar1 = new swing.ImageAvatar();
        jLabel1 = new javax.swing.JLabel();
        lbl_type = new javax.swing.JLabel();

        setBackground(new java.awt.Color(228, 232, 229));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel5.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        roundPanel5.setRound(10);
        roundPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_date.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_date.setForeground(new java.awt.Color(102, 102, 102));
        lbl_date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_date.setText("2023-03-10");
        roundPanel5.add(lbl_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 160, 40));

        lbl_time.setFont(new java.awt.Font("Segoe UI", 1, 70)); // NOI18N
        lbl_time.setForeground(new java.awt.Color(102, 102, 102));
        lbl_time.setText("00-00-00");
        roundPanel5.add(lbl_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 310, 80));

        card4.setDescription("");
        card4.setIcon(javaswingdev.GoogleMaterialDesignIcon.TODAY);
        roundPanel5.add(card4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 50));

        add(roundPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 520, 170));

        roundPanel1.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scroll.setBorder(null);
        scroll.setViewportView(chart1);

        roundPanel1.add(scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 890, 430));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("DAILY INCOME");
        roundPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        add(roundPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 930, 480));

        roundPanel2.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Invoice ID", "Customer", "Date", "Nettotal", "Isssued By"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
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

        roundPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 660, 790));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("ALL INVOICES");
        roundPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        add(roundPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 170, 690, 860));

        card1.setColor1(new java.awt.Color(153, 255, 153));
        card1.setColor2(new java.awt.Color(0, 153, 51));
        card1.setDescription("TODAY SALES");
        card1.setIcon(javaswingdev.GoogleMaterialDesignIcon.MONETIZATION_ON);
        card1.setValues("LKR");
        add(card1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 520, -1));

        card2.setColor1(new java.awt.Color(95, 211, 226));
        card2.setColor2(new java.awt.Color(26, 166, 170));
        card2.setDescription("TODAY SERVICES INCOME");
        card2.setIcon(javaswingdev.GoogleMaterialDesignIcon.RECEIPT);
        card2.setValues("COUNT");
        add(card2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 520, -1));

        card3.setColor1(new java.awt.Color(255, 204, 204));
        card3.setColor2(new java.awt.Color(204, 0, 0));
        card3.setDescription("LOW STOCK");
        card3.setIcon(javaswingdev.GoogleMaterialDesignIcon.WARNING);
        card3.setValues("COUNT");
        add(card3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 20, 520, -1));

        roundPanel3.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        roundPanel3.setRound(10);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("PRODUCT OVERVIEW");

        javax.swing.GroupLayout roundPanel3Layout = new javax.swing.GroupLayout(roundPanel3);
        roundPanel3.setLayout(roundPanel3Layout);
        roundPanel3Layout.setHorizontalGroup(
            roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(pieChart1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(roundPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 184, Short.MAX_VALUE)))
                .addContainerGap())
        );
        roundPanel3Layout.setVerticalGroup(
            roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pieChart1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        add(roundPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, 390, -1));

        roundPanel4.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        roundPanel4.setRound(10);
        roundPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_username.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_username.setForeground(new java.awt.Color(102, 102, 102));
        lbl_username.setText("Welcome, Username");
        roundPanel4.add(lbl_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 400, 40));

        imageAvatar1.setImage(new javax.swing.ImageIcon(getClass().getResource("/img/Layer 1.png"))); // NOI18N
        roundPanel4.add(imageAvatar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 140, 130));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("MINU MOTORS");
        roundPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        lbl_type.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_type.setForeground(new java.awt.Color(102, 102, 102));
        lbl_type.setText("UserType");
        roundPanel4.add(lbl_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        add(roundPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 520, 170));
    }// </editor-fold>//GEN-END:initComponents

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked

    }//GEN-LAST:event_tableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javaswingdev.card.Card card1;
    private javaswingdev.card.Card card2;
    private javaswingdev.card.Card card3;
    private javaswingdev.card.Card card4;
    private com.bike.chart.Chart chart1;
    private swing.ImageAvatar imageAvatar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_date;
    private javax.swing.JLabel lbl_time;
    private javax.swing.JLabel lbl_type;
    private javax.swing.JLabel lbl_username;
    private com.bike.chart.PieChart pieChart1;
    private javaswingdev.swing.RoundPanel roundPanel1;
    private javaswingdev.swing.RoundPanel roundPanel2;
    private javaswingdev.swing.RoundPanel roundPanel3;
    private javaswingdev.swing.RoundPanel roundPanel4;
    private javaswingdev.swing.RoundPanel roundPanel5;
    private javax.swing.JScrollPane scroll;
    private javaswingdev.swing.table.Table table;
    // End of variables declaration//GEN-END:variables

    Double nettotal, netservice;
    String date;

    private void loadChart() {
        chart1.clear();
        chart1.start();
        chart1.addLegend("PRODUCT", new Color(135, 189, 245));
//        chart1.addLegend("SERVICES", new Color(189, 135, 245));

        try {

            ResultSet rs2 = DB.search("select * from sales");
            while (rs2.next()) {
                date = rs2.getString("date");
                String total = rs2.getString("total");

                ResultSet rs = DB.search("select * from total_services");
                while (rs.next()) {
                    String date2 = rs.getString("date");
                    String total2 = rs.getString("total");

                    netservice = Double.valueOf(total);
                    nettotal = Double.valueOf(total);
                    chart1.addData(new ModelChart(date, new double[]{nettotal}));

                }

            }

        } catch (Exception e) {
            log.error("Load income chart Failed", e);
        }
    }

    private void loadPieChart() {
        try {
            pieChart1.clearData();
            ResultSet resultSet = DB.search("select p.product_name, sum(it.subtotal),"
                    + " sum(it.qty) from  invoice i,product p,invoice_item it\n"
                    + " where it.invoice_id = i.invoice_id and  p.product_id = it.product_id  group "
                    + "by p.product_id\n"
                    + "order by p.product_name");

            int index = 0;
            while (resultSet.next()) {
                String productName = resultSet.getString(1);
                double sum = resultSet.getDouble(2);
                int qty = resultSet.getInt(3);
                pieChart1.addData(new ModelPieChart(productName, sum, qty, getColor(index++)));

            }
            resultSet.close();

        } catch (Exception e) {
            log.error("Load Pie chart Failed", e);
        }
    }

    private Color getColor(int index) {
        Color[] color = new Color[]{new Color(139, 229, 222), new Color(189, 135, 245),
            new Color(135, 189, 245), new Color(245, 189, 135), new Color(250, 250, 250),
            new Color(191, 219, 56), new Color(155, 222, 102), new Color(215, 202, 82),
            new Color(255, 142, 100), new Color(155, 102, 252), new Color(215, 102, 182),};
        return color[index];
    }

    private void loadTable() {
        
               try {

            DefaultTableModel dtm = (DefaultTableModel) table.getModel();
            dtm.setRowCount(0);
            ResultSet rs = DB.search("select * from invoice ORDER BY date && time DESC");
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("invoice_id"));
                v.add(rs.getString("customer"));
                v.add(rs.getString("date") + " " + rs.getString("time"));
                v.add(rs.getString("nettotal"));
                v.add(rs.getString("employee"));

                dtm.addRow(v);
                log.info("Invoice table Loaded");
            }

        } catch (Exception e) {
            log.error("Load INV Details Failed", e);
        }

    }

    private void showDate() {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
        String dat = s.format(d);
        lbl_date.setText(dat);
    }

    private void showTime() {
        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                SimpleDateFormat s = new SimpleDateFormat("HH-mm-ss");
                String tim = s.format(d);
                lbl_time.setText(tim);
            }
        }).start();
    }

    private void loadUser() {
        try {
            String type = SystemConfigData.getUsertype();
            ResultSet rs = DB.search("select * from user_type where user_type_id ='" + type + "'");
            if (rs.next()) {
                lbl_type.setText(rs.getString("type"));
            }
            
            String empId =SystemConfigData.getEmployee();
            ResultSet rs2 = DB.search("select * from employee where emp_id ='" + empId + "'");
            if (rs2.next()) {
                lbl_username.setText("Welcome, "+rs2.getString("fname")+" "+rs2.getString("lname"));
            }
        } catch (Exception e) {
        }

    }

}
