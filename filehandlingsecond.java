import java.io.File;
public class filehandlingsecond {
    public static void main(String args[]) {
        try {

            File f = new File("test.java");
            if (f.createNewFile()) {
                System.out.println(f.getName() + "   ok");
            } else {
                System.out.println("not ok");
            }
        }
        catch (Exception e)
        {
            System.out.println("nothing");
        }
    }
}
