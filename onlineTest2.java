//import java.applet.Applet;
//import java.awt.*;
//import java.util.Scanner;
public class onlineTest2{
//    public static void compute(int i, int j){
//        System.out.println("int version");
//    }
//
//    public void compute(int i, int j){
//        System.out.println("long version");
//    }
//
//    public static void main(String args[]){
//        onlineTest2 t = new onlineTest2();
//        compute(10, 5);
//    }



//    static native int compute(int i, int j);

//public class onlineTest2 extends Applet {
//    public  void paint(Graphics g){
//        g.drawString("hello",10,99);
//
//    }
//
//    public class Test{
//
//        public static void main(String[] args){
//
//            int a = 0;
//            while(a < 10){
//                System.out.println(a++);
//            }
//        }
//    }
//1.  Compilation error
//2.  Code will print 1 to 9
//            3.  Code will print 0 to 9
//            4.  Code will print 1 to 10
//    Incorrect answer.
//    Option 3 is the correct choice. Variable a is started with zero. Since a is incremented using post increment operator (a++), its value is printed first and then value gets incremented. When a is 9 then it is printed and incremented to 10, so in next while iteration a < 10 becomes false. Program will print 0 to 9.
//
//    What will happen when you compile and run the following code?
//
//    public class Test{

//        public static void main(String[] args){
//
//            int a = 0, b = 5;
//            while(b--){
//                System.out.println(a++);
//            }
//        }
//    }
//1.  Compilation error
//2.  Code will print 0 to 5
//            3.  Code will print 0 to 4
//            4.  Code will print 1 to 5
//    Correct answer.
//    Option 1 is the correct choice. While loop condition must be of type boolean.
//
//    What will happen when you compile and run the following code?
//
//    public class Test{
//
//        public static void main(String[] args){
//
//            int a = 0;
//            while(a <= 10){
//                a++;
//            }
//            System.out.println(a);
//        }
//    }
//1.  Compilation error
//2.  11
//        3.  10
//        4.  9
//    Correct answer.
//    Option 2 is the correct choice. When a becomes 10, while loop condition (a <= 10) evaluates to true and control goes inside the loop where it is incremented to 11. However, in the next iteration while loop condition becomes false and value of a is printed as 11.
//
//    What will happen when you compile and run the following code?
//
//    public class Test{
//
//        public static void main(String[] args){
//
//            int a = 0;
//            while(a < 10){
//                System.out.println(++a);
//            }
//        }
//    }
//1.  Compilation error
//2.  Code prints 0 to 9
//            3.  Code prints 0 to 10
//            4.  Code prints 1 to 10
//    Incorrect answer.
//    Option 4 is the correct choice. Value of a is incremented using pre increment operator so value is incremented first and printed later. Hence output starts with 1 in the first iteration of the loop. When a becomes 9, while loop condition is still true and a is incremented to 10 and printed. Condition become false thereafter since a is no more less than 10. Program will print 1 to 10.
//
//    What will happen when you compile and run the following code?
//
//    public class Test{
//
//        public static void main(String[] args){
//
//            int a = 0, b = 10;
//            while( a + 2 < b){
//                System.out.println(a);
//            }
//        }
//    }
//1.  Compilation error
//2.  Code will print 2 to 8
//            3.  Code will print 0 to 8
//            4.  None of the above
//    Incorrect answer.
//    Option 4 is the correct choice. It is very easy to overlook that value of a is never incremented inside the loop. It stays 0 forever and the while loop condition a + 2 < b always evaluates to true. The loop never ends and prints 0 infinitely. This kind of loop is called infinite loop.
//
//    What will happen when you compile and run the following code?
//
//    public class Test{
//
//        public static void main(String[] args){
//
//            int a = 0, b = 5;
//            while( b-- > a++)
//                System.out.println(a);
//
//        }
//    }
//1.  Code will print 0 to 4
//            2.  Code will print 0 to 5
//            3.  Code will print 1 to 4
//            4.  Code will print 1 to 3
//    Correct answer.
//    Option 4 is the correct choice. In while loop condition, b is decremented and a is incremented simultaneously using post decrement and post increment operators respectively. Hence values are compared first and decremented and incremented later. Output starts with 1. When a is 2 and b is 3 in third iteration, the while condition is still true, however, they are immediately incremented and decremented to 3 and 2 respectively and printed. In the next iteration, the condition becomes false so program will print 1 to 3.
//
//    What will happen when you compile and run the following code?
//
//    public class Test{
//
//        public static void main(String[] args){
//
//            int a = 0, b = 10;
//            while( --b > a )
//                System.out.println(a);
//            a++;
//        }
//    }
//1.  Program will print 9 to 0
//            2.  Program will print 10 to 0
//            3.  Program will print 10 to 1
//            4.  None of the above
//    Correct answer.
//    Option 4 is the correct choice. Since while loop does not have curly braces only System.out.println statement is considered part of it and a++ statement outside of the loop. Since a is never incremented inside the loop, it stays at zero till the value of b becomes 0 which makes while condition false. Code will print zero 9 times.
//
//    What will happen when you compile and run the following code?
//
//    public class Test{
//
//        public static void main(String[] args){
//            int a = 100;
//            while(int b = 10){
//                a -= 10;
//                b += 10;
//                System.out.println(a);
//            }
//        }
//
//    }
//1.  Compilation error
//2.  Code will print nothing
//3.  Code will print "100 90…..10"
//            4.  Code will print "90 80…0"
//    Correct answer.
//    Option 1 is the correct choice. While loop condition must be of type boolean, variable declaration is not allowed there. Hence program will give compilation error.
//
//    What will happen when you compile and run the following code?
//
//    public class Test{
//
//        public static void main(String[] args){
//            int a = 0;
//            while(a + 2 < 10){
//                a += 2;
//                int b = 10;
//                while(b - 2 > 0){
//                    b -= 2;
//                }
//            }
//            System.out.println(a + " " + b);
//        }
//
//    }
//1.  Code will print "10 0"
//            2.  Code will print "10 2"
//            3.  Code will print "8 0"
//            4.  None of the above
//    Correct answer.
//    Option 4 is the correct choice. Since variable b is declared inside inner while loop, it is local to that block only and cannot be accessed outside that loop. Hence, program will give compilation error “b cannot be resolved to a variable”.
//
//    What will happen when you compile and run the following code?
//
//    public class Test{
//
//        public static void main(String[] args){
//            int a = 10, b = 0;
//            while( a + 2 < 10 && b - 2 > 0){
//                System.out.println(a);
//            }
//        }
//
//    }
//1.  Compilation error
//2.  Code will print 10 to 0
//            3.  Code will print 10 to 2
//            4.  None of the above
//    Correct answer.
//    Option 4 is the correct choice. The while condition is always false since values of a and b variables are never incremented or decremented. Program will not print anything when run.
//
//    What will happen when you compile and run the following code?
//
//    public class Test{
//
//        public static void main(String[] args){
//            int a = 0, b = 10;
//            while(b - 2 > 0){
//                b -= 2;
//                while(a + 2 < 10){
//                    a += 2;
//                    if(a == b)
//                        continue;
//
//                    System.out.print(a + " " + b + ", ");
//                }
//            }
//        }
//
//    }
//1.  Compilation error
//2.  2 8, 4 8, 6 8,
//        3.  2 8, 4 8, 6 8, 2 6, 4 6, 8 6, 2 4, 6 4, 8 4, 4 2, 6 2, 8 2,
//        4.  8 2, 8 4, 8 6, 6 2, 6 4, 6 8, 4 2, 4 6, 4 8, 2 4, 2 6, 2 8,
//    Incorrect answer.
//    Option 2 is the correct choice. Variable a is declared outside both the loops, so after first iteration of the outer while loop, value of variable a becomes 8 and stays at that value. Hence, nothing will be printed from second iteration onward due to while condition of the inner loop being always false ( 8+2 < 10 ).
//
//    What will happen when you compile and run the following code?
//
//    public class Test{
//
//        public static void main(String[] args){
//            int a = 3, b = 0;
//            while( a >= 0 ){
//                a -= 1;
//                while(b<=3 ){
//                    b += 1;
//                    if(a < b)
//                        break;
//
//                    System.out.print(a + " " + b + ", ");
//                }
//            }
//        }
//
//    }
//1.  Compilation error
//2.  2 1, 2 2, 1 1,
//        3.  2 1, 2 2,
//        4.  3 1, 3 2, 2 1, 1 1,
//    Correct answer.
//    Option 3 is the correct choice. Variable b is declared before both the loops, it is not reset to zero before inner while loop. In the first iteration of outer while loop, a is 3 – 1 i.e. 2 and b starts from 0 + 1 i.e. 1. The values are printed if and only if a >= b (because of break statement if a < b condition). So program will print 2 1 and 2 2. However, once b becomes 3, a < b condition becomes true and will not print anything then onwards.
//
//    What will happen when you compile and run the following code?
//
//    public class Test{
//
//        public static void main(String[] args){
//            int i = 0;
//            outer: while(i < 10){
//                i+=2;
//                int j = 10;
//                inner: while(j > 0){
//                    j -=2;
//                    if(i == j)
//                        break outer;
//                    System.out.print(i + " " + j + ", ");
//                }
//            }
//
//        }
//
//    }
//1.  2 8, 2 6, 2 4, 4 8, 4 6, 6 8,
//        2.  2 8, 2 6, 2 4,
//        3.  8 2, 6 2, 4 2, 8 4, 6 4, 8 6,
//        4.  None of the above
//    Incorrect answer.
//    Option 2 is the correct choice. Variable a goes from 0 to 10 in increments of 2, variable b goes 10 to 0 in decrements of 2. if a == b, control goes to the break statement. Both the loops are marked with the labels. However, code breaks the outer loop, so whenever code encounters a == b first time, control goes out of the loop and rest of the iterations are never executed. In first iteration of inner loop 2 2 will be printed. in second iteration 2 6 and in third iteration of inner loop 2 6 will be printed. However, in forth iteration of the inner loop, both a and b are equal to 2 so control goes to the break statement which breaks both the loops not just the inner loop.
//
//    What will happen when you compile and run the following code?
//
//    public class Test{
//
//        public static void main(String[] args){
//            int a = 4, b = 4;
//            while(a-- > 0){
//                while(b-- > 0){
//                    if(a == b)
//                        continue;
//                    System.out.print(a + " " + b + ", ");
//                }
//            }
//        }
//
//    }
//1.  3 2, 3 1, 3 0,
//        2.  4 3, 4 2, 4 1, 3 4, 3 2, 3 1, 2 4, 2 3, 2 1, 1 4, 1 3, 1 2,
//        3.  3 2, 3 1, 3 0, 2 3, 1 3, 1 2, 0 3, 0 2, 0 1,
//        4.  None of the above
//    Incorrect answer.
//    Option 1 is the correct choice. Continue statement skips the current iteration of the inner most loop and goes to the next iteration. Plus, a and b are declared outside both the loops. So once variable b becomes 1 in the first iteration of the outer loop and third iteration of inner loop, the inner while condition will always be false then onwards.
//
//    What will happen when you compile and run the following code?
//
//    public class Test{
//
//        public static void main(String[] args){
//            int a = 4, b = 4;
//            outer: while(a-- > 0){
//                while(b-- > 0){
//                    if(a == b)
//                        continue outer;
//                    System.out.print(a + " " + b + ", ");
//                }
//            }
//        }
//
//    }
//1.  3 2, 3 1, 2 3, 2 1, 1 3, 1 2,
//        2.  3 2, 2 3, 1 3, 1 2,
//        3.  3 3, 2 2, 1 1,
//        4.  None of the above
//    Incorrect answer.
//    Option 4 is the correct choice. The code will not print anything! That’s because a and b both are initialized to 4 and decremented at the same time. So in every first iterations of the inner loop, if condition becomes true and code will continue with the next iteration of the outer loop.
//
//    What will happen when you compile and run the following code?
//
//    public class Test{
//
//        public static void main(String[] args){
//            while(1){
//                System.out.println("Hello");
//            }
//        }
//
//    }
//1.  Compilation error
//2.  Hello will be printed once
//3.  Hello will be printed infinite times
//4.  None of the above
//    Incorrect answer.
//    Option 1 is the correct choice. Program will give compilation error. Condition of the while loop must be of type boolean unlike C/C++ where you could mention 0 or 1.
//
//    Requirement is to read the user input line from the console using loop and write the input to a file line by line. If the user enters “END”, it should be written to the file and the program should exit. Which loop would you use?
//
//            1.  while loop
//2.  do while loop
//    Correct answer.
//    Option 2 is the correct choice. Since the requirement is to read at least one input line from console and write to a file before exiting, do while loop is a better choice. Do while loop ensures that there is always one iteration of the loop before exiting (because do while loop executes code block first and checks the condition later).
//
//    What will happen when you compile and run the following code?
//
//    public class Test{
//
//        public static void main(String[] args){
//            int i = 0;
//            do{
//                System.out.println("Loop");
//            }while(i != 0);
//
//        }
//
//    }
//1.  Compilation error
//2.  "Loop" will be printed once
//3.  "Loop" will be printed infinite times
//4.  No output
//    Correct answer.
//    Option 2 is the correct choice. Do while loop always has one iteration of the code block regardless of the condition. Code will execute and print “Loop”, then the condition will be checked which is false and hence the loop will be terminated.
//
//    What will happen when you compile and run the following code?
//
//    public class Test{
//
//        public static void main(String[] args){
//            int a;
//            for (int i=0;i<=20;i++){
//                System.out.println(i++);
//
//                 }
//             }
//            int i = 0;
//            do{
//                i++;
//                System.out.println(i);
//            }while(i < 5);


//
//    }
//1.  Compilation error
//2.  Code will print 1 to 5
//            3.  Code will print 0 to 4
//            4.  Code will print 1 to 4
//    Incorrect answer.
//    Option 1 is the correct choice. There must be a semi-colon after the while condition
//    which is missing. Correct statement would be “while(i < 5);".
//
//    Regardless of the boolean condition of the do while loop, there is always at least one iteration of the loop.
//
//            1.  True
//2.  False
//    Correct answer.
//    True is the correct choice. Do while loop executes the code block once and then checks for the associated condition. If it is true, it continues to the next iteration otherwise control goes out of the loop to the next statement in code.
//
    }