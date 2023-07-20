package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Panelik extends JPanel implements ActionListener {

    JLabel label1;
    JButton button1;
    JTextArea JTextArea1;



    public Panelik() {
        this.setLayout(new BorderLayout());

        this.setSize(500,500);

        label1 = new JLabel("wpisz tekst");
        this.add(label1, BorderLayout.NORTH);

        button1 = new JButton();
        button1.setText("zacznij pisać");
        button1.setSize(100, 30);
        button1.addActionListener(e-> new RobotScrypt(JTextArea1.getText()));
        this.add(button1, BorderLayout.SOUTH);

        JTextArea1 = new JTextArea("tutaj kupjujesz tekst");
        this.add(JTextArea1, BorderLayout.CENTER);
        JTextArea1.setLineWrap(true); // Ta linia sprawia, że tekst zostanie zawinięty
        JTextArea1.setWrapStyleWord(true); // Ta linia sprawia, że słowa są zawijane


        Dimension minSize = new Dimension(400, 300);
        this.setMinimumSize(minSize);
        System.out.println("panelik");


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== button1){
            new RobotScrypt(JTextArea1.getText());
        }
    }
}
