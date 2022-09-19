package ru.vsu.cs.kg2022.g61.Tararykov_Anton_Alekseevich.shop;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setSize(1000,800);
        DrawPanel drawPanel = new DrawPanel();

        frame.add(drawPanel);
        frame.setVisible(true);
    }
}
