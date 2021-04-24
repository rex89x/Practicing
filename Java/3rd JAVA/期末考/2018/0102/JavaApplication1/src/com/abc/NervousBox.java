package com.abc;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class NervousBox extends JPanel implements Runnable{
    //成員
    private double x, y;
    private double dx, dy;
    private int color;
    
    //建構元
    public NervousBox(){
        this.x = Math.random()*800+100;
        this.y = Math.random()*650+100;
        this.dx = Math.random()*10;
        this.dy = Math.random()*10;
        this.color = (int)(Math.random()*16000000);
    }

    //移動
    private void moveBox() {
        this.x += this.dx;
        this.y += this.dy;
        
        if(this.x>950){
            this.x=950;
            this.dx*=-1;
        }
        
        if(this.x<50){
            this.x=50;
            this.dx*=-1;        
        }
        
        if(this.y>750){
            this.y=750;
            this.dy*=-1;
        }
        
        if(this.y<50){
            this.y=50;
            this.dy*=-1;
        }
    }

    //繪圖
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        
        this.setSize(new Dimension(30, 30));
        g.setColor(new Color(this.color));
        g2d.fillRect(0, 0, 30, 30);
        
        this.setLocation((int)(this.x), (int)(this.y));
    }

    //執行緒的執行內容
    @Override
    public void run() { 
        while(true){                
            this.moveBox();
            this.repaint();
            try{
                Thread.sleep(10);
            }catch(InterruptedException e){
                System.out.println("中斷執行");
                break;
            }    
        }	
    }    
}