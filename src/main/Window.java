package main;
import javax.swing.*;

public class Window {

    public void createWindow(){
        JFrame frame = new JFrame();
        JButton button = new JButton("ok");
        button.setBounds(150, 150, 100, 40);
        frame.add(button);
        frame.setSize(Utils.WINDOW_WIDTH, Utils.WINDOW_HEIGHT);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }

}
