import java.util.Scanner;

public static void main(String[] args) {
    int input1, result;
    Scanner scanner = new Scanner(System.in);
    System.out.println("請輸入一個數字：");
    input1 = scanner.nextInt();
    result = Fibo(input1);
}

public static int Fibo(int n){
    if(n==0){
        return 0;
    }else if(n==1){
        return 1;
    }else{
        return (Fibo(n-1) + Fibo(n-2));
    }
}