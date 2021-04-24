package com.abc;

public class Counter{
    private int cnt=0;
	
    public int count(){
        //-------------------------
        // 程式同步區域
        //-------------------------	
        synchronized(this){
            int i=this.cnt;
            i++;
	    
	    try{
	        Thread.sleep(1);
	    }catch(Exception e){}
	    
            this.cnt=i;
        }
        //-------------------------
	
        return this.cnt;		
    }
}   
