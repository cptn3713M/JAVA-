//public class calculatr {
//}
import java.util.Scanner;

public class  calculatr {
    static int fact(int n)
    {
//        System.out.println("enter no.for fact");
//        Scanner x= new Scanner(System.in);
//        a=x.nextInt();)
        if (n==1)
         {
             return 1;
         }
         else {
             return n*fact(n-1);
        }
    }
    /* a=5
    * f=1*1
    * f=1*2
    * f=1*3
    * f=1*4
    * f=1*5*/
    public static void main(String args [])
    {
        System.out.println("enter nbr=");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int result=fact(n);
        System.out.println(result);

    }
}
