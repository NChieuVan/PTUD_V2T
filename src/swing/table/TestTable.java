package swing.table;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import java.awt.Component;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.NumberFormat;
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

/**
 *
 * @author DELL
 */
public class TestTable extends javax.swing.JFrame {

    public TestTable() {
        initComponents();
        table.setRowHeight(30);
        testData();// setData
        sumAmount(); // Tính tổng tiền
    }
    
    private void testData() {
        try {
            ReportManager.getInstance().compileReport();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        table.getColumnModel().getColumn(3).setCellEditor(new QtyCellEditor(new EventCellInputChange() {
            @Override
            public void inputChanged() {
                sumAmount();
            }
        }));
        
        table.getColumnModel().getColumn(3).setCellRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                setHorizontalAlignment(SwingConstants.CENTER);
                return this;
            }
        });
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.addRow(new ModelItemSell(1, "Coca", 2, 0.5, 2).toTableRow(table.getRowCount() + 1));
        model.addRow(new ModelItemSell(8, "Fanta", 2, 0.5, 2).toTableRow(table.getRowCount() + 1));
        model.addRow(new ModelItemSell(10, "Beer", 1, 0.5, 0.5).toTableRow(table.getRowCount() + 1));
        model.addRow(new ModelItemSell(11, "Orange", 2, 0.5, 2).toTableRow(table.getRowCount() + 1));
        model.addRow(new ModelItemSell(15, "Apple", 2, 0.5, 2).toTableRow(table.getRowCount() + 1));
//        sumAmount();
    }
    
    private void sumAmount(){
        double total = 0;
        for(int i=0;i<table.getRowCount();i++){
            ModelItemSell item = (ModelItemSell) table.getValueAt(i, 0);
            total += item.getTotal();
        }
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
        lbTotal.setText("$ "+ decimalFormat.format(total));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new swing.table.Table();
        jLabel1 = new javax.swing.JLabel();
        lbTotal = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data", "STT", "Tên", "Số lượng", "Giá", "Tổng tiền"
            }
        ));
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setMinWidth(0);
            table.getColumnModel().getColumn(0).setPreferredWidth(0);
            table.getColumnModel().getColumn(0).setMaxWidth(0);
            table.getColumnModel().getColumn(1).setPreferredWidth(50);
            table.getColumnModel().getColumn(2).setPreferredWidth(200);
            table.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel1.setText("Tổng tiền:");

        lbTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbTotal.setText("$ 0.00");

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(lbTotal)
                        .addGap(9, 9, 9)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(72, 72, 72))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbTotal))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            List<FieldReportPayment> fields = new ArrayList<>();
            for (int i = 0; i < table.getRowCount(); i++) {
                ModelItemSell data = (ModelItemSell) table.getValueAt(i, 0);
                fields.add(new FieldReportPayment(data.getProductName(), data.getQty(), data.getPrice(), data.getTotal()));
            }
            ParameterReportPayment dataprint = new ParameterReportPayment("Admin", "MR A", lbTotal.getText(), generateQrcode(), fields);
            ReportManager.getInstance().printReportPayment(dataprint);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    
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
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTotal;
    private swing.table.Table table;
    // End of variables declaration//GEN-END:variables
}
