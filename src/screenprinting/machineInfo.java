/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screenprinting;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author alfarie
 */
public class machineInfo {
    static ArrayList<headPrint> headList =new ArrayList<headPrint>();
    static ArrayList<Integer> module = new ArrayList<Integer>();
    
    static Image default1 = Toolkit.getDefaultToolkit().createImage("./src/screenPrinting/image/test/default1.png");
    static Image default2 = Toolkit.getDefaultToolkit().createImage("./src/screenPrinting/image/test/default2.png");
   
    static Image dragbackward1 = Toolkit.getDefaultToolkit().createImage("./src/screenPrinting/image/test/dragbackward1.png");
    static Image dragbackward2 = Toolkit.getDefaultToolkit().createImage("./src/screenPrinting/image/test/dragbackward2.png");
    
    static Image dragforward1 = Toolkit.getDefaultToolkit().createImage("./src/screenPrinting/image/test/dragforward1.png");
    static Image dragforward2 = Toolkit.getDefaultToolkit().createImage("./src/screenPrinting/image/test/dragforward2.png");
    
    static Image frame1 = Toolkit.getDefaultToolkit().createImage("./src/screenPrinting/image/test/frame1.png");
    static Image frame2 = Toolkit.getDefaultToolkit().createImage("./src/screenPrinting/image/test/frame2.png");
    
    static Image heattime1 = Toolkit.getDefaultToolkit().createImage("./src/screenPrinting/image/test/heattime1.png");
    static Image heattime2 = Toolkit.getDefaultToolkit().createImage("./src/screenPrinting/image/test/heattime2.png");
    static Image ok1 = Toolkit.getDefaultToolkit().createImage("./src/screenPrinting/image/test/ok1.png");
    static Image ok2 = Toolkit.getDefaultToolkit().createImage("./src/screenPrinting/image/test/ok2.png");
    static Image up1 = Toolkit.getDefaultToolkit().createImage("./src/screenPrinting/image/test/up1.png");
    static Image up2 = Toolkit.getDefaultToolkit().createImage("./src/screenPrinting/image/test/up2.png");
    static Image down1 = Toolkit.getDefaultToolkit().createImage("./src/screenPrinting/image/test/down1.png");
    static Image down2 = Toolkit.getDefaultToolkit().createImage("./src/screenPrinting/image/test/down2.png");
    static Image operation1 = Toolkit.getDefaultToolkit().createImage("./src/screenPrinting/image/test/operation1.png");
    static Image operation2 = Toolkit.getDefaultToolkit().createImage("./src/screenPrinting/image/test/operation2.png");
    static Image print1 = Toolkit.getDefaultToolkit().createImage("./src/screenPrinting/image/test/print1.png");
    static Image print2 = Toolkit.getDefaultToolkit().createImage("./src/screenPrinting/image/test/print2.png");
    static Image testStation1 = Toolkit.getDefaultToolkit().createImage("./src/screenPrinting/image/test/testStation1.png");
    static Image testStation2 = Toolkit.getDefaultToolkit().createImage("./src/screenPrinting/image/test/testStation2.png");
    static Image printAmount1 = Toolkit.getDefaultToolkit().createImage("./src/screenPrinting/image/test/printAmount1.png");
    static Image printAmount2 = Toolkit.getDefaultToolkit().createImage("./src/screenPrinting/image/test/printAmount2.png");
    static Image rotatepadcom2_1 = Toolkit.getDefaultToolkit().createImage("./src/screenPrinting/image/test/rotatepadcom2.png");
    static Image rotatepadcom2_2 = Toolkit.getDefaultToolkit().createImage("./src/screenPrinting/image/test/rotatepadcom2-2.png");
    static Image rotatepadcom3_1 = Toolkit.getDefaultToolkit().createImage("./src/screenPrinting/image/test/rotatepadcom3.png");
    static Image rotatepadcom3_2 = Toolkit.getDefaultToolkit().createImage("./src/screenPrinting/image/test/rotatepadcom3-2.png");
    static Image rotatepadcom4_1 = Toolkit.getDefaultToolkit().createImage("./src/screenPrinting/image/test/rotatepadcom4.png");
    static Image rotatepadcom4_2 = Toolkit.getDefaultToolkit().createImage("./src/screenPrinting/image/test/rotatepadcom4-2.png");
    static Image rotatepadcom5_1 = Toolkit.getDefaultToolkit().createImage("./src/screenPrinting/image/test/rotatepadcom5.png");
    static Image rotatepadcom5_2 = Toolkit.getDefaultToolkit().createImage("./src/screenPrinting/image/test/rotatepadcom5-2.png");
    static Image save1 = Toolkit.getDefaultToolkit().createImage("./src/screenPrinting/image/test/save1.png");
    static Image save2 = Toolkit.getDefaultToolkit().createImage("./src/screenPrinting/image/test/save2.png");
    static Image saveall1 = Toolkit.getDefaultToolkit().createImage("./src/screenPrinting/image/test/saveall1.png");
    static Image saveall2 = Toolkit.getDefaultToolkit().createImage("./src/screenPrinting/image/test/saveall2.png");
    static Image squeeze1 = Toolkit.getDefaultToolkit().createImage("./src/screenPrinting/image/test/squeeze1.png");
    static Image squeeze2 = Toolkit.getDefaultToolkit().createImage("./src/screenPrinting/image/test/squeeze2.png");
    static Image stationtest1 = Toolkit.getDefaultToolkit().createImage("./src/screenPrinting/image/test/stationtest1.png");
    static Image sweep1 = Toolkit.getDefaultToolkit().createImage("./src/screenPrinting/image/test/sweep1.png");
    static Image sweep2 = Toolkit.getDefaultToolkit().createImage("./src/screenPrinting/image/test/sweep2.png");
    static Image textfield1 = Toolkit.getDefaultToolkit().createImage("./src/screenPrinting/image/test/textfield1.png");
    static Image totalspeed1 = Toolkit.getDefaultToolkit().createImage("./src/screenPrinting/image/test/totalspeed2_1.png");
    static Image totalspeed2 = Toolkit.getDefaultToolkit().createImage("./src/screenPrinting/image/test/totalspeed2_2.png");
    static Image updown1 = Toolkit.getDefaultToolkit().createImage("./src/screenPrinting/image/test/updown1.png");
    static Image updown2 = Toolkit.getDefaultToolkit().createImage("./src/screenPrinting/image/test/updown2.png");
    static Image wattheat1 = Toolkit.getDefaultToolkit().createImage("./src/screenPrinting/image/test/wattheat1.png");
    static Image wattheat2 = Toolkit.getDefaultToolkit().createImage("./src/screenPrinting/image/test/wattheat2.png");
    static Image bgimage = Toolkit.getDefaultToolkit().createImage("./src/screenPrinting/image/test/bgimage.png");
    
    
    
    
    static boolean workingMode = false;
    
