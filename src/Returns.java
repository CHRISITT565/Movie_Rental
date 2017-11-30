import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;

public class Returns extends JFrame implements ActionListener{

    ArrayList<Game> gameStock;
    ArrayList<Movie> movieStock;
    ArrayList<Movie> rentedMovie;
    ArrayList<Game> rentedGames;
    JComboBox returns = new JComboBox();

    public Returns() {
        //set the frame default properties
        Container cPane = getContentPane();
        cPane.setLayout(new FlowLayout());
        Color mycolor = new Color(51, 204, 51);
        cPane.setBackground(mycolor);
        //register 'Exit upon closing' as close operation
        setDefaultCloseOperation(EXIT_ON_CLOSE);



        setTitle("Retro Style Retuns");
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

        JButton gameRent = new JButton("Video Game");
        JButton movieRent= new JButton("Movie");

        gameRent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                openGameFile();
                returns.setModel(new DefaultComboBoxModel(rentedGames.toArray()));
            }
        });
        movieRent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                openMovieFile();

                returns.setModel(new DefaultComboBoxModel(rentedMovie.toArray()));
            }
        });


        setResizable(false);



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

    public void openMovieFile() {
        try {
            ObjectInputStream is;
            is = new ObjectInputStream(new FileInputStream("Movies.dat"));
            movieStock = (ArrayList<Movie>) is.readObject(); // CHANGED
            is.close();
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "FileNotFound: didn't work");
            e.printStackTrace();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "IOException: didn't work");
            e.printStackTrace();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "open didn't work");
            e.printStackTrace();
            // counting valid bikes not needed

        }
    }

    public void openGameFile() {
        try {
            ObjectInputStream is;
            is = new ObjectInputStream(new FileInputStream("Games.dat"));
            gameStock = (ArrayList<Game>) is.readObject(); // CHANGED
            is.close();
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "FileNotFound: didn't work");
            e.printStackTrace();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "IOException: didn't work");
            e.printStackTrace();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "open didn't work");
            e.printStackTrace();
            // counting valid bikes not needed

        }


    }

    public void RentGames() throws IOException {
        ObjectOutputStream os;
        os = new ObjectOutputStream(new FileOutputStream("RentedGames.dat"));
        os.writeObject(rentedGames);
        os.close();
    }

    public void rentMovie() throws IOException {
        ObjectOutputStream os;
        os = new ObjectOutputStream(new FileOutputStream("RentedMovies.dat"));
        os.writeObject(rentedMovie);
        os.close();
    }


}
