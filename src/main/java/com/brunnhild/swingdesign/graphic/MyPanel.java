package com.brunnhild.swingdesign.graphic;

import javax.swing.*;
import java.awt.*;

class MyPanel extends JPanel {

    MyPanel() {
        super();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(new Color(0.5f, 0.5f, 0.5f, 0.5f));

        g.drawRoundRect(10, 10, 100, 100, 30, 30);

        System.out.println(g.getColor());
    }
}
