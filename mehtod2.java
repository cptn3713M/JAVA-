import java.util.Scanner;
public class mehtod2 {
    public static int  add(int a, int b)
    {
         int c=a+b;
        return c;
    }
    static  char end()
    {
        System.out.println("happy");
        System.out.println("now smile");
        return 0;
    }
    public static void main(String [] args )
    {
        System.out.println("nbr a.=");
         Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        System.out.println("nbr.b=");
        Scanner x=new Scanner(System.in);
        int b=x.nextInt();
        int sum=add(a,b);
         System.out.println(+sum);
         end();

    }
}
