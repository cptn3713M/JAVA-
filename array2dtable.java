public class array2dtable
{
    public static void main(String args[])
    {
        int [][]p={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<=3;i++) {
            for (int r = 0; r < p.length; r++) {
                System.out.println("  ");
                for (int c = 0; c < p[r].length; c++) {
                    System.out.print(" " + p[r][c]);
                }
            }
        }
    }
}
