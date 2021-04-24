package com.abc.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MyFrame extends JFrame implements ActionListener, WindowListener{
    //--------------------------
    //(1)宣告將加入面板中的元件
    //--------------------------
    JLabel jl1, jl2, jl3, jl4;
    JTextField jtf1, jtf2;
    JButton jb;
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
        jl1 = new JLabel("職級:");
        jl2 = new JLabel("銷售金額:");          
        
        jl3 = new JLabel("傭金:");
        jl4 = new JLabel();
    
        jtf1 = new JTextField();
        jtf2 = new JTextField();
        
        jb = new JButton("計算");
        //----------------------------------------  
        
        
        //----------------------------------------
        //(3)宣告將接收事件的實例
        //----------------------------------------        
        jb.addActionListener(this); 
        //----------------------------------------
        
        
        //----------------------------------------
        //(4)宣告這個面板將接收視窗事件
        //----------------------------------------        
        addWindowListener(this); 
        //----------------------------------------        
        
        
        this.setTitle("我的JFrame");
        this.getContentPane().setBackground(new Color(255, 255, 255));

        
        //----------------------------------------
        //(5)將元件的實例加到面板中
        //----------------------------------------        
        this.getContentPane().setLayout(null);  
       
        this.getContentPane().add(jl1);
        this.getContentPane().add(jl2);
        this.getContentPane().add(jl3);
        this.getContentPane().add(jl4);        
        
        this.getContentPane().add(jtf1);
        this.getContentPane().add(jtf2);
        
        this.getContentPane().add(jb);
        //---------------------------------------- 
        
        
        //---------------------------------------- 
        //(6)設定實例的座標及大小
        //----------------------------------------         
        jl1.setBounds(35,40,150,25);
        jl2.setBounds(35,80,150,25); 
        
        jtf1.setBounds(135,40,150,25);
        jtf2.setBounds(135,80,150,25);    
        
        jb.setBounds(135,120,150,25); 
        
        jl3.setBounds(35,160,150,25);
        jl4.setBounds(135,160,150,25);         
         //---------------------------------------- 
         
         
        this.setSize(new Dimension(500,300));
        this.setVisible(true);        
    }
    
    
    //---------------------------------------------
    //改寫發生事件的方法
    //---------------------------------------------
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==jb){
            //取得輸入資料
            String rank = jtf1.getText();
            double salesTot = Double.parseDouble(jtf2.getText());
            double commission=0;
            

            //計算
            if(rank.equals("A")){
                commission=salesTot*0.12;
            }else if(rank.equals("B")){
                commission=salesTot*0.1;
            }else{
                commission=salesTot*0.08;
            }
            
            //送出結果
            jl4.setText(String.valueOf(commission));            
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