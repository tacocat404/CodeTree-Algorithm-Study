import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float A = sc.nextFloat();
        float B = sc.nextFloat();

        if (A >= 1.0 && B >= 1.0) {
            System.out.println("High");
        }
        else if (A >= 0.5 && B >= 0.5) {
            System.out.println("Middle");
        }
        else {
            System.out.println("Low");
        }

        
    }
}