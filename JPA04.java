import java.util.*;
public class JPA04{
 static Scanner keyboard = new Scanner(System.in);
 public static void main(String args[]) {
  System.out.printf("Input the number n: ");
  int n =keyboard.nextInt();
  System.out.printf("Ans: %d",sum2(n));
 }    
 static int sum2(int n){
  if(n==1) return 2;
  else return sum2(n-1)+2*n;
 }
}
