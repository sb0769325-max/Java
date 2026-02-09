import java.util.Scanner;
public class voters{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    if (a>=18){
      System.out.println("he is eligible");
    }
    else{
      System.out.println("he is not eligible");
    }
  }
}