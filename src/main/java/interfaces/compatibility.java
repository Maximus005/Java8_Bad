package interfaces;

interface A1 {}

interface B1 {}

class Smth implements A1{

}

public class compatibility {
    static void method(A1 a){
        System.out.println("from A");
    }

    static void method(B1 b){
        System.out.println("from B");
    }

    public static void main(String[] args) {
        method(new Smth());
    }
}
