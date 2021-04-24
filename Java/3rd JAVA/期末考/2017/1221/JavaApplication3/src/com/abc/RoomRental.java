package com.abc;

//-------------------------------------------
//「租房類別」實作了「應付款介面」
//-------------------------------------------
public class RoomRental implements Payable{
    private boolean specialDiscount;   //是否折扣房型

    //建構元(1)
    public RoomRental(boolean specialDiscount){
        this.specialDiscount=specialDiscount;
    }    

    //建構元(2)
    public RoomRental(){}
	
    //setter	
    public void setSpecialDiscount(boolean specialDiscount){
        this.specialDiscount=specialDiscount;
    }
	
    //getter	
    public boolean getSpeicalDiscount(){return specialDiscount;}

    //------------------------------
    //實作介面的方法	
    //------------------------------    
    @Override
    public String item(){
        return "房租費";    	
    } 
    //------------------------------
    

    //------------------------------
    //實作介面的方法	
    //------------------------------    
    @Override	
    public int payment(){
        int price;
		
        if(specialDiscount){
            price=2400;
        }else{
            price=3000;
        }
				
        return price;
    }
    //------------------------------    
}
