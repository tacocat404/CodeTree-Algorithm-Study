import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        
        System.out.println( (A % 3 == 0 && A % 2 == 1) || (A % 5 == 0 && A % 2 == 0) ? "true" : "false"    );
    }
}