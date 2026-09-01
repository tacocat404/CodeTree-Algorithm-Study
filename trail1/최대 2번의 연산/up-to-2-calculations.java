import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();

        if (A % 2 == 0) {
            A = A / 2;
        }
        if (A % 2 == 1) {
            A = (A + 1) / 2;
        }
        System.out.println(A);
    }
}