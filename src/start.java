import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class start implements ActionListener {
    JTextField textField;
    JButton normalButton, nightmareButton;
    int temp = 0;
    JFrame f = new JFrame();

    public void background() throws InterruptedException {
        textField = new JTextField();
        textField.setText(" T-rex run?");
        Font font = new Font("TimesRoman", Font.PLAIN, 30);
        textField.setFont(font);
        textField.setBounds(70, 50, 160, 120);
        textField.setEditable(false);
        normalButton = new JButton("normal");
        normalButton.setBounds(70, 170, 80, 70);
        nightmareButton = new JButton("nightmare");
        nightmareButton.setBounds(150, 170, 80, 70);
        normalButton.addActionListener(this);
        nightmareButton.addActionListener(this);
        f.add(textField);
        f.add(normalButton);
        f.add(nightmareButton);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == normalButton) {
            temp = 1;
        } else if (e.getSource() == nightmareButton)
            temp = 2;
    }

    public void close() {
        f.dispose();
    }
}
