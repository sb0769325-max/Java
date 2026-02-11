import java.util.Scanner;
class bank{
  int accno;
  String name;
  int balance;
  int deposite;
  int withdraw;
  
  bank(int a,String b,int c,int d,int e){
    accno=a;
    name=b;
    balance=c;
    deposite=d;
    withdraw=e;
  }
  void disp(){
    System.out.println("Account no: "+accno);
    System.out.println("Name: "+name);
    System.out.println("Balance: "+balance);
  }
  void deposite(){
    balance=balance+deposite;
    System.out.println("after deposite: "+balance);
  }
  void withdraw(){
    if (withdraw<=balance){
      balance=balance-withdraw;
      System.out.println("after withdraw: "+balance);
    }else{
      System.out.println("insufficient amount");
    }
  }
}
public class bank2{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Acc no: ");
    int accno=sc.nextInt();
    System.out.println("Enter name: ");
    String name=sc.next();
    System.out.println("Enter balannce: ");
    int balance=sc.nextInt(); 
    System.out.println("Enter deposit: ");
    int deposite=sc.nextInt();
    System.out.println("Enter withdraw: ");
    int withdraw=sc.nextInt();
    
    bank s=new bank(accno,name,balance,deposite,withdraw);
    
    s.disp();
    s.deposite();
    s.withdraw();
  }
}