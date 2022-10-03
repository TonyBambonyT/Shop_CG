package ru.vsu.cs.kg2022.g61.Tararykov_Anton_Alekseevich.shop;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {

    private final Pumpkin p = new Pumpkin();
    private final Background b = new Background();
    private final Shelf s = new Shelf();

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D canvas = (Graphics2D) g;

        b.draw(canvas); //задний фон

        for (int i = 0; i < (int) (Math.random() * 9); i++) {
            p.draw(canvas);                                     //тыква
        }

        s.draw(canvas); //стеллаж


    }
}







