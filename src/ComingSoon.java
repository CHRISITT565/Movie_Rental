import chrriis.dj.nativeswing.swtimpl.NativeInterface;
import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;

//import chrriis.dj.nativeswing.swtimpl.NativeInterface;
//import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;

public class ComingSoon extends JFrame implements ActionListener{

 JButton gameTrailer;
 JButton movieTrailer;


    public ComingSoon ()
        {

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

             gameTrailer = new JButton("Video Game");

            movieTrailer= new JButton("Movie");

            movieTrailer.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {

                    NativeInterface.open();

                    JFrame frame = new JFrame("Movie Trailer Viewer");
                    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                    frame.getContentPane().add(getBrowserPanelM(), BorderLayout.CENTER);
                    frame.setSize(800, 600);
                    frame.setLocationByPlatform(true);
                    frame.setVisible(true);


                }
            });

            gameTrailer.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {

                   //CSGV.main(new String[]{});
                    //new CSGV();

                    NativeInterface.open();

                            JFrame frame = new JFrame("Game Trailer Viewer");
                            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                            frame.getContentPane().add(getBrowserPanel(), BorderLayout.CENTER);
                            frame.setSize(800, 600);
                            frame.setLocationByPlatform(true);
                            frame.setVisible(true);













                    //c.main(null);
                }
            });
            movieTrailer.addActionListener(this);


            gameTrailer.setBounds(200,200,80,50);

            movieTrailer.setBounds(380,200,80,50);

            cPane.add(gameTrailer);
            cPane.add(movieTrailer);

            setResizable(false);





        }

    public static JPanel getBrowserPanel() {
        JPanel webBrowserPanel = new JPanel(new BorderLayout());
        JWebBrowser webBrowser = new JWebBrowser();
        webBrowserPanel.add(webBrowser, BorderLayout.CENTER);
        webBrowser.setBarsVisible(false);
        webBrowser.navigate("https://www.youtube.com/watch?v=RGj0JApvb5k");
        return webBrowserPanel;
    }

    public static JPanel getBrowserPanelM() {
        JPanel webBrowserPanel = new JPanel(new BorderLayout());
        JWebBrowser webBrowser = new JWebBrowser();
        webBrowserPanel.add(webBrowser, BorderLayout.CENTER);
        webBrowser.setBarsVisible(false);
        webBrowser.navigate("https://www.youtube.com/watch?v=zTF913m8jVc");
        return webBrowserPanel;
    }



    public static void main(String[] args) {
        ComingSoon myFrame = new ComingSoon();

            myFrame.setVisible(true);
            //Buttons Created and defigned


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
            new Returns().setVisible(true);
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

    


}
