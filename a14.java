import java.awt.*;
import java.awt.event.*;

class Sum extends Frame {
    TextField num1, num2, result;
    Button addButton;

    SumApplet() {
        num1 = new TextField(); num2 = new TextField(); result = new TextField();
        addButton = new Button("Add");
        setLayout(new FlowLayout());
        add(new Label("Num1:")); add(num1); add(new Label("Num2:")); add(num2);
        add(addButton); add(new Label("Sum:")); add(result);
        addButton.addActionListener(e -> result.setText(String.valueOf(Integer.parseInt(num1.getText()) + Integer.parseInt(num2.getText()))));
        setSize(250, 150); setVisible(true);
    }

    public static void main(String[] args) { new SumApplet(); }
}
