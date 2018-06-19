import java.io.*;
import java.util.*;
class Num
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if((a>1)&&(a<100000))
        {
            if(a>1)
            {
                System.out.print("postive");
            }
            else if(a==0)
            {
                System.out.print("zero");
            }
            else
            {
                System.out.print("negative");
            }
        }
    }
}
