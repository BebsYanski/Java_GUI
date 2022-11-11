package JComponents;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JCheckb extends JFrame implements ActionListener {
    // JCheckbox = a GUI component that can be selected or deselected.

    JButton button;
    JCheckBox checkBox;
    ImageIcon xIcon;
    ImageIcon checkIcon;
    JCheckb(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        xIcon= new ImageIcon("img/swiper-component-2_icon.png");
        checkIcon= new ImageIcon("img/popup-icon.jpg");

        button= new JButton();
        button.setText("submit");
        button.addActionListener(this);


        checkBox= new JCheckBox();
        checkBox.setText("I am not a Robot");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consolas",Font.PLAIN,30));
        checkBox.setIcon(xIcon);
        checkBox.setSelectedIcon(checkIcon);

        this.add(checkBox);
        this.add(button);
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            System.out.println(checkBox.isSelected());;
        }
    }

}
