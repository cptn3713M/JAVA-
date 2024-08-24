import java.util.Scanner;
    class userinput {
    public static void main(String[] args)
    {
        int a,b,c;
        //System.out.println("enter nbr=");
        Scanner in = new Scanner(System.in);
        System.out.println("enter nbr1=");
        a= in.nextInt();
        System.out.println("enter nbr2=");
        b= in.nextInt();
        c=a+b;
        System.out.println("sum ="+c);

    }
}
