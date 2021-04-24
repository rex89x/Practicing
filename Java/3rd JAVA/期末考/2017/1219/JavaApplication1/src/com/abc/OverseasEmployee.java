/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc;

/**
 *
 * @author USER
 */
public class OverseasEmployee extends Employee{
    private String type;  //兼職時數
	
    //建構元(1)	
    public OverseasEmployee(String empNo, String empName, char rank, String type){
        super(empNo, empName, rank);
        this.type=type;
    }
	
    //建構元(2)
    public OverseasEmployee(){}
	
    //設定成員值, setter
    public void setType(String type){this.type=type;}
	
    //取出成員值, getter
    public String getType(){return type;}
	
    //------------------------------------------------
    //兼職員工計算薪水的方法, 實作父親的抽象方法
    //------------------------------------------------    
    @Override    
    public int salary(){	
        int base = 0;
        switch(type){
            case "北京" : 
                base=70000;
                break;
            case "上海" : 
                base=68000;
                break;
            case "北美" : 
                base=80000;
                break;
            case "南美" : 
                base=65000;
                break;
        }
        return base;
        /*if(type.equals("北京")){return 70000;}
        else if(type.equals("上海")){return 68000;}
        else if(type.equals("北美")){return 80000;}
        else {return 65000;}*/
    }
    //------------------------------------------------    
}
