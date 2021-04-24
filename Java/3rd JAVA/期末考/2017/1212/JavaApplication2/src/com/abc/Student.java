package com.abc;

public class Student implements Comparable<Student>{
    //成員
    private String stuNo;
    private String gender;
    private int chi;
    private int eng;
    private int mat;
    private int soc;
    private int nat;
    private int lec;
    
    //建構元(1)
    public Student(String stuNo, String gender, int chi, int eng, int mat, int soc, int nat, int lec){
        this.stuNo=stuNo;
        this.gender=gender;
        this.chi=chi;
        this.eng=eng;
        this.mat=mat;
        this.soc=soc;
        this.nat=nat;
        this.lec=lec;
    }
    
    //建構元(2)
    public Student(){}
    
    //setters
    public void setStuNo(String stuNo){this.stuNo=stuNo;}
    public void setGender(String gender){this.gender=gender;}
    public void setChi(int chi){this.chi=chi;}
    public void setEng(int eng){this.eng=eng;}
    public void setMat(int mat){this.mat=mat;}
    public void setSoc(int soc){this.soc=soc;}
    public void setNat(int nat){this.nat=nat;}
    public void setLec(int lec){this.lec=lec;}
    
    //getters
    public String getStuNo(){return this.stuNo;}
    public String getGender(){return this.gender;}
    public int getChi(){return this.chi;}
    public int getEng(){return this.eng;}
    public int getMat(){return this.mat;}
    public int getSoc(){return this.soc;}
    public int getNat(){return this.nat;}
    public int getLec(){return this.lec;}
    
    //------------------------------------------------------------------
    //計算總分
    //------------------------------------------------------------------
    public double total(){
        return chi*2.5 + eng*2 + mat*1.5 + soc*0.5 + nat*0.5 + lec*3;        
    }
    //------------------------------------------------------------------ 
    //--------------------------------------------------------------
    //實作Comparable介面的方法
    //--------------------------------------------------------------
    @Override
    public int compareTo(Student stu){        
        return (int)(this.total()*10 - stu.total()*10);  //由小到大
    }
    //--------------------------------------------------------------    
}
