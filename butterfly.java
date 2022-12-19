
public class butterfly {
    /*  

     *      *
     **    **
     ***  ***
     ******** 
     ******** 
     ***  ***
     **    **
     *      *

     */
    public static void main(String[] args) {
        int n = 5;
        // Upper half 
        for(int i = 1; i<=n ; i++){
            // 1st half 
            for(int  j = 1; j<=i; j++){
                System.out.print("*");
            }

            // spaces
            for(int j = 1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            // 2nd half
            for ( int j = 1; j<=i; j++){
                System.err.print("*");
            }
            System.out.println();           
        }
        // Lower part
        for(int i = n; i>=1 ; i--){
            // 1st half 
            for(int  j = 1; j<=i; j++){
                System.out.print("*");
            }

            // spaces
            for(int j = 1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            // 2nd half
            for ( int j = 1; j<=i; j++){
                System.err.print("*");
            }
            System.out.println();           
        }
    }
}
