package com.abc;

public class Electricity {
    public static int fee(int degree){   
        int a=(int)2.10*120;
        int b=(int)3.02*110;
        int c=(int)4.39*170;
        int d=(int)5.44*200;
        int e=(int)6.16*300;
        if(degree<=120){
            return (int)(degree*2.10);
        }else if(degree>120 && degree <=330){
            return (int)(a+(degree-120)*3.02);
        }else if(degree>330 && degree <=500){
            return (int)(a+b+(degree-330)*4.39);
        }else if(degree>500 && degree <=700){
            return (int)(a+b+c+(degree-500)*5.44);
        }else if(degree>700 && degree <=1000){
            return (int)(a+b+c+d+(degree-700)*6.16);
        }else{
            return (int)(a+b+c+d+e+(degree-1000)*6.71);
        }
    }
}


/*以下是台電電費計算方式(小數捨去):

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

假設用電1200度, 電費為:
2.10*120 + 3.02*210 + 4.39*170 + 5.44*200 + 6.16*300 + 6.71*200
= 5,910元*/
