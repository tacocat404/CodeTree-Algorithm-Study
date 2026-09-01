import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (N >= 100) {
            System.out.println("vapor");
        }
        else if (N < 0) {
            System.out.println("ice");
        }
        else {
            System.out.println("water");
        }
    }
}