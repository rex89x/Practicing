public static void main(String[] args) {
    int i[] = new int[10];
    int k, total = 0;
    for(k = 0; k < 10; k++){
        i[k] = k+1;
    }
    for(k = 0; k < 10; k++){
        total += i[k];
    }
    System.out.printf("%d\n", total);
}