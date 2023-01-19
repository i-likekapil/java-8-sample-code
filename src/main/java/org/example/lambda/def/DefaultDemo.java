package org.example.lambda.def;


interface interf {
    default void sayDef(){
        System.out.println("from default");
    }
    void m2();
}


public class DefaultDemo implements interf {
    @Override
    public void m2() {

    }

    public static void main(String[] args) {
        interf i = ()->{
            System.out.println("from m2");
        };
        i.sayDef();
        i.m2();
    }

}
