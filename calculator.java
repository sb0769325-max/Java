class calculator{
  int add(int a,int b){
    return a+b;
  }
  int add(int a,int b,int c){
    return a+b+c;
  }
  double add(double a,double b){
    return a+b;
  }
  public static void main(String args[]){
    calculator abc=new calculator();
    int a=abc.add(2,5);
    System.out.println(a);
    int b=abc.add(2,5,8);
    System.out.println(b);
    double c=abc.add(1.2,2.1);
    System.out.println(c);
  }
}