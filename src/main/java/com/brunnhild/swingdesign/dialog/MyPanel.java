package com.brunnhild.swingdesign.dialog;

import javax.swing.*;
import java.awt.*;

class MyPanel extends JPanel {

    MyPanel() {
        super();
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        add(Box.createGlue());

        Box box = new Box(BoxLayout.Y_AXIS);
        box.add(Box.createGlue());
        JButton jButton1 = new JButton("Message");
        jButton1.addActionListener((e) -> {
            JOptionPane.showMessageDialog(this, "Attention! ");
        });

        JButton jButton2 = new JButton("Confirm");
        jButton2.addActionListener((e) -> {

            /* 0 for consent, 1 for denial, 2 for cancel. */
            int ans =  JOptionPane.showConfirmDialog(this, "Choose your option. ");
            System.out.println(ans);
        });

        JButton jButton3 = new JButton("Input");
        jButton3.addActionListener((e) -> {

            /* return null when canceled, chinese input is not supported. */
            String s = JOptionPane.showInputDialog("Input something. ");
            System.out.println(s);
        });

        box.add(jButton1);
        box.add(jButton2);
        box.add(jButton3);
        box.add(Box.createGlue());
        add(box);

        add(Box.createGlue());

    }
}
