public class skip{
  public static void main(String args[]){
    for(int i=1;i<=10;i++){
    if (i%3==0){
      continue;
    }
    if (i>10){
      break;
    }
   System.out.println(i);
  }
  }
}