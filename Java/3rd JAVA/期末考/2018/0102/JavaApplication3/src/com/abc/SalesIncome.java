package com.abc;

public class SalesIncome extends Income{
    private int price;   //單價
    private int amount;  //數量

    public SalesIncome(String date, String title, String empName, int price , int amount){
        super(date,title,empName);
        this.price=price;
        this.amount=amount;
    }
    public SalesIncome(){}
    
    public void setPrice(int price){this.price=price;}
    public void setAmount(int amount){this.amount=amount;}
    
    public int getPrice(){return price;}
    public int getAmount(){return amount;}
    //setters

    //計算總金額(未完成)
    public int total(){
        int tot=price*amount;
        if(tot>=20000 && tot <30000){
            return (int)(tot*0.95);
        }else if(tot>=30000){
            return (int)(tot*0.85);
        }else{
            return tot;
        }
    }    
}
/*銷貨金額 = 單價 * 數量

若銷貨金額>=30000, 打85折;
若銷貨金額>=20000且不足30000, 打95折;
其他不打折.

總金額 = 折扣後的銷貨金額.*/
