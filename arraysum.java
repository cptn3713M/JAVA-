public class arraysum
{
    public static void main(String arggs [])
    {
        int[]a={1,2,3,4};
       // int[]b={1,2,3,4};
        int i,sum=0;
        for (i=0;i<a.length;i++)
        {
            sum=sum+a[i];
           // System.out.println("the aray elements sum="+sum);
        }
        System.out.println(+sum);
    }
}
