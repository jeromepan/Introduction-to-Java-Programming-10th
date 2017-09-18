package Chapter_9_9th_edition;

import javax.swing.*;
import java.awt.*;

/**
 *
 * listing 12.4 page 455 9th edition
 * Created by lmsj0 on 9/18/2017.
 */
public class showGridLayout extends JFrame{
    public showGridLayout(){
        // set Gridlayout 3 rows, 2 columns, and gaps 5 between
        //components horizontally and vertically
        setLayout(new GridLayout(3,2,5,5));

        //add labels and text fields to the frame
        add(new JLabel("First Name"));
        add(new JTextField(8));
        add(new JLabel("MI"));
        add(new JTextField(1));
        add(new JLabel("Last name"));
        add(new JTextField(8));

    }

    public static void main(String []args){
        showGridLayout frame = new showGridLayout();
        frame.setTitle("ShowGridLayout");
        frame.setSize(200,125);
        frame.setLocationRelativeTo(null);// center the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
