import javax.swing.*;
import java.awt.FlowLayout;
import java.util.Arrays;

public class Window extends JFrame {

    JLabel lbl1, lbl2, lbl3, lbl4, lbl5, lbl6, lbl7;

    public Window() {
        super("First JFrame Window");
        setLayout(new FlowLayout());

        lbl1 = new JLabel("This is the first label ");
        lbl2 = new JLabel("This is the second label ");
        lbl3 = new JLabel("This is the third label ");
        lbl4 = new JLabel("This is the forth label ");
        lbl5 = new JLabel("This is the fifth label ");
        lbl6 = new JLabel("This is the sixth label ");
        lbl7 = new JLabel("This is the seventh label ");

        // add(lbl1); add(lbl2); add(lbl3); add(lbl4); add(lbl5); add(lbl6); add(lbl7);

        for (JLabel jLabel : Arrays.asList(lbl1, lbl2, lbl3, lbl4, lbl5, lbl6, lbl7)) {
            add(jLabel);
        }

    }
}
