#include <iostream>
using namespace std;
//遞迴求階層

int recursive(int i){
  int sum;
  if(i == 0)
    return (1);
  else 
    sum = i * recursive(i-1);
  return sum;
}

int main() {
  int Num;
  cout << "請輸入一個數 : ";
  cin >> Num;
  Num = recursive(Num);

  cout << "此數階層為 = " << Num << endl;
}