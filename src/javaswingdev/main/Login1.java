package javaswingdev.main;

import com.bike.common.MD5;
import com.bike.common.SystemConfigData;
import static com.bike.common.SystemLogger.initLogger;
import com.bike.db.DB;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;

public class Login1 extends javax.swing.JFrame {

    private Logger log;

    private Animator animatorLogin;
    private Animator animatorBody;
    private boolean signIn;

    Login1(Main dashboard) {
        this();
    }

    public Login1() {

        initComponents();
        initLogger();
        log = Logger.getLogger("bikeLogger");
        log.info("Application Starting");
        getContentPane().setBackground(new Color(245, 245, 245));
        TimingTarget targetLogin = new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                if (signIn) {
                    background1.setAnimate(fraction);
                } else {
                    background1.setAnimate(1f - fraction);
                }
            }

            @Override
            public void end() {
                if (signIn) {
                    panelLogin.setVisible(false);
                    background1.setShowPaint(true);
                    checkType();
                    
                    animatorBody.start();
                    dispose();

                } else {
                    enableLogin(true);
                    txt_username.grabFocus();
                }
            }

            private void checkType() {
                String userType = SystemConfigData.getUsertype();
                if(userType.equals("UST-31424")){
                    Main home = new Main();
                    home.setVisible(true);
                    log.info("Admin Home Page Loading");
                }else if(userType.equals("UST-31428")){
                    Main1 home2 = new Main1();
                    home2.setVisible(true);
                    log.info("Cashier Home Page Loading");
                }
            }
        };
        TimingTarget targetBody = new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                if (signIn) {
                    Main home = new Main();

                }
            }

            @Override
            public void end() {
                if (signIn == false) {
                    Main home = new Main();
                    home.setVisible(false);
                    background1.setShowPaint(false);
                    background1.setAnimate(1);
                    panelLogin.setVisible(true);
                    animatorLogin.start();
                }
            }
        };
        animatorLogin = new Animator(1500, targetLogin);
        animatorBody = new Animator(500, targetBody);
        animatorLogin.setResolution(0);
        animatorBody.setResolution(0);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background1 = new swingLogin.Background();
        panelLogin = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmdSignIn = new swingLogin.Button();
        txt_username = new swingLogin.TextField();
        txt_password = new swingLogin.PasswordField();
        lbl_exit = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        background1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelLogin.setOpaque(false);

        jPanel1.setOpaque(false);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        cmdSignIn.setBackground(new java.awt.Color(157, 153, 255));
        cmdSignIn.setForeground(new java.awt.Color(255, 255, 255));
        cmdSignIn.setText("Log In");
        cmdSignIn.setEffectColor(new java.awt.Color(199, 196, 255));
        cmdSignIn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cmdSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSignInActionPerformed(evt);
            }
        });

        txt_username.setBackground(new java.awt.Color(245, 245, 245));
        txt_username.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_username.setLabelText("User Name");
        txt_username.setLineColor(new java.awt.Color(131, 126, 253));
        txt_username.setSelectionColor(new java.awt.Color(157, 153, 255));
        txt_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usernameActionPerformed(evt);
            }
        });

        txt_password.setBackground(new java.awt.Color(245, 245, 245));
        txt_password.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_password.setLabelText("Password");
        txt_password.setLineColor(new java.awt.Color(131, 126, 253));
        txt_password.setSelectionColor(new java.awt.Color(157, 153, 255));
        txt_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passwordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(374, 374, 374)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_username, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmdSignIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmdSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lbl_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/burger/icon/close_1.png"))); // NOI18N
        lbl_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_exitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
        panelLogin.setLayout(panelLoginLayout);
        panelLoginLayout.setHorizontalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addContainerGap(157, Short.MAX_VALUE)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginLayout.createSequentialGroup()
                        .addComponent(lbl_exit)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124))))
        );
        panelLoginLayout.setVerticalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbl_exit)
                .addGap(86, 86, 86)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(180, Short.MAX_VALUE))
        );

        background1.add(panelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 540));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/21612843_6492671-removebg-preview.png"))); // NOI18N
        background1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background1, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSignInActionPerformed
        if (!animatorLogin.isRunning()) {
            try {
                String username = txt_username.getText();
                String password = new String(txt_password.getPassword());
                log.info("Trying to login user : " + username);
                Connection connection = DB.getDBConnection();
                String sql = "select * from system_user where username=? and password=?";
                PreparedStatement ps = connection.prepareStatement(sql);
                ps.setString(1, username);

                String encPw = MD5.getMd5(password);
                ps.setString(2, encPw);

                ResultSet rs = ps.executeQuery();

                signIn = true;
                String user = txt_username.getText().trim();
                String pass = String.valueOf(txt_password.getPassword());
                boolean action = true;
                if (user.equals("")) {
                    txt_username.setHelperText("Please input user name");
                    txt_username.grabFocus();
                    action = false;
                }
                if (pass.equals("")) {
                    txt_password.setHelperText("Please input password");
                    if (action) {
                        txt_password.grabFocus();
                    }
                    action = false;
                }

                if (rs.next()) {
                    SystemConfigData.setActiveUser(username);
                    SystemConfigData.setUsertype(rs.getString("user_type"));
                    SystemConfigData.setEmployee(rs.getString("employee_id"));
                    ResultSet rs2 = DB.search("select stat from employee where emp_id = '" + rs.getString("employee_id") + "'");
                    if (rs2.next()) {
                        String status = rs.getString("stat");
                        if (status.equals("1")) {
                            log.info("Loging Success user : " + username);
                            loginActivity();
                            animatorLogin.start();
                            enableLogin(false);
                        }else{
                             JOptionPane.showMessageDialog(this, "Your accoutn has Deactivated. Please Contact Admin!!", "Login Error", JOptionPane.ERROR_MESSAGE);
                        }

                    }

                    //loading();
                } else {
                    log.warn("Loging Failed due to invalid username or password / username : " + username);
                    signIn = false;

                    JOptionPane.showMessageDialog(this, "Invalid username or password!!", "Login Error", JOptionPane.ERROR_MESSAGE);

                    clearLogin();

                }

            } catch (Exception e) {
                log.error("Loging Failed", e);
            }

        }
    }//GEN-LAST:event_cmdSignInActionPerformed

    private void txt_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usernameActionPerformed
        txt_password.grabFocus();
    }//GEN-LAST:event_txt_usernameActionPerformed

    private void txt_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passwordActionPerformed
        cmdSignIn.grabFocus();
    }//GEN-LAST:event_txt_passwordActionPerformed

    private void lbl_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lbl_exitMouseClicked

    private void enableLogin(boolean action) {
        txt_username.setEditable(action);
        txt_password.setEditable(action);
        cmdSignIn.setEnabled(action);
    }

    public void clearLogin() {
        txt_username.setText("");
        txt_password.setText("");
        txt_username.setHelperText("");
        txt_password.setHelperText("");
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login1().setVisible(true);
            }
        });
    }

    private void loginActivity() {
        try {
            generateLoginID();
            String loginId = SystemConfigData.getLoginID();
            DB.push("insert into system_login values ('" + loginId + "','" + SystemConfigData.getEmployee() + "', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(),'PENDING')");

        } catch (Exception e) {
            log.error("user login Date , login time failed", e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swingLogin.Background background1;
    private swingLogin.Button cmdSignIn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_exit;
    private javax.swing.JPanel panelLogin;
    private swingLogin.PasswordField txt_password;
    private swingLogin.TextField txt_username;
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
}
