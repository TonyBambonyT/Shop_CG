package ru.vsu.cs.kg2022.g61.Tararykov_Anton_Alekseevich.shop;
import java.awt.*;
public class Tomato {
    int heightTomato, widthTomato, xTomato, yTomato;
    public void draw(Graphics2D g) {
        heightTomato = 30+(int) (Math.random() * 30);
        widthTomato = 30+(int) (Math.random() * 30);
        xTomato = 65+(int) (Math.random() * 10);
        yTomato = 140+(int) (Math.random() * 10);
        g.setColor(new Color(0xA30105));
        g.fillOval(xTomato, yTomato, widthTomato, heightTomato);
        g.setColor(new Color(0x000000));
        g.drawOval(xTomato, yTomato, widthTomato, heightTomato);
        g.setColor(new Color(0x17330F));
        g.fillOval(xTomato + (widthTomato / 2) - ((widthTomato / 4) / 2), yTomato, widthTomato / 4, heightTomato / 6);

    }
}
