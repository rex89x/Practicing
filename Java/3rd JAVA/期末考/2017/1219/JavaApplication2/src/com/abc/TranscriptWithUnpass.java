//------------------------------------------------------
// 不及格統計成績單的類別 (兒子, 繼承成績單類別, 未完成)
//------------------------------------------------------
package com.abc;

public class TranscriptWithUnpass extends Transcript{
    private String unpass;
    //建構元(1)
    public TranscriptWithUnpass(String stuNo, String stuName, int chi, int eng, int mat){
        super(stuNo, stuName, chi, eng ,mat);
    	this.unpass=unpass;
    }
    //建構元(2)
    public TranscriptWithUnpass(){}
    
    public void setUnpass(String unpass){this.unpass=unpass;}
    
    //getters
    public String getUnpass(){return this.unpass;}
    //----------------------------------
    //不及格統計的備註
    //---------------------------------- 
    @Override
    public String remark(){
        int cnt = 0;
        if(super.getChi()<60){
            cnt ++;
        }
        if(super.getEng()<60){
            cnt ++;
        }
        if(super.getMat()<60){
            cnt ++;
        }
        if(cnt==0){
            return "不及格數:"+ cnt;
        }else{
            return " ";
        }
    }
    //----------------------------------    
}