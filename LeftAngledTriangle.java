public class LeftAngledTriangle {
    public static void main(String[] args) {
        int rows = 5; // number of rows

        for (int i = 1; i <= rows; i++) {
            // Print spaces first
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/* Output:
      *
     **
    ***
   ****
  *****
*/