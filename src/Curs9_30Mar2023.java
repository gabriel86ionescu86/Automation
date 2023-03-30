
import java.util.Scanner;

public class Curs9_30Mar2023 {
   /* protected String str;

    Curs9_30Mar2023(){
        str = "This";
    }}

    class Copil1 extends Curs9_30Mar2023{
        Copil1(){
            str = str.concat(" is");
        }
    }
    class Copil2 extends Copil1{
        Copil2(){
            str = str.concat(" Curs9_30Mar2023 Inheritance");
        }
    }
    class Copil3 extends Copil2{
        Copil3(){
            str = str.concat(" Example.");
        }
        void display(){
            System.out.println(str);
    }

    public static void main(String[] args) {
        Copil3 cop = new Copil3();
        cop.display();

        }*/
}

   class BaseClass{
    void displayA(){
        System.out.println("Continut clasa de baza");
    }

    static class A extends BaseClass{
        void displayB(){
            System.out.println("Continut clasa A");
        }
    }
   static class B extends BaseClass{
       void displayC(){
           System.out.println("Continut clasa B");
       }
   }

       public static void main(String[] args) {
        B b = new B();
        b.displayA();
        b.displayC();

       A a = new A();
       a.displayA();
       a.displayB();
       }
    }

