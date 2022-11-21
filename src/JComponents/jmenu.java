package JComponents;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class jmenu extends JFrame implements ActionListener {


    JMenuItem loadItem;
    JMenuItem newItem;
    JMenuItem openItem;
    JMenuItem saveItem;
    JMenuItem exitItem;

    JLabel label;
    
    ImageIcon exitIcon;
    ImageIcon loadIcon;
    ImageIcon saveIcon;
    ImageIcon newIcon;
    ImageIcon openIcon;
    jmenu(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());

        loadIcon = new ImageIcon("icons/folder.png");
        newIcon = new ImageIcon("icons/edit.png");
        openIcon = new ImageIcon("icons/new.png");
        saveIcon = new ImageIcon("icons/save.png");
        exitIcon = new ImageIcon("icons/exit.png");

        label = new JLabel();
        this.add(label);

        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu helpMenu = new JMenu("Help");

        loadItem = new JMenuItem("Load");
        newItem = new JMenuItem("New");
         openItem = new JMenuItem("Open");
         saveItem = new JMenuItem("Save");
         exitItem = new JMenuItem("Exit");

        loadItem.addActionListener(this);
        newItem.addActionListener(this);
        openItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        loadItem.setIcon(loadIcon);
        newItem.setIcon(newIcon);
        openItem.setIcon(openIcon);
        saveItem.setIcon(saveIcon);
        exitItem.setIcon(exitIcon);

       fileMenu.setMnemonic(KeyEvent.VK_F);//Alt + F for file
        editMenu.setMnemonic(KeyEvent.VK_E);//Alt + E for file
        helpMenu.setMnemonic(KeyEvent.VK_H);//Alt + H for file
        loadItem.setMnemonic(KeyEvent.VK_L);
        saveItem.setMnemonic(KeyEvent.VK_S);
        openItem.setMnemonic(KeyEvent.VK_O);
        newItem.setMnemonic(KeyEvent.VK_N);
        exitItem.setMnemonic(KeyEvent.VK_E);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        fileMenu.add(loadItem);
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        this.setJMenuBar(menuBar);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==loadItem){
            System.out.println("Loading item");
            label.setText("You loaded a file");
        }
        if (e.getSource()==saveItem){
            System.out.println("You saved an item");
            label.setText("You saved a file");
        }
        if (e.getSource()==openItem){
            System.out.println("You Opened an item");
            label.setText("You Opened a file");
        }
        if (e.getSource()==newItem){
            System.out.println("You Created an item");
            label.setText("You Created a new file");
        }
        if (e.getSource()==exitItem){
            System.out.println("You are exiting...");
            label.setText("You are exiting...");

            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
            //System.exit(0);
            this.dispose();
        }
    }
}
