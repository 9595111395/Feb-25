
public class OffByOneErrorForLoop {
 public static void main(String[] args) {
 for (int i = 0; i <= 10; i++) {
 System.out.println(i);
 }
 // Expected: 10 iterations with numbers 1 to 10
 // Actual: Prints numbers 1 to 10, but the task expected only 1 to 9
 }
}
/*
// Error to investigate: What is the issue with the loop boundaries? How should the loop be adjusted to meet the
expected output? 
-bz i initiaised value is one so it start printing 1 onwords to 9.
for (int i = 1; i <= 10; i++) 
-after 9th iteartion condition become false
-----------------------------------------------------
correct code:
public class OffByOneErrorForLoop {
 public static void main(String[] args) {
 for (int i = 0; i <= 10; i++) {
 System.out.println(i);
 }
}
}
*/
