package Chapter_9_9th_edition;

import javax.swing.*;
import java.awt.*;

/**
 * Created by lmsj0 on 9/18/2017.
 */
public class ShowBorderLayout extends JFrame {
    public ShowBorderLayout(){
        //set BorderLayer with horizonal gap 5, and veritcal gap 10
        setLayout(new BorderLayout(5,10));


        add(new Label("East"),BorderLayout.EAST);
        add(new Label("West"),BorderLayout.WEST);
        add(new Label("North"),BorderLayout.NORTH);
        add(new Label("South"),BorderLayout.SOUTH);
        add(new Label("Center"),BorderLayout.CENTER);
    }

    public static void main(String []args){
        ShowBorderLayout frame = new ShowBorderLayout();
        frame.setTitle("ShowBorderLayout");
        frame.setSize(300,200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
