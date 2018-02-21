import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;


public class Rent extends JFrame implements ActionListener{

    ArrayList<Game> gameStock;
    ArrayList<Movie> movieStock;
    ArrayList<Disk> rented;
    ArrayList<Disk> popular;
    JComboBox Stock = new JComboBox();




    public Rent() {
        Container cPane = getContentPane();
        cPane.setLayout(new FlowLayout());
        Color mycolor = new Color(51, 204, 51);
        cPane.setBackground(mycolor);

        setDefaultCloseOperation(EXIT_ON_CLOSE);//set the frame default properties
        setTitle("Retro Style Rent");
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

        JButton RentDisk= new JButton("rent");

        gameRent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                openGameFile();
                System.out.println(gameStock.size());
                String[] allGameNames = new String[gameStock.size()];

                for(int i=0;i<gameStock.size();i++)
                    allGameNames[i] = gameStock.get(i).getName();


                Stock.setModel(new DefaultComboBoxModel(allGameNames));

            }
        });
        movieRent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                openMovieFile();

                Stock.setModel(new DefaultComboBoxModel(movieStock.toArray()));
            }
        });

        rent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                DaysRented();
                UpdateData();



            }
        });


        gameRent.setBounds(200,200,80,50);

        movieRent.setBounds(380,200,80,50);

        cPane.add(gameRent);
        cPane.add(movieRent);

        Stock.setLocation(300,400);

        Stock.setSize(200,50);

        cPane.add(Stock);



        Stock.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String selected = (String) Stock.getSelectedItem();

                JOptionPane.showMessageDialog(null,selected);

                for(Game g: gameStock){
                    if (selected.equals( g.getName()))
                    {
                        JOptionPane.showMessageDialog(null, g.toString());
                    }

                }

            }
        });





        setResizable(false);





    }


    public static void main(String[] args) {
       Rent myFrame = new Rent();

        myFrame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if(e.getActionCommand().equals("Home"))
        {
            new MainFrame().setVisible(true);

        }
        else if(e.getActionCommand().equals("Add"))
        {

            new Add().setVisible(true);
        }

        else if(e.getActionCommand().equals("Rent"))
        {
            new Rent().setVisible(true);
        }
        else if(e.getActionCommand().equals("Returns"))
        {
            new Returns();
        }

        else if(e.getActionCommand().equals("Popular"))
        {
            new Popular().setVisible(true);
        }
        else if(e.getActionCommand().equals("Coming Soon"))
        {
            new  ComingSoon().setVisible(true);
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

    public void RentStock() throws IOException {
        ObjectOutputStream os;
        os = new ObjectOutputStream(new FileOutputStream("RentedItems.dat"));
        os.writeObject(rented);
        os.close();
    }





    public void DaysRented(){


    }


    public void UpdateData(){


    }

    public void PopStock(){

    }



}
