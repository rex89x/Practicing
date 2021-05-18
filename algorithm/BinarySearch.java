import java.util.Scanner;

public static void main(String[] args) {
    int input1, result;
    Scanner scanner = new Scanner(System.in);
    System.out.println("請輸入一個數字：");
    input1 = scanner.nextInt();
    result = Fibo(input1);
}

public static void BinarySearch(int A[], int n, int x, int j){
    int lower = 1;
    int upper = n, mid;
    while(lower <= upper){
        mid = (lower + upper) / 2;
        if(x > A[mid]){
            lower = mid + 1;
        }else if(x < A[mid]){
            upper = mid - 1;
        }else{
            j = mid;
            System.out.println("Found, " + x + " is #" + mid + "record.");
        }
    }
}