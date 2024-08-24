import java.util.ArrayList;
public class araaylist {
    public static void main(String args[]) {
        ArrayList<String> ob = new ArrayList<String>();
         ob.add("hello");
        ob.add("world");
        ob.add("jadu");
        ob.add ("abc");
        System.out.println(ob.get(0));
        ob.set(0,"d");
//        ob.remove(2);
//        ob.clear();
        System.out.println(ob.size());
        System.out.println(ob);
    }
}