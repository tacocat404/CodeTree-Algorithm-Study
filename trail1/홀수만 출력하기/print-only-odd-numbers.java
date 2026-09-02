import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int I = sc.nextInt();
            if ((I % 2 == 1) && (I % 3 == 0)) {
                System.out.println(I);
            }
        }
    }
}