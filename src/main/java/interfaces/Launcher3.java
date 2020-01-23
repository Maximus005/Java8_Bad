package interfaces;

interface First {
    int value = 100;

    int getValueFromFirst();

    //int getValue();

    default int getValue(){
        return value;
    }
}

interface Second {
    int value = -100;

    int getValueFromSecond();

    //int getValue();

    default int getValue(){
        return value;
    }
}
class B implements First, Second {

    @Override
    public int getValueFromFirst() {
        return 0;
    }

    @Override
    public int getValueFromSecond() {
        return 0;
    }

    @Override
    public int getValue() {
        return First.super.getValue();
    }
}

public class Launcher3 {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.getValue());
    }
}
