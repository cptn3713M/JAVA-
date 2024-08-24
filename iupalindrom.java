import java.util.Scanner;

public class iupalindrom
{
    public static void main(String[]args)
    {
        /*int a ,n=0;
       int z=a;*/
        Scanner x=new Scanner(System.in);
        int a=x.nextInt();
                int n=0;
        int z=a;
                int rm;
        System.out.println("enter nbr");


       // System.out.println(a);
        while (a!=0)
        {
           rm=a%10;
           n=n*10+rm;
           a=a/10;
        }


        if (z==n)
        {
            System.out.println("yes p");
        }
        else
        {
            System.out.println("not p");
        }
    }
}
