package projectj;
public class ClothingProduct extends Product {
    private String size;
     private String fabric;
    public ClothingProduct() {
    }
    public ClothingProduct(String name, int productId, float price, String size, String fabric) {
        super(name, productId, price);
        this.size = size;
        this.fabric = fabric;
    }
    @Override
    public float getpricing() {
        return price;
    }
    public void setsize(String sz) {

        this.size = sz;
    }
    public void setfabric(String fc) {
        this.fabric = fc;
    }
    public String getsize() {
        return size;
    }
    public String getfabric() {
        return fabric;
    }
}
