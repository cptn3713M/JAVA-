public class arrayreverse
{
    public static void main(String[] args)
    {
        int [] rev={456,745,569,256};
        int[] end=new int[4];
         int rem=rev.length-1;
         for (int i=0;i<rev.length;i++)
         {
             end[i]=rev[rem];
             rem--;

         }

    }
}
