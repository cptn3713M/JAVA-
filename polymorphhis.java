  class polymorphhis {
      void car() {
          System.out.println(" nissan gtr");
      }
  }
    class motogp extends polymorphhis {
        void zxbike() {System.out.println("zx10r");}
    }
class truck extends motogp{
    void ffaltu(){
        System.out.println("faltu");
    }
}
    class tractor extends polymorphhis {
        void mahindra() {
            System.out.println("farmer");
        }
    }
    class tst {
        public static void main(String args[]) {
    tractor c=new tractor();
    c.car();
    c.mahindra();

         }

    }
