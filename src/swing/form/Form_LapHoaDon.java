package swing.form;

import com.formdev.flatlaf.FlatIntelliJLaf;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.raven.datechooser.DateChooser;
import java.awt.Component;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import print.FieldReportPayment;
import print.ParameterReportPayment;
import print.ReportManager;
import swing.table.EventCellInputChange;
import swing.table.ModelItemSell;
import swing.table.QtyCellEditor;


public class Form_LapHoaDon extends javax.swing.JPanel  {
    
    private DateChooser chdate = new DateChooser();
    private DefaultTableModel model;
    
    public Form_LapHoaDon() {
        initComponents();
        FlatIntelliJLaf.registerCustomDefaultsSource("style");
        FlatIntelliJLaf.setup();
        chdate.setTextField(txtNLHD);
        chdate.setDateSelectionMode(DateChooser.DateSelectionMode.SINGLE_DATE_SELECTED);
        chdate.setLabelCurrentDayVisible(false); 
//        chdate.setDateFormat(new SimpleDateFormat("dd-MMMM-yyyy"));
        table.setRowHeight(25);
        table.fixTable(jScrollPane1);
        
        showData();
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtMaHD = new swing.jtext.MyTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNLHD = new swing.jtext.MyTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNV = new swing.jtext.MyTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new swing.table.Table();
        btnTimThuoc = new swing.jtext.MyButton();
        btnXoa = new swing.jtext.MyButton();
        panelBoder1 = new swing.form.PanelBoder();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtTotal = new swing.jtext.MyTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTongTienKhuyenMai = new swing.jtext.MyTextField();
        jLabel10 = new javax.swing.JLabel();
        txtThanhTienCuoi = new swing.jtext.MyTextField();
        myButton4 = new swing.jtext.MyButton();
        btnInHoaDon = new swing.jtext.MyButton();
        jLabel11 = new javax.swing.JLabel();
        txtTenKH = new swing.jtext.MyTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtCccd = new swing.jtext.MyTextField();
        txtSdt = new swing.jtext.MyTextField();
        jLabel15 = new javax.swing.JLabel();
        btnXoa1 = new swing.jtext.MyButton();

        setBackground(new java.awt.Color(255, 253, 250));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("LẬP HÓA ĐƠN");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel1.setText("Mã HD:");

        txtMaHD.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtMaHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaHDActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel2.setText("Ngày lập HD:");

        txtNLHD.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtNLHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNLHDActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel3.setText("Nhân viên:");

        txtNV.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNVActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data", "STT", "Tên thuốc", "Số lượng", "Đơn giá", "Giá giảm", "Thành tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setMinWidth(0);
            table.getColumnModel().getColumn(0).setPreferredWidth(0);
            table.getColumnModel().getColumn(0).setMaxWidth(0);
            table.getColumnModel().getColumn(1).setPreferredWidth(30);
            table.getColumnModel().getColumn(2).setPreferredWidth(100);
        }


