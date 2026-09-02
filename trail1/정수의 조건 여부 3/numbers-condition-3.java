import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        System.out.println( ((A % 13 == 0) || (A % 19 == 0)) ? "True" : "False" );
    }
}