package swing.login;

import dao.Login_Dao;
import java.awt.Cursor;
import model.TaiKhoan;
import swing.center.Main;

public class Login extends javax.swing.JFrame {
    private Login_Dao login_Dao;
    public Login() {
        login_Dao =new Login_Dao();
        initComponents();
//        setSize(Toolkit.getDefaultToolkit().getScreenSize());
        setLocationRelativeTo(null);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGradiente1 = new swing.login.PanelGradiente();
        jLabel1 = new javax.swing.JLabel();
        panelBorder2 = new swing.login.PanelBorder();
        jLabel2 = new javax.swing.JLabel();
        txtusername = new swing.jtext.MyTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtpassword = new swing.jtext.MyPassword();
        btnDangNhap = new swing.jtext.MyButton();
        jCheckBox1 = new swing.jtext.MyCheckBox();
        lbInfo = new javax.swing.JLabel();
        lbForget = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelGradiente1.setColorPrimario(new java.awt.Color(62, 221, 218));
        panelGradiente1.setColorSecundario(new java.awt.Color(37, 157, 211));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("THUỐC TÂY V2T");

        panelBorder2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Đăng Nhập");
        panelBorder2.add(jLabel2);
        jLabel2.setBounds(80, 10, 160, 40);
        panelBorder2.add(txtusername);
        txtusername.setBounds(50, 100, 240, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Tên đăng nhập:");
        panelBorder2.add(jLabel3);
        jLabel3.setBounds(50, 80, 90, 16);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Mật khẩu:");
        panelBorder2.add(jLabel4);
        jLabel4.setBounds(50, 150, 90, 16);
        panelBorder2.add(txtpassword);
        txtpassword.setBounds(50, 170, 240, 30);

        btnDangNhap.setBackground(new java.awt.Color(0, 204, 255));
        btnDangNhap.setText("Đăng nhập");
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });
        panelBorder2.add(btnDangNhap);
        btnDangNhap.setBounds(50, 290, 240, 30);

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Quản lý");
        panelBorder2.add(jCheckBox1);
        jCheckBox1.setBounds(50, 210, 70, 20);

        lbInfo.setFont(new java.awt.Font("Times New Roman", 2, 13)); // NOI18N
        lbInfo.setForeground(new java.awt.Color(255, 0, 51));
        panelBorder2.add(lbInfo);
        lbInfo.setBounds(50, 240, 240, 20);

        lbForget.setFont(new java.awt.Font("Segoe UI", 2, 13)); // NOI18N
        lbForget.setForeground(new java.awt.Color(102, 102, 102));
        lbForget.setText("Quên mật khẩu?");
        lbForget.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbForgetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbForgetMouseExited(evt);
            }
        });
        panelBorder2.add(lbForget);
        lbForget.setBounds(120, 340, 100, 18);

        panelGradiente1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelGradiente1.setLayer(panelBorder2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelGradiente1Layout = new javax.swing.GroupLayout(panelGradiente1);
        panelGradiente1.setLayout(panelGradiente1Layout);
        panelGradiente1Layout.setHorizontalGroup(
            panelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGradiente1Layout.createSequentialGroup()
                .addGroup(panelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGradiente1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(panelBorder2, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelGradiente1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel1)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        panelGradiente1Layout.setVerticalGroup(
            panelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGradiente1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBorder2, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        TaiKhoan tk = login_Dao.getTaiKhoan(txtusername.getText(), txtpassword.getText());
            if (txtusername.getText().equals("") || txtpassword.getText().equals("")) {
//                    lbInfo.setText("");
                lbInfo.setText("Chưa nhập userName hoặc passWord!");
                txtusername.requestFocus();
                txtusername.selectAll();
            } else if (tk == null) {
                lbInfo.setText("Sai userName hoặc passWord!");
                txtusername.requestFocus();
                txtusername.selectAll();
            } else if (jCheckBox1.isSelected() == false && tk.getVaiTro().equals("QuanLy")) {
//            	System.out.println("Yes ql");
                lbInfo.setText("Sai userName hoặc passWord!");
            } else if (jCheckBox1.isSelected() == true && tk.getVaiTro().equals("QuanLy")) {
//            	System.out.println("Yes ql");
                lbInfo.setText("");
                Main main = new Main();
                main.setVisible(true);
                Login.this.dispose();
            } else if (jCheckBox1.isSelected() == true && tk.getVaiTro().equals("NhanVien")) {
//            	System.out.println("Yes ql");
                lbInfo.setText("Sai userName hoặc passWord!");
            } else if (jCheckBox1.isSelected() == false && tk.getVaiTro().equals("NhanVien")) {
//            	System.out.println("Yes NV");
                Main main = new Main();
                main.setVisible(true);
                Login.this.dispose();
            }
    }//GEN-LAST:event_btnDangNhapActionPerformed

    private void lbForgetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbForgetMouseEntered
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_lbForgetMouseEntered

    private void lbForgetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbForgetMouseExited
        setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_lbForgetMouseExited
    
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.jtext.MyButton btnDangNhap;
    private swing.jtext.MyCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbForget;
    private javax.swing.JLabel lbInfo;
    private swing.login.PanelBorder panelBorder2;
    private swing.login.PanelGradiente panelGradiente1;
    private swing.jtext.MyPassword txtpassword;
    private swing.jtext.MyTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
