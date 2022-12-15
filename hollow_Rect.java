import java.util.Scanner;

public class hollow_Rect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // user input
        System.out.println("Enter Number for pattern : ");
        int n = sc.nextInt();

        // outer loop
        for (int i = 1; i <= n; i++) {

            // inner loop
            for (int j = 1; j <= n; j++) {

                // inner loop chack condition
                if (i == 1 || j == 1 || i == n || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // next line after inner loop
            System.out.println();
        }
        sc.close();
    }
}
