/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc;


public class SkilledStudent extends Student{
    //成員
    private int coding;
    
    //建構元(1)
    public SkilledStudent(String stuNo, String gender, int chi, int eng, int mat, int soc, int nat, int lec, int coding){
        super(stuNo, gender, chi, eng, mat, soc, nat, lec);
        this.coding=coding;
    }
    
    //建構元(2)
    public SkilledStudent(){}
    
    //setters
    public void setCoding(int coding){this.coding=coding;}
    
    //getters
    public int getCoding(){return this.coding;}
    
    //------------------------------------------------------------------
    //計算總分
    //------------------------------------------------------------------
    @Override
    public double total(){
        return super.total() + this.coding*3;        
    }
    public double avg(){
        return (super.total() + this.coding*3)/13;
    }
    //------------------------------------------------------------------     

    
}
