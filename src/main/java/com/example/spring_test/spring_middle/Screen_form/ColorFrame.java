package com.example.spring_test.spring_middle.Screen_form;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

@Component
public class ColorFrame extends JFrame {
    @Autowired
    public Color color;
    Random random = new Random();

    public ColorFrame(){
        setSize(250,250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    @SneakyThrows
    public void moveToRandomLocation(){
        setLocation(random.ints(0,1200).findAny().getAsInt(),random.ints(0,900).findAny().getAsInt());
        getContentPane().setBackground(color);
        repaint();
    }
}
