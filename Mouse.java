import javax.swing.*;
import java.awt.event.*; 
public class Mouse extends JFrame implements MouseListener, MouseMotionListener
{ 
 JLabel lbl; 
 Mouse() //constructor here
{ 
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //for exit when window closed
addMouseListener(this); 
addMouseMotionListener(this);
lbl=new JLabel(); 
lbl.setBounds(20,50,200,50); 
add(lbl); 
} 
// Handle mouse clicked
 public void mouseClicked(MouseEvent e) 
{ 
lbl.setText("Mouse Clicked " ); 
} 
// Handle mouse entered.
 public void mouseEntered(MouseEvent e) 
{ 
lbl.setText("Mouse Entered"); 
} 
// Handle mouse exited.
 public void mouseExited(MouseEvent e) 
{ 
lbl.setText("Mouse Exited"); 
} 
// Handle mouse pressed.
 public void mousePressed(MouseEvent e) 
{ 
lbl.setText("Mouse Pressed"); 
} 
// Handle mouse released
public void mouseReleased(MouseEvent e) 
{ 
lbl.setText("Mouse Released"); 
} 
// Handle mouse dragged.
public void mouseDragged(MouseEvent e) 
{
lbl.setText("Dragging mouse at " + e.getX() + ", " + e.getX());
}
// Handle mouse moved.
public void mouseMoved(MouseEvent e) 
{
lbl.setText("Moving mouse at " + e.getX() + ", " + e.getY());
}
//main here
public static void main(String[] args) 
{ 
Mouse ob= new Mouse(); //object creation
ob.setSize(500,500); 
ob.setLayout(null); 
ob.setVisible(true);
} 
}