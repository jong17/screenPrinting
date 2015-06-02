/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screenprinting;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author alfarie
 */

class machinePanel extends JPanel{
    int width = (int)(1024*MainFrame.Rw);
    int height = (int)(388*MainFrame.Rh);
    machinePanel(){
        initt();
        //set.addCom(this, new startButton(), 100, 100, 200, 200);
        //set.addCom(this,new comp() , 100, 100, 200, 200);
        //add(new comp());
        startButton start = new startButton();
        set.addCom(this, start, 0, 0, start.getWidth(), start.getHeight());
        System.out.println(start.getWidth());
        validate();
        repaint();
    }
    void initt(){
        setLayout(null);
        setName("machine");
        setSize(width,height);
    }
    
   
}

class startButton extends eventButton{
    startButton(){
        
        super(machineInfo.default1,machineInfo.default2);
    }
    @Override
    public void mousePressed(MouseEvent e){
        System.out.println("pressed");
        setIcon(cIm);
    }
    @Override
    public void mouseReleased(MouseEvent e){
        setIcon(dIm);
    }
} 


class comp extends JLabel{
    Image m1;
    ImageIcon mi1;
    comp(){
        setText("dsfdkfj");
        m1= Toolkit.getDefaultToolkit().createImage("./src/screenprinting/image/start1.png");
        mi1 = new ImageIcon(m1);
        System.out.println(m1.getWidth(this));
        setBounds(0,0,300,130);
        setIcon(mi1);
    }
}