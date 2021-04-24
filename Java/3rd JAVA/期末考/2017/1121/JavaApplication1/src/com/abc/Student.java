/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc;

//-----------------------------
// 宣告一個公開的類別
//-----------------------------
public class Student {
    //成員
    private String stuNo;
    private String stuName;
    
    //建構元(1)
    public Student(String stuNo, String stuName){
        this.stuNo=stuNo;
        this.stuName=stuName;
    }
    
    //建構元(2)
    public Student(){}
    
    //Setters
    public void setStuNo(String stuNo){this.stuNo=stuNo;}
    public void setStuName(String stuName){this.stuName=stuName;}
    
    //Getters
    public String getStuNo(){return this.stuNo;}
    public String getStuName(){return this.stuName;}
}
