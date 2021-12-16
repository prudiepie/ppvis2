package com.company.View;

import com.company.Controller.Control;

import javax.swing.*;
import java.awt.*;

public class Menu {
    //JFrame frame;
    //GridBagConstraints constraints;
    //JButton makeLog;

    public Menu(){

        start();
    }
    public void start() {
        JFrame frame;
        GridBagConstraints constraints;
        JButton makeLog;
        JButton makeLog2;
        JButton makeLog3;
        JButton makeLog4;
        JButton makeLog5;
        JButton makeLog6;

        JPanel panel = new JPanel(new GridBagLayout());

        constraints = new GridBagConstraints();
        frame = new JFrame();
        frame.setTitle("Меню");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.setContentPane(panel);
        makeLog = new JButton("Новости");
        constraints.gridx = 2;
        constraints.gridy = 2;
        panel.add(makeLog, constraints);

        makeLog2 = new JButton("Личное дело");
        constraints.gridx = 2;
        constraints.gridy = 4;
        panel.add(makeLog2, constraints);

        makeLog3 = new JButton("Приемы");
        constraints.gridx = 2;
        constraints.gridy = 6;
        panel.add(makeLog3, constraints);

        makeLog4 = new JButton("Таблица");
        constraints.gridx = 2;
        constraints.gridy = 8;
        panel.add(makeLog4, constraints);

        makeLog5 = new JButton("Выйти");
        constraints.gridx = 2;
        constraints.gridy = 10;
        panel.add(makeLog5, constraints);



        frame.setResizable(false);
        frame.setVisible(true);
        frame.setBounds(0, 400, 240, 240);

    }
}


////













