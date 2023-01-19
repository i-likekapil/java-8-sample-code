package lambda.def;

public interface InterfMain {

    public static void main(String[] args) {
        System.out.println("hello");
        sayHello();
        System.out.println(myName("Kapil"));
    }
    public static void sayHello(){
        System.out.println("from sayHello");
    }

    public static String myName(String s){
        return "My name is "+s;
    }
}
