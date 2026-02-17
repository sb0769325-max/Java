import java.util.Scanner;
public class except{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    try {
      int a=sc.nextInt();
      int b=sc.nextInt();
      int res;
      res=a/b;
      System.out.println("Cannot divide by zero"+res);
    }catch(ArithmeticException e){
      System.out.println("Cannot divide by zero");
    }
  }
}