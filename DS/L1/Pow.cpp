#include <iostream>
using namespace std;
//指數運算(呼叫函式)

float Pow (float x, int y){
  float p = 1;
  int i;
  for ( i = 1; i <= y; i++ )
  p *= x;
  return p;
}

int main() {
  float x;
  int y;

  cout << "請輸入次方運算 : ";
  cin >> x >> y;
  cout << "次方運算結果 : " << Pow(x, y) << endl;
}