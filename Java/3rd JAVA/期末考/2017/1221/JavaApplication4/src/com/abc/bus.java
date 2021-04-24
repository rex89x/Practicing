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
public class bus implements Payable{
    private String type;    //車型

    //建構元(1)
    public bus(String type){
        this.type=type;
    }

    //建構元(2)
    public bus(){}

    //setter
    public void setType(String type){this.type=type;}
    public String getType(){return type;}
    @Override
    public String item(){
        return "車票";    	
    }    

    
    @Override	
    public int payment(){
        int price = 0;
		
        if(type.equals("台中")){
            price=500;
        }else if(type.equals("台南")){
            price=800;
        }else if(type.equals("高雄")){
            price=1200;
        }
				
        return price;
    }
    //-----------------------    

}
