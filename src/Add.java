import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;

public class Add extends JFrame implements ActionListener{

    public Add() {
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
            JOptionPane.showMessageDialog(null,"this will be the Home page");
        }
        else if(e.getActionCommand().equals("Add"))
        {
            JOptionPane.showMessageDialog(null,"this will be the add page");
        }

        else if(e.getActionCommand().equals("Rent"))
        {
            JOptionPane.showMessageDialog(null,"this will be the rent page");
        }
        else if(e.getActionCommand().equals("Popular"))
        {
            JOptionPane.showMessageDialog(null,"this will be the popular page");
        }
        else if(e.getActionCommand().equals("ComingSoon"))
        {
            JOptionPane.showMessageDialog(null,"this will be the coming soon page");
        }

        if(e.getActionCommand().equals("Exit"))
        {
            System.exit(0);
        }


    }



}



