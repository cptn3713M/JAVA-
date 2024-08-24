import java.util.Scanner;
public class iutable
{
    public static void main(String[] args)
    {
        int t,i;
        Scanner x= new Scanner(System.in);
        System.out.println("enter number for table");
        t=x.nextInt();
        for (i=1;i<=10;i++)
        {
            System.out.println(t*i);
        }
    }
}
