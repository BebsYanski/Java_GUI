package JComponents;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Jcombo extends JFrame implements ActionListener {

    JComboBox comboBox;
    Jcombo(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

//        Cannot store primitive data types in combobox
        Integer[] num={1,2,3,4,3};
        String[] animals={"dog","cat","bird"};
        comboBox= new JComboBox(animals);
        comboBox.addActionListener(this);

        //comboBox.setEditable(true);//You can use this to search for an item
        System.out.println(comboBox.getItemCount());
        comboBox.addItem("Pig");
        comboBox.insertItemAt("Horse",0);
        comboBox.setSelectedIndex(0);
//        comboBox.removeItem("cat");
        comboBox.removeItemAt(0);
        comboBox.removeAllItems();

        this.add(comboBox);
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
            if(e.getSource()==comboBox){
//                System.out.println(comboBox.getSelectedItem());
                System.out.println(comboBox.getSelectedIndex());
            }

    }
}
