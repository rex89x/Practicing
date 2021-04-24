package com.abc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class MyThread extends Thread {
    //成員
    private String name;
    private String url;
    private String nm;
	
    //建構元
    public MyThread(String name, String url, String nm){
        this.name=name;
        this.url=url;
        this.nm=nm;
    }
	
    //改寫執行緒的執行內容
    @Override
    public void run() { 
        try{         
            System.out.println(name + ":" + "啟動...");
            
	    //----------------------------------------------
            //設定連結目的地
	    // https://www.mobile01.com/
	    // https://tw.yahoo.com/
	    //----------------------------------------------
            URL url = new URL(this.url);  
            
            //建立輸入串流
            InputStream in = url.openStream();                           
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));            
            
            //建立一個File物件
            File file = new File(this.nm);
        
            //建立連結檔案的輸出Writer
            FileWriter fw = new FileWriter(file);
            //從串流逐行讀入資料, 顯示在畫面上
            String data;
            while((data=reader.readLine()) != null){ 
                System.out.println(name + ":" +  data);   
                //由輸出Writer寫資料到檔案
                fw.write(data); 
                fw.write("\n"); 
            }
          
            //關閉串流
            in.close();
        }catch(IOException e){
            System.out.println("資料讀取錯誤");
        }
        
    }	   
}    
