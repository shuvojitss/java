import java.applet.Applet;
import java.awt.*;

/* 
<applet code="WelcomeTextApplet" width=400 height=200>
</applet>
*/

public class WelcomeTextApplet extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.ORANGE);
        g.drawOval(100, 50, 200, 100); // Oval
        g.setColor(Color.BLACK);
        g.drawString("Welcome", 160, 100); // Text inside the oval
    }
}
