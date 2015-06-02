/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screenprinting;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author alfarie
 */
public class settingPanel extends JPanel{
    JPanel cPane;
    int width = (int)(1024*MainFrame.Rw);
    int height = (int)(638*MainFrame.Rh);
    settingPanel(){
        setLayout(null);
        setSize(width,height);
        
        inputValue in = new inputValue();
        
        okButton ok = new okButton();
        upButton up = new upButton();
        downButton down = new downButton();
        forwordButton forword = new forwordButton();
        backwordButton backword = new backwordButton();
        headButton head = new headButton();
        operationButton op = new operationButton();
        printButton print = new printButton();
        printAmountButton printAm = new printAmountButton();
        frameButton frame = new frameButton();
        squeezeButton squeeze= new squeezeButton();
        heatTimeButton heatt= new heatTimeButton();
        wattHeatButton watth= new wattHeatButton();
        saveButton save = new saveButton();
        defaultButton def = new defaultButton();
        saveAllButton saveAll = new saveAllButton();
        sweepButton sweep = new sweepButton();
        saveAllButton saveall = new saveAllButton();
        totalspeed tspeed = new totalspeed();
        stepOneButton step1 = new stepOneButton();
        stepTwoButton step2 = new stepTwoButton();
        leftButton left = new leftButton();
        rightButton right = new rightButton();
       
        set.addCom(this, in, 57 , 18, 400, (int)ok.getheight());
        
        set.addCom(this, ok,647 , 18, (int)ok.getwidth(), (int)ok.getheight());
        set.addCom(this, up,484 , 18, (int)up.getwidth(), (int)up.getheight());
        set.addCom(this, down,484 , 71, (int)down.getwidth(), (int)down.getheight());
        set.addCom(this, forword,815 , 18, (int)forword.getwidth(), (int)forword.getheight());
        set.addCom(this, backword,815 , 71, (int)backword.getwidth(), (int)backword.getheight());
        set.addCom(this, head,484 , 176, (int)head.getwidth(), (int)head.getheight());
        set.addCom(this, op,542 , 255, (int)op.getwidth(), (int)op.getheight());
        set.addCom(this, print,694 , 255, (int)print.getwidth(), (int)print.getheight());
        set.addCom(this, sweep , 834, 255, (int)sweep.getwidth(), (int)sweep.getheight());
        set.addCom(this, printAm,542 , 377, (int)printAm.getwidth(), (int)print.getheight());
        set.addCom(this, frame,694 , 377, (int)frame.getwidth(), (int)frame.getheight());
        set.addCom(this, squeeze,834 , 377, (int)squeeze.getwidth(), (int)squeeze.getheight());
        set.addCom(this, heatt,542 , 495, (int)heatt.getwidth(), (int)heatt.getheight());
        set.addCom(this, watth,834 , 495, (int)watth.getwidth(), (int)watth.getheight());
        set.addCom(this, save,694 , 549, (int)save.getwidth(), (int)save.getheight());
        set.addCom(this, def,264 , 509, (int)def.getwidth(), (int)def.getheight());
        set.addCom(this, saveAll,121 , 509, (int)saveAll.getwidth(),(int) saveAll.getheight());
        set.addCom(this,step1,97,410,(int)step1.getwidth(),(int)step1.getheight());
        set.addCom(this,step2,164,410,(int)step2.getwidth(),(int)step2.getheight());
        set.addCom(this,left,274,358,(int)left.getwidth(),(int)left.getheight());
        set.addCom(this,right,349,358,(int)right.getwidth(),(int)right.getheight());
        set.addCom(this,tspeed,57,229,(int)tspeed.getwidth(),(int)tspeed.getheight());
        setbg();
    }
    private void setbg(){
         
        eventButton back = new eventButton(machineInfo.bgimage);
        set.addCom(this, back, 0, 0, (int)back.getwidth(), (int)back.getheight());
        
    }
   
}

class okButton extends eventButton{

    public okButton() {
        super(machineInfo.ok1, machineInfo.ok2);
        
    }
    @Override
    public void mousePressed(MouseEvent e){
        setIcon(cIm);
    }
    @Override
    public void mouseReleased(MouseEvent e){
        setIcon(dIm);
    }
}

class upButton extends eventButton{

    public upButton() {
        super(machineInfo.up1, machineInfo.up2);
        
    }
    @Override
    public void mousePressed(MouseEvent e){
        setIcon(cIm);
    }
    @Override
    public void mouseReleased(MouseEvent e){
        setIcon(dIm);
    }
}

class downButton extends eventButton{

    public downButton() {
        super(machineInfo.down1, machineInfo.down2);
        
    }
    @Override
    public void mousePressed(MouseEvent e){
        setIcon(cIm);
    }
    @Override
    public void mouseReleased(MouseEvent e){
        setIcon(dIm);
    }
}

class forwordButton extends eventButton{

    public forwordButton() {
        super(machineInfo.dragforward1, machineInfo.dragforward2);
        
    }
    @Override
    public void mousePressed(MouseEvent e){
        setIcon(cIm);
    }
    @Override
    public void mouseReleased(MouseEvent e){
        setIcon(dIm);
    }
}

class backwordButton extends eventButton{

    public backwordButton() {
        super(machineInfo.dragbackward1, machineInfo.dragbackward2);
        
    }
    @Override
    public void mousePressed(MouseEvent e){
        setIcon(cIm);
    }
    @Override
    public void mouseReleased(MouseEvent e){
        setIcon(dIm);
    }
}

class headButton extends eventButton{

