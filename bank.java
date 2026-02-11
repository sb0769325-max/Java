import java.util.Scanner;
class bank{
  int accno;
  String name;
  int balance;
  bank(int a,String b,int c){
    accno=a;
    name=b;
    balance=c;
  }
  void disp(){
    System.out.println("Account no: "+accno);
    System.out.println("Name: "+name);
    System.out.println("Balance: "+balance);
  }
  void deposite(int amount){
    balance=balance+amount;
    System.out.println("after deposite: "+balance);
  }
  void withdraw(int withdraw){
    if (withdraw<=balance){
      balance=balance-withdraw;
      
    }else{
      System.out.println("insufficient amount");
    }
  }
}
public class bank2{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int accno=sc.nextInt();
    String name=sc.next();
    int balance=sc.nextInt();
    bank s=new bank(accno,name,balance);
    s.disp();
    s.deposite();
    s.withdraw();
  }
}