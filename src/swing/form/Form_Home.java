package swing.form;

import java.awt.Color;
import javax.swing.Icon;
import swing.icon.GoogleMaterialDesignIcons;
import swing.icon.IconFontSwing;
import swing.model.ModelCard;

public class Form_Home extends javax.swing.JPanel {

    public Form_Home() {

        initComponents();
        table1.fixTable(jScrollPane1);
        setOpaque(false);
        initData();
    }

    private void initData() {
        initCardData();
    }

    private void initCardData() {
        Icon icon1 = IconFontSwing.buildIcon(GoogleMaterialDesignIcons.PEOPLE, 60, new Color(255, 255, 255, 100), new Color(255, 255, 255, 15));
        Icon icon2 = IconFontSwing.buildIcon(GoogleMaterialDesignIcons.MONETIZATION_ON, 60, new Color(255, 255, 255, 100), new Color(255, 255, 255, 15));
        Icon icon3 = IconFontSwing.buildIcon(GoogleMaterialDesignIcons.SHOPPING_BASKET, 60, new Color(255, 255, 255, 100), new Color(255, 255, 255, 15));
        Icon icon4 = IconFontSwing.buildIcon(GoogleMaterialDesignIcons.BUSINESS_CENTER, 60, new Color(255, 255, 255, 100), new Color(255, 255, 255, 15));

        card1.setData(new ModelCard("Đơn bán", 200, 20, icon1));
        card2.setData(new ModelCard("Thu nhập", 5000000, 41, icon2));
        card3.setData(new ModelCard("Số hàng tồn kho", 2000, 16, icon3));
        card4.setData(new ModelCard("Số lượng hết hạng", 200, 18, icon4));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        card1 = new swing.chartbar.Card();
        jLabel1 = new javax.swing.JLabel();
        card2 = new swing.chartbar.Card();
        card3 = new swing.chartbar.Card();
        card4 = new swing.chartbar.Card();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new swing.table.Table();

        setBackground(new java.awt.Color(204, 227, 242));

        card1.setColorGradient(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(4, 7, 100));
        jLabel1.setText("Trang Chủ");

        card2.setBackground(new java.awt.Color(0, 204, 255));
        card2.setColorGradient(new java.awt.Color(0, 204, 255));

        card3.setBackground(new java.awt.Color(255, 102, 102));
        card3.setColorGradient(new java.awt.Color(255, 153, 153));

        card4.setBackground(new java.awt.Color(255, 153, 102));
        card4.setColorGradient(new java.awt.Color(255, 153, 153));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("Bảng Hóa Đơn");

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "HD00000001", "Nguyễn Chiêu Văn", "Nguyễn", "12-21-2023", "10000"},
                {"2", "HD00000002", "Nguyễn Chiêu Văn", "Nguyễn", "12-21-2023", "342414"},
                {"3", "HD00000003", "Nguyễn Chiêu Văn", "Nguyễn", "12-21-2023", "24234234"},
                {"4", "HD00000004", "Nguyễn Chiêu Văn", "Nguyễn", "12-21-2023", "424324"},
                {"5", "HD00000005", "Nguyễn Chiêu Văn", "Nguyễn", "12-21-2023", "432423"},
                {"6", "HD00000006", "Nguyễn Chiêu Văn", "Nguyễn", "12-21-2023", "4234234"},
                {"7", "HD00000007", "Nguyễn Chiêu Văn", "Nguyễn", "12-21-2023", "4234"},
                {"8", "HD00000008", "Nguyễn Chiêu Văn", "Nguyễn", "12-21-2023", "4234"},
                {"9", "HD00000009", "Nguyễn Chiêu Văn", "Nguyễn", "12-21-2023", "4234"},
                {"10", "HD00000010", "Nguyễn Chiêu Văn", "Nguyễn", "12-21-2023", "65645"},
                {"11", "HD000000011", "Nguyễn Chiêu Văn", "Nguyễn", "12-21-2023", "6546"},
                {"12", "HD00000012", "Nguyễn Chiêu Văn", "Nguyễn", "12-21-2023", "76557"},
                {"13", "HD00000013", "Nguyễn Chiêu Văn", "Nguyễn", "12-21-2023", "53453"},
                {"14", "HD00000014", "Nguyễn Chiêu Văn", "Nguyễn", "12-21-2023", null}
            },
            new String [] {
                "STT", "Mã Hóa Đơn", "Tên Khách Hàng", "Tên nhân viên", "Ngày tạo HD", "Tổng tiền"
            }
        ));
        jScrollPane1.setViewportView(table1);
        if (table1.getColumnModel().getColumnCount() > 0) {
            table1.getColumnModel().getColumn(0).setPreferredWidth(30);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 928, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(card3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(card4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.chartbar.Card card1;
    private swing.chartbar.Card card2;
    private swing.chartbar.Card card3;
    private swing.chartbar.Card card4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private swing.table.Table table1;
    // End of variables declaration//GEN-END:variables
}
