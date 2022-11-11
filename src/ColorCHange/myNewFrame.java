package ColorCHange;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myNewFrame extends JFrame implements ActionListener {
   JCheckBox checkBox1,checkBox2,checkBox3;
    int c1,c2,c3;

    myNewFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        checkBox1=new JCheckBox("RED");
        checkBox2=new JCheckBox("GREEN");
        checkBox3=new JCheckBox("BLUE");

        checkBox1.addActionListener(this);
        checkBox2.addActionListener(this);
        checkBox3.addActionListener(this);

        this.add(checkBox1);
        this.add(checkBox2);
        this.add(checkBox3);
        this.pack();
        this.setVisible(true);
    }

    void check(){

        if (checkBox1.isSelected()){
            checkBox2.setSelected(false);
            checkBox3.setSelected(false);
        } else if (checkBox2.isSelected()) {
            checkBox1.setSelected(false);
            checkBox3.setSelected(false);
        } else{
            checkBox1.setSelected(false);
            checkBox2.setSelected(false);

        }

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        check();
            if (e.getSource()==checkBox1){
                this.getContentPane().setBackground(Color.RED);
            }

        if (e.getSource()==checkBox2){
            this.getContentPane().setBackground(Color.GREEN);
        }

        if (e.getSource()==checkBox3){
            this.getContentPane().setBackground( Color.BLUE);
        }
    }
}
