/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screenprinting;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author alfarie
 */
public class MainFrame extends JFrame {
    static int width = 1024;
    static int height = 768;
    static double screenwidth;
    static double screenheight;
    static double Rw,Rh;
    JPanel cPane;
    AutoPanel auPane;
    MainPanel mPane;
    settingPanel setPane ;
    MainFrame(){
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); //get screen size
        screenwidth = screenSize.getWidth(); //
        screenheight = screenSize.getHeight(); //
        
        System.out.println("Screen widthxheight : " + screenwidth + "x" +screenheight);
        
        Rw = screenwidth/width; // get Ratio
        Rh = screenheight/height;//
        
         System.out.println("width :"+ width + " height : " + height + "\nRw : " + Rw + " Rh :" + Rh);
        width = (int)(width * Rw); // scale frame size
        height= (int)(height *Rh); //
        
      
        
        setSize((int)screenwidth,(int)screenheight);
        cPane = (JPanel) getContentPane();
        cPane.setSize(width,height);
        cPane.setLayout(null);
        
        
        auPane = new AutoPanel();
        mPane = new MainPanel();
        setPane = new settingPanel();
        
        set.addCom(cPane, setPane, 0, 130, setPane.width, setPane.height);
      
        setUndecorated(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);//
        setVisible(true);
    }
}
class MainPanel extends JPanel{
    int width = (int)(MainFrame.width*MainFrame.Rw);
    int height = (int)(130*MainFrame.Rh);
    MainPanel(){
        setPreferredSize(new Dimension(width,height));
    }
}

