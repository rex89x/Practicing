import java.util.Scanner;

public static void main(String[] args) {
    int fibo1 = 1;
    int fibo2 = 0;
    int input1;
    int result = 0;

    Scanner scanner = new Scanner(System.in);
    System.out.println("請輸入一個數字：");
    input1 = scanner.nextInt();

    if(input1 == 0){
        System.out.println(0);
    }else if(input1 == 1) {
        System.out.println(1);
    }else{
        for (int i = 2; i <= input1; i++) {
            result = fibo1 + fibo2;
            fibo2 = fibo1;
            fibo1 = result;
        }
        System.out.println(result);
    }
}