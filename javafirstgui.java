import javax.swing.*;

public class javafirstgui extends JFrame{
    public static void main(String [] args){
        JFrame f =new JFrame("hi this is fun");
        JButton b =new JButton("click me");
        b.setBounds(140,200,150,40);
        f.add(b);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
   
    
   
}
