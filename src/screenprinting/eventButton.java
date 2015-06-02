/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screenprinting;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 
 * @author alfarie
 */
class eventButton extends JLabel implements MouseListener {
    
    /**
     * 
     * ใช้งานได้เลย scale ไห้เรียบร้อย
     */
    Image image1,image2;
    ImageIcon dIm,cIm;
    
    eventButton(Image m1 , Image m2){
        setName(this.getClass().getSimpleName());
        image1 = m1;
        image2 = m2;
        dIm = new ImageIcon(image1);
        cIm = new ImageIcon(image2);
        System.out.println("image1 : " +image1.getWidth(this));
        image1 = image1.getScaledInstance((int)(image1.getWidth(this)*MainFrame.Rw), (int)(image1.getHeight(this)*MainFrame.Rh),  Image.SCALE_SMOOTH);
        image2 = image2.getScaledInstance((int)(image2.getWidth(this)*MainFrame.Rw), (int)(image2.getHeight(this)*MainFrame.Rh),  Image.SCALE_SMOOTH);
        dIm = new ImageIcon(image1);
        cIm = new ImageIcon(image2);
        setIcon(dIm);
        setSize(image1.getWidth(this),image1.getHeight(this));
        addMouseListener(this);
    }
    

    eventButton(Image m1) {
        
        image1 = m1;
        image2 = m1;
        dIm = new ImageIcon(image1);
        cIm = new ImageIcon(image2);
        System.out.println("image1 : " +image1.getWidth(this));
        image1 = image1.getScaledInstance((int)(image1.getWidth(this)*MainFrame.Rw), (int)(image1.getHeight(this)*MainFrame.Rh),  Image.SCALE_SMOOTH);
        image2 = image2.getScaledInstance((int)(image2.getWidth(this)*MainFrame.Rw), (int)(image2.getHeight(this)*MainFrame.Rh),  Image.SCALE_SMOOTH);
        dIm = new ImageIcon(image1);
        cIm = new ImageIcon(image2);
        setIcon(dIm);
        setSize(image1.getWidth(this),image1.getHeight(this));
    }
    public settingPanel getP(){
        return (settingPanel)(this.getParent());
        
    }
    
    public double getheight(){
        return image1.getHeight(this)/MainFrame.Rh;
    }
    public double getwidth(){
        return image1.getWidth(this)/MainFrame.Rw;
    }
    
    @Override
    public void mouseClicked(MouseEvent me) {
        
    }
    @Override
    public void mousePressed(MouseEvent me) {
        
    }
    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override
    public void mouseEntered(MouseEvent me) {
    }

    @Override
    public void mouseExited(MouseEvent me) {
    }
    public void clear(){
        setIcon(dIm);
    }
}

class input extends JTextField implements MouseListener{
    
    input(){
        setFont(new Font("Tahoma", Font.PLAIN, 80));
        setHorizontalAlignment(JTextField.CENTER);
        addMouseListener(this);
    }
    
    @Override
    public void mouseClicked(MouseEvent me) {
    }

    @Override
    public void mousePressed(MouseEvent me) {
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override
    public void mouseEntered(MouseEvent me) {
    }

    @Override
    public void mouseExited(MouseEvent me) {
    }
    
    
  
    
}
