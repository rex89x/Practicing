package com.abc;

//-------------------------------------------
// 有一個未完成的方法, 因此宣告為 abstract
//-------------------------------------------
public abstract class Employee{
    private String empNo;    //員工編號
    private String empName;  //姓名
    public char rank;       //職級
	
    //建構元(1)
    public Employee(String empNo, String empName, char rank){
        this.empNo=empNo;
        this.empName=empName;
        this.rank=rank;
    }
	
    //建構元(2)
    public Employee(){}		
	
    //設定成員值, setter
    public void setEmpNo(String empNo){this.empNo=empNo;}
    public void setEmpName(String empName){this.empName=empName;}
    public void setRank(char rank){this.rank=rank;}
	
    //取出成員值, getter
    public String getEmpNo(){return empNo;}
    public String getEmpName(){return empName;}
    public char getRank(){return rank;}

    //----------------------------------   
    //抽象方法
    //未撰寫內容的方法, 由它的兒子完成
    //----------------------------------       
    abstract public int salary();
    //----------------------------------       

    public Object rank() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
