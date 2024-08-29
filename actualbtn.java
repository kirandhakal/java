
import javax.swing.*;

public class actualbtn extends JFrame {
    public static void main(String[] args) {
        JFrame f = new JFrame("This is a Frame");
        f.setSize(500, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null); // Use null layout

        // Create components
        JLabel l1 = new JLabel("This is label");
        JTextField t1 = new JTextField(20);
        JButton btn = new JButton("Hi");
        JTextField txt = new JTextField(20);

        // Set bounds for each component
        l1.setBounds(50, 50, 200, 30);
        t1.setBounds(50, 100, 200, 30);
        btn.setBounds(50, 150, 100, 30);
        txt.setBounds(50, 200, 200, 30);

        // Add components to frame
        f.add(l1);
        f.add(t1);
        f.add(btn);
        f.add(txt);

        // Set frame visibility
        f.setVisible(true);
    }
}
