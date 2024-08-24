import java.io.File;
public class filecatch {
    public static void main(String args[])
    {
        try {
            File f = new File("E:\\music m");
            if (f.exists()) {
                System.out.println("yes it exist");
            }
            else {
                System.out.println("no exist");
            }
        }
        catch (Exception e)
        {
            System.out.println("catch");
        }
    }
}
