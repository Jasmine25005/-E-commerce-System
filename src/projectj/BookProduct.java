package projectj;
public class BookProduct extends Product {
     private String author;
    private String publisher;
    public BookProduct(String name,int productId,float price ,String author,String publisher) {
super(name,productId,price);
this.author =author;
this.publisher = publisher;
    }  
    @Override
  public float getpricing() {
        return price;
        }      
   public void setauthor(String author){
    this.author=author;
}
public void setpublisher(String publisher){
this.publisher=publisher;
}
public String getauthor() {
        return author;
        }
      public String getpublisher() {
        return publisher;
        }
}
