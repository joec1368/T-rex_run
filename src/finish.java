import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class finish implements ActionListener {
    JTextField  textField;
    JButton okButton, againButton;
    JFrame f= new JFrame();
    int temp = 0;
    public void background(long time) throws InterruptedException {
        textField =new JTextField();
        textField.setText("Servie Time : \n" +String.valueOf(time) + " s");
        Font font = new Font("TimesRoman", Font.PLAIN, 18);
        textField.setFont(font);
        textField.setBounds(75,50,150,120);
        textField.setEditable(false);
        okButton =new JButton("OK");
        okButton.setBounds(75,170,70,70);
        againButton =new JButton("Again");
        againButton.setBounds(155,170,70,70);
        okButton.addActionListener(this);
        againButton.addActionListener(this);
        f.add(textField);f.add(okButton);f.add(againButton);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
        }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== okButton){
            System.exit(0);
        }
        else if(e.getSource()== againButton)
            temp = 1;

    }
    public void close(){
        f.dispose();
    }
}