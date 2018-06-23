import java.io.*;
import java.util.*;
class SumofNatural
{
    public static void main(String args[])
    {
        int sum=0;
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        for(int i=0;i<=a;i++)
        {
            sum+=i;
        }
        System.out.print(sum);
    }
}
