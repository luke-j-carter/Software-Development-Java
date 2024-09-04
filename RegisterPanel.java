/* DOES NOT WORK Throws a NullPointerException
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

public class RegisterPanel extends JPanel {

    Register register;
    JTextField box;
    PursePanel changePanel;
    JLabel label;

    public RegisterPanel()
    {
        Register register = new Register();

        JPanel panel = new JPanel();
        panel.setBackground(Color.yellow);
        panel.setPreferredSize(new Dimension(500, 500));

        JLabel label = new JLabel(" Enter an amount: ");
        label.setAlignmentX(Component.LEFT_ALIGNMENT);
        this.add(label);


        //Making the box and storing user data
        box = new JTextField();
        //Editing the box
        box.setEditable(true);
        box.setPreferredSize(new Dimension(300, 30));
        box.setAlignmentX(SwingConstants.CENTER);
        box.addActionListener(new CoinListener());
        this.add(box);

        changePanel = new PursePanel();
        this.add(changePanel);
    }
    private class CoinListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
                String tempUserInput = box.getText();
                double userInput = Double.parseDouble(tempUserInput);
                Purse purse = register.makeChange(userInput);
        }
    }

}
*/



