package projectj;
import java.util.Scanner;
import java.lang.Math;
public class Customer {
    static Scanner choco = new Scanner(System.in);
    private int customerId;
   private String name;
   private String address;  
   public Customer() {    
    }
    
    
    public Customer(int customerId,String name,String address) {//3amla hena 2 constructors wahd fadi w wahd laa laan h3ooz astd3ii metnod get men al class deh fii class tania w lakn bedon kol el galaba eli fii cont.2 ,men al akhir aiza bas a3ml farq bein 2 const
    this.customerId=customerId;
    this.name    = name;   
    this.address=address;
            }
    public void setcustomerId(final int id) {
        if (id > 0) {
            this.customerId = id;
        } else {
            this.customerId = Math.abs(id);
        }
    }
    public void setname(String n) {
        this.name = n;
    }
    public void setcustomeraddress(String ad) {
        this.address = ad;
    }
    public String getname() {
        return name;
    }

    public int getcustomerId() {
        return customerId;
    }

    public String getaddress() {
        return address;
    }
}
