package KeyListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class KeyListener extends JFrame implements java.awt.event.KeyListener {

    JLabel label ;
    ImageIcon icon;

    KeyListener(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500,500);

        label = new JLabel();
        label.setBounds(0,0,100,100);//Since layout is null
//        label.setBackground(Color.black);
//        label.setOpaque(true);// so that label can show

        icon = new ImageIcon("icons/rocket.png");

        label.setIcon(icon);
        this.getContentPane().setBackground(Color.black);

        this.add(label);
        this.setLayout(null);
        this.addKeyListener(this);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
//Keytyped = Invoked when a physical key is typed. Uses KeyChar, char output
        switch (e.getKeyChar()){
            case 'a':
                label.setLocation(label.getX()-10,label.getY());
                break;
            case 'w':
                label.setLocation(label.getX(),label.getY()-10);
                break;
            case 's':
                label.setLocation(label.getX()+10,label.getY());
                break;
            case 'z':
                label.setLocation(label.getX(),label.getY()+10);
                break;


        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
//KeyPressed = Invoked when a physical key is pressed down. Uses KeyCode, int output
        switch (e.getKeyCode()){
            case 37:
                label.setLocation(label.getX()-10,label.getY());
                break;
            case 38:
                label.setLocation(label.getX(),label.getY()-10);
                break;
            case 39:
                label.setLocation(label.getX()+10,label.getY());
                break;
            case 40:
                label.setLocation(label.getX(),label.getY()+10);
                break;

        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
//KeyReleased = Called whenever a button is released
        System.out.println("You Released key char: "+e.getKeyChar());
        System.out.println("You Released key Code: "+e.getKeyCode());

    }
}
