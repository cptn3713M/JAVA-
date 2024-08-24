import java.util.Scanner;

public class iuareaofcircle
{
    public static void main(String[] args)
    {
        double r,area,a=3.14;
        Scanner x=new Scanner(System.in);
        System.out.println("enter radious=");
        r=x.nextInt();

        area=3.14*r*r;
        System.out.println("the area of circle="+area);

    }
}
