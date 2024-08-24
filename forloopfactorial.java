import java.util.Scanner;
public class forloopfactorial {
    public static void main(String[] args)
    {
        int a,i;
        int f=1;
        Scanner x= new Scanner(System.in);
        System.out.println("enter no.a=");
        a= x.nextInt();
        i=1;
           while (i<=a)
        {
            f=f*i;
            i++;
        }
       /* int n=3;
        int f=1;
        int i;*/
        System.out.println(f);
        }

    }
