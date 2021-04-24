package com.abc;

public abstract class Customer{
    private String phoneNo;     //手機號碼
    private String name;        //姓名
    int minutes;        //本月通話分鐘數   
    
    //建構元(1)
    public Customer(String phoneNo, String name, int minutes){
    	this.phoneNo=phoneNo;
    	this.name=name;
    	this.minutes=minutes;
    }
    
    //建構元(2)
    public Customer(){}
    
    //setters
    public void setPhoneNo(String phoneNo){this.phoneNo=phoneNo;}
    public void setName(String name){this.name=name;}
    public void setMinutes(int minutes){this.minutes=minutes;}
    
    //getters
    public String getPhoneNo(){return this.phoneNo;}
    public String getName(){return this.name;}
    public int getMinutes(){return this.minutes;}

    //---------------------------------	
    //通話費, 抽象方法
    //---------------------------------
    abstract public int fee();
}    
