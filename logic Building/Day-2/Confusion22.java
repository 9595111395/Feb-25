//Snippet 23:
public class Confusion22 {
 public static void main(String[] args) {
 int value = 2;
 switch(value) {
 case 1:
 System.out.println("Value is 1");
 case 2:
 System.out.println("Value is 2");
 case 3:
 System.out.println("Value is 3");
 default:
 System.out.println("Default case");
 }
 }
}/* Error to Investigate: Why does the default case print after "Value is 2"? How can you prevent
the program from executing the default case? 
-causes the switch statement to execute all subsequent cases unless a break statement is used.
-To prevent the default case from executing, add break statements after each case.
---------------------------------------------
public class Confusion22 {
 public static void main(String[] args) {
 int value = 2;
 switch(value) {
 case 1:
 System.out.println("Value is 1");
break;
 case 2:
 System.out.println("Value is 2");
break;
 case 3:
 System.out.println("Value is 3");
break;
 default:
 System.out.println("Default case");
 }
 }*/