import java.io.*;
import java.util.*;
class PowerOfNumber
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        double c=(Math.pow(a,b));
        //int d=Integer.parseInt(c);
        System.out.print(Math.round(c));
    }
}
