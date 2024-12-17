import java.applet.Applet;
import java.awt.*;

/* 
<applet code="ShapesApplet" width=400 height=300>
</applet>
*/

public class ShapesApplet extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillOval(50, 50, 150, 100); // Filled oval
        g.setColor(Color.RED);
        g.fillRect(250, 50, 150, 100); // Filled rectangle
    }
}
