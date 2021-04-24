package com.abc;

//------------------------------------
// 「租車類別」實作了「應付款介面」
//------------------------------------
public class CarRental implements Payable{
    private String type;    //車型
    private int rentDays;   //租用天數

    //建構元(1)
    public CarRental(String type, int rentDays){
        this.type=type;
        this.rentDays=rentDays;
    }

    //建構元(2)
    public CarRental(){}

    //setter
    public void setType(String type){this.type=type;}
    public String getType(){return type;}

    //getter
    public void setRentDays(int rentDays){this.rentDays=rentDays;}
    public int getRentDays(){return rentDays;}	

    //-----------------------
    //實作介面的方法(1)	
    //-----------------------
    @Override
    public String item(){
        return "租車費";    	
    }    
    //-----------------------
    
    
    //-----------------------    
    //實作介面的方法(2)	
    //-----------------------    
    @Override	
    public int payment(){
        int price;
		
        if(type.equals("3000cc")){
            price=4000;
        }else if(type.equals("2400cc")){
            price=2500;
        }else if(type.equals("1800cc")){
            price=2000;
        }else{
            price=1500;
        }
				
        return price*rentDays;
    }
    //-----------------------    
}