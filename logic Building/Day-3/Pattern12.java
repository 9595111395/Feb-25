/*26. Write a program to print the following pattern:
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15 */
public class Pattern12 {
    public static void main(String[] args) {
        int n = 5; // Number of rows
        int num = 1; // Initialize number to print
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println(); // Move to the next line
        }
    }
}
