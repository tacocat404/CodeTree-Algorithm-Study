import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][4];
        int sumVal = 0;


        for (int y = 0;y < 4; y++) {
            for (int x = 0;x < 4;x++) {
                arr[y][x] = sc.nextInt();
                sumVal += arr[y][x];
            }
            System.out.println(sumVal);
            sumVal = 0;
        }
    }
}

