import java.io.*;
import java.util.*;
 class ReverseNumber {
   public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       String a=s.nextLine();
      String b = String.valueOf(a);
      StringBuffer str = new StringBuffer (b).reverse();
      System.out.print( Integer.parseInt(str.toString()));
   }
}
