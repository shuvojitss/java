import java.applet.Applet;
import java.awt.*;

/* 
<applet code="HelloWorldApplet" width=300 height=200>
</applet>
*/

public class HelloWorldApplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("Hello World", 100, 100); // Display "Hello World" at (100, 100)
    }
}
