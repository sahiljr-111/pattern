import java.util.Scanner;

public class binary_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // user input
        System.out.println("Enter Number for pattern : ");
        int n = sc.nextInt();

        // outer loop
        for (int i = 1; i <= n; i++) {

            // inner loop
            for (int j = 1; j <= i; j++) {
                int sum = i+j;
                if (sum % 2 != 0) {//odd
                    System.out.print("0 ");
                } else {//even
                    System.out.print("1 ");
                }
            }

            System.out.println();
        }
        sc.close();
    }
}
