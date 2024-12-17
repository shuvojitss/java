import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ShowNameButton {
    ShowNameButton() {
        JFrame frame = new JFrame("Show Name");
        JButton button = new JButton("Click Name");
        JLabel label = new JLabel();
        button.addActionListener(e -> label.setText("Shuvojit Samanta"));
        frame.setLayout(new FlowLayout()); // Corrected import
        frame.add(button); frame.add(label);
        frame.setSize(250, 150); frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); frame.setVisible(true);
    }
    public static void main(String[] args) { new ShowNameButton(); }
}
