package com.abc;

public class TranscriptWithGrade extends Transcript{  
    //建構元(1)
    public TranscriptWithGrade(String stuNo, String stuName, int chi, int eng, int mat){
    	super(stuNo,stuName,chi,eng,mat);
    }
    //建構元(2)
    public TranscriptWithGrade(){}
    
    //----------------------------------
    //等第的備註
    //---------------------------------- 
    @Override
    public String remark(){
        int tot=chi+eng+mat;
        if(tot<180){
            return "E";
        }else if(tot>=180 && tot <210){
            return "D";
        }else if(tot>=210 && tot <240){
            return "C";
        }else if(tot>=240 && tot <270){
            return "B";
        }else{
            return "A";
        }
    }
    //----------------------------------      
}

/*
「等第成績單的類別」的備註: 
若3科總分大於等於270分, 等第為「A」;
若總分小於270分且大於等於240分, 等第為「B」;
若總分小於240分且大於等於210分, 等第為「C」;			
若總分小於210分且大於等於180分, 等第為「D」;	  
若總分小於180分, 等第為「E」;

*/