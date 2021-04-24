package com.abc;

public class SignUp{
    private String tel;      //電話
    private String name;     //報名姓名
	
    //建構元(1)
    public SignUp(String tel, String name){
        this.tel=tel;
        this.name=name;
    }
    
    //建構元(2)
    public SignUp(){}
    //setters
    public void setTel(String tel){this.tel=tel;}
    public void setName(String name){this.name=name;}
    //getters
    public String getTel(){return this.tel;}
    public String getName(){return this.name;}
}
/*
參加費用(每人) = 500 
租用相機(每台) = 300 或 0 (若租用相機, 加收租金300元; 否則不必付租金.)
總費用 = 500*人數 + 300*台數
*/