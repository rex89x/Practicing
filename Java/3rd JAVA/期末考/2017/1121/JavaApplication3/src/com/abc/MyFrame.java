package com.abc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MyFrame extends JFrame implements ActionListener, WindowListener{
    //--------------------------
    //(1)宣告將加入面板中的元件
    //--------------------------
    JLabel jl1, jl2, jl3, jl4;
    JTextField jtf1, jtf2;
    JButton jb,jb2;
    //--------------------------
    
    
    //--------------------------
    //建構元
    //--------------------------
    public MyFrame(){        
        initUI();
    }
    
    //一個僅可在類別內被其他方法呼叫的私用方法
    private void initUI(){
        //----------------------------------------
        //(2)建立元件的實例
        //----------------------------------------       
        jl1 = new JLabel("請輸入身高:");
        jl2 = new JLabel("請輸入體重:");          
        
        jl3 = new JLabel("身體質量指數:");
        jl4 = new JLabel();
    
        jtf1 = new JTextField();
        jtf2 = new JTextField();
        
        jb = new JButton("執行");
        jb2 = new JButton("清除");
        //----------------------------------------  
        
        
        //----------------------------------------
        //(3)宣告將接收事件的實例
        //----------------------------------------        
        jb.addActionListener(this);
        jb2.addActionListener(this);
        //----------------------------------------
        
        this.setTitle("我的JFrame");
        this.getContentPane().setBackground(new Color(255, 255, 255));

        
        //----------------------------------------
        //(4)將元件的實例加到面板中
        //----------------------------------------        
        this.getContentPane().setLayout(null);  
       
        this.getContentPane().add(jl1);
        this.getContentPane().add(jl2);
        this.getContentPane().add(jl3);
        this.getContentPane().add(jl4);        
        
        this.getContentPane().add(jtf1);
        this.getContentPane().add(jtf2);
        
        this.getContentPane().add(jb);
        this.getContentPane().add(jb2);
        //---------------------------------------- 
        
        
        //---------------------------------------- 
        //(4)設定實例的座標及大小
        //----------------------------------------         
        jl1.setBounds(35,40,150,25);
        jl2.setBounds(35,80,150,25); 
        
        jtf1.setBounds(135,40,150,25);
        jtf2.setBounds(135,80,150,25);    
        
        jb.setBounds(135,120,150,25); 
        jb2.setBounds(135,160,150,25);
        
        jl3.setBounds(35,200,150,25);
        jl4.setBounds(135,200,150,25);         
         //---------------------------------------- 
         
         
        this.setSize(new Dimension(400,300));
        this.setVisible(true);        
    }
    
    
    //---------------------------------------------
    //完成處理事件的方法
    //---------------------------------------------
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==jb){
            //取得輸入資料
            double height = Double.parseDouble(jtf1.getText())/100;
            double weight = Double.parseDouble(jtf2.getText());             

            //計算
            double bmi=weight/Math.pow(height, 2);
            
            //送出結果
            jl4.setText(String.valueOf(bmi));            
        }
        //-----------------------------------------------------
        
        if (e.getSource()==jb2){
            jtf1.setText(" ");
            jtf2.setText(" ");
            jl4.setText(" ");
        }
    }
    //---------------------------------------------
    //改寫視窗動作的7個方法
    //---------------------------------------------    
    @Override
    public void windowClosing(WindowEvent e){
        int result=JOptionPane.showConfirmDialog(this, "是否確定離開?", "確定", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if (result==JOptionPane.YES_OPTION){
            this.dispose();
            System.exit(0);  
        }else{
            this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        }            
    }
  
    @Override
    public void windowActivated(WindowEvent e){}
    
    @Override
    public void windowClosed(WindowEvent e){}
    
    @Override
    public void windowDeactivated(WindowEvent e){}
    
    @Override
    public void windowDeiconified(WindowEvent e){}
    
    @Override
    public void windowIconified(WindowEvent e){}
    
    @Override
    public void windowOpened(WindowEvent e){}    
}