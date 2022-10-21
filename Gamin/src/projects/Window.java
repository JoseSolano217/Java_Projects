package projects;

import javax.swing.*;
import java.awt.Canvas;
import java.awt.Dimension;

public class Window extends Canvas {
    public Window(int width, int height, String title, Game game) {
        JFrame frame = new JFrame(title);
        frame.setPreferredSize(new Dimension(width, height));
        frame.setMaximumSize(new Dimension((int) Math.floor(width*1.3), (int) Math.floor(height*1.3)));
        frame.setMinimumSize(new Dimension((int) Math.floor(width*0.7), (int) Math.floor(height*0.7)));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.add(game);
        frame.setVisible(true);
        game.start();
    }
}
