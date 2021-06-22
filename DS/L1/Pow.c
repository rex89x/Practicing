#include <stdio.h>

int powe(int num, int power){
  int p = 1;
  for(int i = 1; i <= power; i++)
  p *= num;
  return p;
}

int main(void) {
  int input1, input2;
  printf("請輸入兩個數 : \n");
  scanf("%d %d", &input1, &input2);

  printf("次方運算 = %d ", powe(input1, input2));
  return 0;
}