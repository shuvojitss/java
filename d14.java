import javax.swing.*;
import java.awt.*;

class ConcentricCirclesSwing extends JPanel {
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int r = 20; r <= 100; r += 20) 
	g.drawOval(150 - r, 150 - r, r * 2, r * 2);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Concentric Circles");
        frame.add(new ConcentricCirclesSwing());
        frame.setSize(400, 400); 
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	frame.setVisible(true);
    }
}
