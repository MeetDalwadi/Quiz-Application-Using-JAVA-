package Quiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener {
    String name;
    JButton start, back;

    Rules(String name) {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        JLabel heading = new JLabel("WELCOME   " + name);
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 35));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);
        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText(
                "<html>" +
                        "1. there are multiple choice questions" + "<br><br>" +
                        "2. 4 options are there                " + "<br><br>" +
                        "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>"
                        +
                        "4. select one option" + "<br><br>" +
                        "5. one life line is also there" + "<br><br>" +
                        "6. you can use lifeline only one time" + "<br><br>" +
                        "7. each question carry 10 marks" + "<br><br>" +
                        "8. good luck" + "<br><br>" +
                        "<html>");
        add(rules);
        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        setSize(800, 650);
        setLocation(300, 100);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Mquiz(name);
        } else if (ae.getSource() == back) {
            setVisible(false);
            new Login();
        }
    }

    public static void main(String[] args) {
        new Rules("User");
    }
}
