package ru.vsu.cs.kg2022.g61.Tararykov_Anton_Alekseevich.shop;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D canvas = (Graphics2D) g;

        canvas.setColor(new Color(0x9A866B));
        canvas.drawRect(0,0,1440,768);
        canvas.fillRect(0,0,1440,768);

        //стеллаж

        int x,y, height, width;

        canvas.setColor(new Color(0x000000));
        canvas.drawRect(80,128,1280,640);
        canvas.fillRect(80,128,1280,640);

    }


}