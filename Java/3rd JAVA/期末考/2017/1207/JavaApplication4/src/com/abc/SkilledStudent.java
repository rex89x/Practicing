/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc;


public class SkilledStudent extends Student{
    //成員
    private String GEPT;
    
    //建構元(1)
    public SkilledStudent(String stuNo, String gender, int chi, int eng, int mat, int soc, int nat, int lec, String GEPT){
        super(stuNo, gender, chi, eng, mat, soc, nat, lec);
        this.GEPT=GEPT;
    }
    
    //建構元(2)
    public SkilledStudent(){}
    
    //setters
    public void setGEPT(int coding){this.GEPT=GEPT;}
    
    //getters
    public String getGEPT(){return this.GEPT;}
    
    
    //------------------------------------------------------------------
    //計算總分
    //------------------------------------------------------------------
    @Override
    public double total(){
        double a = 0;
        if(this.GEPT.equals("初級")){a=60;}
        if(this.GEPT.equals("中級")){a=80;}
        if(this.GEPT.equals("中高級")){a=90;}
        return super.total() + a*3;
    }
    public double avg(){
        double a = 0;
        if(this.GEPT.equals("初級")){a=60;}
        if(this.GEPT.equals("中級")){a=80;}
        if(this.GEPT.equals("中高級")){a=90;}
        return (super.total() + a*3)/13;
    }
    //------------------------------------------------------------------     

    
}
