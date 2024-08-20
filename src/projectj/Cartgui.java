package projectj;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Cartgui {
    static Scanner choco = new Scanner(System.in);
    float totalprice = 0;
    Product[] myproducts;
    int nProducts;
    int customerId;
    public Cartgui(int customerId) {
        this.customerId = customerId;
    }
    public void addProduct() {
        int nProducts = Integer.parseInt(JOptionPane.showInputDialog("How many products do you want in your cart ?"));             
        myproducts = new Product[nProducts];
        
        for (int i = 0; i < nProducts; i++) {
              int answer = Integer.parseInt(JOptionPane.showInputDialog("which product would you like to add ? 1-Samsung Galaxy A03s   2-Green dress    3-Make Time"));      
           
            switch (answer) {
                case 1:
                    myproducts[i] = new ElectronicProduct("Samsung Galaxy A03s", 1, 3599.99f, "Samsung", 1);
                    break;
                case 2:
                    myproducts[i] = new ClothingProduct("Green dress", 2, 449.99f, "Medium", "Cotton");
                    break;
                case 3:
                    myproducts[i] = new BookProduct("Make Time", 3, 9.99f, "Jake nape & Jhon", "XPublications");
                    break;
                default:
                    System.out.println("invalid input");
                    break;
            }
            totalprice = myproducts[i].getpricing() + totalprice;
        }
        calculatePrice();
    }
    
    
    public Product[] removeProduct() {     
        System.out.println("Enter the product item you want to remove:");
        
        int indexToRemove = choco.nextInt() - 1;
        
         totalprice = totalprice - myproducts[indexToRemove].getpricing();
         
        if (indexToRemove >= 0 && indexToRemove < nProducts) {
            
            // Shift elements to the left starting from the index to remove
            for (int i = indexToRemove; i < nProducts - 1; i++) {
                myproducts[i] = myproducts[i + 1];
            }
            nProducts--; // decrement the count of products
            System.out.println("Product removed successfully.");
           
        } else {
            System.out.println("Invalid index. No product removed.");
        }
        return myproducts; // return the updated array
    }
    
    
    
    public void calculatePrice() {
       JOptionPane.showMessageDialog(null,"your total is $" + totalprice);
    }
    
    
    public void placeOrder() {
           int Answer1 = Integer.parseInt(JOptionPane.showInputDialog("yor total is $4059.97.Would you like to place order? 1-YES 2-NO"));
      
        switch (Answer1) {
            case 1:
                Ordergui myOrder = new Ordergui();
                myOrder.printOrderInfo(myproducts, nProducts, customerId, totalprice);
                break;
            case 2:
                System.out.println(" 1-remove item from cart    2-new cart     3-Leave the super market ");
                int Answer2 = choco.nextInt();
                switch (Answer2) {
                    case 1:
                        removeProduct();
                        Ordergui modifiedmyOrder = new Ordergui();
                        modifiedmyOrder.printOrderInfo(myproducts, nProducts, customerId, totalprice);
                        break;
                    case 2:
                        addProduct();
                        Ordergui mynewOrder = new Ordergui();
                        mynewOrder.printOrderInfo(myproducts, nProducts, customerId, totalprice);
                        break;
                    case 3:
                        System.out.println("Thanks for passing by!");
                        break;
                    default:
                        
                        break;
                }
                break;
            default:
                  System.out.println("invalid input");
                break;
        }
    }
}
