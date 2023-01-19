package lambda.def;

interface left{
    default void m1(){
        System.out.println("Left");
    }
}
interface right{
    default void m1(){
        System.out.println("Right");
    }
}
public class DefaultInhert implements left, right{
    public static void main(String[] args) {

    }

    @Override
    public void m1() {
        System.out.println("my own impl");
        left.super.m1();
    }
}
