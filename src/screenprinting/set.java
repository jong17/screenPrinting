/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screenprinting;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;

/**
 *
 * @author alfarie
 */
public class set{
    static void addCom(JComponent cmp1, JComponent cmp2,int x , int y,int w,int h){
        System.out.println(cmp1.getWidth() + "  "+ cmp1.getHeight());
        if(cmp1.getWidth() < (x +  w) || cmp1.getHeight() < (y+h)){
            System.out.println("outbound. can not add component : " + cmp2.getName());
            return ;
        }
        //cmp1.setLayout(null); //set pane = null
        cmp2.setBounds((int)(x*MainFrame.Rw),(int)(y*MainFrame.Rh),(int)(w*MainFrame.Rw),(int)(h*MainFrame.Rh)); // set position
        cmp1.add(cmp2); // add com
        cmp1.validate();
    }
}



