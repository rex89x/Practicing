package com.abc;

//------------------------------------------------------
//「兼職員工」繼承「員工」, 因此宣告 extends 父親類別
//------------------------------------------------------
public class PartTimeEmployee extends Employee{
    private int hours;  //兼職時數
	
    //建構元(1)	
    public PartTimeEmployee(String empNo, String empName, char rank, int hours){
        super(empNo, empName, rank);  //呼叫父親的建構元
        this.hours=hours;
    }
	
    //建構元(2)
    public PartTimeEmployee(){}
	
    //設定成員值, setter
    public void setHours(int hours){this.hours=hours;}
	
    //取出成員值, getter
    public int getHours(){return hours;}
	
    //------------------------------------------------
    //兼職員工計算薪水的方法, 實作父親的抽象方法
    //------------------------------------------------    
    @Override    
    public int salary(){		
        return (hours*200);
    }
    //------------------------------------------------    
}