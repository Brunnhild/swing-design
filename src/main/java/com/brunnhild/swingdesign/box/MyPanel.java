package com.brunnhild.swingdesign.box;

import javax.swing.*;

class MyPanel extends JPanel {

    MyPanel() {
        super();

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        add(Box.createGlue());
        for(int i = 0; i < 3; i++) {
            /* Creates a Box that displays its components along the the specified axis. */
            Box hbox = new Box(BoxLayout.X_AXIS);
            hbox.add(Box.createGlue());
            hbox.add(new JButton("Swing Design " + i));
            hbox.add(Box.createGlue());
            add(hbox);
            add(Box.createGlue());
        }

        /* Returns the minimum dimensions needed to lay out the components contained in the specified target container. */
        System.out.println(getLayout());
    }
}
