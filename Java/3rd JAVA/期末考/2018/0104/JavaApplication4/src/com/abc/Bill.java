package com.abc;

import static com.abc.Price.bagPrice;
import static com.abc.Price.bootsPrice;
import static com.abc.Price.fastServicePrice;
import static com.abc.Price.shoesPrice;

public class Bill {
    public static int fee(int shoes, int boots, int bags, boolean fastService){  
        int fs=0;
        if (fastService==true){
            fs+=100;
        }else{
            fs=0;
        }
        return (int)((shoesPrice*shoes)+(bootsPrice*boots)+(bagPrice*bags))+fs;
    }
}

/*
以下是一個洗1雙鞋子, 2雙靴子, 3個包包, 並且要求快速服務的價錢:

洗鞋子總金額 = 350*1 = 350
洗靴子總金額 = 450*2 = 900
洗包包總金額 = 550*3 = 1650
快速取回服務 = 100*6 = 600
總金額 = 350 + 900 + 1650 + 600
*/