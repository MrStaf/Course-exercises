import java.awt.*;
import java.awt.event.*;

import javax.swing.event.MouseInputListener;

public class MouseTracker_Task2 extends Frame{
    public int x;
    public int y;
    MouseTracker_Task2() {
        addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e) {  
                dispose();  
            }  
        });
        addMouseMotionListener(new MouseInputListener(){
            @Override
            public void mouseMoved(MouseEvent e) {
                x = e.getX();
                y = e.getY();
                repaint();
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }
        });
        this.setSize(550,120);    
        this.setLayout(null);
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2D.setBackground(Color.white);
        g2D.setColor(Color.BLACK);
        g2D.drawString(this.x+","+this.y, this.x+1, this.y+1);
    }

    public static void main (String args[]) {
        MouseTracker_Task2 m = new MouseTracker_Task2();
        m.setVisible(true);
    }
}
