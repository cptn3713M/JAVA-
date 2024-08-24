public class twoarraysum
{
    public static void main(String args[])
    {
        int []a={1,2};
        int []b={5,7};
          int sum1=0,i;
          int sum2=0,tsum;
          for (i=0;i<a.length;i++)
          {
              sum1=sum1+a[i]+b[i];

          }
        System.out.println("1st array sum;"+sum1);
//foe 2nd array
//          for (i=0;i<b.length;i++)
//          {
//              sum2=sum2+a[i];
//          }
//        System.out.println("2nd array sum:"+sum2);
//          tsum=sum1+sum2;
//        System.out.println("both array sum;"+tsum);
    }
}
