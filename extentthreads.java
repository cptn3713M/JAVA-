
public class extentthreads extends Thread
    {
        public static void main(String args[])
        {
            extentthreads ob=new extentthreads();
            ob.start();
            System.out.println("first file");
        }
        public void run()
        {
            System.out.println("second");
        }
    }
