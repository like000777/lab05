import java.util.*;
public class JPA03{
 static Scanner keyboard = new Scanner(System.in);
 public static void main(String args[]) {
  int m,n,sum=1;
  System.out.printf("Input m:");
  m = keyboard.nextInt();
  while(m!=999){
   System.out.printf("Input n:");
   n = keyboard.nextInt();
   System.out.println("最大公因數為 = " + factorial(m,n));
   System.out.printf("Input m:");
   m = keyboard.nextInt();
  }
 }
 static int factorial(int m,int n){
  if (n == 0) return m;
  else return factorial(n, m % n);
 }
}
