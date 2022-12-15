import java.util.Scanner;

public class solid_Rect{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        // user input
        System.out.println("Enter Number for pattern : ");
        int n = sc.nextInt();

        // outer loop
        for(int i=1; i<=n; i++){

            // inner loop
            for(int j=1; j<=n; j++){

                // execute line
                System.out.print("*");
            }

            // next line after finishing inner loop
            System.out.println();
        }

        sc.close();
    }
}