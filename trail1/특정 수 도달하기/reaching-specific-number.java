import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumVal = 0;
        int cnt = 0;


        for (int i = 0; i < 10; i++) {
            int el = sc.nextInt();
            if (el > 250) {
                break;
            }
            sumVal += el;
            cnt += 1;
        }
        System.out.printf("%d %.1f",sumVal,(double)sumVal / cnt);
    }
}