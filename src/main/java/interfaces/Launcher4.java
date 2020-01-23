package interfaces;

interface A {
    default int getValue() {
        return 100;
    }

    int get();
}

class Example4 implements A {
    public int getValue(){
        return 900;
    }

    @Override
    public int get() {
        return 456;
    }
}
public class Launcher4 extends Example4 implements A {

    @Override
    public int get() {
        return 654;
    }

    public static void main(String[] args) {
        Launcher4 launcher4 = new Launcher4();
        System.out.println(launcher4.getValue());
        System.out.println(launcher4.get());
    }
}
