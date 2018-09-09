package view;

import javax.swing.*;
import java.awt.*;

public class MainView extends JFrame{
    private Dimension screenSize;

    public MainView(){


            this.setTitle("Security Risk Manager v1.0");
            this.screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            this.setBounds(0,0, this.screenSize.width, this.screenSize.height);

            this.setLayout(new BorderLayout());

            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setBackground(Color.CYAN);
            this.setVisible(true);


    }

}
