import java.util.*;
 
class ReverseString
{
   public static void main(String args[])
   {
      String  c = "";
      Scanner in = new Scanner(System.in);
     String b = in.nextLine();
      int length = b.length();
    for ( int i = length - 1 ; i >= 0 ; i-- )
         c = c + b.charAt(i);
       System.out.print(c);
   }
}
