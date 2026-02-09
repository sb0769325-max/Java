import java.util.Scanner;
public class read{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    while(true){
      int num=sc.nextInt();
      if (num<0){
         System.out.println("negative number entered ");
        break;
      } 
      if (num==0){
        continue;
      }
      System.out.println(num);
    } 
  }
}