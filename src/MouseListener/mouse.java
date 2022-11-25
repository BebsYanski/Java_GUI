package MouseListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class mouse extends JFrame implements MouseListener {

    JLabel label;
    mouse(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500,500);

        label = new JLabel();
        label.setBounds(0,0,100,100);
        label.setBackground(Color.cyan);
        label.setOpaque(true);
        label.addMouseListener(this);

        this.add(label);
        this.setLayout(null);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
//called when a mouse button has been clicked (pressed and released) on a component.

        System.out.println("You clicked the mouse");
    }

    @Override
    public void mousePressed(MouseEvent e) {
//called when a mouse button has been pressed on a component.
        System.out.println("You Pressed the mouse");
        label.setBackground(Color.BLUE);

    }

    @Override
    public void mouseReleased(MouseEvent e) {
//called when a mouse button has been released on a component.
        System.out.println("You Released the mouse");
        label.setBackground(Color.green);


    }

    @Override
    public void mouseEntered(MouseEvent e) {
//called when the mouse enters a component
        System.out.println("You entered the component");
        label.setBackground(Color.black);

    }

    @Override
    public void mouseExited(MouseEvent e) {
//called when the mouse exits a component
        System.out.println("You exited the component");
        label.setBackground(Color.cyan);



    }
}
