//------------------------------------------------------
// 等第成績單的類別 (兒子, 繼承成績單類別, 未完成)
//------------------------------------------------------
package com.abc;

public class TranscriptWithGrade extends Transcript{  
    private String grade;
    //建構元(1)
    public TranscriptWithGrade(String stuNo, String stuName, int chi, int eng, int mat){
        super(stuNo, stuName, chi, eng ,mat);
    	this.grade=grade;
    }
    //建構元(2)
    public TranscriptWithGrade(){}
    public void setGrade(String grade){this.grade=grade;}
    
    //getters
    public String getGrade(){return this.grade;}
    //----------------------------------
    
    //等第的備註
    //---------------------------------- 
    @Override
    public String remark(){
        if(super.getChi()+super.getEng()+super.getMat()>=270){
            return "等第:A";
        }else if(super.getChi()+super.getEng()+super.getMat()<270 && super.getChi()+super.getEng()+super.getMat()>=240){
            return "等第:B";
        }else if(super.getChi()+super.getEng()+super.getMat()<240 && super.getChi()+super.getEng()+super.getMat()>=210){
            return "等第:C";
        }else if(super.getChi()+super.getEng()+super.getMat()<210 && super.getChi()+super.getEng()+super.getMat()>=180){
            return "等第:D";
        }else{return "等第:E";}
    }
    /*=====================
5. 說明:
=====================
「等第成績單的類別」的備註: 
若3科總分大於等於270分, 等第為「A」;
若總分小於270分且大於等於240分, 等第為「B」;
若總分小於240分且大於等於210分, 等第為「C」;			
若總分小於210分且大於等於180分, 等第為「D」;	  
若總分小於180分, 等第為「E」;


「不及格統計成績單的類別」的備註: 
成績小於60分為不及格.
有不及格者輸出不及格科目數; 全及格者輸出空白.
*/
    //----------------------------------      
}
