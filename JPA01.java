import java.util.*;
public class JPA01{
 static Scanner keyboard = new Scanner(System.in);
 public static void main(String args[]) {
  int n;
  System.out.printf("Input n (0 <= n <= 16):");
  n = keyboard.nextInt();
  while(n!=999){
   System.out.println(n + " 的階層 = " + factorial(n));
   System.out.printf("Input n (0 <= n <= 16):");
   n = keyboard.nextInt();
  }
 }         
 static int factorial(int n){
  if (n==1) return 1;
  else return n*factorial(n-1);
 }
}
