import java.util.Scanner;

public class halfPyramid_invert_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // user input
        System.out.println("Enter Number for pattern : ");
        int n = sc.nextInt();

        //outer loop
        for(int i = 1; i<=n; i++){

            //inner loop
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();

    }
}
