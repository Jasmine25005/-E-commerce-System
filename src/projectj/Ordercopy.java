package projectj;
import java.util.Scanner;
public class Ordercopy {
    static Scanner choco = new Scanner(System.in);
    float totalprice = 0;
    int orderId = 1;
    Customer c = new Customer();
    public void printOrderInfo(Product[] myproducts, int nProducts, int customerid, float totalprice) { //akhdet mnee ayam ashan alahzha en momken a3ml modo3  share a value between different classes kloo 3n tareek al parameters ea3ny kol cons le class tedii el hagaat ll class el tany we hakaza 
        System.out.println("Here is your order summary:");                         // malhooza kman en el kiam eli bttrma llel abd we malhash estekhdam fi baki al class hia bas elkiam eli bettsagl fi var met3arf goa el method deh bas we msh fi ai haga tania di bas 
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer ID: " + customerid);
        System.out.println("Products:");
        for (int i = 0; i < nProducts; i++) {
            System.out.println(myproducts[i].getname() + " - $" + myproducts[i].getpricing());
        }
        System.out.println("Total Price: $" + totalprice);
    }
    public void setorderId(int id) {
        if (id > 0) {
            this.orderId = id;
        } else {
            this.orderId = Math.abs(id);
        }
    }
    public int getorderId() {
        return orderId;
    }

}


