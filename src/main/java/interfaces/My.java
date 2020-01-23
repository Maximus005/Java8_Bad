package interfaces;

public class My {
    public static void main(String[] args) {
        SuperClass superClass = new SubClass();
        System.out.println(superClass.f()); // в байткоде почемуто идет вызов SuperClass.f()
    }
}

class SuperClass {
    int f(){ return 100;}
}

class SubClass extends SuperClass {
    int f(){ return 200;}

    void f(int i){ }
}