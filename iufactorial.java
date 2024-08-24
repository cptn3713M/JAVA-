import java.util.Scanner;

public class iufactorial
{
    public static void main(String[] args)
    {
        int a,i,f=1;
        System.out.println("enter no.for fact");
        Scanner x= new Scanner(System.in);
        a=x.nextInt();
        for (i=1;i<=a;i++)
        {
            f=f*i;

        }
        System.out.println(f);
    }
}
