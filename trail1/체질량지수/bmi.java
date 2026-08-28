import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();

        int c = 10000 * w / (h * h);
        System.out.println(c);
        if (c >= 25) {
            System.out.println("Obesity");
        }

    }
}