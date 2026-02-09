import java.util.Scanner;
public class citizen{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int avg;
    avg=a+b/2;
    if (avg>40){
      System.out.println("You have passed");
    }
    else{
      System.out.println("You have failed");
    }
  }
}
    