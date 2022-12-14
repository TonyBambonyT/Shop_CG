package ru.vsu.cs.kg2022.g61.Tararykov_Anton_Alekseevich.shop;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {

    private final Pumpkin p = new Pumpkin();
    private final Background b = new Background();
    private final Shelf s = new Shelf();
    private final Cabbage c = new Cabbage();
    private final Tomato t = new Tomato();
    private final Apple a = new Apple();
    private final Lemon l = new Lemon();
    private final Text te = new Text();



    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D canvas = (Graphics2D) g;

        b.draw(canvas); //задний фон
        for (int i = 0; i < 1+(int) (Math.random() * 9); i++) {p.draw(canvas);}   //тыква
        for (int i = 0; i < 1+(int) (Math.random() * 6); i++) {c.draw(canvas);}   //капуста
        for (int i = 0; i < 1+(int) (Math.random() * 5); i++) {t.draw(canvas);}   //помидор
        for (int i = 0; i < 1+(int) (Math.random() * 5); i++) {a.draw(canvas);}   //яблоко
        for (int i = 0; i < 1+(int) (Math.random() * 6); i++) {l.draw(canvas);}   //лимон

        te.draw(canvas);





        s.draw(canvas); //стеллаж

    }
}







