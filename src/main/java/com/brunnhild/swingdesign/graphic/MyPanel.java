package com.brunnhild.swingdesign.graphic;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;

class MyPanel extends JPanel {

    MyPanel() {
        super();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        String imgPath = "src/main/resources/test.jpg";
        try {
            BufferedImage image = ImageIO.read(new FileInputStream(imgPath));
            g.drawImage(image, 200, 200, 300, 300, null);
        } catch (IOException e) {
            e.printStackTrace();
        }

        g.setColor(new Color(0.5f, 0.5f, 0.5f, 0.5f));

        g.fillRect(0, 0, getWidth(), getHeight());

        g.setColor(Color.CYAN);

        g.drawRoundRect(10, 10, 50, 50, 30, 30);

        g.drawOval(100, 100, 20, 40);

        System.out.println(g.getColor());
    }
}
