import javax.swing.*;

public class JoptionPan {
    public static void main(String[] args) {
        // JOptionPane = pop up a standard dialog box that prompts users for a value or informs them of something.
     //   JOptionPane.showMessageDialog(null, "This is some useless message","Yanski",JOptionPane.PLAIN_MESSAGE);
//        JOptionPane.showMessageDialog(null, "This is some more useless message","Yanski",JOptionPane.INFORMATION_MESSAGE);
//        JOptionPane.showMessageDialog(null, "Hello how are you doing?","Yanski",JOptionPane.QUESTION_MESSAGE);
//        JOptionPane.showMessageDialog(null, "Your computer has a virus","Yanski",JOptionPane.WARNING_MESSAGE);
    //    JOptionPane.showMessageDialog(null, "Call tech support now","Yanski",JOptionPane.ERROR_MESSAGE);
//        System.out.println(JOptionPane.showConfirmDialog(null,"Bro, do you even code?","Yanski",JOptionPane.YES_NO_CANCEL_OPTION));
//        String name= JOptionPane.showInputDialog("What is your name?");
//        System.out.println("Hello "+ name);
        String[] responses = { "No, you're awesome","Thank you", "*blush*"};
        ImageIcon icon = new ImageIcon("10.jpg");
        JOptionPane.showOptionDialog(
                null,
                "You are awesome",
                "Yanski message",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                responses,
                0);
       // JOptionPane.showOptionDialog(null,"You are awesome","secret message",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,icon,null,0);
    }
}
