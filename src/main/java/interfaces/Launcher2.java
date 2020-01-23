package interfaces;

interface Left {
    public static final int value = 100;

    static int getValue() {
        return value;
    }
}

interface Right {
    public static final int value = -100;

    static int getValue() {
        return value;
    }
}

class GrandGrandChild extends GrandChild implements Left, Right {
    public GrandGrandChild() {
        int value = getValue();
        System.out.println(value);
    }
}

public class Launcher2 {
    public static void main(String[] args) {

        GrandGrandChild grandGrandChild = new GrandGrandChild();
        System.out.println(grandGrandChild.getValue());

        Left left = grandGrandChild;
//        System.out.println(left.getValue()); стат методы интерф. выз-ь ток через интерфейсы.
        System.out.println(Left.getValue());
        System.out.println(Left.value);
    }
}
