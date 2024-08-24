public class forprimenbr
{
    public static void main(String[] args)
    {
        int n=5;
        int i;
        /*for (i=2;i<n/2;i++)
        {if (n%i==0)
            {System.out.println("nprime"+n); }
           else {System.out.println("p"+n);}*/
        i=2;
        boolean nis=true;
        while (i<n)
        {
            if (n%i==0)
            {
                System.out.println("np");
                nis=false;
                break;
            }

             i++;
        }
        if (nis){
            System.out.println("p");

        }

    }
}
