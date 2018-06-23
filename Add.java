import java.io.*;
import java.util.*;
class Add
{
    public static void main(String args[])
    {
        int sum=0;
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int c[]=new int[a];
        int b=s.nextInt();
        for(int i=0;i<a;i++)
        {
           c[i]=s.nextInt(); 
        }
        for(int i=0;i<=b;i++)
        {
            sum+=i;
        }
        System.out.print(sum);
    }
}
