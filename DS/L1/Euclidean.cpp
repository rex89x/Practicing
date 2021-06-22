#include <iostream>
using namespace std;
//最大公因數(輾轉相除法)

int main() {
  int Num1;
  int Num2;
  cout << "請輸入兩個數 : ";
  cin >> Num1 >> Num2;
  int TmpNum;

  if (Num1 < Num2) {
    TmpNum = Num1;
    Num1 = Num2;
    Num2 = TmpNum;
  }

  while (Num2 != 0) {
    TmpNum = Num1 % Num2;
    Num1 = Num2;
    Num2 = TmpNum;
  }

  cout << "最大公因數 = " << Num1 << endl;
}