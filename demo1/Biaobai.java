import javax.swing.*;
import java.awt.*;

public class Biaobai {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Heart Drawing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(new HeartPanel());
        frame.setVisible(true);
    }
}

class HeartPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;
        int size = 100;

        g.setColor(Color.RED);

        // Draw left half of the heart
        g.fillArc(centerX - size, centerY - size, size * 2, size * 2, 0, -180);

        // Draw right half of the heart
        g.fillArc(centerX, centerY - size, size * 2, size * 2, 0, -180);

        // Draw the triangle bottom
        int[] xPoints = {centerX - size * 2, centerX + size * 2, centerX};
        int[] yPoints = {centerY, centerY, centerY + size * 2};
        g.fillPolygon(xPoints, yPoints, 3);
    }
}
