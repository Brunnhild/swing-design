package com.brunnhild.swingdesign.menu;

import javax.swing.*;
import java.awt.*;

class MyPanel extends JPanel {

    MyPanel() {
        super();

        setLayout(new BorderLayout());

        JMenuBar jMenuBar = new JMenuBar();

        /* A tear-off menu is not yet implemented. */
        jMenuBar.add(new JMenu("First"), true);

        JMenu jMenu = new JMenu("Second");
        jMenu.add(new JMenuItem("Second-First"));
        jMenu.add(new JMenuItem("Second-Second"));
        jMenu.add(new JMenuItem("Second-Third"));

        JMenu subMenu = new JMenu("Pop up");
        subMenu.add(new JMenuItem("one"));
        subMenu.add(new JMenuItem("two"));
        subMenu.add(new JMenuItem("three"));

        jMenu.add(subMenu);
        jMenuBar.add(jMenu);

        /* Similar to Box.createGlue. */
        jMenuBar.add(new JSeparator(SwingConstants.HORIZONTAL));

        jMenuBar.add(new JMenu("Third"));

        add(jMenuBar, BorderLayout.NORTH);
    }
}
