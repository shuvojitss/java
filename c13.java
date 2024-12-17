import java.applet.Applet;
import java.awt.*;

/* 
<applet code="ConcentricCirclesApplet" width=400 height=400>
</applet>
*/

public class ConcentricCirclesApplet extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.GREEN);
        for (int r = 20; r <= 100; r += 20) { // Increment radius
            g.drawOval(150 - r, 150 - r, r * 2, r * 2); // Concentric circles
        }
    }
}
