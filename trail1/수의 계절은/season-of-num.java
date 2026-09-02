import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        if (3 <= A && A <= 5) {
            System.out.println("Spring");
        }
        else if (6 <= A && A <= 8) {
            System.out.println("Summer");
        }
        else if (9 <= A && A <= 11) {
            System.out.println("Fall");
        }
        else {
            System.out.println("Winter");
        }
        

    }
}
