import java.util.Scanner;
public class newsir {
    public static void main(String args[]){
        System.out.println(" enter nbr == ");

        Scanner ob=new Scanner(System.in);
        int a= ob.nextInt();

        int n;
         for (n=2;n<a;n++)
         {
              if (a%n== 0)
              {

                 System.out.println("yes it is prime nbr");
                 System.out.println(a * a);
             }
              else {
                  System.out.println("not a prime nbr");
                  System.out.println(a + a);
              }

             }

         }
    }

