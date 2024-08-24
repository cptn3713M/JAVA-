  class sumevenoddloop {
    public static void main(String[] args)
    {
        int i;
        int sum=0;
        int sum2=0;
        for (i=0;i<10;i++){
            if (i%2==0)
            {
                 sum=sum+i;
            }
            else {
                sum2=sum+i;
            }

        }
        System.out.println("even sum="+sum);
        System.out.println("odd sum="+sum2);
    }
}
