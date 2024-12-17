import java.awt.*;
class ShapesAWT extends Frame {
    ShapesAWT() { setTitle("Shapes"); setSize(400, 300); setVisible(true); }
    public void paint(Graphics g) {
        g.setColor(Color.BLUE); g.fillOval(50, 50, 150, 100);
        g.setColor(Color.RED); g.fillRect(250, 50, 150, 100);
    }
    public static void main(String[] args) { new ShapesAWT(); }
}
