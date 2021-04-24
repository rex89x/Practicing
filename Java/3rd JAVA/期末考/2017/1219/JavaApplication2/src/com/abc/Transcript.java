//------------------------------------------------------
// 成績單類別 (父親, 抽象類別, 已完成)
//------------------------------------------------------
package com.abc;

public abstract class Transcript{
    //成員
    private String stuNo;
    private String stuName;
    private int chi, eng, mat;

    //建構元(1)
    public Transcript(String stuNo, String stuName, int chi, int eng, int mat){
    	this.stuNo=stuNo;
    	this.stuName=stuName;
    	this.chi=chi;
    	this.eng=eng;
    	this.mat=mat;
    }
    
    //建構元(2)
    public Transcript(){}    
    
    //setters
    public void setStuNo(String stuNo){this.stuNo=stuNo;}
    public void setStuName(String stuName){this.stuName=stuName;}
    public void setChi(int chi){this.chi=chi;}
    public void setEng(int eng){this.eng=eng;}
    public void setMat(int mat){this.mat=mat;}
    
    //getters
    public String getStuNo(){return this.stuNo;}
    public String getStuName(){return this.stuName;}
    public int getChi(){return this.chi;}
    public int getEng(){return this.eng;}
    public int getMat(){return this.mat;}

    //----------------------------------
    //備註, 抽象方法
    //----------------------------------     
    abstract public String remark();
    //----------------------------------      
}