import java.util.Scanner;

public class half_pyramid2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // user input
        System.out.println("Enter Number for pattern : ");
        int n = sc.nextInt();

        // outer loop
        for (int i = 1; i <= n; i++) {

            // inner loop -> print spaces
            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }

            // inner loop -> print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
