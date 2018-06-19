import java.io.*;
import java.util.*;
class Oq
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if((a>=1)&&(a<=100000))
        {
            if(a%2==0)
            {
                System.out.print("even");
            }
            else 
            {
                System.out.print("odd");
            }
            
            
        }
        else
        {
            System.out.print("invalid");
        }
        
    }
}
