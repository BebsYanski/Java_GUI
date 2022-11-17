package JComponents;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class jradio extends JFrame implements ActionListener {
    JRadioButton pizzaButton;
    JRadioButton hamburgerButton;
    JRadioButton hotDogButton;

    ImageIcon pizzaIcon;
    ImageIcon hamburgerIcon;
    ImageIcon hotDogIcon;
    jradio(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        pizzaIcon=new ImageIcon("img/beian.png");
        hamburgerIcon=new ImageIcon("img/Facebook.png");
        hotDogIcon=new ImageIcon("img/Linkedin.png");

         pizzaButton = new JRadioButton("Pizza");
         hamburgerButton = new JRadioButton("Hamburger");
         hotDogButton = new JRadioButton("Hotdog");

        ButtonGroup group= new ButtonGroup();
        group.add(pizzaButton);
        group.add(hamburgerButton);
        group.add(hotDogButton);

        pizzaButton.addActionListener(this);
        hamburgerButton.addActionListener(this);
        hotDogButton.addActionListener(this);

        pizzaButton.setIcon(pizzaIcon);
        hamburgerButton.setIcon(hamburgerIcon);
        hotDogButton.setIcon(hotDogIcon);

        this.add(pizzaButton);
        this.add(hamburgerButton);
        this.add(hotDogButton);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            if(e.getSource()==pizzaButton){
                System.out.println("You ordered a Pizza");
            }
            if(e.getSource()==hamburgerButton){
                System.out.println("You ordered a Hamburger");
            }
            if(e.getSource()==hotDogButton){
                System.out.println("You ordered a hotdog");
            }
    }
}
