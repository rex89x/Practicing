package com.abc;

public class TranscriptWithUnpass extends Transcript{
    //建構元(1)
    public TranscriptWithUnpass(String stuNo, String stuName, int chi, int eng, int mat){
    	super(stuNo,stuName,chi,eng,mat);
    }
    //建構元(2)
    public TranscriptWithUnpass(){}
    //建構元(2)
    
    //----------------------------------
    //不及格統計的備註
    //---------------------------------- 
    @Override
    public String remark(){
        int tot=0;
        if(chi<60){tot++;}
        if(eng<60){tot++;}
        if(mat<60){tot++;}
        if(tot>0){
            return tot+"科";
        }else{
            return " ";
        }
    }
    //----------------------------------    
}
/*
「不及格統計成績單的類別」的備註: 
成績小於60分為不及格.
有不及格者輸出不及格科目數; 全及格者輸出空白.
*/