package com.company.View;

import com.company.Controller.Control;

import javax.swing.*;
import java.awt.*;

public class Reception {
    //JFrame frame;
    //GridBagConstraints constraints;
    //JButton makeLog;

    public Reception(){

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
        frame.setTitle("Прием");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.setContentPane(panel);
        makeLog = new JButton("Запись");
        constraints.gridx = 2;
        constraints.gridy = 2;
        panel.add(makeLog, constraints);

        makeLog2 = new JButton("Добавление");
        constraints.gridx = 2;
        constraints.gridy = 4;
        panel.add(makeLog2, constraints);

        makeLog3 = new JButton("Удаление");
        constraints.gridx = 2;
        constraints.gridy = 6;
        panel.add(makeLog3, constraints);

        makeLog4 = new JButton("Просмотр");
        constraints.gridx = 2;
        constraints.gridy = 8;
        panel.add(makeLog4, constraints);

        makeLog5 = new JButton("В меню");
        constraints.gridx = 2;
        constraints.gridy = 10;
        panel.add(makeLog5, constraints);



        frame.setResizable(false);
        frame.setVisible(true);
        frame.setBounds(750, 400, 240, 240);

    }
}


////