    static double totalWorkingTime;
    static double lastHeadScreentTime=500;
    static double latencyTime=2000;
    static double tpp;
    static int numHead=2;
    static int numShirt=10;
    static int numberShirtPicture = 6;
    
    static TimeCounter timer; //คลาสนับเวลา
    
    machineInfo(){
        
    }
    public static  void addHead(headPrint h){
        if(headList.size() < 20){
            headList.add(h);
            System.out.println("addHead()");
        }
        else{
            JOptionPane.showMessageDialog(  null,
                                            "not enough power to drive motor.",
                                            "OverLoad",
                                            JOptionPane.WARNING_MESSAGE
            );
        }
    }
    public static void addModule(int type){
        
        module.add(type);
        for(int a : module){
            System.out.print(a);
        }
        switch(type){
            case 0:
                addHead(new headPrint());
                addHead(new headPrint());
                addHead(new headPrint());
                break;
            case 1:
                addHead(new headPrint());
                addHead(new headPrint());
                break;
            case 2:
                addHead(new headPrint());
                addHead(new headPrint());
                addHead(new headPrint());
                break;
        }      
    }
   /* public static void setTimer(){
        setSuccesShirtScreen();
        setTotalWorkingTime();
        timer = new TimeCounter();
    }
    
    public static String printTime(int mode){
        
        if(mode==0){
            String hh = Long.toString(timer.rh);
            String mm = Long.toString(timer.rm);
            String ss = Long.toString(timer.rs);
            if(timer.rh<10) hh="0"+Long.toString(timer.rh);
            if(timer.rm<10) mm="0"+Long.toString(timer.rm);
            if(timer.rs<10) ss="0"+Long.toString(timer.rs);
            //if(timeCounter==0) return hh+":"+mm+":"+ss;
            if(timer.t<500) return hh+":"+mm+":"+ss;
            else return hh+" "+mm+" "+ss;
        }
        else{
            String hh = Long.toString(timer.h);
            String mm = Long.toString(timer.m);
            String ss = Long.toString(timer.s);
            if(timer.h<10) hh="0"+Long.toString(timer.h);
            if(timer.m<10) mm="0"+Long.toString(timer.m);
            if(timer.s<10) ss="0"+Long.toString(timer.s);
            if(timer.t<500) return hh+":"+mm+":"+ss;
            else return hh+" "+mm+" "+ss;
        }
            
    }
    /*public static double setSuccesShirtScreen(){
        if(StatusPanel.countShirt==0)
            return tpp = lastHeadScreentTime*numHead+latencyTime;
        else
            return tpp = latencyTime+lastHeadScreentTime;
        
    } 
    
    public static void setTotalWorkingTime(){
        totalWorkingTime = (tpp+numShirt*(latencyTime+lastHeadScreentTime))/1000;
    } */
}
    

