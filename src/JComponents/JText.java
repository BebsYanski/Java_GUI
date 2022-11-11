package JComponents;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JText extends JFrame implements ActionListener {

    JButton button;
    JTextField textField;
    JText(){
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setLayout(new FlowLayout());

       button= new JButton("Submit");
       button.addActionListener(this);

       textField= new JTextField();
       textField.setPreferredSize(new Dimension(250,40));
       textField.setFont(new Font("Consolas",Font.PLAIN,35));
       textField.setForeground(new Color(0x00FF00));
       textField.setBackground(Color.black);
       textField.setCaretColor(Color.white);
       textField.setText("username");
       textField.setEditable(false);

       this.add(textField);
       this.add(button);
       this.pack();
       this.setVisible(true);
   }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            button.setEnabled(false);
            textField.setEditable(false);
            System.out.println("Welcome "+ textField.getText());;
        }
    }
}
