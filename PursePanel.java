/* DOES NOT WORK Throws a NullPointerException
import javax.swing.*;
import java.awt.*;
import java.util.Map;


public class PursePanel extends JPanel
{
    Purse purse = new Purse();
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        JPanel panel = new JPanel();
        panel.setBackground(Color.GRAY);
        panel.setPreferredSize(new Dimension(500, 500));
        panel.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.add(panel);

        JLabel label = new JLabel("The contents of the purse: ");
        panel.add(label);
        g.drawString(purse.toString(), 10, 20);
    }
}
*/
