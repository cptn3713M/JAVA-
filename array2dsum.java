public class array2dsum
{
    public static void main(String args[])
    {
        int [][]b={{1,2,3},{4,5,6},{7,8,9}};
//        int sumy=0;
//        int sumx;
//        for (int i=0;i<b.length;i++)
//        {
//             sumy=sumy+b[i];
//            System.out.println(+sumy);
//        }
//        for (int j=0;j<b.length;j++)
//        {
//             sumx=sumx+b[j];
//            System.out.println(+sumx);
//        }
//        int tsum=sumy+sumx;
//        System.out.println(tsum);
        int sum=0;
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                sum=sum+b[i][j];


            }
            System.out.println(sum);
        }

     }
}
//class arraysum
//{
//    public static void main(String args[])
//    {
//        int sum=0;
//        int [][] b={{1,2,3},{4,5,6},{7,8,9}};
//        for (int i=0;i<=b.length;i++)
//        {
//            for (int j=0;j<b.length;j++)
//            {
//                sum==sum+b[i][j];
//
//            }
//             System.out.println(sum);
//        }
//    }
//}