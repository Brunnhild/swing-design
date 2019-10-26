package com.brunnhild.swingdesign.flowlayout;

import javax.swing.*;
import java.awt.*;

/**
 * A flow layout lets each component assume its natural (preferred) size
 * The flow direction is determined by the container's componentOrientation property and may be one of two values:
 * ComponentOrientation.LEFT_TO_RIGHT
 * ComponentOrientation.RIGHT_TO_LEFT
 *
 */
class MyPanel extends JPanel {

    MyPanel() {
        super();
        setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        setLayout(new FlowLayout(FlowLayout.LEFT, 40, 10));
        add(new JButton("Swing Design 1"));
        add(new JButton("Swing Design 2"));
        add(new JButton("Swing Design 3"));
        add(new JButton("Swing Design 4"));
        add(new JButton("Swing Design 5"));
        /* The default layout of JPanel is flow layout */
        System.out.println(getLayout());
    }
}
