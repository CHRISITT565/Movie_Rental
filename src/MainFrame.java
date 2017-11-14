import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {


    public MainFrame() {
        //set the frame default properties
        setTitle("My Window");
        setSize(500, 400);
        setLocation(150, 250);
        JMenuBar Menu;
        JMenuItem item;

        Container cPane = getContentPane();
        Color mycolor = new Color(51, 204, 51);
        cPane.setBackground(mycolor);
        //register 'Exit upon closing' as close operation
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }


    public static void main(String[] args) {
        MainFrame myFrame = new MainFrame();

        myFrame.setVisible(true);
    }

}
