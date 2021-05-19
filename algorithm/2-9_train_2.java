public static void main(String[] args) {
    int arr2[][] = new int [5][5];
    int i, j, total = 0;
    for(i = 0; i < 5; i++){
        for(j = 0; j < 5; j++){
            arr2[i][j] = i + j;
            System.out.printf("%3d", arr2[i][j]);
        }
        System.out.printf("\n");
    }

    for(i = 0; i < 5; i++){
        for(j = 0; j < 5; j++){
            total += arr2[i][j];
        }
    }
    System.out.printf("total = %d\n", total);
}