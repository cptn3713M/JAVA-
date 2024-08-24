import java.util.Scanner;
public class ifelse3nbr
{
    public static void main(String[] args)
    {
        int a, b, c;
        a = 18;
        b = 25;
        c = 36;
        if (a<b)
        {
            if (b<c)
            {
                System.out.println("c is large");
            }
            else
            {
                System.out.println("b is large");
            }

        }
        else
        {
            if (a>c)
            {
                System.out.println("a is large");

            }
            else
            {
                System.out.println("c is large");
            }
        }

    }
}