#include <stdio.h>

int main(void) {
  int input1, input2, tmp;
  printf("請輸入兩個數 : \n");
  scanf("%d %d", &input1, &input2);

  if(input1 < input2){
    tmp = input1;
    input1 = input2;
    input2 = tmp;
  }

  while(input2 != 0){
    tmp = input1 % input2;
    input1 = input2;
    input2 = tmp;
  }

  printf("最大公因數 = %d ", input1);
  return 0;
}