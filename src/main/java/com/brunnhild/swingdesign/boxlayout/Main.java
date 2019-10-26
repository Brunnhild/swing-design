package com.brunnhild.swingdesign.boxlayout;

import com.bulenkov.darcula.DarculaLaf;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new DarculaLaf());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        MyFrame myFrame = new MyFrame();
        myFrame.setVisible(true);
    }
}
