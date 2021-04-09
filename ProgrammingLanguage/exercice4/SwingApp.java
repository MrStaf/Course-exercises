import javax.swing.*;
import java.awt.*;

public class SwingApp extends JFrame {
    /**
     *
     */
    private static final long serialVersionUID = 8204654634183141093L;

    SwingApp() {
        JPanel p1 = new JPanel();
        p1.add(new JLabel("Label 1"));
        p1.add(new JLabel("Label 2"));

        p1.setLayout(new GridLayout(1,2));

        JPanel p2 = new JPanel();
        p2.add(new JTextField(20));
        p2.add(new JButton("Click me!"));

        p2.setLayout(new GridLayout(1,2));


        // Elements for panel 3 : Choice & Checkbox
        Choice cb = new Choice();
        cb.add("element 1");
        cb.add("element 2");
        cb.add("element 3");
        
        CheckboxGroup grp = new CheckboxGroup();
        Checkbox r1 = new Checkbox("option 1", grp, true);
        Checkbox r2 = new Checkbox("option 2", grp, true);
        Checkbox r3 = new Checkbox("option 3", grp, true);


        JPanel p3 = new JPanel();
        p3.add(cb);
        p3.add(r1);
        p3.add(r2);
        p3.add(r3);
        
        p3.setLayout(new FlowLayout(FlowLayout.CENTER));

        this.add(p1, BorderLayout.NORTH);  
        this.add(p2, BorderLayout.CENTER);  
        this.add(p3, BorderLayout.SOUTH);  
        this.setSize(550,120);    
        this.setLayout(new GridLayout(3,1));  
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    public static void main (String args[]) throws Exception {
        new SwingApp();
    }
}
