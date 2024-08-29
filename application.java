import java.awt.*;
public class application extends Frame{
     label lbl;
     
     application(){
        setTitle("hello");
        lbl = new label();
        // lbl.setBounds()
        // Add(lbl);
        setSize(400,400);
        setVisible(true);

     }
     public static void main(String []args){
        application ap =new application();
        
     }

}