package com.abc;


import com.abc.Customer;

//------------------------------------------------------
// 月租型客戶 (兒子, 未完成)
//------------------------------------------------------
public abstract class MonthlyCustomer extends Customer{
    private int baseFee;      //月租費
    private int freeMinutes;  //免費通話分鐘數
    //建構元(1)	
    /*public PartTimeEmployee(String empNo, String empName, char rank, int hours){
        super(empNo, empName, rank);  //呼叫父親的建構元
        this.hours=hours;
    }
	
    //建構元(2)
    public PartTimeEmployee(){}
	
    //設定成員值, setter
    public void setHours(int hours){this.hours=hours;}
	
    //取出成員值, getter
    public int getHours(){return hours;}*/
    public MonthlyCustomer(String phoneNo, String name, int minutes, int baseFee, int freeMinutes){
        super(phoneNo, name, minutes);
        this.baseFee=baseFee;
        this.freeMinutes=freeMinutes;
    }
    public MonthlyCustomer(){}
    public void setFreeMinutes(int freeMinutes){
        this.freeMinutes=freeMinutes;
    }
    public void setBaseFee(int baseFee){
        this.baseFee=baseFee;
    }
    public int getBaseFee(){return baseFee;}
    public int getFreeMinutes(){return freeMinutes;}
    
    public int fee(){
        if(freeMinutes>minutes){
            return (int)(baseFee+(minutes-freeMinutes)*5.6);
        }else{
            return baseFee;
        }
    }
    /*請完成「月租型客戶」及「易付卡型客戶」類別. 
通話費計算方式如下:

-------------------
(5-1) 月租型客戶 
-------------------
若通話分鐘數超過免費通話分鐘數, 超時通話費 = 5.6元 * 超過免費通話之分鐘數; 
若通話分鐘數未超過免費通話分鐘數, 無需付超時通話費.

通話費 = 月租費 + 超時通話費. (小數捨去)

--------------------
(5-2) 易付卡型客戶 
--------------------
通話費 = 8.7元 * 本月通話分鐘數.  (小數捨去)*/
    //通話費
}
