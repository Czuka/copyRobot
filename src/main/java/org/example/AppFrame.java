package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class AppFrame {


    JFrame frame;
    Panelik jp;



    public void initComponents() {
        frame = new JFrame("Robot AWT");
        frame.setDefaultCloseOperation(3);
        frame.setBounds(100,100,500,500);
        frame.setVisible(true);
        jp = new Panelik();
        frame.add(jp);

    }

    public AppFrame() {
        initComponents();


    }




}
