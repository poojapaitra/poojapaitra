import java.io.*;
import java.util.*;
class Alp
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        char b=s.next().charAt(0);
        if((b >='a'&&b<='z')||(b>='A'&&b<='Z'))
        {
            System.out.print("alphabet");
        }
            else
        System.out.print("not alphabet");
        
    }
}


