package com.brunnhild.swingdesign.tabbedpane;

import javax.swing.*;
import java.awt.*;

class MyFrame extends JFrame {

    MyFrame() {
        super();
        setTitle("Swing Design");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        Container contentPane = getContentPane();

        MyPanel myPanel = new MyPanel();
        contentPane.add(myPanel);
    }
}
