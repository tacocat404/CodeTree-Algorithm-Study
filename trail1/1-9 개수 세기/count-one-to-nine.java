import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[10];


        for (int i = 0; i < N; i++) {
            int P = sc.nextInt();
            arr[P] += 1;
        }

        for (int i = 1; i < 10; i++) {
            System.out.println(arr[i]);
        }
    }
}