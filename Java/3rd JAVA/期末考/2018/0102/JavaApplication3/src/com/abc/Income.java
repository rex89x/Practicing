package com.abc;

// 收入類別
public class Income {
    //成員(日期, 項目, 經手人)
    private String date;
    private String title;
    private String empName;
    
    //建構元(1)
    public Income(String date, String title, String empName){
        this.date=date;
        this.title=title;
        this.empName=empName;
    }

    //建構元(2)    
    public Income(){}
    
    //getter
    public String getDate(){return this.date;}
    public String getTitle(){return this.title;}
    public String getEmpName(){return this.empName;}
    
    //setter
    public void setDate(String date){this.date=date;}
    public void setTitle(String title){this.title=title;}
    public void setEmpName(String empName){this.empName=empName;}
}