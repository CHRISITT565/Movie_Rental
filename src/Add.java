import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Add extends JFrame implements ActionListener{

    public Add() {
        //container Created
        Container cPane = getContentPane();
        cPane.setLayout(new FlowLayout());
        Color mycolor = new Color(51, 204, 51);
        cPane.setBackground(mycolor);
        //register 'Exit upon closing' as close operation
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //set the frame default properties
        setTitle("Retro Style Comming Soon");
        setSize(500, 400);
        setLocation(150, 250);
        JMenuBar jMenuBar = new JMenuBar();
        setJMenuBar(jMenuBar);
        //Menu added and action Liseners
        JMenu list = new JMenu("Menu");
        jMenuBar.add(list);

        JMenuItem home = new JMenuItem("Home");
        JMenuItem add = new JMenuItem("Add");
        JMenuItem rent = new JMenuItem("Rent");
        JMenuItem returns = new JMenuItem("Returns");
        JMenuItem popular = new JMenuItem("Popular");
        JMenuItem comingSoon = new JMenuItem("Coming Soon");
        JMenuItem exit = new JMenuItem("Exit");

        list.add(home);
        list.add(add);
        list.add(rent);
        list.add(returns);
        list.add(popular);
        list.add(comingSoon);
        list.add(exit);

        home.addActionListener(this);
        add.addActionListener(this);
        rent.addActionListener(this);
        returns.addActionListener(this);
        popular.addActionListener(this);
        comingSoon.addActionListener(this);
        exit.addActionListener(this);

        JButton gameAdd = new JButton("Video Game");
        JButton movieAdd= new JButton("Movie");

        gameAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VideoGameMaker();

            }
        });
        movieAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MovieMaker();

            }
        });


        gameAdd.setBounds(200,200,80,50);

        movieAdd.setBounds(380,200,80,50);

        cPane.add(gameAdd);
        cPane.add(movieAdd);

        setResizable(false);


        Game[] gameStock = new Game[15];
        Movie[] movieStock= new Movie[15];





    }


    public static void main(String[] args) {
        Add myFrame = new Add();

        myFrame.setVisible(true);
        //Buttons Created and defigned


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

    public String MovieMaker(){

        movieStock[];
        Movie m = new Movie();
        m.setName(JOptionPane.showInputDialog(""));
        m.setLength(Double.parseDouble(JOptionPane.showInputDialog("")));
        m.setBonus(Boolean.parseBoolean(JOptionPane.showInputDialog("")));
        m.setGenre(JOptionPane.showInputDialog(""));
        m.setCondition(JOptionPane.showInputDialog(""));
        m.setRating(JOptionPane.showInputDialog(""));
        m.setTimesRented(0);
        m.setRentFee();

        //return JOptionPane.showMessageDialog(null,m.toString());
        return m.toString();

        movieStock.add(m);
    }


    public String VideoGameMaker(){
       Game g = new Game();
        g.setName(JOptionPane.showInputDialog(""));
        g.setSetting(JOptionPane.showInputDialog(""));
        g.setStyle(JOptionPane.showInputDialog(""));
        g.setGenre(JOptionPane.showInputDialog(""));
        g.setCondition(JOptionPane.showInputDialog(""));
        g.setRating(JOptionPane.showInputDialog(""));
        g.setTimesRented(0);
        g.setRentFee();

        //return JOptionPane.showMessageDialog(null,g.toString());
        return g.toString();
    }




}
