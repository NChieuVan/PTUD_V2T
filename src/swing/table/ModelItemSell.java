package swing.table;

import java.text.DecimalFormat;

public class ModelItemSell {
     public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public ModelItemSell(int productId, String productName, int qty, double price, double giaGiam,double total ) {
        this.productId = productId;
        this.productName = productName;
        this.qty = qty;
        this.price = price; 
        this.giaGiam = giaGiam;
         this.total = total;
    }

    

    public double getGiaGiam() {
        return giaGiam;
    }

    public void setGiaGiam(double giaGiam) {
        this.giaGiam = giaGiam;
    }
    
    
    public ModelItemSell() {
    }

    private int productId;
    private String productName;
    private int qty;
    private double price;
    private double total;
    private double giaGiam;

    public Object[] toTableRow(int rowNum) {
        DecimalFormat df = new DecimalFormat("#,##0.##");
        return new Object[]{this, df.format(rowNum), productName, df.format(qty),df.format(price),df.format(giaGiam) ,df.format(total)};
    }
}
