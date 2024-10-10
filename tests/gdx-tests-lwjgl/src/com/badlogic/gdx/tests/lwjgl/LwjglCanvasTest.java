package com.badlogic.gdx.tests.lwjgl;

import com.badlogic.gdx.backends.lwjgl.LwjglCanvas;
import com.badlogic.gdx.tests.UITest;

import javax.swing.*;
import java.awt.*;

public class LwjglCanvasTest extends JFrame {
    LwjglCanvas canvas;

    public LwjglCanvasTest() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = getContentPane();
        canvas = new LwjglCanvas(new UITest());

        container.add(canvas.getCanvas(), BorderLayout.CENTER);

        pack();
        setVisible(true);
        setSize(800, 480);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LwjglCanvasTest();
            }
        });
    }
}