        btnTimThuoc.setBackground(new java.awt.Color(0, 255, 255));
        btnTimThuoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search.png"))); // NOI18N
        btnTimThuoc.setText("Tìm thuốc");
        btnTimThuoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimThuocActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(51, 255, 255));
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete.png"))); // NOI18N
        btnXoa.setText("Xóa thuốc");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        panelBoder1.setBackground(new java.awt.Color(204, 235, 241));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 0));
        jLabel6.setText("Chi tiết hóa đơn");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel8.setText("Tổng tiền thuốc:");

        txtTotal.setText("0.00");
        txtTotal.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel9.setText("Giảm khuyến mãi:");

        txtTongTienKhuyenMai.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtTongTienKhuyenMai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTongTienKhuyenMaiActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel10.setText("Tổng thành tiền:");

        txtThanhTienCuoi.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtThanhTienCuoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtThanhTienCuoiActionPerformed(evt);
            }
        });

        myButton4.setText("Tạo Hóa Đơn Mới");
        myButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton4ActionPerformed(evt);
            }
        });

        btnInHoaDon.setText("In Hóa Đơn");
        btnInHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInHoaDonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBoder1Layout = new javax.swing.GroupLayout(panelBoder1);
        panelBoder1.setLayout(panelBoder1Layout);
        panelBoder1Layout.setHorizontalGroup(
            panelBoder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBoder1Layout.createSequentialGroup()
                .addGroup(panelBoder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBoder1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBoder1Layout.createSequentialGroup()
                        .addGroup(panelBoder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBoder1Layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addGroup(panelBoder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(panelBoder1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBoder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTongTienKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtThanhTienCuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelBoder1Layout.createSequentialGroup()
                                .addComponent(myButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnInHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        panelBoder1Layout.setVerticalGroup(
            panelBoder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBoder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBoder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBoder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTongTienKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBoder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtThanhTienCuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelBoder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBoder1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBoder1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(panelBoder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(myButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel11.setText("Tên KH:");

        txtTenKH.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtTenKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenKHActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel12.setText("CCCD:");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel13.setText("SDT:");

        txtCccd.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtCccd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCccdActionPerformed(evt);
            }
        });

        txtSdt.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtSdt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSdtActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 51, 0));
        jLabel15.setText("Bảng danh sách thuốc");

        btnXoa1.setBackground(new java.awt.Color(51, 255, 255));
        btnXoa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete.png"))); // NOI18N
        btnXoa1.setText("Tìm Khách hàng");
        btnXoa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(panelBoder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(351, 351, 351)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                        .addGap(405, 405, 405))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNV, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                                    .addComponent(txtMaHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtTenKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(11, 11, 11)
                                        .addComponent(txtNLHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel12)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(209, 209, 209)
                                .addComponent(btnTimThuoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(55, 55, 55)
                                .addComponent(btnXoa1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(37, 37, 37)
                                .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCccd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNV, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNLHD, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtCccd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))))
<<<<<<< HEAD
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(myButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(myButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNV1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
=======
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTimThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnXoa1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
>>>>>>> branch 'master' of https://github.com/NChieuVan/PTUD_V2T.git
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(panelBoder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtMaHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaHDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaHDActionPerformed

    private void txtNLHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNLHDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNLHDActionPerformed

    private void txtNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNVActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoaActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void txtTongTienKhuyenMaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTongTienKhuyenMaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTongTienKhuyenMaiActionPerformed

    private void txtThanhTienCuoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtThanhTienCuoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtThanhTienCuoiActionPerformed

    private void myButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myButton4ActionPerformed

    private void txtTenKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenKHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenKHActionPerformed

    private void btnInHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInHoaDonActionPerformed
        try {
            List<FieldReportPayment> fields = new ArrayList<>();
            for (int i = 0; i < table.getRowCount(); i++) {
                ModelItemSell data = (ModelItemSell) table.getValueAt(i, 0);
                fields.add(new FieldReportPayment(data.getProductName(), data.getQty(), data.getPrice(), data.getTotal()));
            }
            ParameterReportPayment dataprint = new ParameterReportPayment("Admin", "MR A", txtTotal.getText(), generateQrcode(), fields);
            ReportManager.getInstance().printReportPayment(dataprint);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnInHoaDonActionPerformed

    private void txtCccdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCccdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCccdActionPerformed

    private void txtSdtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSdtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSdtActionPerformed

    private void btnTimThuocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimThuocActionPerformed
        Form_TìmThuoc timThuoc = new Form_TìmThuoc(null, true);
        timThuoc.setVisible(true);
        
    }//GEN-LAST:event_btnTimThuocActionPerformed

    private void btnXoa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa1ActionPerformed
            Form_TimKhachHang kh = new Form_TimKhachHang(null, true);
            kh.setVisible(true);
    }//GEN-LAST:event_btnXoa1ActionPerformed

    private void myButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.jtext.MyButton btnInHoaDon;
    private swing.jtext.MyButton btnTimThuoc;
    private swing.jtext.MyButton btnXoa;
    private swing.jtext.MyButton btnXoa1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private swing.jtext.MyButton myButton4;
    private swing.form.PanelBoder panelBoder1;
    private swing.table.Table table;
    private swing.jtext.MyTextField txtCccd;
    private swing.jtext.MyTextField txtMaHD;
    private swing.jtext.MyTextField txtNLHD;
    private swing.jtext.MyTextField txtNV;
    private swing.jtext.MyTextField txtSdt;
    private swing.jtext.MyTextField txtTenKH;
    private swing.jtext.MyTextField txtThanhTienCuoi;
    private swing.jtext.MyTextField txtTongTienKhuyenMai;
    private swing.jtext.MyTextField txtTotal;
    // End of variables declaration//GEN-END:variables
    
    /**
     * chỉnh số lượng sản phẩm,
     * tính giá giảm ,
     * tính tổng tiền
     */
    private void showData() {
        try {
            ReportManager.getInstance().compileReport();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        table.getColumnModel().getColumn(3).setCellEditor(new QtyCellEditor(new EventCellInputChange() {
            @Override
            public void inputChanged() {
                sumAmount();
                sumKhuyenMai();
            }
        }));
        /**
         * chỉnh cho giá trị nhập chỉnh sửa ở giữa
         */
        table.getColumnModel().getColumn(3).setCellRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                setHorizontalAlignment(SwingConstants.CENTER);
                return this;
            }
        });
        
        /**
         * add vào table
         * List <Qrcode,"Name","số lượng = 1" ,đơn giá", "giá đã giảm","Tổng tiền" >
         * @ giá đã giảm = số lượng *đơn giá * % giảm
         * @ tổng tiền = số lượng * đơn giá - giá đã giảm
         */
        model = (DefaultTableModel) table.getModel();
        model.addRow(new ModelItemSell(1, "Coca", 2, 0.5,0.0, 2).toTableRow(table.getRowCount() + 1));
        model.addRow(new ModelItemSell(8, "Fanta", 2, 0.5,0.0, 2).toTableRow(table.getRowCount() + 1));
        model.addRow(new ModelItemSell(10, "Beer", 1, 0.5,0.0,0.5).toTableRow(table.getRowCount() + 1));
        model.addRow(new ModelItemSell(11, "Orange", 2, 0.5,0.0, 2).toTableRow(table.getRowCount() + 1));
        model.addRow(new ModelItemSell(15, "Apple", 2, 0.5,0.0, 2).toTableRow(table.getRowCount() + 1));
        sumAmount();
        sumKhuyenMai();
    }
    
    
    /**
     * hàm tính tổng tiền đã trừ khuyến mãi
     * lấy cột thành tiền cộng dồn
     */
    private void sumAmount(){
        double total = 0;
        for(int i=0;i<table.getRowCount();i++){
            ModelItemSell item = (ModelItemSell) table.getValueAt(i, 0);
            total += item.getTotal();
        }
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
        txtTotal.setText("$ "+ decimalFormat.format(total));
    }
    
    private void sumKhuyenMai(){
        double total = 0;
        double tmp = 0.0;
//        int index = table.getColumnCount()-2;
         
        for(int i=0;i<table.getRowCount();i++){
           
           tmp = Double.parseDouble(table.getValueAt(i, 5).toString());
            total += tmp;
        }
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
        txtTongTienKhuyenMai.setText(decimalFormat.format(total));
    }
    
    
    
    /**
     * Tạo QRcode cho chi tiết hóa đơn
     * @return
     * @throws WriterException
     * @throws IOException 
     */
    private InputStream generateQrcode() throws WriterException, IOException {
        NumberFormat nf = new DecimalFormat("0000000");
        Random ran = new Random();
        String invoice = nf.format(ran.nextInt(9999999) + 1);
        Map<EncodeHintType, Object> hints = new HashMap<>();
        hints.put(EncodeHintType.MARGIN, 0);
        BitMatrix bitMatrix = new MultiFormatWriter().encode(invoice, BarcodeFormat.QR_CODE, 100, 100, hints);
        BufferedImage image = MatrixToImageWriter.toBufferedImage(bitMatrix);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        ImageIO.write(image, "png", outputStream);
        return new ByteArrayInputStream(outputStream.toByteArray());
    }
}
