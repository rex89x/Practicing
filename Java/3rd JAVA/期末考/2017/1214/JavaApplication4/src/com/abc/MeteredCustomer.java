package com.abc;

//------------------------------------------------------
// 易付卡型客戶 (兒子, 未完成)
//------------------------------------------------------
public class MeteredCustomer extends Customer{
    private int minutes;
    
    public MeteredCustomer(String phoneNo, String name, int minutes,int hours){
        super(phoneNo, name, minutes);
        this.minutes=minutes;
    }
    
    public MeteredCustomer(){}

    public MeteredCustomer(String phoneNo, String name, int minute) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setMinutes(int hours){this.minutes=minutes;}
    
    public int getMinutes(){return minutes;}
    
    @Override    
    public int fee(){		
        return (int) (minutes*8.7);
    }
    /*private int hours;  //兼職時數
	
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
    }*/
    
    //------------------------------------------------    
    //建構元(1)
    //建構元(2)
    //通話費
}
