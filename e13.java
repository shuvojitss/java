import java.applet.Applet;
import java.awt.*;

/* 
<applet code="SquareWithCirclesApplet" width=400 height=400>
</applet>
*/

public class SquareWithCirclesApplet extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.MAGENTA);
        g.fillRect(150, 150, 100, 100); // Filled square
        g.setColor(Color.CYAN);
        g.drawOval(130, 130, 140, 140); // Outer circle
        g.drawOval(160, 160, 80, 80);   // Inner circle
    }
}