    public headButton() {
        super(machineInfo.testStation1, machineInfo.testStation2);
        
    }
    @Override
    public void mousePressed(MouseEvent e){
        setIcon(cIm);
    }
    @Override
    public void mouseReleased(MouseEvent e){
        setIcon(dIm);
    }
}

class operationButton extends eventButton{
    public operationButton() {
        super(machineInfo.operation1, machineInfo.operation2);
    }
    @Override
    public void mousePressed(MouseEvent e){
        setIcon(cIm);
    }
    @Override
    public void mouseReleased(MouseEvent e){
        setIcon(dIm);
    }
}

class printButton extends eventButton{
    public printButton() {
        super(machineInfo.print1, machineInfo.print2);
    }
    @Override
    public void mousePressed(MouseEvent e){
        setIcon(cIm);
    }
    @Override
    public void mouseReleased(MouseEvent e){
        setIcon(dIm);
    }
}

class sweepButton extends eventButton{
    public sweepButton() {
        super(machineInfo.sweep1, machineInfo.sweep2);
    }
    @Override
    public void mousePressed(MouseEvent e){
        setIcon(cIm);
    }
    @Override
    public void mouseReleased(MouseEvent e){
        setIcon(dIm);
    }
}

class printAmountButton extends eventButton{
    public printAmountButton() {
        super(machineInfo.printAmount1, machineInfo.printAmount2);
    }
    @Override
    public void mousePressed(MouseEvent e){
        setIcon(cIm);
    }
    @Override
    public void mouseReleased(MouseEvent e){
        setIcon(dIm);
    }
}

class frameButton extends eventButton{
    public frameButton() {
        super(machineInfo.frame1, machineInfo.frame2);
    }
    @Override
    public void mousePressed(MouseEvent e){
        setIcon(cIm);
    }
    @Override
    public void mouseReleased(MouseEvent e){
        setIcon(dIm);
    }
}

class squeezeButton extends eventButton{
    public squeezeButton() {
        super(machineInfo.squeeze1, machineInfo.squeeze2);
    }
    @Override
    public void mousePressed(MouseEvent e){
        setIcon(cIm);
    }
    @Override
    public void mouseReleased(MouseEvent e){
        setIcon(dIm);
    }
}

class heatTimeButton extends eventButton{
    public heatTimeButton() {
        super(machineInfo.heattime1, machineInfo.heattime2);
    }
    @Override
    public void mousePressed(MouseEvent e){
        setIcon(cIm);
    }
    @Override
    public void mouseReleased(MouseEvent e){
        setIcon(dIm);
    }
}

class wattHeatButton extends eventButton{
    public wattHeatButton() {
        super(machineInfo.wattheat1, machineInfo.wattheat2);
    }
    @Override
    public void mousePressed(MouseEvent e){
        setIcon(cIm);
    }
    @Override
    public void mouseReleased(MouseEvent e){
        setIcon(dIm);
    }
}

class saveButton extends eventButton{
    public saveButton() {
        super(machineInfo.save1, machineInfo.save2);
    }
    @Override
    public void mousePressed(MouseEvent e){
        setIcon(cIm);
    }
    @Override
    public void mouseReleased(MouseEvent e){
        setIcon(dIm);
    }
}

class stepOneButton extends eventButton{
    public stepOneButton() {
        super(machineInfo.rotatepadcom2_1, machineInfo.rotatepadcom2_2);
    }
    @Override
    public void mousePressed(MouseEvent e){
        setIcon(cIm);
    }
    @Override
    public void mouseReleased(MouseEvent e){
        setIcon(dIm);
    }
}

class stepTwoButton extends eventButton{
    public stepTwoButton() {
        super(machineInfo.rotatepadcom3_1, machineInfo.rotatepadcom3_2);
    }
    @Override
    public void mousePressed(MouseEvent e){
        setIcon(cIm);
    }
    @Override
    public void mouseReleased(MouseEvent e){
        setIcon(dIm);
    }
}

class leftButton extends eventButton{
    public leftButton() {
        super(machineInfo.rotatepadcom4_1, machineInfo.rotatepadcom4_2);
    }
    @Override
    public void mousePressed(MouseEvent e){
        setIcon(cIm);
    }
    @Override
    public void mouseReleased(MouseEvent e){
        setIcon(dIm);
    }
}

class rightButton extends eventButton{
    public rightButton() {
        super(machineInfo.rotatepadcom5_1, machineInfo.rotatepadcom5_2);
    }
    @Override
    public void mousePressed(MouseEvent e){
        setIcon(cIm);
    }
    @Override
    public void mouseReleased(MouseEvent e){
        setIcon(dIm);
    }
}

class defaultButton extends eventButton{

    public defaultButton() {
        super(machineInfo.default1, machineInfo.default2);
        
    }
    @Override
    public void mousePressed(MouseEvent e){
        setIcon(cIm);
    }
    @Override
    public void mouseReleased(MouseEvent e){
        setIcon(dIm);
    }
}

class saveAllButton extends eventButton{

    public saveAllButton() {
        super(machineInfo.saveall1, machineInfo.saveall2);
        
    }
    @Override
    public void mousePressed(MouseEvent e){
        setIcon(cIm);
    }
    @Override
    public void mouseReleased(MouseEvent e){
        setIcon(dIm);
    }
    
}

class totalspeed extends eventButton{

    public totalspeed() {
        super(machineInfo.totalspeed1, machineInfo.totalspeed2);
        
    }
    @Override
    public void mousePressed(MouseEvent e){
        setIcon(cIm);
    }
    @Override
    public void mouseReleased(MouseEvent e){
        setIcon(dIm);
    }
    
}

class inputValue extends input{
    inputValue(){
        super();
    }
      @Override
    public void mouseClicked(MouseEvent e){
    }
        
}



