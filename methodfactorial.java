 import java.util.Scanner;

public class methodfactorial {
    static int fact(int a)
    {
        int i,f=1;
//        System.out.println("enter no.for fact");
//        Scanner x= new Scanner(System.in);
//        a=x.nextInt();
        for (i=1;i<=a;i++)
        {
            f=f*i;
        }
        return f;
    }
    public static void main(String args [])
    {
        System.out.println("enter nbr=");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int result=fact(a);
        System.out.println(result);

    }
}
