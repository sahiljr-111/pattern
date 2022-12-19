public class homework {
    public static void main(String[] args) {
        int n = 5;
        // inner loop
        for (int i = 1; i <= n; i++) {

            for(int j =1; j<=n-i;j++){
                System.out.print(" ");
            }

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
    }
}
