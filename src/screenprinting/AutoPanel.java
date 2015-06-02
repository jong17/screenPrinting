/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screenprinting;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.LayoutManager;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author alfarie
 */
public class AutoPanel extends JPanel{
    shirtPanel shPane;
    statusPanel stPane;
    machinePanel maPane;
    
    AutoPanel(){
        initialize();
    }
    private void initialize(){
        shPane = new shirtPanel();
        stPane = new statusPanel();
        maPane = new machinePanel();
        setSize(2000,2000);
        setLayout(null);
        set.addCom(this,shPane, 0, 0, 512, 250);
        set.addCom(this,stPane,512,0,512,250);
        set.addCom(this,maPane, 0, 250, 1024, 638-250);
    }
}








