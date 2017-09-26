package Chapter_9_9th_edition;

import javax.swing.*;
import java.awt.*;

/**
 *
 * textbook  listing 12.3    9th edition page.452
 * Created by lmsj0 on 9/18/2017.
 */
public class ShowFlowLayout extends JFrame {
    public ShowFlowLayout(){
        //Set FlawLayout aligned left with horizontal gap 10
        //and vertical gap 20 between components
        setLayout(new FlowLayout(FlowLayout.LEFT,10,20));

        //add labels and text fields to the frame;
        add(new JLabel("First name"));
        add(new JTextField(8));
        add(new JLabel("MI"));
        add(new JTextField(1));
        add(new JLabel("Last name"));
        add(new JTextField(8));
    }

    public static void main(String [] args){
        ShowFlowLayout frame = new ShowFlowLayout();
        frame.setTitle("ShowFlowLayout");
        frame.setSize(200,200);
        frame.setLocationRelativeTo(null);// center the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
