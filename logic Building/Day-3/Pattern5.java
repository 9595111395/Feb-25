/*
17. Write a program to print the following pattern:
*  *  *  * *
  *  *  * *
     * * *
       * *
         * 
*/
public class Pattern5 {
    public static void main(String[] args) {
        int n = 5; // Number of rows
       for (int i = 0; i < n; i++) {
   for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
             System.out.println(); // Move to the next line
        }
    }
}
