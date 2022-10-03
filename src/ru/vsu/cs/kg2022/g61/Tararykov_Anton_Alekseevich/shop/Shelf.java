package ru.vsu.cs.kg2022.g61.Tararykov_Anton_Alekseevich.shop;

import java.awt.*;

public class Shelf {
    int heightShelving, widthShelving, bottomPoint, heightBox, widthBox, distanceBetweenBoxes,x;;

    public void draw(Graphics2D g) {
        widthShelving = 900;
        heightShelving = 650;
        bottomPoint = 770;




        heightBox = 45;
        widthBox = 168;
        distanceBetweenBoxes = 10;
        x=50;

        for (int i = 0; i < 3; i++) {

            g.setColor(new Color(0x715C49));
            g.drawRect(50,bottomPoint-30,widthShelving,30);
            g.fillRect(50,bottomPoint-30,widthShelving,30);

            for (int b = 0; b < widthShelving/(widthBox+12); b++) {

                g.setColor(new Color(0x703F19));
                g.drawRect(x+distanceBetweenBoxes, bottomPoint - 30 -heightBox, widthBox, heightBox);
                g.fillRect(x+distanceBetweenBoxes, bottomPoint - 30 -heightBox, widthBox, heightBox);

                x +=widthBox+distanceBetweenBoxes;
            }
            bottomPoint -= 250;
            x=50;

        }



}}
