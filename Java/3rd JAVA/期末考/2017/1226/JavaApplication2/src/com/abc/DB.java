package com.abc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB{
    //-----------------------------------------------------
    //取出並回傳學生資料
    //-----------------------------------------------------    
    public static Connection getConnection(){
        try{   
            //載入mysql驅動程式
            Class.forName("com.mysql.jdbc.Driver");
            
            //產生一個連到資料庫的連結物件
            Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "mysql");             
         
            //回傳連結物件
            return connection;
        }catch(ClassNotFoundException | SQLException e){  
            //回傳空值
            return null;
        }
    }
    //-----------------------------------------------------    
} 