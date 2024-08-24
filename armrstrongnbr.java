public class armrstrongnbr {
    public static void main(String[] args)
    {
        int b=370;
         int a,res=0,temp=b;
        while (b!=0)
        {
            a=b%10; //a=3
            res=res+a*a*a;//res=0+3*3*3
            b=b/10;//b=370/10

        }
        if (temp==res)//temp370=res loop counting
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");

        }
    }
}
