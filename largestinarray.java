public class largestinarray
{
    public static void main(String args[])
    {
        int [] a={1,2,3,8,5,6};
        int i,large=a[0];
        for (i=0;i<5;i++)
        {
            if (a[i]>large)
            {
                large=a[i];
            }
        }
        System.out.println(large);
    }
}
