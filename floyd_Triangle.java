import java.util.Scanner;

public class floyd_Triangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // user input
        System.out.println("Enter Number for pattern : ");
        int n = sc.nextInt();
        int num=1;

        //outer loop
        for(int i =1; i<=n; i++){
            
            // inner loop
            for(int j = 1; j<=i; j++){
                System.out.print(num);
                
                num++; //increase number for next incremented line
            }
            System.out.println();
        }
        sc.close();
    }
}