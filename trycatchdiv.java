import java.util.Scanner;

public class trycatchdiv {

        public static void main(String[] args)
        {
            Scanner obj=new Scanner(System.in);
            int a=0,b,c;
            try
            {
                System.out.println("Enter first number");
                b=obj.nextInt();
                System.out.println("Enter second number");
                c=obj.nextInt();
                if(c!=0)
                {
                    a=b/c;
                }
                else
                    throw  new Exception("Don't put zero in denominator");
            } catch (Exception e)
            {
                System.out.println("Error:"+e);
            }
            finally
            {
                System.out.println("Div="+a);
            }
        }
    }

