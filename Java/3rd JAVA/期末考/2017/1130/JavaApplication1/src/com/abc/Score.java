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
public class Score {
    public static double total(int chi, int eng, int mat, int soc, int nat, int lec){
        return chi*2.5 + eng*1.5 + mat*1 + soc*0.5 + nat*0.5 + lec*3;
    }
    
    public static double avg(int chi, int eng, int mat, int soc, int nat, int lec){
        return (Score.total(chi, eng, mat, soc, nat, lec))/10;
    }
}


