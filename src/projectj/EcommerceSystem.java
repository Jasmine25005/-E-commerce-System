package projectj;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.*;
import java.awt.*;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import static projectj.Customer.choco;
public class EcommerceSystem {
    static Scanner choco = new Scanner(System.in);
    public static void main(String[] args) {
        // Product[] myproducts = null;
        Customer c = new Customer();
        
        JFrame frame = new JFrame();
        JLabel label;
        boolean isFaceVisible = false;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 600);
        frame.getContentPane().setBackground(new Color(70, 10, 90));
        
        
        
        
        
        
        
        
        
        System.out.println("please enter your id :");
        c.setcustomerId(choco.nextInt());
        System.out.println("please enter your name :");
        String name = choco.nextLine();
        c.setname(name);
        choco.nextLine();
        System.out.println("please enter your address :");
        String address = choco.nextLine();
        c.setcustomeraddress(address); // We added an extra choco.nextLine() after reading the customer ID to consume the newline character laen lma a3ml nextline el satr eli ba3dha bitakl men el input user .
        Ordergui n = new Ordergui();
        Cartgui m = new Cartgui(c.getcustomerId());
        m.addProduct();
        m.placeOrder();
    }
}
