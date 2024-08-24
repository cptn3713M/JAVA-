  class palilnodrom {
    public static void main(String [] args)
    {
        int a=1231;
       int b=0;
       int x=a;
        while (a!=0)
        {
            b=b*10;
            b=b+a%10;
            a=a/10;


        }
         if (x==b)
        {
            System.out.println("yes it is p");
        }
        else
        {
            System.out.println("it is not p");
        }
//int rem=0,temp=a;
//        int a=121;
//    rem=rem*10;
//    temp=rem+a*10;
//    a=a/10;
//         if (rem==a){
//            System.out.println("yes it pallindrome");
//        }else {
//            System.out.println("it is not pallindrrome");
//        }
    }
}
