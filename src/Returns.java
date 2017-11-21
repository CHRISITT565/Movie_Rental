import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;

public class Returns extends JFrame implements ActionListener{

    public Returns() {
        //set the frame default properties
        setTitle("Retro Style New Product");
        setSize(500, 400);
        setLocation(150, 250);
        JMenuBar jMenuBar = new JMenuBar();
        setJMenuBar(jMenuBar);

        JMenu list = new JMenu("Menu");
        jMenuBar.add(list);

        JMenuItem home = new JMenuItem("Home");
        JMenuItem add = new JMenuItem("Add");
        JMenuItem rent = new JMenuItem("Rent");
        JMenuItem popular = new JMenuItem("Popular");
        JMenuItem comingSoon = new JMenuItem("Coming Soon");
        JMenuItem exit = new JMenuItem("Exit");

        list.add(home);
        list.add(add);
        list.add(rent);
        list.add(popular);
        list.add(comingSoon);
        list.add(exit);

        home.addActionListener(this);
        add.addActionListener(this);
        rent.addActionListener(this);
        popular.addActionListener(this);
        comingSoon.addActionListener(this);
        exit.addActionListener(this);





        Container cPane = getContentPane();
        cPane.setLayout(new FlowLayout());
        Color mycolor = new Color(51, 204, 51);
        cPane.setBackground(mycolor);
        //register 'Exit upon closing' as close operation
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }


    public static void main(String[] args) {
        MainFrame myFrame = new MainFrame();

        myFrame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if(e.getActionCommand().equals("Home"))
        {
            new MainFrame();

        }
        else if(e.getActionCommand().equals("Add"))
        {

            new Add();
        }

        else if(e.getActionCommand().equals("Rent"))
        {
            new Rent();
        }
        else if(e.getActionCommand().equals("Returns"))
        {
            new Returns();
        }

        else if(e.getActionCommand().equals("Popular"))
        {
            new Popular();
        }
        else if(e.getActionCommand().equals("Coming Soon"))
        {
            new  CommingSoon();
        }

        if(e.getActionCommand().equals("Exit"))
        {
            System.exit(0);
        }


    }



}
