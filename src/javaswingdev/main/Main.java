package javaswingdev.main;

import com.bike.common.SystemConfigData;
import com.bike.db.DB;
import java.awt.Color;
import java.awt.Component;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javaswingdev.form.AllServices;
import javaswingdev.form.BasiCSalary;
import javaswingdev.form.BikeRegister;
import javaswingdev.form.Brand;
import javaswingdev.form.Category;
import javaswingdev.form.CheckStock1;
import javaswingdev.form.Customer;
import javaswingdev.form.DashboardView;
import javaswingdev.form.Employees;
import javaswingdev.form.Form_Empty;
import javaswingdev.form.GoodsReceiveNote;
import javaswingdev.form.GoodsReturnNote;
import javaswingdev.form.Invoice;
import javaswingdev.form.Paysheet;
import javaswingdev.form.Products;
import javaswingdev.form.Profile;
import javaswingdev.form.PurchaseOrder;
import javaswingdev.form.Salary;
import javaswingdev.form.ServiceDetails;
import javaswingdev.form.ServiceInfo;
import javaswingdev.form.ServiceInvoice;
import javaswingdev.form.Supplier;
import javaswingdev.form.User;
import javaswingdev.form.ViewGRN;
import javaswingdev.form.ViewInvoice;
import javaswingdev.form.ViewPO;

import javaswingdev.form.ViewReturn1;

import javaswingdev.menu.EventMenuSelected;
import javax.swing.JOptionPane;
import javax.xml.crypto.KeySelector;
import org.apache.log4j.Logger;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;

public class Main extends javax.swing.JFrame {

    private static Main main;
    private Logger log;
    
    Main(Login1 login) {
        this();
    }

    public Main() {
        initComponents();
        log = Logger.getLogger("bikeLogger");
        log.info("Home Page Loaded");
        init();
        
       

    }

    private void init() {
       
        main = this;
        titleBar.initJFram(this);
        menu.addEvent(new EventMenuSelected() {
            @Override
            public void menuSelected(int index, int indexSubMenu) {
//                Dashboard
                if (index == 0 && indexSubMenu == 0) {
                    showForm(new DashboardView());
//                  Notes
                } else if (index == 1 && indexSubMenu == 1) {
                    showForm(new Invoice());
                } else if (index == 1 && indexSubMenu == 2) {
                    showForm(new ViewInvoice());
                } else if (index == 2 && indexSubMenu == 1) {
                    showForm(new PurchaseOrder());
                } else if (index == 2 && indexSubMenu == 2) {
                    showForm(new ViewPO());
                } else if (index == 3 && indexSubMenu == 1) {
                    showForm(new GoodsReceiveNote());
                } else if (index == 3 && indexSubMenu == 2) {
                    showForm(new ViewGRN());
                } else if (index == 4 && indexSubMenu == 1) {
                    showForm(new GoodsReturnNote());
                } else if (index == 4 && indexSubMenu == 2) {
                    showForm(new ViewReturn1());
//                BIKE SERVICE
                } else if (index == 5 && indexSubMenu == 0) {
                    showForm(new BikeRegister());
                } else if (index == 6 && indexSubMenu == 0) {
                    showForm(new ServiceDetails());
                } else if (index == 7 && indexSubMenu == 0) {
                    showForm(new ServiceInvoice());
         
                } else if (index == 8 && indexSubMenu == 0) {
                    showForm(new ServiceInfo());
                } else if (index == 9 && indexSubMenu == 0) {
                    showForm(new Products());
//                 PRODUCTS
                } else if (index == 10 && indexSubMenu == 0) {
                    showForm(new Brand());
                } else if (index == 11 && indexSubMenu == 0) {
                    showForm(new Category());
                } else if (index == 12 && indexSubMenu == 0) {
                    showForm(new CheckStock1());
//                  CUSTOMER
                } else if (index == 13 && indexSubMenu == 0) {
                    showForm(new Customer());
//                    SUPPLIER
                } else if (index == 14 && indexSubMenu == 0) {
                    showForm(new Supplier());
//                    EMPLOYEE
                } else if (index == 15 && indexSubMenu == 0) {
                    showForm(new Employees());
//                    USER
                } else if (index == 16 && indexSubMenu == 0) {
                    showForm(new User());
               
                    //salary
                 } else if (index == 17 && indexSubMenu == 0) {
                    showForm(new BasiCSalary());  
                } else if (index == 18 && indexSubMenu == 0) {
                    showForm(new Paysheet());
//                    OTHER
           
                } else if (index == 19 && indexSubMenu == 0) {
                    logout();

                }
            }

         
        });
        menu.setSelectedIndex(0, 0);
        
    }

    public void showForm(Component com) {
        body.removeAll();
        body.add(com);
        body.repaint();
        body.revalidate();
    }

    public static Main getMain() {
        return main;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        panelMenu = new javax.swing.JPanel();
        menu = new javaswingdev.menu.Menu();
        titleBar = new javaswingdev.swing.titlebar.TitleBar();
        body = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        background.setBackground(new java.awt.Color(245, 245, 245));

        panelMenu.setBackground(new java.awt.Color(255, 255, 255));

        menu.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(titleBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createSequentialGroup()
                .addComponent(titleBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
                .addContainerGap())
        );

        body.setOpaque(false);
        body.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, 1098, Short.MAX_VALUE)
                .addContainerGap())
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel body;
    private javaswingdev.menu.Menu menu;
    private javax.swing.JPanel panelMenu;
    private javaswingdev.swing.titlebar.TitleBar titleBar;
    // End of variables declaration//GEN-END:variables

  

    private void generateLoginID() {
        try {
            ResultSet rs = DB.search("select count(*) as login_count from system_login");
            if (rs.next()) {
                int count = rs.getInt("login_count");
               int c = Integer.parseInt(new SimpleDateFormat("Mddyy").format(new Date()));
                int value = c + (++count);
                String loginId = "LOG-" + value;
                SystemConfigData.setLoginID(loginId);
            }

        } catch (Exception e) {
            log.error("Generate Login ID Failed", e);
        }
    }
    
    
       private void logout() {

                log.info("Logout View Loaded");
                int logout = JOptionPane.showConfirmDialog(null, "Do You Want Logout from this Application ?", "Select", JOptionPane.YES_NO_OPTION);
                if (logout == 0) {
                    try {
                        log.info("Logout System User" + SystemConfigData.getActiveUser());
                        DB.push("update system_login set logout_time = CURRENT_TIMESTAMP() where login_id = '" + SystemConfigData.getLoginID() + "' ");
                        createNewLoginID();
                    } catch (Exception e) {
                        log.error("Logout Failed", e);
                    }
                    Login1 login = new Login1();
                    login.setVisible(true);
                    dispose();
//                   System.exit(0);
                    

                }
            }

            private void createNewLoginID() {
                SystemConfigData.setLoginID("");
                generateLoginID();
            }
}
