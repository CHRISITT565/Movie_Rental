import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class Add extends JFrame implements ActionListener{

    ArrayList<Game> gameStock;
   ArrayList<Movie> movieStock;

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


        gameStock = new ArrayList<>();
        movieStock= new ArrayList<>();





    }


    public static void main(String[] args) {
        Add myFrame = new Add();

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

    public void MovieMaker(){


        Movie m = new Movie();
        m.setName(JOptionPane.showInputDialog("Please enter a name of the Movie"));
        m.setLength(Integer.parseInt(JOptionPane.showInputDialog("Please enter the length of the movie in minuets")));
        m.setBonus(Boolean.parseBoolean(JOptionPane.showInputDialog("Does this Movie have Bonus Features ( Yes ,No)")));
        m.setGenre(JOptionPane.showInputDialog("Please enter the genre of the movie e.g (Romance,Action.Horror, ect)"));
        m.setCondition(JOptionPane.showInputDialog("Please enter the condition of the Disk (good ,Ok or Bad)"));
        m.setRating(JOptionPane.showInputDialog("Please rate the movie"));
        m.setTimesRented(0);
        m.setRentFee();

        //return JOptionPane.showMessageDialog(null,m.toString());
        //return m.toString();
        if(m.getCondition().equals("Bad"))
        {
            JOptionPane.showMessageDialog(null,"This Disk cannot be taken as the condition is not up to our standards");
        }

        else {


            movieStock.add(m);

            try {
                saveMovie();
                JOptionPane.showMessageDialog(null, "Data saved successfully");
            } // try
            catch (IOException f) {
                JOptionPane.showMessageDialog(null, "Not able to save the file:\n" +
                        "Check the console printout for clues to why ");
                f.printStackTrace();
            }// catch
        }
    }


    public void VideoGameMaker() {
        Game g = new Game();
        g.setName(JOptionPane.showInputDialog("Please enter the name of the Game"));
        g.setSetting(JOptionPane.showInputDialog("Please enter the setting (Online, Offline"));
        g.setStyle(JOptionPane.showInputDialog("RPG,FPS,Puzzle,Platform"));
        g.setGenre(JOptionPane.showInputDialog("Please enter the Genre(Action,Adventure, Horror ect)"));
        g.setCondition(JOptionPane.showInputDialog("Please enter the Disk Condition (good ,ok or Bad"));
        g.setRating(JOptionPane.showInputDialog("Please rate the Game"));
        g.setTimesRented(0);
        g.setRentFee();

        //return JOptionPane.showMessageDialog(null,g.toString());
        //return g.toString();

        if (g.getCondition().equals("Bad")) {
            JOptionPane.showMessageDialog(null, "This Disk cannot be taken as the condition is not up to our standards");
        } else {
            gameStock.add(g);

            try {
                saveGames();
                JOptionPane.showMessageDialog(null, "Data saved successfully");
            } // try
            catch (IOException f) {
                JOptionPane.showMessageDialog(null, "Not able to save the file:\n" +
                        "Check the console printout for clues to why ");
                f.printStackTrace();
            }// catch
        }
    }


    public void saveGames() throws IOException {
        ObjectOutputStream os;
        os = new ObjectOutputStream(new FileOutputStream("Games.dat"));
        os.writeObject(gameStock);
        os.close();
    }

    public void saveMovie() throws IOException {
        ObjectOutputStream os;
        os = new ObjectOutputStream(new FileOutputStream("Movies.dat"));
        os.writeObject(movieStock);
        os.close();
    }




}
