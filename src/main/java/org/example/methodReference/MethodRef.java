package org.example.methodReference;

/**
 * @author Kapil Kaushik on 18/01/23
 * @project java-8-learn-code
 */

/* :: -> double colon operator is method reference
 *  syntax:
 *  static -> classname :: methodName
 *  instance -> object instance :: methodName (only for non-static)
 *        Main m = new Main();
 *        Interf2 interf2 = m::m3;
 *        interf2.m1(100);
 *
 */
interface Interf1 {
    public void m1();
}

interface Interf2{
    int m1(int a);
}

interface Interf3{
    Sample getSample();

}

class Sample{
    Sample(){
        System.out.println("sample constructor");
    }
}

public class MethodRef {
    public static void m2() {
        System.out.println("from m2");
    }

    public void m3(){
        System.out.println("from m3");
    }
    public int m3(int i){
        System.out.println("from m3 and i = "+i);
        return i*i;
    }

    public MethodRef(){
        System.out.println("method constructor");
    }
    public static void main(String[] args) {
        Interf1 inter1 = MethodRef::m2; // assign m2 definition to m1 of interface
        inter1.m1();

        MethodRef m = new MethodRef();
        Interf2 interf2 = m::m3;
        int x = interf2.m1(100);
        System.out.println("x is "+ x);

        // create a thread
        // with lambda expression
        Runnable runnable = () ->{
            System.out.println("Runnable run print");
        };

        // with method ref
        //Runnable runnable1 = MethodRef::m2;
        Runnable runnable1 = m::m3; // cannot use m2 because m2 is static method

        Thread t = new Thread(runnable);
        Thread t1 = new Thread(runnable1);

        t.start();
        t1.start();

        // :: operator used for constructor reference

        Interf3 interf3 = Sample::new;
        Sample sample = interf3.getSample();
        System.out.println("sample ref "+sample);

    }
}

