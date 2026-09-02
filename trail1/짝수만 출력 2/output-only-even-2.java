import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int i = A;

        while (i > (B - 1)) {
            System.out.print(i + " ");
            i -= 2;
        }
    }
}