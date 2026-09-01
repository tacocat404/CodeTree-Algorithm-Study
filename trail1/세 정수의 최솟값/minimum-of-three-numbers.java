import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int min = -101;

        min = ((A <= B) && (A <= C)) ? A : min;
        min = ((B <= C) && (B <= A)) ? B : min;
        min = ((C <= A) && (C <= B)) ? C : min;
        
        System.out.println(min);
    }
}