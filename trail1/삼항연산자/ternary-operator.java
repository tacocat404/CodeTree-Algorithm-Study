import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        String B = "None";
        
        B = A == 100 ? "pass" : "failure";
        System.out.println(B);
    }
}