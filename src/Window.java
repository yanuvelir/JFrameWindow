import javax.swing.*;
import java.awt.FlowLayout;

public class Window extends JFrame{

    JLabel lbl1;
    JLabel lbl2;

    public Window(){
        super("First JFrame Window");
        setLayout(new FlowLayout());

        lbl1 = new JLabel("This is the first label ");
        lbl2 = new JLabel("This is the second label");
        add(lbl1);
        add(lbl2);

    }
}
