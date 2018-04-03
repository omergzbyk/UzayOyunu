
import java.awt.Event;
import java.awt.HeadlessException;
import java.io.IOException;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author COOLER MASTER
 */
public class OyunEkrani extends JFrame{

    public OyunEkrani(String title) throws HeadlessException {
        super(title);
    }

   

    public static void main(String[] args) throws IOException {
         OyunEkrani ekran =new OyunEkrani("Uzay Oyunu");
         ekran.setResizable(false);
         ekran.setFocusable(false);
         
         ekran.setSize(800, 600);
         ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
         Oyun oyun=new Oyun();
         oyun.requestFocus();
         oyun.addKeyListener(oyun);
         oyun.setFocusable(true);
         oyun.setFocusTraversalKeysEnabled(false);
         ekran.add(oyun);
         ekran.setVisible(true);
         
         
    }
    
    
}
