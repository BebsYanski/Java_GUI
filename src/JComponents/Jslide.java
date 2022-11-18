package JComponents;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Jslide implements ChangeListener {

    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;

   Jslide(){
       frame= new JFrame("Slider Demo");
       panel = new JPanel();
       label = new JLabel();
       slider = new JSlider(0,100,50);

       slider.setPreferredSize(new Dimension(200,350));
       slider.setPaintTicks(true);
       slider.setMinorTickSpacing(10);

       slider.setPaintTrack(true);
       slider.setMajorTickSpacing(25);

       slider.setPaintLabels(true);
       slider.setFont(new Font("MV Boli",Font.PLAIN,15));
       label.setFont(new Font("MV Boli",Font.PLAIN,25));

       slider.setOrientation(SwingConstants.VERTICAL);

       label.setText("°C= "+slider.getValue());

       slider.addChangeListener(this);

       panel.setBackground(Color.cyan);
       panel.add(slider);
       panel.add(label);

       frame.add(panel);
       frame.setSize(420,420);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);



   }

    @Override
    public void stateChanged(ChangeEvent e) {
        if(e.getSource()==slider){
//            System.out.println(slider.getX());
            System.out.println(slider.getValue());
            label.setText("°C = "+slider.getValue());

        }
    }
}
