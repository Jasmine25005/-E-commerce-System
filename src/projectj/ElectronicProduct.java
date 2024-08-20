package projectj;
public class ElectronicProduct extends Product {
     private String brand;
    private  int warrantyPeriod;
    public ElectronicProduct() {
    }
    public ElectronicProduct(String name, int productId, float price, String brand, int warrantyPeriod) {
        super(name, productId, price);
        this.brand = brand;
        this.warrantyPeriod = warrantyPeriod;
    }
    @Override
    public float getpricing() {
        return price;
    }
    public void setwarrantyPeriod(int wp) {
        if (wp > 0) {
            this.warrantyPeriod = wp;
        } else {
            this.productId = Math.abs(wp);
        }
    }
    public void setbrand(String bd) {
        this.brand = bd;
    }
    public String getbrand() {
        return brand;
    }
    public int getwarrantyPeriod() {
        return warrantyPeriod;
    }
}
