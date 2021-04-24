package com.abc;

public class MyThread extends Thread {
    private String name;
    private Counter counter;
	
    public MyThread(String name, Counter counter){
        this.name=name;
        this.counter=counter;
    }	
    
    @Override
    public void run() { 
        for(int i=0; i<500; i++){
            System.out.println(name + ":" + counter.count());
        }	
    }
}      