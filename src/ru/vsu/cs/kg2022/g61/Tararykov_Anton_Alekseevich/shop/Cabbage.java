package ru.vsu.cs.kg2022.g61.Tararykov_Anton_Alekseevich.shop;

import java.awt.*;

public class Cabbage {
    int radiusCabbage, xCabbage, yCabbage;
    public void draw(Graphics2D g) {
        radiusCabbage = 150;
        xCabbage = 65+(int) (Math.random() * 10);
        yCabbage = 140+(int) (Math.random() * 10);

        g.setColor(new Color(0xDACBA6));
        g.fillOval(xCabbage, yCabbage, radiusCabbage, radiusCabbage);
        g.setColor(new Color(0x000000));
        g.drawOval(xCabbage, yCabbage, radiusCabbage, radiusCabbage);
    }
}
