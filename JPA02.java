import java.util.*;
public class JPA02{
 static Scanner keyboard = new Scanner(System.in);
 public static void main(String args[]) {
  int n,sum=1;
  System.out.printf("Input n (0 <= n <= 16):");
  n = keyboard.nextInt();
  while(n!=999){
   System.out.println(n + " 的階層(尾端遞迴) = " + backfactorial(n,sum));
   System.out.println(n + " 的階層(迴圈) = " + loop(n));
   System.out.printf("Input n (0 <= n <= 16):");
   n = keyboard.nextInt();
  }
 }        
 static int loop(int n){
  int sum=1,i;
  for(i=1;i<=n;i++){
   sum*=i;
  }
  return sum;
 }
 static int backfactorial(int n,int sum){
  if (n==1) return sum;
  else return backfactorial(n-1,n*sum);
 }
}
