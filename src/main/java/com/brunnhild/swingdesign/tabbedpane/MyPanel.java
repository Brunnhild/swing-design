package com.brunnhild.swingdesign.tabbedpane;

import javax.swing.*;
import java.awt.*;

class MyPanel extends JTabbedPane {

    MyPanel() {
        super(JTabbedPane.TOP);
        Font font = new Font(getFont().getFamily(), getFont().getStyle(), 18);
        setFont(font);

        String[] names = {"First", "Second", "Third"};
        for(int i = 0; i < 3; i++) {
            JButton jButton = new JButton("Swing Design " + i);
            jButton.setFont(font);
            add(names[i], jButton);
        }

        /* the default layout is BasicTabbedPaneUI$TabbedPaneLayout. */
        System.out.println(getLayout());
    }
}
