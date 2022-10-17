package ru.vsu.cs.kg2022.g61.Tararykov_Anton_Alekseevich.shop;

import java.awt.*;

public class Cabbage {
    int radiusCabbage, xCabbage, yCabbage;
    public void draw(Graphics2D g) {
        radiusCabbage = 90;
        xCabbage = 240+(int) (Math.random() * 70);
        yCabbage = 140+(int) (Math.random() * 10);
        g.setColor(new Color(0xDACBA6));
        g.fillOval(xCabbage, yCabbage, radiusCabbage, radiusCabbage);
        g.setColor(new Color(0x000000));
        g.drawOval(xCabbage, yCabbage, radiusCabbage, radiusCabbage);
        g.drawOval((int)(xCabbage),(int)(yCabbage*1.05),(int)(radiusCabbage/1.1),(int)(radiusCabbage/1.1));
        g.drawOval(xCabbage+(xCabbage/3)/5,yCabbage+(yCabbage/3)/5, (int) (radiusCabbage/1.5), (int) (radiusCabbage/1.5));
        g.drawOval((int) (xCabbage*1.1), (int) (yCabbage*1.07),(int) (radiusCabbage/2), (int) (radiusCabbage/2));

        xCabbage = 65+(int) (Math.random() * 70);
        yCabbage = 390+(int) (Math.random() * 10);
        g.setColor(new Color(0xDACBA6));
        g.fillOval(xCabbage, yCabbage, radiusCabbage, radiusCabbage);
        g.setColor(new Color(0x000000));
        g.drawOval(xCabbage, yCabbage, radiusCabbage, radiusCabbage);
        g.drawOval((int)(xCabbage),(int)(yCabbage*1.05),(int)(radiusCabbage/1.1),(int)(radiusCabbage/1.1));
        g.drawOval(xCabbage+(xCabbage/3)/5,yCabbage+(yCabbage/3)/5, (int) (radiusCabbage/1.5), (int) (radiusCabbage/1.5));
        g.drawOval((int) (xCabbage*1.1), (int) (yCabbage*1.07),(int) (radiusCabbage/2), (int) (radiusCabbage/2));

        xCabbage = 65+(int) (Math.random() * 70);
        yCabbage = 665+(int) (Math.random() * 10);
        g.setColor(new Color(0xFFD428));
        g.fillOval(xCabbage, yCabbage, radiusCabbage, radiusCabbage);
        g.setColor(new Color(0x000000));
        g.drawOval(xCabbage, yCabbage, radiusCabbage, radiusCabbage);
        g.drawOval((int)(xCabbage),(int)(yCabbage*1.05),(int)(radiusCabbage/1.1),(int)(radiusCabbage/1.1));
        g.drawOval(xCabbage+(xCabbage/3)/5,yCabbage+(yCabbage/3)/5, (int) (radiusCabbage/1.5), (int) (radiusCabbage/1.5));
        g.drawOval((int) (xCabbage*1.1), (int) (yCabbage*1.07),(int) (radiusCabbage/2), (int) (radiusCabbage/2));
    }
}
