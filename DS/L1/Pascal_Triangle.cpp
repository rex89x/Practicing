#include <iostream>
using namespace std;
//巴斯卡三角形

int main() {
  int rows;
  cout << "請輸入列數 : ";
  cin >> rows;

  for(int i = 0; i < rows; i++){
    int val = 1;
    for(int j = 1; j < (rows - i); j++){
      cout << "   ";
    }
    for(int k = 0; k <= i; k++){
      cout << "     " << val;
      val = val * (i - k) / (k + 1);
    }
    cout << endl << endl;
  }

  cout << endl;
  return 0;
}