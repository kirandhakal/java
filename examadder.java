import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
// import java.awt.*;
// import java.awt.event.*;

public class examadder extends JFrame {
    private JFrame frame;
    private JTextField txt1,txt2,txtsum;
    private JLabel lbl1,lbl2,lbl3;
    private JButton btn;
    private int n1,n2,sum;
    private String s;

    examadder(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lbl1 = new JLabel("first number");
        lbl1.setBounds(50,50,100,20);
        add(lbl1);
        txt1 =new JTextField();
        txt1.setBounds(200,50,150,30);
        add(txt1);
        txt1.setColumns(10);

        lbl2 = new JLabel("second number");
        lbl2.setBounds(50,80,100,20);
        add(lbl2);
        txt2 =new JTextField();
        txt2.setBounds(200,80,200,30);
        add(txt2);
        txt2.setColumns(10);

        lbl3 = new JLabel("sum");
        lbl3.setBounds(50,200,100,30);
        add(lbl3);
        txtsum =new JTextField();
        txtsum.setBounds(200,220,200,80);
        add(txtsum);
        txtsum.setColumns(10);

        btn= new JButton("add");
        add(btn);
         btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent args0){
                n1= Integer.parseInt(txt1.getText());
                n2= Integer.parseInt(txt2.getText());
                sum=n1+n2;
                s=String.format("%d",sum);
                txtsum.setText(s);
            }
            
         });
    }
    public static void main(String args []){
        examadder f =new examadder();
        f.setLayout(new FlowLayout());
        f.setSize(1000,1000);
        f.setVisible(true);

    }
    
}
