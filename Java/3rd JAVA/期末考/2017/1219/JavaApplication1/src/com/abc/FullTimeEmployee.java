package com.abc;

//------------------------------------------------------
//「全職員工」繼承「員工」, 因此宣告 extends 父親類別
//------------------------------------------------------
public class FullTimeEmployee extends Employee{
    private int saleTotal;  //月銷售額
	
    //建構元(1)	
    public FullTimeEmployee(String empNo, String empName, char rank, int saleTotal){
        super(empNo, empName, rank); //呼叫父親的建構元
        this.saleTotal=saleTotal;
    }
	
    //建構元(2)
    public FullTimeEmployee(){}
	
    //設定成員值, setter
    public void setSaleTotal(int saleTotal){this.saleTotal=saleTotal;}
	
    //取出成員值, getter
    public int getSaleTotal(){return saleTotal;}
	
    //-------------------------------------------
    //全職員工計算薪水的方法, 實作父親的抽象方法
    //-------------------------------------------
    @Override    
    public int salary(){
        int base;         //底薪
        int commission;   //傭金
		
        switch(super.getRank()){
            case 'A':
                base=40000;
                commission=(int)(saleTotal*0.05);
                break;
            case 'B':
                base=35000;
                commission=(int)(saleTotal*0.04);
                break;
            case 'C':
                base=30000;
                commission=(int)(saleTotal*0.03);
                break;
            default:
                base=25000;
                commission=(int)(saleTotal*0.02);
        }
		
        return (base + commission);
    }
    //-------------------------------------------------------------    
}
