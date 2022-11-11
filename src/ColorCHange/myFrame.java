package ColorCHange;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myFrame extends JFrame implements ActionListener {
   JButton button;
    myFrame(){
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setLayout(new FlowLayout());
       this.getContentPane().setBackground(Color.BLACK);

       button = new JButton("Change Color");
       button.addActionListener(this);

       this.add(button);
       this.pack();
       this.setVisible(true);
   }
    @Override
    public void actionPerformed(ActionEvent e) {

            if (e.getSource() == button) {
                Color s = this.getContentPane().getBackground();
                System.out.println(s);
                if (s == Color.BLACK) {
                    this.getContentPane().setBackground(Color.RED);
                } else if (s == Color.RED) {
                    this.getContentPane().setBackground(Color.GREEN);
                } else if (s == Color.GREEN) {
                    this.getContentPane().setBackground(Color.BLUE);
                } else {
                    this.getContentPane().setBackground(Color.BLACK);
                }
            }
        }

}
