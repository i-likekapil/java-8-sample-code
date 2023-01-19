package org.example.lambda;
interface interf{
    void m1();
}
public class Anonymous {
int x = 888;
void m2(){
    interf i = new interf() {
        int x = 999;
        @Override
        public void m1() {
            System.out.println(this.x+" "+ this.getClass());
        }
    };
    i.m1();
}

void m3(){
    interf i = ()->{
        int x = 777;
        System.out.println(this.x+" "+ this.getClass());
        System.out.println(x+" "+ this.getClass());
    };
    i.m1();
}

    public static void main(String[] args) {
        new Anonymous().m2();
        new Anonymous().m3();
    }
}
