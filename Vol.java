import java.io.*;
import java.util.*;
class Vol
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        char a=s.next().charAt(0);
        
        if((a=='a')||(a=='e')||(a=='i')||(a=='o')||(a=='u')||(a=='A')||(a=='E')||(a=='I')||(a=='O')||(a=='U'))
        {
        System.out.print("volwels");
        }
        else if((a>='a'&& a<='z')||(a>='A'&& a<='Z'))
        {
            System.out.print("consonent");
        }
        else
        {
            System.out.print("not alphabet");
        }
    }
}


