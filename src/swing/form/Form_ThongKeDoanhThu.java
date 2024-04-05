
package swing.form;

import java.awt.Color;
import swing.chartbar.ModelChart;

public class Form_ThongKeDoanhThu extends javax.swing.JPanel {

    /**
     * Creates new form From_ThongKeDoanhThu
     */
    public Form_ThongKeDoanhThu() {
        initComponents();
        chart.addLegend("Income", new Color(245, 189, 135));
        chart.addLegend("Expense", new Color(135, 189, 245));
        chart.addLegend("Profit", new Color(189, 135, 245));
        chart.addLegend("Cost", new Color(139, 229, 222));
        chart.addData(new ModelChart("January", new double[]{500, 200, 80,89}));
        chart.addData(new ModelChart("February", new double[]{600, 750, 90,150}));
        chart.addData(new ModelChart("March", new double[]{200, 350, 460,900}));
        chart.addData(new ModelChart("April", new double[]{480, 150, 750,700}));
        chart.addData(new ModelChart("May", new double[]{350, 540, 300,150}));
        chart.addData(new ModelChart("June", new double[]{190, 280, 81,200}));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chart = new swing.chartbar.Chart();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(chart, javax.swing.GroupLayout.PREFERRED_SIZE, 891, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chart, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(442, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.chartbar.Chart chart;
    // End of variables declaration//GEN-END:variables
}
