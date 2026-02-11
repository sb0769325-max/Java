import java.util.Scanner;
class stud{
  int sno;
  String name;
  int age;
  int m1;
  int m2;
  stud(int a,String b,int c,int d,int e){
    sno=a;
    name=b;
    age=c;
    m1=d;
    m2=e;
  }
  void disp(){
    System.out.println("stud no: "+sno);
    System.out.println("Name: "+name);
    System.out.println("Age :"+age);
    System.out.println("Mark1: "+m1);
    System.out.println("Mark2: "+m2);
  }
  void cal(){
    int total;
    total=m1+m2;
    int avg;
    avg=total/2;
    System.out.println("Total: "+total);
    System.out.println("Average: "+avg);
  }
}
public class demo{
   public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int sno=sc.nextInt();
      String name=sc.next();
      int age=sc.nextInt();
      int m1=sc.nextInt();
      int m2=sc.nextInt();
      stud s=new stud(sno,name,age,m1,m2);
      s.disp();
      s.cal();
   }
}



  