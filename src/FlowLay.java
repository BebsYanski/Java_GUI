import javax.swing.*;
import java.awt.*;

public class FlowLay {
    public static void main(String[] args) {
        /*Layout Manager = Defines the natural layout for components within a container
        FlowLayout = places components in a row, sized at their preferred size.
                    if the horizontal space in the container is too small,
                    the flowLayout class uses the next available row.
         */

        JFrame frame= new JFrame();
        frame.setTitle("Yanski");
        frame.setSize(500,500);
        frame.getContentPane().setBackground(Color.darkGray);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,6,0));

        JPanel panel= new JPanel();
        panel.setPreferredSize(new Dimension(250,250));
        panel.setBackground(Color.lightGray);
        panel.setLayout(new FlowLayout());
//        JButton button1= new JButton();
//        frame.add(button1);
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));
        panel.add(new JButton("10"));

        frame.add(panel);
        frame.setVisible(true);
    }
}
