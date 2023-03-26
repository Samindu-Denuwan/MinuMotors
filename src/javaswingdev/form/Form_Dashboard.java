package javaswingdev.form;

import com.bike.chart.ModelChart;
import com.bike.chart.ModelPieChart;
import com.bike.db.DB;
import java.awt.Color;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Vector;
import javaswingdev.card.ModelCard;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;

public class Form_Dashboard extends javax.swing.JPanel {

    private ViewInvoice invoice;
    private CheckStock1 checkStock1;
    private Logger log;

    public Form_Dashboard() {
        initComponents();
        loadChart();
        loadPieChart();
        log = Logger.getLogger("bikeLogger");
        log.info("Dashboard Page Loaded");
        table.fixTable(jScrollPane1);
      
         loadTable();
        init();

    }

    Form_Dashboard(ViewInvoice invoice) {
        this();
        this.invoice = invoice;
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel2 = new javaswingdev.swing.RoundPanel();
        pieChart1 = new com.bike.chart.PieChart();
        card1 = new javaswingdev.card.Card();
        card2 = new javaswingdev.card.Card();
        card3 = new javaswingdev.card.Card();
        roundPanel1 = new javaswingdev.swing.RoundPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        chart1 = new com.bike.chart.Chart();
        roundPanel3 = new javaswingdev.swing.RoundPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javaswingdev.swing.table.Table();

        setOpaque(false);

        roundPanel2.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        roundPanel2.setRound(10);

        javax.swing.GroupLayout roundPanel2Layout = new javax.swing.GroupLayout(roundPanel2);
        roundPanel2.setLayout(roundPanel2Layout);
        roundPanel2Layout.setHorizontalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(pieChart1, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );
        roundPanel2Layout.setVerticalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(pieChart1, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        card1.setColor1(new java.awt.Color(153, 255, 153));
        card1.setColor2(new java.awt.Color(0, 153, 51));
        card1.setDescription("TODAY SALES");
        card1.setIcon(javaswingdev.GoogleMaterialDesignIcon.MONETIZATION_ON);
        card1.setValues("LKR");

        card2.setColor1(new java.awt.Color(95, 211, 226));
        card2.setColor2(new java.awt.Color(26, 166, 170));
        card2.setDescription("TODAY SERVICES INCOME");
        card2.setIcon(javaswingdev.GoogleMaterialDesignIcon.RECEIPT);
        card2.setValues("COUNT");

        card3.setColor1(new java.awt.Color(255, 204, 204));
        card3.setColor2(new java.awt.Color(204, 0, 0));
        card3.setDescription("LOW STOCK");
        card3.setIcon(javaswingdev.GoogleMaterialDesignIcon.WARNING);
        card3.setValues("COUNT");

        roundPanel1.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        roundPanel1.setRound(10);
        roundPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane3.setViewportView(chart1);

        roundPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 700, 470));

        roundPanel3.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        roundPanel3.setRound(10);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Detail", "Date", "Employee"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
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

        javax.swing.GroupLayout roundPanel3Layout = new javax.swing.GroupLayout(roundPanel3);
        roundPanel3.setLayout(roundPanel3Layout);
        roundPanel3Layout.setHorizontalGroup(
            roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );
        roundPanel3Layout.setVerticalGroup(
            roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 971, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(618, 618, 618)
                .addComponent(card2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(card3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(roundPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(roundPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(roundPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(card3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roundPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(roundPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, Short.MAX_VALUE)
                        .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
 
    }//GEN-LAST:event_tableMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javaswingdev.card.Card card1;
    private javaswingdev.card.Card card2;
    private javaswingdev.card.Card card3;
    private com.bike.chart.Chart chart1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private com.bike.chart.PieChart pieChart1;
    private javaswingdev.swing.RoundPanel roundPanel1;
    private javaswingdev.swing.RoundPanel roundPanel2;
    private javaswingdev.swing.RoundPanel roundPanel3;
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
            ResultSet rs = DB.search("select * from system_activity order by date && time desc");
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("detail"));
                v.add(rs.getString("date")+" "+rs.getString("time"));
                v.add(rs.getString("employee"));

                dtm.addRow(v);

            }

        } catch (Exception e) {
            log.error("Load system activi Failed", e);
        }
     }

}
