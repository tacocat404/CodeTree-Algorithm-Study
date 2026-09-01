import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int small = 0;
        int same = 0;

        if (A < B) {
            small = 1;
        }
        if (A == B) {
            same = 1;
        }
        System.out.println(small + " " + same);
    }
}