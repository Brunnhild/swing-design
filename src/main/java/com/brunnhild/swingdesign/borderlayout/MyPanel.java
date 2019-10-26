package com.brunnhild.swingdesign.borderlayout;

import javax.swing.*;
import java.awt.*;

/**
 * In addition, BorderLayout supports the relative positioning constants, PAGE_START, PAGE_END, LINE_START, and LINE_END.
 * In a container whose ComponentOrientation is set to ComponentOrientation.LEFT_TO_RIGHT, these constants map to NORTH, SOUTH, WEST, and EAST, respectively.
 */
class MyPanel extends JPanel {

    MyPanel() {
        super();
        setLayout(new BorderLayout(0, 0));
        add(new JButton("Swing Design"), BorderLayout.WEST);
        add(new JButton("Swing Design"), BorderLayout.EAST);
        add(new JButton("Swing Design"), BorderLayout.SOUTH);
        add(new JButton("Swing Design"), BorderLayout.NORTH);

        /* CENTER is the default value, a single component will occupy the whole parent component. */
        add(new JButton("Swing Design"), BorderLayout.CENTER);

        System.out.println(getLayout());
    }
}
