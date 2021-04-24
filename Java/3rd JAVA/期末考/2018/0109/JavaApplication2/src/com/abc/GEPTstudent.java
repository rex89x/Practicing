package com.abc;

public class GEPTstudent extends Student{
    //成員
    private String gept;   //全民英檢級數
    
    public GEPTstudent(String stuNo, String gender, int chi, int eng, int mat, int soc, int nat, int lec, String gept){
        super(stuNo,gender,chi,eng,mat,soc,nat,lec);
        this.gept=gept;
    }
    public GEPTstudent(){}
    //建構元(1)
    public void setGept(String gept){this.gept=gept;}
    //建構元(2)    
    //setters
    public String getGept(){return this.gept;}
    //getters    

    //計算總分
    public double total(){
        int cnt;
        if(gept.equals("中高級")){cnt=100;}
        else if(gept.equals("中級")){cnt=80;}
        else{cnt=60;}
        return getChi()*2.5 + getEng()*2 + getMat()*1.5 + getSoc()*0.5 + getNat()*0.5 + getLec()*3+cnt;     
    }
}
/*
請完成「加考全民英檢考生」類別. 
總分計算方式如下:

國文 2.5倍
英文 2倍
數學 1.5倍 
社會 0.5倍
自然 0.5倍 
作文 3倍
(以上與一般考生完全相同)

另全民英檢:
中高級, 加計100分
中級,   加計80分
初級,   加計60分.

*/