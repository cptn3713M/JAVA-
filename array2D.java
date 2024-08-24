public class array2D
{
    public static void main(String args[])
    {
        int [][]b={{1,2,3},{4,5,6},{7,8,9}};
        for (int i=0;i<b.length;i++)
        {
            for (int j=0;j<b[0].length;j++)
            {
                System.out.println(b[i][j]);
            }
        }
    }
}
