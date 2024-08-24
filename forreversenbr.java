public class forreversenbr {
    public static void main(String[] args)
        {
           int i,r, a=123,b=0;

            for (a=1;a!=0;a++)
            {
          r=a%10;
        b = b *10+ r;
                a = a / 10;
/*public class ReverseNumberExample1
{
public static void main(String[] args)
{
int number = 987654, reverse = 0;
while(number != 0)
{
int remainder = number % 10;
reverse = reverse * 10 + remainder;
number = number/10;
}
System.out.println("The reverse of the given number is: " + reverse);
}
}
*/
            }
            System.out.println("reverse nbr"  +a);
        }
}


