import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterPanel extends JPanel {

    Register register;
    JTextField box;
    PursePanel changePanel;
    JLabel label;

    public RegisterPanel()
    {
        JLabel label = new JLabel(" Enter an amount: ");
        this.add(label);

        //Making the box and storing user data
        box = new JTextField();
        //Editing the box
        box.setEditable(true);
        box.setPreferredSize(new Dimension(300, 30));
        box.addActionListener(new CoinListener());
        this.add(box);
    }
    private class CoinListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String tempUserInput = box.getText();
            double userInput = Double.parseDouble(tempUserInput);

            Purse purse = register.makeChange(userInput);

            changePanel.setPurse(purse);

        }
    }

}




