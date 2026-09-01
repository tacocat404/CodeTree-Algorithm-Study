import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();

        if (N == 5) {
            System.out.println("A");
        }
        if (N % 2 == 0) {
            System.out.println("B");
        }
    }
}