public class string{
  public static void main(String args[]){
    String str="hello";
    String s2=str+"world";
    String upper=str.toUpperCase();
    String replaced=s2.replace('l','x');
    String replacedall=s2.replaceAll("l","y");
    System.out.println("Original string: "+str);
    System.out.println("UpperCase: "+upper);
    System.out.println("Char at index 3 :"+s2.charAt(3));
    System.out.println("After repalce(): "+replaced);
    System.out.println("After replacedAll: "+replacedall);
    
  }
}
    