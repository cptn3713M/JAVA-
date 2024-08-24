import java.util.LinkedList;
public class link_list {
    public static void main(String args [])
    {
         LinkedList<String> ob=new LinkedList<String>();
        ob.add("wlcm");
        ob.add("1");
        ob.add("2");
        ob.add("3");
        ob.add("4");
        ob.remove("wlcm");
         System.out.println(ob);
        System.out.println(ob.get(1));
    }
}
