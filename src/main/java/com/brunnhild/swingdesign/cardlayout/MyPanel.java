package com.brunnhild.swingdesign.cardlayout;

import javax.swing.*;
import java.awt.*;

class MyPanel extends JPanel {

    MyPanel() {
        super();
        CardLayout cardLayout = new CardLayout();
        setLayout(cardLayout);

        add(new JButton("Swing Design 1"), "1");
        add(new JButton("Swing Design 2"), "2");
        add(new JButton("Swing Design 3"), "3");

        cardLayout.show(this, "2");

        System.out.println(getLayout());
    }
}
