package ru.vsu.cs.kg2022.g61.Tararykov_Anton_Alekseevich.shop;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class DrawPanel extends JPanel {

    private Pumpkin p = new Pumpkin();

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D canvas = (Graphics2D) g;

        canvas.setColor(new Color(0x9A866B));
        canvas.drawRect(0,0,1000,800);
        canvas.fillRect(0,0,1000,800);

        //стеллаж

        int heightShelving, widthShelving, bottomPoint;  //height - высота width - ширина

        widthShelving = 900;
        heightShelving = 650;
        bottomPoint = 770;


        canvas.setColor(new Color(0x000000));
        canvas.drawRect(50,120,widthShelving,heightShelving);
        canvas.fillRect(50,120,widthShelving,heightShelving);

        //p.draw(canvas); //тыква



        //ящики

        int heightBox, widthBox, distanceBetweenBoxes,x;
        heightBox = 45;
        widthBox = 168;
        distanceBetweenBoxes = 10;
        x=50;

        for (int i = 0; i < 3; i++) {

            canvas.setColor(new Color(0xFF0000));
            canvas.drawRect(50,bottomPoint-30,widthShelving,30);
            canvas.fillRect(50,bottomPoint-30,widthShelving,30);

            for (int b = 0; b < widthShelving/(widthBox+12); b++) {

                canvas.setColor(new Color(0x00FF0F));
                canvas.drawRect(x+distanceBetweenBoxes, bottomPoint - 30 -heightBox, widthBox, heightBox);
                canvas.fillRect(x+distanceBetweenBoxes, bottomPoint - 30 -heightBox, widthBox, heightBox);

                x +=widthBox+distanceBetweenBoxes;
            }
            bottomPoint -= 250;
            x=50;

        }

        for (int i = 0; i < (int) (Math.random() * 9); i++) {
            p.draw(canvas);
        }}





    }

