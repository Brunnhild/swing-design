package com.brunnhild.swingdesign.boxlayout;

import javax.swing.*;

class MyPanel extends JPanel {

    MyPanel() {
        super();
        /* Creates a layout manager that will lay out components along the given axis. */
        BoxLayout boxLayout = new BoxLayout(this, BoxLayout.X_AXIS);
        setLayout(boxLayout);
        add(new JButton("Swing Design 1"));
        add(new JButton("Swing Design 2"));
        add(new JButton("Swing Design 3"));
        add(new JButton("Swing Design 4"));
        add(new JButton("Swing Design 5"));
        /* Returns the minimum dimensions needed to lay out the components contained in the specified target container. */
        System.out.println(boxLayout.minimumLayoutSize(this));
        System.out.println(getLayout());
    }
}
