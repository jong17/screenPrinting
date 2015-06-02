/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screenprinting;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author alfarie
 */
class shirtPanel extends JPanel{
    int width = (int)(512*MainFrame.Rw);
    int height = (int)(250*MainFrame.Rh);
    shirtPanel(){
        setLayout(null);
        setName("shirt");
        setSize(1000,1000);
        
        stopButton stop = new stopButton();
        
        set.addCom(this, stop, 0, 0, stop.getWidth(), stop.getHeight());
        
        
    }    
}

class stopButton extends eventButton{

    public stopButton() {
        super(machineInfo.dragbackward1,machineInfo.dragbackward2);
    }
    @Override
    public void mousePressed(MouseEvent e){
        System.out.println("start");
        setIcon(cIm);
    }
    public void mouseReleased(MouseEvent e){
        setIcon(dIm);
    }
    
}
