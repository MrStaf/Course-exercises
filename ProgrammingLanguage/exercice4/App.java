import java.awt.*;
import java.awt.event.*;

public class App extends Frame{

    /**
     *
     */
    private static final long serialVersionUID = -3305818604926287530L;

    App() {
        // close on x
        addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e) {  
                dispose();  
            }  
        });     
        


        Panel p1 = new Panel();
        p1.add(new Label("Label 1"));
        p1.add(new Label("Label 2"));

        p1.setLayout(new GridLayout(1,2));

        Panel p2 = new Panel();
        p2.add(new TextField(20));
        p2.add(new Button("Click me!"));

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


        Panel p3 = new Panel();
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

    public static void main(String[] args) throws Exception {
        new App();
    }
}