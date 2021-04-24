package com.abc;

public class Electricity {
    public static int fee(int degree){   
        int a=(int)(2.10*120);
        int b=(int)(3.02*210);
        int c=(int)(4.39*170);
        int d=(int)(5.44*200);
        int e=(int)(6.16*300);
        if(degree<=120){return (int)(2.10*degree);}
        if(degree>120 && degree <=330){return a+(int)(3.02*(degree-120));}
        if(degree>330 && degree <=500){return a+b+(int)(4.39*(degree-330));}
        if(degree>500 && degree <=700){return a+b+c+(int)(5.44*(degree-500));}
        if(degree>700 && degree <=1000){return a+b+c+d+(int)(6.16*(degree-700));}
        if(degree>1000){return a+b+c+d+e+(int)(6.71*(degree-1000));}
        else{return 0;}
    }
}
/*
以下是台電電費計算方式(小數捨去):

---------------------------------------
「非營業用電」   夏月每度（元） 
---------------------------------------
120度(含)以下部分   2.10      	 
121-330度部分       3.02      	 
331-500度部分       4.39      
501-700度部分       5.44      	 
701-1000度部分      6.16      	 
1001度以上部分      6.71      	  
---------------------------------------

*/