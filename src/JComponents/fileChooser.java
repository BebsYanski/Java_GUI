package JComponents;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class fileChooser extends JFrame implements ActionListener {


    JButton button;
    fileChooser(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Select File");
        button.addActionListener(this);
        button.setFocusable(false);

        this.add(button);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            JFileChooser fileChooser= new JFileChooser();

            //fileChooser.setCurrentDirectory(new File("."));//for the default file to be current directory
            fileChooser.setCurrentDirectory(new File("C:\\Users\\dell\\Desktop"));

            //int response= fileChooser.showOpenDialog(null);//Selects file to open
            int response= fileChooser.showSaveDialog(null);//Selects file to save

            if (response == JFileChooser.APPROVE_OPTION){
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
            }
        }
    }
}
