package ru.vsu.cs.kg2022.g61.Tararykov_Anton_Alekseevich.shop;

import java.awt.*;

public class Pumpkin {

    int heightPumpkin, widthPumpkin, xPumpkin, yPumpkin;

    public void draw(Graphics2D g) {

            heightPumpkin = 60+(int) (Math.random() * 60);
            widthPumpkin = 100+(int) (Math.random() * 50);
            xPumpkin = 65+(int) (Math.random() * 10);
            yPumpkin = 140+(int) (Math.random() * 10);
            g.setColor(new Color(0xFF8800));
            g.fillOval(xPumpkin, yPumpkin, widthPumpkin, heightPumpkin);
            g.setColor(new Color(0x000000));
            g.drawOval(xPumpkin, yPumpkin, widthPumpkin, heightPumpkin);
            g.setColor(new Color(0x17330F));
            g.fillOval(xPumpkin + (widthPumpkin / 2) - ((widthPumpkin / 4) / 2), yPumpkin, widthPumpkin / 4, heightPumpkin / 6);
        }
    }


