import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][4];
        int sumVal = 0;


        for (int y = 1; y < 5;y++) {
            for (int x = 1; x < 5;x++) {
                arr[y-1][x-1] = sc.nextInt();
            }
        }


        for (int y = 1; y < 5;y++) {
            for (int x = 1; x <= y;x++) {
                sumVal += arr[y-1][x-1];
            }
        }
        System.out.println(sumVal);
    }
}

