public class InfiniteForLoop {
 public static void main(String[] args) {
 for (int i = 0; i < 10; i--) {
 System.out.println(i);
 }
 }
}
/*
// Error to investigate: Why does this loop run infinitely? How should the loop control variable be adjusted? 
--------------------------------------------------
i-- =goes loop into infinity.
-------------------------------------------------
public class InfiniteForLoop {
 public static void main(String[] args) {
 for (int i = 0; i < 10; i++) {
 System.out.println(i);
 }
 }
}
*/