import java.awt.*;
import java.awt.event.*;

import javax.swing.AbstractButton;
import javax.swing.JCheckBox;



public class AWTApp_Task1 extends Frame{

    /**
     *
     */
    private static final long serialVersionUID = -3305818604926287530L;
    public String choice;
    public String textFieldContent;
    public TextField text;
    public String checkboxText;

    AWTApp_Task1() {
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
        text =new TextField(20);
        p2.add(text);
        Button button = new Button("Click me!");
        p2.add(button);

        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        p2.setLayout(new GridLayout(1,2));


        // Elements for panel 3 : Choice & Checkbox
        Choice cb = new Choice();
        cb.add("element 1");
        cb.add("element 2");
        cb.add("element 3");
        
        cb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                choice1ItemStateChanged(evt);
            }
        });

        CheckboxGroup grp = new CheckboxGroup();
        Checkbox r1 = new Checkbox("option 1", grp, true);
        Checkbox r2 = new Checkbox("option 2", grp, true);
        Checkbox r3 = new Checkbox("option 3", grp, true);

        r1.addItemListener(new java.awt.event.ItemListener()  {
            @Override
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkBoxItemStateChanged(evt);
            }
        });
        r2.addItemListener(new java.awt.event.ItemListener()  {
            @Override
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkBoxItemStateChanged(evt);
            }
        });
        r3.addItemListener(new java.awt.event.ItemListener()  {
            @Override
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkBoxItemStateChanged(evt);
            }
        });

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

    public void checkBoxItemStateChanged(ItemEvent e) {
        this.checkboxText = e.getItem().toString();
        System.out.printf("CheckBox Content : %s\n", this.checkboxText);
    }

    public void choice1ItemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            this.choice = e.getItem().toString();
            System.out.printf("Text Choice Content :%s \n",this.choice);
        }
    }

    public void button1ActionPerformed(ActionEvent e) {
        this.textFieldContent = this.text.getText();
        this.text.setText("");
        System.out.printf("Text Field Content : %s\n",this.textFieldContent);
    }

    public static void main(String[] args) throws Exception {
        new AWTApp_Task1();
    }
}