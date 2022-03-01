package Interface;

// public abstract class Main {
//     abstractMeth() {
//         System.out.println("abstractMeth()");
//     }
//     void meth1() {
//         System.out.println("meth1()");
//     }

// in place of abstract class interface main is used
interface lakshya{
    void meth1();
    void meth2();

}
 /**
  * InnerMain  implements Maine
  */
  class InnerMain  implements lakshya{
    
    public void meth1() {
        System.out.println("meth1()");
    }
    public void meth2() {
        System.out.println("meth2()");
    }
 
     
 }
 /**
  * Main

  */
 public class Main
  {
 public static void main(String[] args) {
  lakshya lakshya = new InnerMain();
  lakshya.meth1();
 }
     
 }