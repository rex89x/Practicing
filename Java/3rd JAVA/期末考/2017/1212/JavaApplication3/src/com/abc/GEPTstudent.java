//------------------------------------------------------
// GEPTstudent (兒子, 加考全民英檢考生類別)
//------------------------------------------------------
package com.abc;
    
public class GEPTstudent extends Student{
    
    private String gept;   //全民英檢級數
    
    public GEPTstudent(){
        this.gept=null;
    }
    public GEPTstudent(String stuNo, String gender, int chi, int eng, int mat, int soc, int nat, int lec, String gept){
		super(stuNo, gender, chi, eng, mat, soc, nat, lec);
		this.gept=gept;
    }   
    public void setGept(String gept){this.gept=gept;}
    public String getGept(){return gept;}    

    public double newtotal(int chi, int eng, int mat, int soc, int nat, int lec, String gept){
        int cnt = 0;
        if(gept.equals("中高級")){cnt=100;}
        else if(gept.equals("中級")){cnt=80;}
        else{cnt=60;}
        double tot = chi*2.5+eng*2+mat*1.5+soc*0.5+nat*0.5+lec*3+cnt;
        return tot;
    }
}
