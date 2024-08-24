public class minnbrinarray
{
    public static void main(String args[])
    {
        int []a={1,3,6,4};
        int min=a[0],i;
        for (i=0;i<3;i++)
        {
            if (min>a[i])
            {
                min=a[i];
//                System.out.println(min);

            }
//            System.out.println(min);
        }
        System.out.println(min);

    }
}
