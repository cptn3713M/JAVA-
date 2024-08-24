//public class Test{
//public class Test{
//
//    public static void main(String[] args) {
//        int i = 0;
////        if( i = 0 )
//            System.out.println(true);
//        else
//            System.out.println(false);
//    }
//}
//    static native int compute(int i, int j);
//}
//1.  Yes
//        2.  No
//        Incorrect answer.
//        Yes is the correct choice. The code declares the method compute as a native method which means that the implementation of the method is written in some other language like C or C++. Native methods in Java can be static or non-static.
//
//        What will happen when you compile and run the following code?
//
//public class Test{
//
//    public static void main(String args[]){
//
//        byte b1 = 10, b2 = 5;
//        compute(b1, b2);
//    }
//
//    public static void compute(long l1, long l2){
//        System.out.println("long");
//    }
//    static native void compute(int i, int j){
//        System.out.println("int");
//    }
//}
//1.  long
//        2.  int
//        3.  Compilation error
//        4.  None of the above
//        Incorrect answer.
//        Option 3 is the correct choice. Java native keyword denotes that the method is implemented in other language like C or C++. Java native methods have only declaration part, and do not have body part .
//
//        So code will give compilation error “Native methods do not specify a body”.
//
//        What will happen when you compile and run the following code?
//
//public class Test{
//
//    int i = 10;
//
//    public Test(){
//        i = 20;
//    }
//
//    public static void main(String args[]){
//        process();
//    }
//
//    public static void process(){
//        Test t = new Test();
//        System.out.println(this.i);
//    }
//}
//1.  10
//        2.  20
//        3.  Compilation error
//        4.  Runtime error
//        Incorrect answer.
//        Option 3 is the correct choice. Static methods in Java cannot use this or super keywords as the static methods are not associated with any particular object of the class. Code will give compilation error “Cannot use this in a static context”.
//
//        Static methods cannot be overloaded
//
//        1.  True
//        2.  False
//        Correct answer.
//        False is the correct choice. Static method can be overloaded just like any other methods.
//
//        What will happen when you compile and run the following code?
//
//public class Test{
//
//    public static void compute(int i, int j){
//        System.out.println("int version");
//    }
//
//    public void compute(int i, int j){
//        System.out.println("long version");
//    }
//
//    public static void main(String args[]){
//        Test t = new Test();
//        compute(10, 5);
//    }
//}
//1.  int version
//        2.  long version
//        3.  Compilation error
//        4.  Runtime error
//        Correct answer.
//        Option 3 is the correct choice. In Java, a method cannot be overloaded if the only difference between them is one being static and other non-static.
//
//        Here, compute method is defined twice with the exact same parameters and return type. The first method being static and second one is non-static. Hence, compiler will give error “Duplicate method compute(int, int) in type Test”.
//
//        What will happen when you compile and run the following code?
//
//class One{
//    public static void process(){
//        System.out.print("Parent");
//    }
//}
//
//class Two extends One{
//    public static void process(){
//        super.process();
//        System.out.print("Child");
//    }
//}
//
//public class Test{
//
//    public static void main(String args[]){
//        One one = new Two();
//        one.process();
//    }
//}
//1.  Parent
//        2.  Child
//        3.  ParentChild
//        4.  Compilation error
//        Correct answer.
//        Option 4 is the correct choice. Static method in Java cannot access super or this keywords as static methods are defined at the class level and not associated with the object of the class. The code will give compilation error “Cannot use super in a static context”.
//
//        Will this code compile?
//
//public class Test{
//
//    static int i = 0;
//    public static void main(String args[]){
//        Test t = new Test();
//        t.print();
//    }
//
//    public void print(){
//        System.out.println(this.i);
//    }
//}
//1.  Yes
//        2.  No
//        Correct answer.
//        Yes is the correct choice. Static variables can be accessed using object reference as well as using the class name. However, it is recommended to access them using the class name because they are shared across all the objects of the class and to avoid confusing it with the instance variables.
//
//        What will happen when you compile and run the following code?
//
//class One{
//    public final One(){
//        System.out.print(" One ");
//    }
//}
//
//class Two extends One{
//    public Two(){
//        System.out.print(" Two ");
//    }
//}
//public class Test{
//
//    public static void main(String[] args) {
//        One one = new One();
//        Two two = new Two();
//    }
//}
//1.  One One Two
//        2.  One Two
//        3.  Compilation error
//        4.  Runtime error
//        Correct answer.
//        Option 3 is the correct choice. A class constructor cannot be final. Additionally, the constructor cannot be abstract or native either.
//
//        The code will give compilation error “Illegal modifier for the constructor in type One; only public, protected & private are permitted”.
//
//        What will happen when you compile and run the following code?
//
//class One{
//    public abstract One();
//}
//
//class Two extends One{
//    public Two(){
//        System.out.println("Two");
//    }
//}
//public class Test{
//
//    public static void main(String[] args) {
//        Two two = new Two();
//    }
//}
//1.  Two
//        2.  Compilation error
//        3.  Runtime error
//        Correct answer.
//        Option 2 is the correct choice. In Java, constructor cannot be abstract, final or native. The code will give compilation error.
//
//        What will happen when you compile and run the following code?
//
//class One{
//    int i = 1;
//    public One(){
//        System.out.println(i);
//    }
//}
//
//class Two extends One{
//    int i = 10;
//    public One(){
//        System.out.println(i);
//    }
//}
//public class Test{
//
//    public static void main(String[] args) {
//        One one = new Two();
//    }
//}
//1.  1
//        2.  10
//        3.  Compilation error
//        4.  Runtime error
//        Correct answer.
//        Option 3 is the correct choice. Constructors cannot be overridden, as it is not inherited in the child class.
//
//        The code tries to override the constructor of the parent class One, but since it is not inherited in class Two, Java treats it as a method. However, a method needs a return type which is missing. So, the code will give compilation error “Return type for the method is missing”.