package generics;

public class PrintGenericTypeInRunTime {
    public static void main(String[] args) throws NoSuchFieldException {

        Pair pair = new Pair();
        ChildPair childPair = new ChildPair();

        System.out.println(pair.getClass().getDeclaredField("field1").getGenericType());
        System.out.println(childPair.getClass()
                .getGenericSuperclass());

    }
}

class Pair<T1, T2> {
    T1 field1;
    T2 field2;
}

class ChildPair extends Pair<Long, String> {
    String field1;
}