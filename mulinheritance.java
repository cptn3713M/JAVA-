class mulinheritance {

    void stnd()
    {
        System.out.println("student");
    }
}
class java extends mulinheritance{
    void jstnd()
    {
        System.out.println("java stnd");
    }
}
class pyhton extends java{
    void pstnd()
    {
        System.out.println("allpy student");
    }
}
class cepta extends pyhton{
    void all()
    {
        System.out.println("all cpt stnd");
    }
}

class testmulinhetance{
    public static void main(String args[])
    {
        cepta c=new cepta();
        c.all();
        c.pstnd();c.jstnd();c.stnd();
    }
}