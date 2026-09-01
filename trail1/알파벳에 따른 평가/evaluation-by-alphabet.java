import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char N = sc.next().charAt(0);
        
        if (N == 'S') {
            System.out.println("Superior");
        }
        else if (N == 'A') {
            System.out.println("Excellent");
        }
        else if (N == 'B') {
            System.out.println("Good");
        }
        else if (N == 'C') {
            System.out.println("Usually");
        }
        else if (N == 'D') {
            System.out.println("Effort");
        }
        else {
            System.out.println("Failure");
        }
    }
}