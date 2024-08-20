package projectj;
public abstract class Product {
    protected int productId;
    protected float price;
    protected String name;
    protected int counter = 0;
   public Product() {
        counter++;
    }
    public Product(String name, int productId, float price) {
        this.name = name;
        this.productId = productId;
        this.price = price;
    }
    public abstract float getpricing();

    public void setproductId(int id) {
        if (id > 0) {
            this.productId = id;
        } else {
            this.productId = Math.abs(id);
        }
    }

    public void setname(String n) {
        this.name = n;
    }

    public void setprice(float price) {
        if (price > 0) {
            this.price = price;
        } else {
            this.productId = (int) Math.abs(price);
        }
    }
    public String getname() {
        return name;
    }
    public int getproductId() {
        return productId;
    }
}
//abstact metthod agiib menha al price 
