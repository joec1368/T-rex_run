import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class start implements ActionListener {
    JTextField  textField;
    JButton startButton, againButton;
    int temp = 0;
    JFrame f= new JFrame();
    public void background() throws InterruptedException {
        textField =new JTextField();
        textField.setText(" T-rex run?");
        Font font = new Font("TimesRoman", Font.PLAIN, 30);
        textField.setFont(font);
        textField.setBounds(75,50,150,120);
        textField.setEditable(false);
        startButton =new JButton("Start");
        startButton.setBounds(75,170,150,70);
        startButton.addActionListener(this);
        f.add(textField);f.add(startButton);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== startButton){
            temp = 1;
        }
    }
    public void close(){
        f.dispose();
    }
}