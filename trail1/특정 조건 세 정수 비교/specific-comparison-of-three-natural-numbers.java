import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int T1 = (((A <= B) && (A <= C)) ? 1 : 0);
        int T2 = (((A == B) && (B == C)) ? 1 : 0); 
        System.out.println(T1 + " " + T2);
    }
}