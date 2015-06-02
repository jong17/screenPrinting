/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screenprinting;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author alfarie
 */
class statusPanel extends JPanel{
    int width = (int)(512*MainFrame.Rw);
    int height = (int)(250*MainFrame.Rh);
    statusPanel(){
        setName("status");
        //setPreferredSize(new Dimension(width,height));
    }
    public void paint(Graphics g){
        g.setColor(Color.BLUE);
        g.fillRect(0, 0, width, height);
    }
}